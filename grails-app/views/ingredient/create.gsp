<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>Create ingredient</title>
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="list" action="index">Recipes list</g:link></li>
            </ul>
        </div>
        <div id="create-ingredient" class="content scaffold-create" role="main">
            <g:form resource="${this.ingredient}" method="POST">
                <fieldset class="form">
                    <f:all bean="ingredient"/>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
