/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.js.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.Company;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.js.model.JSEntry;
import com.liferay.portlet.js.util.JSUtil;
import com.liferay.portlet.js.util.VersionComparator;
import com.liferay.portlet.js.service.base.JSEntryLocalServiceBaseImpl;

/**
 * The implementation of the j s entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.portlet.js.service.JSEntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.js.service.base.JSEntryLocalServiceBaseImpl
 * @see com.liferay.portlet.js.service.JSEntryLocalServiceUtil
 */
public class JSEntryLocalServiceImpl extends JSEntryLocalServiceBaseImpl {
	public JSEntry addEntry(long classNameId, long classPK, 
			String js, ServiceContext serviceContext)
		throws SystemException  {

		return addEntry(classNameId, classPK, JSUtil.NEW_VERSION, js, 
			serviceContext);
	}
	
	public JSEntry addEntry(long classNameId, long classPK, double version,
			String js, ServiceContext serviceContext)
		throws SystemException  {

		Date now = new Date();

		JSEntry jsEntry = jsEntryPersistence.create(
				counterLocalService.increment());

		jsEntry.setCreateDate(serviceContext.getCreateDate(now));
		jsEntry.setUuid(serviceContext.getUuid());
		jsEntry.setModifiedDate(serviceContext.getModifiedDate(now));
		jsEntry.setClassNameId(classNameId);
		jsEntry.setClassPK(classPK);
		jsEntry.setVersion(version);
		if (classNameId != PortalUtil.getClassNameId(Company.class)) {
			jsEntry.setGroupId(serviceContext.getScopeGroupId());
		}
		jsEntry.setJs(js);
		jsEntry.setStatus(WorkflowConstants.STATUS_APPROVED);
		jsEntry.setStatusDate(serviceContext.getModifiedDate(now));
		jsEntry.setExpandoBridgeAttributes(serviceContext);

		return jsEntryPersistence.update(jsEntry, false);
	}

	public void deleteJSEntry(long jsEntryId)
		throws SystemException, PortalException {

		jsEntryPersistence.remove(jsEntryId);
	}

	public void deleteJSEntryByGroupId(long groupId)
		throws SystemException, PortalException {

		jsEntryPersistence.removeByGroupId(groupId);
	}

	public void deleteJSEntry(long classNameId, long classPK)
		throws SystemException, PortalException {
	
		jsEntryPersistence.removeByClassNameId_ClassPK(classNameId, classPK);
	}
	
	public void deleteJSEntry(long classNameId, long classPK, double version)
		throws SystemException, PortalException {

		jsEntryPersistence.removeByClassNameId_ClassPK_Version(
			classNameId, classPK, version);
	}

	public List<JSEntry> getJSEntry(long classNameId, long classPK)
		throws SystemException {

		return jsEntryPersistence.findByClassNameId_ClassPK(
			classNameId, classPK);
	}

	public JSEntry getJSEntry(long classNameId, long classPK, double version)
		throws SystemException, PortalException {

		return jsEntryPersistence.findByClassNameId_ClassPK_Version(
			classNameId, classPK, version);
	}

	public JSEntry getLatestJSEntry(long classNameId, long classPK)
		throws SystemException, PortalException {

		return jsEntryPersistence.findByClassNameId_ClassPK_First(
			classNameId, classPK, new VersionComparator());
	}

	public JSEntry updateEntry(long classNameId, long classPK, double version,
			String js, ServiceContext serviceContext)
		throws SystemException, PortalException {

		return updateEntry(classNameId, classPK, version, js,
			WorkflowConstants.STATUS_APPROVED, serviceContext);
	}

	public JSEntry updateEntry(long classNameId, long classPK, double version,
			String js, int status, ServiceContext serviceContext)
		throws SystemException, PortalException {

		JSEntry jsEntry =
			jsEntryPersistence.findByClassNameId_ClassPK_Version(
				classNameId, classPK, version);

		Date now = new Date();

		jsEntry.setModifiedDate(serviceContext.getModifiedDate(now));
		jsEntry.setJs(js);
		jsEntry.setStatus(status);
		jsEntry.setStatusDate(serviceContext.getModifiedDate(now));
		jsEntry.setExpandoBridgeAttributes(serviceContext);

		return jsEntryPersistence.update(jsEntry, false);
	}
}