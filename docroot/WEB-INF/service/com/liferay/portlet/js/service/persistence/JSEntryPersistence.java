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

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.portlet.js.model.JSEntry;

/**
 * The persistence interface for the j s entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JSEntryPersistenceImpl
 * @see JSEntryUtil
 * @generated
 */
public interface JSEntryPersistence extends BasePersistence<JSEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JSEntryUtil} to access the j s entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the j s entry in the entity cache if it is enabled.
	*
	* @param jsEntry the j s entry to cache
	*/
	public void cacheResult(com.liferay.portlet.js.model.JSEntry jsEntry);

	/**
	* Caches the j s entries in the entity cache if it is enabled.
	*
	* @param jsEntries the j s entries to cache
	*/
	public void cacheResult(
		java.util.List<com.liferay.portlet.js.model.JSEntry> jsEntries);

	/**
	* Creates a new j s entry with the primary key. Does not add the j s entry to the database.
	*
	* @param jsEntryId the primary key for the new j s entry
	* @return the new j s entry
	*/
	public com.liferay.portlet.js.model.JSEntry create(long jsEntryId);

	/**
	* Removes the j s entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jsEntryId the primary key of the j s entry to remove
	* @return the j s entry that was removed
	* @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry remove(long jsEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	public com.liferay.portlet.js.model.JSEntry updateImpl(
		com.liferay.portlet.js.model.JSEntry jsEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the j s entry with the primary key or throws a {@link com.liferay.portlet.js.NoSuchEntryException} if it could not be found.
	*
	* @param jsEntryId the primary key of the j s entry to find
	* @return the j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry findByPrimaryKey(long jsEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	/**
	* Finds the j s entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jsEntryId the primary key of the j s entry to find
	* @return the j s entry, or <code>null</code> if a j s entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry fetchByPrimaryKey(
		long jsEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the j s entries where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.portlet.js.model.JSEntry findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

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
	public com.liferay.portlet.js.model.JSEntry findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

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
	public com.liferay.portlet.js.model.JSEntry[] findByUuid_PrevAndNext(
		long jsEntryId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	/**
	* Finds the j s entry where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.portlet.js.NoSuchEntryException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching j s entry
	* @throws com.liferay.portlet.js.NoSuchEntryException if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	/**
	* Finds the j s entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the j s entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the j s entries where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.portlet.js.model.JSEntry findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

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
	public com.liferay.portlet.js.model.JSEntry findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

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
	public com.liferay.portlet.js.model.JSEntry[] findByGroupId_PrevAndNext(
		long jsEntryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	/**
	* Finds all the j s entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @return the matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByClassNameId_ClassPK(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByClassNameId_ClassPK(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findByClassNameId_ClassPK(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.portlet.js.model.JSEntry findByClassNameId_ClassPK_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

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
	public com.liferay.portlet.js.model.JSEntry findByClassNameId_ClassPK_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

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
	public com.liferay.portlet.js.model.JSEntry[] findByClassNameId_ClassPK_PrevAndNext(
		long jsEntryId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

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
	public com.liferay.portlet.js.model.JSEntry findByClassNameId_ClassPK_Version(
		long classNameId, long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	/**
	* Finds the j s entry where classNameId = &#63; and classPK = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry fetchByClassNameId_ClassPK_Version(
		long classNameId, long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the j s entry where classNameId = &#63; and classPK = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.js.model.JSEntry fetchByClassNameId_ClassPK_Version(
		long classNameId, long classPK, double version,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the j s entries.
	*
	* @return the j s entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.js.model.JSEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the j s entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the j s entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	/**
	* Removes all the j s entries where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the j s entries where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByClassNameId_ClassPK(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the j s entry where classNameId = &#63; and classPK = &#63; and version = &#63; from the database.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.js.NoSuchEntryException;

	/**
	* Removes all the j s entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the j s entries where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the j s entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the j s entries where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the j s entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByClassNameId_ClassPK(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the j s entries where classNameId = &#63; and classPK = &#63; and version = &#63;.
	*
	* @param classNameId the class name id to search with
	* @param classPK the class p k to search with
	* @param version the version to search with
	* @return the number of matching j s entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the j s entries.
	*
	* @return the number of j s entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}