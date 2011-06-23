package com.liferay.portlet.js.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.service.LayoutSetLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.js.model.JSEntry;
import com.liferay.portlet.js.service.JSEntryLocalServiceUtil;
import com.liferay.util.servlet.ServletResponseUtil;

public class JSServlet extends HttpServlet {

	public void service(
			HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		
		response.setContentType(ContentTypes.TEXT_JAVASCRIPT);
		
		String js = StringPool.BLANK;

		long classNameId = 0;
		long classPK = 0;

		String scope = request.getServletPath();

		if (scope.equals("/page.js")) {
			classNameId = PortalUtil.getClassNameId(Layout.class);
			classPK = ParamUtil.getLong(request, "plid");
		}
		else if (scope.equals("/site.js")) {
			boolean privateLayout = ParamUtil.getBoolean(request, "privateLayout");
			long groupId = ParamUtil.getLong(request, "groupId");
			try {
				classPK = LayoutSetLocalServiceUtil.getLayoutSet(groupId, privateLayout).getLayoutSetId();
			}
			catch (Exception e) {}
			classNameId = PortalUtil.getClassNameId(LayoutSet.class);
		}
		else if (scope.equals("/global.js")) {
			classNameId = PortalUtil.getClassNameId(Company.class);
			classPK = PortalUtil.getCompanyId(request);
		}

		JSEntry jsEntry = null;

		try {
			jsEntry = JSEntryLocalServiceUtil.getLatestJSEntry(classNameId, classPK);
			js = jsEntry.getJs();
		}
		catch (Exception e) {}
				
		ServletResponseUtil.write(
			response,
			js.getBytes(StringPool.UTF8));
	}
}
