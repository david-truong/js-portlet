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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import com.liferay.portlet.js.model.JSEntryClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "js-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(JSEntryClp.class.getName())) {
			JSEntryClp oldCplModel = (JSEntryClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.liferay.portlet.js.model.impl.JSEntryImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setUuid",
							new Class[] { String.class });

					String value0 = oldCplModel.getUuid();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setJsEntryId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getJsEntryId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCreateDate",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getCreateDate();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value3 = oldCplModel.getModifiedDate();

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setJs",
							new Class[] { String.class });

					String value4 = oldCplModel.getJs();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setClassNameId",
							new Class[] { Long.TYPE });

					Long value5 = new Long(oldCplModel.getClassNameId());

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setClassPK",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getClassPK());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value7 = new Long(oldCplModel.getGroupId());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setVersion",
							new Class[] { Double.TYPE });

					Double value8 = new Double(oldCplModel.getVersion());

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setStatus",
							new Class[] { Integer.TYPE });

					Integer value9 = new Integer(oldCplModel.getStatus());

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setStatusDate",
							new Class[] { Date.class });

					Date value10 = oldCplModel.getStatusDate();

					method10.invoke(newModel, value10);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.liferay.portlet.js.model.impl.JSEntryImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					JSEntryClp newModel = new JSEntryClp();

					Method method0 = oldModelClass.getMethod("getUuid");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setUuid(value0);

					Method method1 = oldModelClass.getMethod("getJsEntryId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setJsEntryId(value1);

					Method method2 = oldModelClass.getMethod("getCreateDate");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setCreateDate(value2);

					Method method3 = oldModelClass.getMethod("getModifiedDate");

					Date value3 = (Date)method3.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value3);

					Method method4 = oldModelClass.getMethod("getJs");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setJs(value4);

					Method method5 = oldModelClass.getMethod("getClassNameId");

					Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

					newModel.setClassNameId(value5);

					Method method6 = oldModelClass.getMethod("getClassPK");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setClassPK(value6);

					Method method7 = oldModelClass.getMethod("getGroupId");

					Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value7);

					Method method8 = oldModelClass.getMethod("getVersion");

					Double value8 = (Double)method8.invoke(oldModel,
							(Object[])null);

					newModel.setVersion(value8);

					Method method9 = oldModelClass.getMethod("getStatus");

					Integer value9 = (Integer)method9.invoke(oldModel,
							(Object[])null);

					newModel.setStatus(value9);

					Method method10 = oldModelClass.getMethod("getStatusDate");

					Date value10 = (Date)method10.invoke(oldModel,
							(Object[])null);

					newModel.setStatusDate(value10);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}