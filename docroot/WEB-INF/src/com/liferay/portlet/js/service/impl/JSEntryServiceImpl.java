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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.js.model.JSEntry;
import com.liferay.portlet.js.service.base.JSEntryServiceBaseImpl;

/**
 * The implementation of the j s entry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.portlet.js.service.JSEntryService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.js.service.base.JSEntryServiceBaseImpl
 * @see com.liferay.portlet.js.service.JSEntryServiceUtil
 */
public class JSEntryServiceImpl extends JSEntryServiceBaseImpl {
	public JSEntry getJSEntry(long classNameId, long classPK, double version)
		throws SystemException, PortalException {
	
		return jsEntryLocalService.getJSEntry(classNameId, classPK, version);
	
	}
}