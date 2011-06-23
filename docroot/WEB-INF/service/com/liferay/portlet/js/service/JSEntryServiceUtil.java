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
 * The utility for the j s entry remote service. This utility wraps {@link com.liferay.portlet.js.service.impl.JSEntryServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JSEntryService
 * @see com.liferay.portlet.js.service.base.JSEntryServiceBaseImpl
 * @see com.liferay.portlet.js.service.impl.JSEntryServiceImpl
 * @generated
 */
public class JSEntryServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.js.service.impl.JSEntryServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portlet.js.model.JSEntry getJSEntry(
		long classNameId, long classPK, double version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJSEntry(classNameId, classPK, version);
	}

	public static void clearService() {
		_service = null;
	}

	public static JSEntryService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					JSEntryService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					JSEntryService.class.getName(), portletClassLoader);

			_service = new JSEntryServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(JSEntryServiceUtil.class,
				"_service");
			MethodCache.remove(JSEntryService.class);
		}

		return _service;
	}

	public void setService(JSEntryService service) {
		MethodCache.remove(JSEntryService.class);

		_service = service;

		ReferenceRegistry.registerReference(JSEntryServiceUtil.class, "_service");
		MethodCache.remove(JSEntryService.class);
	}

	private static JSEntryService _service;
}