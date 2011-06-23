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

package com.liferay.portlet.js.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.js.model.JSEntry;

import java.util.List;

/**
 * The persistence utility for the j s entry service. This utility wraps {@link JSEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JSEntryPersistence
 * @see JSEntryPersistenceImpl
 * @generated
 */
public class JSEntryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(JSEntry jsEntry) {
		getPersistence().clearCache(jsEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JSEntry> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JSEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JSEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static JSEntry remove(JSEntry jsEntry) throws SystemException {
		return getPersistence().remove(jsEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static JSEntry update(JSEntry jsEntry, boolean merge)
		throws SystemException {
		return getPersistence().update(jsEntry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static JSEntry update(JSEntry jsEntry, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(jsEntry, merge, serviceContext);
	}

	/**
	* Caches the j s entry in the entity cache if it is enabled.
	*
	* @param jsEntry the j s entry to cache
	*/
	public static void cacheResult(com.liferay.portlet.js.model.JSEntry jsEntry) {
		getPersistence().cacheResult(jsEntry);
	}

	/**
	* Caches the j s entries in the entity cache if it is enabled.
	*
	* @param jsEntries the j s entries to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portlet.js.model.JSEntry> jsEntries) {
		getPersistence().cacheResult(jsEntries);
	}

	/**
	* Creates a new j s entry with the primary key. Does not add the j s entry to the database.
	*
	* @param jsEntryId the primary key for the new j s entry
	* @return the new j s entry
	*/
	public static com.liferay.portlet.js.model.JSEntry create(long jsEntryId) {
		return getPersistence().create(jsEntryId);
	}

	/**
	* Removes the j s entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntryId the primary key of the j s entry to remove
	* @return the j s entry that was removed
	* @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry remove(long jsEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence().remove(jsEntryId);
	}

	public static com.liferay.portlet.js.model.JSEntry updateImpl(
		com.liferay.portlet.js.model.JSEntry jsEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(jsEntry, merge);
	}

	/**
	* Finds the j s entry with the primary key or throws a {@link com.liferay.portlet.js.NoSuchEntryException} if it could not be found.
	*
	* @param jsEntryId the primary key of the j s entry to find
	* @return the j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByPrimaryKey(
		long jsEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence().findByPrimaryKey(jsEntryId);
	}

	/**
	* Finds the j s entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jsEntryId the primary key of the j s entry to find
	* @return the j s entry, or <code>null</code> if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry fetchByPrimaryKey(
		long jsEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jsEntryId);
	}

	/**
	* Finds all the j s entries where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Finds a range of all the j s entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @return the range of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Finds an ordered range of all the j s entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Finds the first j s entry in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Finds the last j s entry in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Finds the j s entries before and after the current j s entry in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param jsEntryId the primary key of the current j s entry
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry[] findByUuid_PrevAndNext(
		long jsEntryId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence()
				   .findByUuid_PrevAndNext(jsEntryId, uuid, orderByComparator);
	}

	/**
	* Finds the j s entry where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.portlet.js.NoSuchEntryException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Finds the j s entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Finds the j s entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Finds all the j s entries where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the j s entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @return the range of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the j s entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first j s entry in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last j s entry in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the j s entries before and after the current j s entry in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param jsEntryId the primary key of the current j s entry
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry[] findByGroupId_PrevAndNext(
		long jsEntryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(jsEntryId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the j s entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @return the matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByClassNameId_ClassPK(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByClassNameId_ClassPK(classNameId, classPK);
	}

	/**
	* Finds a range of all the j s entries where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @return the range of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByClassNameId_ClassPK(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByClassNameId_ClassPK(classNameId, classPK, start, end);
	}

	/**
	* Finds an ordered range of all the j s entries where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findByClassNameId_ClassPK(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByClassNameId_ClassPK(classNameId, classPK, start, end,
			orderByComparator);
	}

	/**
	* Finds the first j s entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByClassNameId_ClassPK_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence()
				   .findByClassNameId_ClassPK_First(classNameId, classPK,
			orderByComparator);
	}

	/**
	* Finds the last j s entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByClassNameId_ClassPK_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence()
				   .findByClassNameId_ClassPK_Last(classNameId, classPK,
			orderByComparator);
	}

	/**
	* Finds the j s entries before and after the current j s entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param jsEntryId the primary key of the current j s entry
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry[] findByClassNameId_ClassPK_PrevAndNext(
		long jsEntryId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence()
				   .findByClassNameId_ClassPK_PrevAndNext(jsEntryId,
			classNameId, classPK, orderByComparator);
	}

	/**
	* Finds the j s entry where classNameId = &#63; and classPK = &#63; and version = &#63; or throws a {@link com.liferay.portlet.js.NoSuchEntryException} if it could not be found.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @return the matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry findByClassNameId_ClassPK_Version(
		long classNameId, long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		return getPersistence()
				   .findByClassNameId_ClassPK_Version(classNameId, classPK,
			version);
	}

	/**
	* Finds the j s entry where classNameId = &#63; and classPK = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry fetchByClassNameId_ClassPK_Version(
		long classNameId, long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByClassNameId_ClassPK_Version(classNameId, classPK,
			version);
	}

	/**
	* Finds the j s entry where classNameId = &#63; and classPK = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.js.model.JSEntry fetchByClassNameId_ClassPK_Version(
		long classNameId, long classPK, double version,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByClassNameId_ClassPK_Version(classNameId, classPK,
			version, retrieveFromCache);
	}

	/**
	* Finds all the j s entries.
	*
	* @return the j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the j s entries.
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
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the j s entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of j s entries to return
	* @param end the upper bound of the range of j s entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.js.model.JSEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the j s entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes the j s entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Removes all the j s entries where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the j s entries where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByClassNameId_ClassPK(long classNameId,
		long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByClassNameId_ClassPK(classNameId, classPK);
	}

	/**
	* Removes the j s entry where classNameId = &#63; and classPK = &#63; and version = &#63; from the database.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException {
		getPersistence()
			.removeByClassNameId_ClassPK_Version(classNameId, classPK, version);
	}

	/**
	* Removes all the j s entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the j s entries where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Counts all the j s entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Counts all the j s entries where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the j s entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByClassNameId_ClassPK(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByClassNameId_ClassPK(classNameId, classPK);
	}

	/**
	* Counts all the j s entries where classNameId = &#63; and classPK = &#63; and version = &#63;.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByClassNameId_ClassPK_Version(classNameId, classPK,
			version);
	}

	/**
	* Counts all the j s entries.
	*
	* @return the number of j s entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static JSEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (JSEntryPersistence)PortletBeanLocatorUtil.locate(com.liferay.portlet.js.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					JSEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(JSEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(JSEntryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(JSEntryUtil.class, "_persistence");
	}

	private static JSEntryPersistence _persistence;
}