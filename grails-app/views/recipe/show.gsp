<%--
  Created by IntelliJ IDEA.
  User: moranta
  Date: 08/10/2020
  Time: 11:47
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
        <li><g:link class="list" action="index">Recipes list</g:link></li>
    </ul>
</div>
<div id="show-recipe" class="content scaffold-show" role="main">
    <f:display bean="recipe" />
    <g:form resource="${this.recipe}" method="PUT">
        <fieldset class="buttons">
            <input class="edit" type="submit" value="Edit" />
        </fieldset>
    </g:form>
</div>

</body>
</html>