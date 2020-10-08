<%--
  Created by IntelliJ IDEA.
  User: moranta
  Date: 08/10/2020
  Time: 11:46
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <title></title>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        <li><g:link class="create" action="create">Create</g:link></li>
    </ul>
</div>
<div id="list-student" class="content scaffold-list" role="main">
    <f:table collection="${recipeList}"
             properties="['name', 'description']" />
</div>

</body>
</html>