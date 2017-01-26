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
                <#list item?keys as key>
                    <td>${item[key]}</td>
                </#list>
                <td><a href="${item["id"]}/show">Select</a></td>
                <td>
                    <form action="${item["id"]}/delete" method="POST">
                        <input type="hidden" name="id" value="${item["id"]}">
                        <input type="submit" value="delete"/>
                    </form>
                </td>
            </tr>
        </#list>
    </table>
</body>
</html>