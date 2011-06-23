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

package com.liferay.portlet.js.model;

/**
 * <p>
 * This class is a wrapper for {@link JSEntry}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JSEntry
 * @generated
 */
public class JSEntryWrapper implements JSEntry {
	public JSEntryWrapper(JSEntry jsEntry) {
		_jsEntry = jsEntry;
	}

	/**
	* Gets the primary key of this j s entry.
	*
	* @return the primary key of this j s entry
	*/
	public long getPrimaryKey() {
		return _jsEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this j s entry
	*
	* @param pk the primary key of this j s entry
	*/
	public void setPrimaryKey(long pk) {
		_jsEntry.setPrimaryKey(pk);
	}

	/**
	* Gets the uuid of this j s entry.
	*
	* @return the uuid of this j s entry
	*/
	public java.lang.String getUuid() {
		return _jsEntry.getUuid();
	}

	/**
	* Sets the uuid of this j s entry.
	*
	* @param uuid the uuid of this j s entry
	*/
	public void setUuid(java.lang.String uuid) {
		_jsEntry.setUuid(uuid);
	}

	/**
	* Gets the js entry id of this j s entry.
	*
	* @return the js entry id of this j s entry
	*/
	public long getJsEntryId() {
		return _jsEntry.getJsEntryId();
	}

	/**
	* Sets the js entry id of this j s entry.
	*
	* @param jsEntryId the js entry id of this j s entry
	*/
	public void setJsEntryId(long jsEntryId) {
		_jsEntry.setJsEntryId(jsEntryId);
	}

	/**
	* Gets the create date of this j s entry.
	*
	* @return the create date of this j s entry
	*/
	public java.util.Date getCreateDate() {
		return _jsEntry.getCreateDate();
	}

	/**
	* Sets the create date of this j s entry.
	*
	* @param createDate the create date of this j s entry
	*/
	public void setCreateDate(java.util.Date createDate) {
		_jsEntry.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this j s entry.
	*
	* @return the modified date of this j s entry
	*/
	public java.util.Date getModifiedDate() {
		return _jsEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this j s entry.
	*
	* @param modifiedDate the modified date of this j s entry
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_jsEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the js of this j s entry.
	*
	* @return the js of this j s entry
	*/
	public java.lang.String getJs() {
		return _jsEntry.getJs();
	}

	/**
	* Sets the js of this j s entry.
	*
	* @param js the js of this j s entry
	*/
	public void setJs(java.lang.String js) {
		_jsEntry.setJs(js);
	}

	/**
	* Gets the class name of the model instance this j s entry is polymorphically associated with.
	*
	* @return the class name of the model instance this j s entry is polymorphically associated with
	*/
	public java.lang.String getClassName() {
		return _jsEntry.getClassName();
	}

	/**
	* Gets the class name id of this j s entry.
	*
	* @return the class name id of this j s entry
	*/
	public long getClassNameId() {
		return _jsEntry.getClassNameId();
	}

	/**
	* Sets the class name id of this j s entry.
	*
	* @param classNameId the class name id of this j s entry
	*/
	public void setClassNameId(long classNameId) {
		_jsEntry.setClassNameId(classNameId);
	}

	/**
	* Gets the class p k of this j s entry.
	*
	* @return the class p k of this j s entry
	*/
	public long getClassPK() {
		return _jsEntry.getClassPK();
	}

	/**
	* Sets the class p k of this j s entry.
	*
	* @param classPK the class p k of this j s entry
	*/
	public void setClassPK(long classPK) {
		_jsEntry.setClassPK(classPK);
	}

	/**
	* Gets the group id of this j s entry.
	*
	* @return the group id of this j s entry
	*/
	public long getGroupId() {
		return _jsEntry.getGroupId();
	}

	/**
	* Sets the group id of this j s entry.
	*
	* @param groupId the group id of this j s entry
	*/
	public void setGroupId(long groupId) {
		_jsEntry.setGroupId(groupId);
	}

	/**
	* Gets the version of this j s entry.
	*
	* @return the version of this j s entry
	*/
	public double getVersion() {
		return _jsEntry.getVersion();
	}

	/**
	* Sets the version of this j s entry.
	*
	* @param version the version of this j s entry
	*/
	public void setVersion(double version) {
		_jsEntry.setVersion(version);
	}

	/**
	* Gets the status of this j s entry.
	*
	* @return the status of this j s entry
	*/
	public int getStatus() {
		return _jsEntry.getStatus();
	}

	/**
	* Sets the status of this j s entry.
	*
	* @param status the status of this j s entry
	*/
	public void setStatus(int status) {
		_jsEntry.setStatus(status);
	}

	/**
	* Gets the status date of this j s entry.
	*
	* @return the status date of this j s entry
	*/
	public java.util.Date getStatusDate() {
		return _jsEntry.getStatusDate();
	}

	/**
	* Sets the status date of this j s entry.
	*
	* @param statusDate the status date of this j s entry
	*/
	public void setStatusDate(java.util.Date statusDate) {
		_jsEntry.setStatusDate(statusDate);
	}

	public boolean isNew() {
		return _jsEntry.isNew();
	}

	public void setNew(boolean n) {
		_jsEntry.setNew(n);
	}

	public boolean isCachedModel() {
		return _jsEntry.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_jsEntry.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _jsEntry.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_jsEntry.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _jsEntry.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jsEntry.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jsEntry.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new JSEntryWrapper((JSEntry)_jsEntry.clone());
	}

	public int compareTo(com.liferay.portlet.js.model.JSEntry jsEntry) {
		return _jsEntry.compareTo(jsEntry);
	}

	public int hashCode() {
		return _jsEntry.hashCode();
	}

	public com.liferay.portlet.js.model.JSEntry toEscapedModel() {
		return new JSEntryWrapper(_jsEntry.toEscapedModel());
	}

	public java.lang.String toString() {
		return _jsEntry.toString();
	}

	public java.lang.String toXmlString() {
		return _jsEntry.toXmlString();
	}

	public JSEntry getWrappedJSEntry() {
		return _jsEntry;
	}

	private JSEntry _jsEntry;
}