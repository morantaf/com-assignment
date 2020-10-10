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

            <g:form resource="${this.recipe}" method="POST">
                <fieldset class="form">
                    <f:field bean="recipe" property="name" />
                    <f:field bean="recipe" property="description" />
                    <f:field bean="recipe" property="timeInMinutes" />

                    <f:field bean="recipe" property="meal">
                        <g:select name="meal"
                                  from="${enums.Meal.values()}"
                                  optionValue="name"/>
                    </f:field>
                    <f:field bean="recipe" property="ingredients">

                    <g:each in="${recipe.ingredients}" var="ingredient">
                        <div class="ingredientEntry">
                            <div class="ingredient">
                               <g:link controller="ingredient" action="show" id="${ingredient.id}"> ${ingredient.name}</g:link>
                            </div>
                        </div>
                    </g:each>
                    </f:field>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="save" class="save" value="Update" />
                </fieldset>
            </g:form>
            <h1>Add Ingredient</h1>
            <g:form controller="ingredient" action="addIngredient" id="${params.id}">

                <fieldset class="form">
                    <label>Ingredient's name</label>
                    <g:textField class="required" name="name"/><br/>
                    <label>Amount</label>
                    <g:textField class="required" name="amount"/>

                   <g:select name="type" from="${enums.AmountType.values()}" optionValue="name"/>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="addIngredient" class="save" value="Add" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
