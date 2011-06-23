<%@ include file="/init.jsp" %>

<%
String tabs1 = ParamUtil.getString(request, "tabs1", "page");
String tabs2 = ParamUtil.getString(request, "tabs2", "public");
String tabs3 = ParamUtil.getString(request, "tabs3", "edit");

PortletURL portletURL = renderResponse.createRenderURL();

String tabNames = "page,site"; 

boolean isControlPanel = layout.getGroup().isControlPanel();
Group scopeGroup = themeDisplay.getScopeGroup();

if (isControlPanel) {
	tabNames.replace("page,","");
	if (tabs1.equals("page")) {
		tabs1 = "site";
	}
}

if (permissionChecker.isOmniadmin()) {
	tabNames+=",global";
}

%>

<liferay-ui:tabs
	names='<%= tabNames.toString() %>'
	param="tabs1"
	value="<%= tabs1 %>"
	url='<%= portletURL.toString() %>'
/>

<c:if test='<%= isControlPanel && tabs1.equals("site") %>'>
	<liferay-ui:tabs
		names="public,private"
		param="tabs2"
		value="<%= tabs2 %>"
		url='<%= portletURL.toString() %>'
	/>
</c:if>

<liferay-ui:tabs
	names="edit,history"
	param="tabs3"
	value="<%= tabs3 %>"
	url='<%= portletURL.toString() %>'
/>

<c:choose>
    <c:when test='<%= tabs3.equals("edit") %>'>
		<%@ include file="/edit.jspf" %>
    </c:when>
    <c:when test='<%= tabs3.equals("history") %>'>
		<%@ include file="/history.jspf" %>
    </c:when>
</c:choose>
   