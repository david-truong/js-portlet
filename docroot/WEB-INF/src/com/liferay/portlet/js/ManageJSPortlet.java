package com.liferay.portlet.js;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portlet.js.model.JSEntry;
import com.liferay.portlet.js.service.JSEntryLocalServiceUtil;
import com.liferay.portlet.js.util.JSUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
public class ManageJSPortlet extends MVCPortlet {

	public void updateJS(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long classNameId = ParamUtil.getLong(actionRequest, "classNameId");
		long classPK = ParamUtil.getLong(actionRequest, "classPK");

		double version = ParamUtil.getDouble(actionRequest, "version");

		String js = ParamUtil.getString(actionRequest, "js");
		String cmd = ParamUtil.getString(actionRequest, "cmd");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			JSEntry.class.getName(), actionRequest);

		if (cmd.equals("new")) {
			JSEntryLocalServiceUtil.addEntry(
				classNameId, classPK, js, serviceContext);
		}
		if (cmd.equals("save")) {
			JSEntryLocalServiceUtil.updateEntry(
				classNameId, classPK, version, js, serviceContext);
		}
		else if (cmd.equals("increment")) {
			JSEntryLocalServiceUtil.addEntry(
				classNameId, classPK, JSUtil.increment(version), js,
				serviceContext);
		}
		else if (cmd.equals("delete")) {
			JSEntryLocalServiceUtil.deleteJSEntry(
				classNameId, classPK, version);
		}

	}

}