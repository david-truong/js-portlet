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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link com.liferay.portlet.js.service.http.JSEntryServiceSoap}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       com.liferay.portlet.js.service.http.JSEntryServiceSoap
 * @generated
 */
public class JSEntrySoap implements Serializable {
	public static JSEntrySoap toSoapModel(JSEntry model) {
		JSEntrySoap soapModel = new JSEntrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setJsEntryId(model.getJsEntryId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setJs(model.getJs());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setVersion(model.getVersion());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static JSEntrySoap[] toSoapModels(JSEntry[] models) {
		JSEntrySoap[] soapModels = new JSEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JSEntrySoap[][] toSoapModels(JSEntry[][] models) {
		JSEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JSEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new JSEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JSEntrySoap[] toSoapModels(List<JSEntry> models) {
		List<JSEntrySoap> soapModels = new ArrayList<JSEntrySoap>(models.size());

		for (JSEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JSEntrySoap[soapModels.size()]);
	}

	public JSEntrySoap() {
	}

	public long getPrimaryKey() {
		return _jsEntryId;
	}

	public void setPrimaryKey(long pk) {
		setJsEntryId(pk);
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