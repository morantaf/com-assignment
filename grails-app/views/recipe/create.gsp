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
        <div id="create-recipe" class="content scaffold-create" role="main">
            <g:form resource="${this.recipe}" method="POST">
                <fieldset class="form">
                    <f:field bean="recipe" property="name" />
                    <f:field bean="recipe" property="description" />
                    <f:field bean="recipe" property="timeInMinutes" />
                    <f:field bean="recipe" property="ingredients" >
                        <g:form controller="ingredient" action ="addIngredient" id="${params.id}">
                            <fieldset class="form">
                                <f:field bean="ingredient" property="name"  />
                                <f:field bean="ingredient" property="amount" />
                            </fieldset>
                            <g:submitButton name="add" value="add"/>
                        </g:form>
                    </f:field>

                    <f:field bean="recipe" property="meal">
                        <g:select name="meal"
                                  from="${enums.Meal.values()}"
                                  optionValue="name"/>
                    </f:field>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="create" class="save" value="create" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
