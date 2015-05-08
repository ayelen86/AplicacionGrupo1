<%--
  Created by IntelliJ IDEA.
  User: imatellan
  Date: 27/04/2015
  Time: 02:34 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <g:javascript src="JavaScriptAPI.js" />
    <g:javascript>
    getAjax("https://api.mercadolibre.com/sites/MLA/search?q=Samsung");
    </g:javascript>


    <title></title>
</head>
<body>
    <textarea id="restResponses"></textarea>
    <textarea id="restParse"></textarea>
    <img id="imagen" />
</body>
</html>