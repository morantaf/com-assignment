<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>Edit Recipe</title>
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="list" action="index">Recipes list</g:link></li>
            </ul>
        </div>
        <div id="edit-recipe" class="content scaffold-edit" role="main">

            <g:form resource="${this.recipe}" method="PUT">
                <fieldset class="form">
                    <f:all bean="recipe"/>
                </fieldset>
                <fieldset class="buttons">
                    <input class="save" type="submit" value="Update" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
