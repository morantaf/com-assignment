<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#edit-ingredient" class="skip" tabindex="-1"></a>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="list" action="index">Recipes list</g:link></li>
            </ul>
        </div>
        <div id="edit-ingredient" class="content scaffold-edit" role="main">

            <g:form resource="${this.ingredient}" method="POST">
                <g:hiddenField name="version" value="${this.ingredient?.version}" />
                <fieldset class="form">
                    <f:all bean="ingredient"/>
                </fieldset>
                <fieldset class="buttons">
                    <input class="save" type="submit" value="Update" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
