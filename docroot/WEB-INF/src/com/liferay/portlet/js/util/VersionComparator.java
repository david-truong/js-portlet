/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.js.util;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portlet.js.model.JSEntry;

/**
 * @author David Truong
 */
public class VersionComparator extends OrderByComparator {

	public static String ORDER_BY_ASC = "version ASC";

	public static String ORDER_BY_DESC = "version DESC";

	public static String[] ORDER_BY_FIELDS = {"version"};

	public VersionComparator() {
		this(false);
	}

	public VersionComparator(boolean ascending) {
		_ascending = ascending;
	}

	public int compare(Object obj1, Object obj2) {
		JSEntry jsEntry1 = (JSEntry)obj1;
		JSEntry jsEntry2 = (JSEntry)obj2;

		int value = Double.compare(
			jsEntry1.getVersion(), jsEntry2.getVersion());

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}

	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	public boolean isAscending() {
		return _ascending;
	}

	private boolean _ascending;

}