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

/**
 * <p>
 * This class is a wrapper for {@link JSEntryLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JSEntryLocalService
 * @generated
 */
public class JSEntryLocalServiceWrapper implements JSEntryLocalService {
	public JSEntryLocalServiceWrapper(JSEntryLocalService jsEntryLocalService) {
		_jsEntryLocalService = jsEntryLocalService;
	}

	/**
	* Adds the j s entry to the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to add
	* @return the j s entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry addJSEntry(
		com.liferay.portlet.js.model.JSEntry jsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.addJSEntry(jsEntry);
	}

	/**
	* Creates a new j s entry with the primary key. Does not add the j s entry to the database.
	*
	* @param jsEntryId the primary key for the new j s entry
	* @return the new j s entry
	*/
	public com.liferay.portlet.js.model.JSEntry createJSEntry(long jsEntryId) {
		return _jsEntryLocalService.createJSEntry(jsEntryId);
	}

	/**
	* Deletes the j s entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntryId the primary key of the j s entry to delete
	* @throws PortalException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteJSEntry(long jsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jsEntryLocalService.deleteJSEntry(jsEntryId);
	}

	/**
	* Deletes the j s entry from the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteJSEntry(com.liferay.portlet.js.model.JSEntry jsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jsEntryLocalService.deleteJSEntry(jsEntry);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the j s entry with the primary key.
	*
	* @param jsEntryId the primary key of the j s entry to get
	* @return the j s entry
	* @throws PortalException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry getJSEntry(long jsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.getJSEntry(jsEntryId);
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
	public com.liferay.portlet.js.model.JSEntry getJSEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.getJSEntryByUuidAndGroupId(uuid, groupId);
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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> getJSEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.getJSEntries(start, end);
	}

	/**
	* Gets the number of j s entries.
	*
	* @return the number of j s entries
	* @throws SystemException if a system exception occurred
	*/
	public int getJSEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.getJSEntriesCount();
	}

	/**
	* Updates the j s entry in the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to update
	* @return the j s entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry updateJSEntry(
		com.liferay.portlet.js.model.JSEntry jsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.updateJSEntry(jsEntry);
	}

	/**
	* Updates the j s entry in the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntry the j s entry to update
	* @param merge whether to merge the j s entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the j s entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry updateJSEntry(
		com.liferay.portlet.js.model.JSEntry jsEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.updateJSEntry(jsEntry, merge);
	}

	public com.liferay.portlet.js.model.JSEntry addEntry(long classNameId,
		long classPK, java.lang.String js,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.addEntry(classNameId, classPK, js,
			serviceContext);
	}

	public com.liferay.portlet.js.model.JSEntry addEntry(long classNameId,
		long classPK, double version, java.lang.String js,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.addEntry(classNameId, classPK, version, js,
			serviceContext);
	}

	public void deleteJSEntryByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jsEntryLocalService.deleteJSEntryByGroupId(groupId);
	}

	public void deleteJSEntry(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jsEntryLocalService.deleteJSEntry(classNameId, classPK);
	}

	public void deleteJSEntry(long classNameId, long classPK, double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jsEntryLocalService.deleteJSEntry(classNameId, classPK, version);
	}

	public java.util.List<com.liferay.portlet.js.model.JSEntry> getJSEntry(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.getJSEntry(classNameId, classPK);
	}

	public com.liferay.portlet.js.model.JSEntry getJSEntry(long classNameId,
		long classPK, double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.getJSEntry(classNameId, classPK, version);
	}

	public com.liferay.portlet.js.model.JSEntry getLatestJSEntry(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.getLatestJSEntry(classNameId, classPK);
	}

	public com.liferay.portlet.js.model.JSEntry updateEntry(long classNameId,
		long classPK, double version, java.lang.String js,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.updateEntry(classNameId, classPK, version,
			js, serviceContext);
	}

	public com.liferay.portlet.js.model.JSEntry updateEntry(long classNameId,
		long classPK, double version, java.lang.String js, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryLocalService.updateEntry(classNameId, classPK, version,
			js, status, serviceContext);
	}

	public JSEntryLocalService getWrappedJSEntryLocalService() {
		return _jsEntryLocalService;
	}

	public void setWrappedJSEntryLocalService(
		JSEntryLocalService jsEntryLocalService) {
		_jsEntryLocalService = jsEntryLocalService;
	}

	private JSEntryLocalService _jsEntryLocalService;
}