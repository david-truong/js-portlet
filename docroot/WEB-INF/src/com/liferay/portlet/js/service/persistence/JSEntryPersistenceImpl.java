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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.portlet.js.NoSuchEntryException;
import com.liferay.portlet.js.model.JSEntry;
import com.liferay.portlet.js.model.impl.JSEntryImpl;
import com.liferay.portlet.js.model.impl.JSEntryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the j s entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JSEntryPersistence
 * @see JSEntryUtil
 * @generated
 */
public class JSEntryPersistenceImpl extends BasePersistenceImpl<JSEntry>
	implements JSEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JSEntryUtil} to access the j s entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JSEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_UUID = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUuid", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_CLASSNAMEID_CLASSPK = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByClassNameId_ClassPK",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_CLASSNAMEID_CLASSPK = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByClassNameId_ClassPK",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION =
		new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByClassNameId_ClassPK_Version",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Double.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_CLASSNAMEID_CLASSPK_VERSION =
		new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByClassNameId_ClassPK_Version",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Double.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the j s entry in the entity cache if it is enabled.
	 *
	 * @param jsEntry the j s entry to cache
	 */
	public void cacheResult(JSEntry jsEntry) {
		EntityCacheUtil.putResult(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryImpl.class, jsEntry.getPrimaryKey(), jsEntry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { jsEntry.getUuid(), new Long(jsEntry.getGroupId()) },
			jsEntry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
			new Object[] {
				new Long(jsEntry.getClassNameId()),
				new Long(jsEntry.getClassPK()), new Double(jsEntry.getVersion())
			}, jsEntry);
	}

	/**
	 * Caches the j s entries in the entity cache if it is enabled.
	 *
	 * @param jsEntries the j s entries to cache
	 */
	public void cacheResult(List<JSEntry> jsEntries) {
		for (JSEntry jsEntry : jsEntries) {
			if (EntityCacheUtil.getResult(
						JSEntryModelImpl.ENTITY_CACHE_ENABLED,
						JSEntryImpl.class, jsEntry.getPrimaryKey(), this) == null) {
				cacheResult(jsEntry);
			}
		}
	}

	/**
	 * Clears the cache for all j s entries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(JSEntryImpl.class.getName());
		EntityCacheUtil.clearCache(JSEntryImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the j s entry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(JSEntry jsEntry) {
		EntityCacheUtil.removeResult(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryImpl.class, jsEntry.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { jsEntry.getUuid(), new Long(jsEntry.getGroupId()) });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
			new Object[] {
				new Long(jsEntry.getClassNameId()),
				new Long(jsEntry.getClassPK()), new Double(jsEntry.getVersion())
			});
	}

	/**
	 * Creates a new j s entry with the primary key. Does not add the j s entry to the database.
	 *
	 * @param jsEntryId the primary key for the new j s entry
	 * @return the new j s entry
	 */
	public JSEntry create(long jsEntryId) {
		JSEntry jsEntry = new JSEntryImpl();

		jsEntry.setNew(true);
		jsEntry.setPrimaryKey(jsEntryId);

		String uuid = PortalUUIDUtil.generate();

		jsEntry.setUuid(uuid);

		return jsEntry;
	}

	/**
	 * Removes the j s entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the j s entry to remove
	 * @return the j s entry that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a j s entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the j s entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jsEntryId the primary key of the j s entry to remove
	 * @return the j s entry that was removed
	 * @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry remove(long jsEntryId)
		throws NoSuchEntryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			JSEntry jsEntry = (JSEntry)session.get(JSEntryImpl.class,
					new Long(jsEntryId));

			if (jsEntry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + jsEntryId);
				}

				throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					jsEntryId);
			}

			return remove(jsEntry);
		}
		catch (NoSuchEntryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected JSEntry removeImpl(JSEntry jsEntry) throws SystemException {
		jsEntry = toUnwrappedModel(jsEntry);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, jsEntry);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		JSEntryModelImpl jsEntryModelImpl = (JSEntryModelImpl)jsEntry;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				jsEntryModelImpl.getOriginalUuid(),
				new Long(jsEntryModelImpl.getOriginalGroupId())
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
			new Object[] {
				new Long(jsEntryModelImpl.getOriginalClassNameId()),
				new Long(jsEntryModelImpl.getOriginalClassPK()),
				new Double(jsEntryModelImpl.getOriginalVersion())
			});

		EntityCacheUtil.removeResult(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryImpl.class, jsEntry.getPrimaryKey());

		return jsEntry;
	}

	public JSEntry updateImpl(com.liferay.portlet.js.model.JSEntry jsEntry,
		boolean merge) throws SystemException {
		jsEntry = toUnwrappedModel(jsEntry);

		boolean isNew = jsEntry.isNew();

		JSEntryModelImpl jsEntryModelImpl = (JSEntryModelImpl)jsEntry;

		if (Validator.isNull(jsEntry.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jsEntry.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, jsEntry, merge);

			jsEntry.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
			JSEntryImpl.class, jsEntry.getPrimaryKey(), jsEntry);

		if (!isNew &&
				(!Validator.equals(jsEntry.getUuid(),
					jsEntryModelImpl.getOriginalUuid()) ||
				(jsEntry.getGroupId() != jsEntryModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
				new Object[] {
					jsEntryModelImpl.getOriginalUuid(),
					new Long(jsEntryModelImpl.getOriginalGroupId())
				});
		}

		if (isNew ||
				(!Validator.equals(jsEntry.getUuid(),
					jsEntryModelImpl.getOriginalUuid()) ||
				(jsEntry.getGroupId() != jsEntryModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
				new Object[] { jsEntry.getUuid(), new Long(jsEntry.getGroupId()) },
				jsEntry);
		}

		if (!isNew &&
				((jsEntry.getClassNameId() != jsEntryModelImpl.getOriginalClassNameId()) ||
				(jsEntry.getClassPK() != jsEntryModelImpl.getOriginalClassPK()) ||
				(jsEntry.getVersion() != jsEntryModelImpl.getOriginalVersion()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
				new Object[] {
					new Long(jsEntryModelImpl.getOriginalClassNameId()),
					new Long(jsEntryModelImpl.getOriginalClassPK()),
					new Double(jsEntryModelImpl.getOriginalVersion())
				});
		}

		if (isNew ||
				((jsEntry.getClassNameId() != jsEntryModelImpl.getOriginalClassNameId()) ||
				(jsEntry.getClassPK() != jsEntryModelImpl.getOriginalClassPK()) ||
				(jsEntry.getVersion() != jsEntryModelImpl.getOriginalVersion()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
				new Object[] {
					new Long(jsEntry.getClassNameId()),
					new Long(jsEntry.getClassPK()),
					new Double(jsEntry.getVersion())
				}, jsEntry);
		}

		return jsEntry;
	}

	protected JSEntry toUnwrappedModel(JSEntry jsEntry) {
		if (jsEntry instanceof JSEntryImpl) {
			return jsEntry;
		}

		JSEntryImpl jsEntryImpl = new JSEntryImpl();

		jsEntryImpl.setNew(jsEntry.isNew());
		jsEntryImpl.setPrimaryKey(jsEntry.getPrimaryKey());

		jsEntryImpl.setUuid(jsEntry.getUuid());
		jsEntryImpl.setJsEntryId(jsEntry.getJsEntryId());
		jsEntryImpl.setCreateDate(jsEntry.getCreateDate());
		jsEntryImpl.setModifiedDate(jsEntry.getModifiedDate());
		jsEntryImpl.setJs(jsEntry.getJs());
		jsEntryImpl.setClassNameId(jsEntry.getClassNameId());
		jsEntryImpl.setClassPK(jsEntry.getClassPK());
		jsEntryImpl.setGroupId(jsEntry.getGroupId());
		jsEntryImpl.setVersion(jsEntry.getVersion());
		jsEntryImpl.setStatus(jsEntry.getStatus());
		jsEntryImpl.setStatusDate(jsEntry.getStatusDate());

		return jsEntryImpl;
	}

	/**
	 * Finds the j s entry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the j s entry to find
	 * @return the j s entry
	 * @throws com.liferay.portal.NoSuchModelException if a j s entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the j s entry with the primary key or throws a {@link com.liferay.portlet.js.NoSuchEntryException} if it could not be found.
	 *
	 * @param jsEntryId the primary key of the j s entry to find
	 * @return the j s entry
	 * @throws com.liferay.portlet.js.NoSuchEntryException if a j s entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry findByPrimaryKey(long jsEntryId)
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = fetchByPrimaryKey(jsEntryId);

		if (jsEntry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + jsEntryId);
			}

			throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				jsEntryId);
		}

		return jsEntry;
	}

	/**
	 * Finds the j s entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the j s entry to find
	 * @return the j s entry, or <code>null</code> if a j s entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the j s entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jsEntryId the primary key of the j s entry to find
	 * @return the j s entry, or <code>null</code> if a j s entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry fetchByPrimaryKey(long jsEntryId) throws SystemException {
		JSEntry jsEntry = (JSEntry)EntityCacheUtil.getResult(JSEntryModelImpl.ENTITY_CACHE_ENABLED,
				JSEntryImpl.class, jsEntryId, this);

		if (jsEntry == null) {
			Session session = null;

			try {
				session = openSession();

				jsEntry = (JSEntry)session.get(JSEntryImpl.class,
						new Long(jsEntryId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (jsEntry != null) {
					cacheResult(jsEntry);
				}

				closeSession(session);
			}
		}

		return jsEntry;
	}

	/**
	 * Finds all the j s entries where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the matching j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public List<JSEntry> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<JSEntry> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
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
	public List<JSEntry> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				uuid,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<JSEntry> list = (List<JSEntry>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_UUID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_JSENTRY_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(JSEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				list = (List<JSEntry>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public JSEntry findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		List<JSEntry> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEntryException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public JSEntry findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		int count = countByUuid(uuid);

		List<JSEntry> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEntryException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public JSEntry[] findByUuid_PrevAndNext(long jsEntryId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = findByPrimaryKey(jsEntryId);

		Session session = null;

		try {
			session = openSession();

			JSEntry[] array = new JSEntryImpl[3];

			array[0] = getByUuid_PrevAndNext(session, jsEntry, uuid,
					orderByComparator, true);

			array[1] = jsEntry;

			array[2] = getByUuid_PrevAndNext(session, jsEntry, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected JSEntry getByUuid_PrevAndNext(Session session, JSEntry jsEntry,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JSENTRY_WHERE);

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else {
			if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(JSEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (uuid != null) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(jsEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JSEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
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
	public JSEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = fetchByUUID_G(uuid, groupId);

		if (jsEntry == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEntryException(msg.toString());
		}

		return jsEntry;
	}

	/**
	 * Finds the j s entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Finds the j s entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching j s entry, or <code>null</code> if a matching j s entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public JSEntry fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_JSENTRY_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_G_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_G_UUID_2);
				}
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			query.append(JSEntryModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<JSEntry> list = q.list();

				result = list;

				JSEntry jsEntry = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					jsEntry = list.get(0);

					cacheResult(jsEntry);

					if ((jsEntry.getUuid() == null) ||
							!jsEntry.getUuid().equals(uuid) ||
							(jsEntry.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, jsEntry);
					}
				}

				return jsEntry;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (JSEntry)result;
			}
		}
	}

	/**
	 * Finds all the j s entries where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public List<JSEntry> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<JSEntry> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
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
	public List<JSEntry> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<JSEntry> list = (List<JSEntry>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_JSENTRY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(JSEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<JSEntry>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public JSEntry findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		List<JSEntry> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEntryException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public JSEntry findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		int count = countByGroupId(groupId);

		List<JSEntry> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEntryException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public JSEntry[] findByGroupId_PrevAndNext(long jsEntryId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = findByPrimaryKey(jsEntryId);

		Session session = null;

		try {
			session = openSession();

			JSEntry[] array = new JSEntryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, jsEntry, groupId,
					orderByComparator, true);

			array[1] = jsEntry;

			array[2] = getByGroupId_PrevAndNext(session, jsEntry, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected JSEntry getByGroupId_PrevAndNext(Session session,
		JSEntry jsEntry, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JSENTRY_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(JSEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(jsEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JSEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the j s entries where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name id to search with
	 * @param classPK the class p k to search with
	 * @return the matching j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public List<JSEntry> findByClassNameId_ClassPK(long classNameId,
		long classPK) throws SystemException {
		return findByClassNameId_ClassPK(classNameId, classPK,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<JSEntry> findByClassNameId_ClassPK(long classNameId,
		long classPK, int start, int end) throws SystemException {
		return findByClassNameId_ClassPK(classNameId, classPK, start, end, null);
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
	public List<JSEntry> findByClassNameId_ClassPK(long classNameId,
		long classPK, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				classNameId, classPK,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<JSEntry> list = (List<JSEntry>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_CLASSNAMEID_CLASSPK,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_JSENTRY_WHERE);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSPK_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(JSEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				list = (List<JSEntry>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_CLASSNAMEID_CLASSPK,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_CLASSNAMEID_CLASSPK,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public JSEntry findByClassNameId_ClassPK_First(long classNameId,
		long classPK, OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		List<JSEntry> list = findByClassNameId_ClassPK(classNameId, classPK, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("classNameId=");
			msg.append(classNameId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEntryException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public JSEntry findByClassNameId_ClassPK_Last(long classNameId,
		long classPK, OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		int count = countByClassNameId_ClassPK(classNameId, classPK);

		List<JSEntry> list = findByClassNameId_ClassPK(classNameId, classPK,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("classNameId=");
			msg.append(classNameId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEntryException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public JSEntry[] findByClassNameId_ClassPK_PrevAndNext(long jsEntryId,
		long classNameId, long classPK, OrderByComparator orderByComparator)
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = findByPrimaryKey(jsEntryId);

		Session session = null;

		try {
			session = openSession();

			JSEntry[] array = new JSEntryImpl[3];

			array[0] = getByClassNameId_ClassPK_PrevAndNext(session, jsEntry,
					classNameId, classPK, orderByComparator, true);

			array[1] = jsEntry;

			array[2] = getByClassNameId_ClassPK_PrevAndNext(session, jsEntry,
					classNameId, classPK, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected JSEntry getByClassNameId_ClassPK_PrevAndNext(Session session,
		JSEntry jsEntry, long classNameId, long classPK,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JSENTRY_WHERE);

		query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSNAMEID_2);

		query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSPK_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(JSEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(classNameId);

		qPos.add(classPK);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(jsEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JSEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
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
	public JSEntry findByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version)
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = fetchByClassNameId_ClassPK_Version(classNameId,
				classPK, version);

		if (jsEntry == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("classNameId=");
			msg.append(classNameId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(", version=");
			msg.append(version);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEntryException(msg.toString());
		}

		return jsEntry;
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
	public JSEntry fetchByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version) throws SystemException {
		return fetchByClassNameId_ClassPK_Version(classNameId, classPK,
			version, true);
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
	public JSEntry fetchByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { classNameId, classPK, version };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_JSENTRY_WHERE);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_CLASSPK_2);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_VERSION_2);

			query.append(JSEntryModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				qPos.add(version);

				List<JSEntry> list = q.list();

				result = list;

				JSEntry jsEntry = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
						finderArgs, list);
				}
				else {
					jsEntry = list.get(0);

					cacheResult(jsEntry);

					if ((jsEntry.getClassNameId() != classNameId) ||
							(jsEntry.getClassPK() != classPK) ||
							(jsEntry.getVersion() != version)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
							finderArgs, jsEntry);
					}
				}

				return jsEntry;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAMEID_CLASSPK_VERSION,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (JSEntry)result;
			}
		}
	}

	/**
	 * Finds all the j s entries.
	 *
	 * @return the j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public List<JSEntry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<JSEntry> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<JSEntry> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<JSEntry> list = (List<JSEntry>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JSENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JSENTRY.concat(JSEntryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<JSEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<JSEntry>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the j s entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUuid(String uuid) throws SystemException {
		for (JSEntry jsEntry : findByUuid(uuid)) {
			remove(jsEntry);
		}
	}

	/**
	 * Removes the j s entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUUID_G(String uuid, long groupId)
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = findByUUID_G(uuid, groupId);

		remove(jsEntry);
	}

	/**
	 * Removes all the j s entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (JSEntry jsEntry : findByGroupId(groupId)) {
			remove(jsEntry);
		}
	}

	/**
	 * Removes all the j s entries where classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param classNameId the class name id to search with
	 * @param classPK the class p k to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByClassNameId_ClassPK(long classNameId, long classPK)
		throws SystemException {
		for (JSEntry jsEntry : findByClassNameId_ClassPK(classNameId, classPK)) {
			remove(jsEntry);
		}
	}

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
		throws NoSuchEntryException, SystemException {
		JSEntry jsEntry = findByClassNameId_ClassPK_Version(classNameId,
				classPK, version);

		remove(jsEntry);
	}

	/**
	 * Removes all the j s entries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (JSEntry jsEntry : findAll()) {
			remove(jsEntry);
		}
	}

	/**
	 * Counts all the j s entries where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the number of matching j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUuid(String uuid) throws SystemException {
		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JSENTRY_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the j s entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the number of matching j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_JSENTRY_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_G_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_G_UUID_2);
				}
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the j s entries where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JSENTRY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the j s entries where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name id to search with
	 * @param classPK the class p k to search with
	 * @return the number of matching j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public int countByClassNameId_ClassPK(long classNameId, long classPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { classNameId, classPK };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CLASSNAMEID_CLASSPK,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_JSENTRY_WHERE);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSPK_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSNAMEID_CLASSPK,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
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
	public int countByClassNameId_ClassPK_Version(long classNameId,
		long classPK, double version) throws SystemException {
		Object[] finderArgs = new Object[] { classNameId, classPK, version };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CLASSNAMEID_CLASSPK_VERSION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_JSENTRY_WHERE);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_CLASSPK_2);

			query.append(_FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_VERSION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				qPos.add(version);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSNAMEID_CLASSPK_VERSION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the j s entries.
	 *
	 * @return the number of j s entries
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JSENTRY);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the j s entry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.portlet.js.model.JSEntry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<JSEntry>> listenersList = new ArrayList<ModelListener<JSEntry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<JSEntry>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(JSEntryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = JSEntryPersistence.class)
	protected JSEntryPersistence jsEntryPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_JSENTRY = "SELECT jsEntry FROM JSEntry jsEntry";
	private static final String _SQL_SELECT_JSENTRY_WHERE = "SELECT jsEntry FROM JSEntry jsEntry WHERE ";
	private static final String _SQL_COUNT_JSENTRY = "SELECT COUNT(jsEntry) FROM JSEntry jsEntry";
	private static final String _SQL_COUNT_JSENTRY_WHERE = "SELECT COUNT(jsEntry) FROM JSEntry jsEntry WHERE ";
	private static final String _FINDER_COLUMN_UUID_UUID_1 = "jsEntry.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "jsEntry.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(jsEntry.uuid IS NULL OR jsEntry.uuid = ?)";
	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "jsEntry.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "jsEntry.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(jsEntry.uuid IS NULL OR jsEntry.uuid = ?) AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "jsEntry.groupId = ?";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "jsEntry.groupId = ?";
	private static final String _FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSNAMEID_2 =
		"jsEntry.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMEID_CLASSPK_CLASSPK_2 = "jsEntry.classPK = ?";
	private static final String _FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_CLASSNAMEID_2 =
		"jsEntry.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_CLASSPK_2 =
		"jsEntry.classPK = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMEID_CLASSPK_VERSION_VERSION_2 =
		"jsEntry.version = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jsEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JSEntry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No JSEntry exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(JSEntryPersistenceImpl.class);
}