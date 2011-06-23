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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
public class JSEntryClp extends BaseModelImpl<JSEntry> implements JSEntry {
	public JSEntryClp() {
	}

	public long getPrimaryKey() {
		return _jsEntryId;
	}

	public void setPrimaryKey(long pk) {
		setJsEntryId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_jsEntryId);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getJsEntryId() {
		return _jsEntryId;
	}

	public void setJsEntryId(long jsEntryId) {
		_jsEntryId = jsEntryId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getJs() {
		return _js;
	}

	public void setJs(String js) {
		_js = js;
	}

	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public double getVersion() {
		return _version;
	}

	public void setVersion(double version) {
		_version = version;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public JSEntry toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (JSEntry)Proxy.newProxyInstance(JSEntry.class.getClassLoader(),
				new Class[] { JSEntry.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		JSEntryClp clone = new JSEntryClp();

		clone.setUuid(getUuid());
		clone.setJsEntryId(getJsEntryId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setJs(getJs());
		clone.setClassNameId(getClassNameId());
		clone.setClassPK(getClassPK());
		clone.setGroupId(getGroupId());
		clone.setVersion(getVersion());
		clone.setStatus(getStatus());
		clone.setStatusDate(getStatusDate());

		return clone;
	}

	public int compareTo(JSEntry jsEntry) {
		int value = 0;

		if (getClassNameId() < jsEntry.getClassNameId()) {
			value = -1;
		}
		else if (getClassNameId() > jsEntry.getClassNameId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getClassPK() < jsEntry.getClassPK()) {
			value = -1;
		}
		else if (getClassPK() > jsEntry.getClassPK()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getVersion() < jsEntry.getVersion()) {
			value = -1;
		}
		else if (getVersion() > jsEntry.getVersion()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		JSEntryClp jsEntry = null;

		try {
			jsEntry = (JSEntryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = jsEntry.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", jsEntryId=");
		sb.append(getJsEntryId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", js=");
		sb.append(getJs());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.js.model.JSEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsEntryId</column-name><column-value><![CDATA[");
		sb.append(getJsEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>js</column-name><column-value><![CDATA[");
		sb.append(getJs());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _jsEntryId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _js;
	private long _classNameId;
	private long _classPK;
	private long _groupId;
	private double _version;
	private int _status;
	private Date _statusDate;
}