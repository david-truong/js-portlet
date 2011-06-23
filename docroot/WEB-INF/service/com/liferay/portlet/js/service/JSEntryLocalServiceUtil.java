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

package com.liferay.portlet.js.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the j s entry local service. This utility wraps {@link com.liferay.portlet.js.service.impl.JSEntryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JSEntryLocalService
 * @see com.liferay.portlet.js.service.base.JSEntryLocalServiceBaseImpl
 * @see com.liferay.portlet.js.service.impl.JSEntryLocalServiceImpl
 * @generated
 */
public class JSEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.js.service.impl.JSEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the j s entry to the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to add
	* @return the j s entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry addJSEntry(
		com.liferay.portlet.js.model.JSEntry jsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addJSEntry(jsEntry);
	}

	/**
	* Creates a new j s entry with the primary key. Does not add the j s entry to the database.
	*
	* @param jsEntryId the primary key for the new j s entry
	* @return the new j s entry
	*/
	public static com.liferay.portlet.js.model.JSEntry createJSEntry(
		long jsEntryId) {
		return getService().createJSEntry(jsEntryId);
	}

	/**
	* Deletes the j s entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntryId the primary key of the j s entry to delete
	* @throws PortalException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteJSEntry(long jsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJSEntry(jsEntryId);
	}

	/**
	* Deletes the j s entry from the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteJSEntry(
		com.liferay.portlet.js.model.JSEntry jsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJSEntry(jsEntry);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the j s entry with the primary key.
	*
	* @param jsEntryId the primary key of the j s entry to get
	* @return the j s entry
	* @throws PortalException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry getJSEntry(
		long jsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJSEntry(jsEntryId);
	}

	/**
	* Gets the j s entry with the UUID and group id.
	*
	* @param uuid the UUID of j s entry to get
	* @param groupId the group id of the j s entry to get
	* @return the j s entry
	* @throws PortalException if a j s entry with the UUID and group id could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry getJSEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJSEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Gets a range of all the j s entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @return the range of j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> getJSEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJSEntries(start, end);
	}

	/**
	* Gets the number of j s entries.
	*
	* @return the number of j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getJSEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJSEntriesCount();
	}

	/**
	* Updates the j s entry in the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to update
	* @return the j s entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry updateJSEntry(
		com.liferay.portlet.js.model.JSEntry jsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateJSEntry(jsEntry);
	}

	/**
	* Updates the j s entry in the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to update
	* @param merge whether to merge the j s entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the j s entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry updateJSEntry(
		com.liferay.portlet.js.model.JSEntry jsEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateJSEntry(jsEntry, merge);
	}

	public static com.liferay.portlet.js.model.JSEntry addEntry(
		long classNameId, long classPK, java.lang.String js,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEntry(classNameId, classPK, js, serviceContext);
	}

	public static com.liferay.portlet.js.model.JSEntry addEntry(
		long classNameId, long classPK, double version, java.lang.String js,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addEntry(classNameId, classPK, version, js, serviceContext);
	}

	public static void deleteJSEntryByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJSEntryByGroupId(groupId);
	}

	public static void deleteJSEntry(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJSEntry(classNameId, classPK);
	}

	public static void deleteJSEntry(long classNameId, long classPK,
		double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteJSEntry(classNameId, classPK, version);
	}

	public static java.util.List<com.liferay.portlet.js.model.JSEntry> getJSEntry(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJSEntry(classNameId, classPK);
	}

	public static com.liferay.portlet.js.model.JSEntry getJSEntry(
		long classNameId, long classPK, double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJSEntry(classNameId, classPK, version);
	}

	public static com.liferay.portlet.js.model.JSEntry getLatestJSEntry(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLatestJSEntry(classNameId, classPK);
	}

	public static com.liferay.portlet.js.model.JSEntry updateEntry(
		long classNameId, long classPK, double version, java.lang.String js,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEntry(classNameId, classPK, version, js,
			serviceContext);
	}

	public static com.liferay.portlet.js.model.JSEntry updateEntry(
		long classNameId, long classPK, double version, java.lang.String js,
		int status, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEntry(classNameId, classPK, version, js, status,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static JSEntryLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					JSEntryLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					JSEntryLocalService.class.getName(), portletClassLoader);

			_service = new JSEntryLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(JSEntryLocalServiceUtil.class,
				"_service");
			MethodCache.remove(JSEntryLocalService.class);
		}

		return _service;
	}

	public void setService(JSEntryLocalService service) {
		MethodCache.remove(JSEntryLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(JSEntryLocalServiceUtil.class,
			"_service");
		MethodCache.remove(JSEntryLocalService.class);
	}

	private static JSEntryLocalService _service;
}