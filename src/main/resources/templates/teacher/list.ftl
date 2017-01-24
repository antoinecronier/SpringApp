<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<head>
<#include "../bootstrap.ftl"/>
</head>
<html>
<body>
    <h1>${page}</h1>
    <a href="create">Create new</a>
    <table class="table table-bordered table-hover">
        <tr>
            <#list attributs as attribut>
                <th>${attribut}</th>
            </#list>
        </tr>

        <#list currentItems as item>
            <tr>
                <td>${item.getFirstname()}</td>
                <td>${item.getLastname()}</td>
                <td>${item.getLogin()}</td>
                <td>${item.getPassword()}</td>
                <td>${item.getSocity()}</td>
                <td><a href="${item.getId()}/show">Select</a></td>
                <td>
                    <form action="${item.getId()}/delete" method="POST">
                        <input type="hidden" name="id" value="${item.getId()}">
                        <input type="submit" value="delete"/>
                    </form>
                </td>
            </tr>
        </#list>
    </table>
</body>
</html>