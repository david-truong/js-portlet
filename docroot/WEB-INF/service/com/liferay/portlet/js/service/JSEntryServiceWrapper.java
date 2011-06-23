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
 * This class is a wrapper for {@link JSEntryService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JSEntryService
 * @generated
 */
public class JSEntryServiceWrapper implements JSEntryService {
	public JSEntryServiceWrapper(JSEntryService jsEntryService) {
		_jsEntryService = jsEntryService;
	}

	public com.liferay.portlet.js.model.JSEntry getJSEntry(long classNameId,
		long classPK, double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jsEntryService.getJSEntry(classNameId, classPK, version);
	}

	public JSEntryService getWrappedJSEntryService() {
		return _jsEntryService;
	}

	public void setWrappedJSEntryService(JSEntryService jsEntryService) {
		_jsEntryService = jsEntryService;
	}

	private JSEntryService _jsEntryService;
}