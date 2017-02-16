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
            <#list currentItems as item>
                <#list item?keys as key>
                    <#if key != "id">
                        <th>${key}</th>
                    </#if>
                </#list>
                <#break>
            </#list>
        </tr>

        <#list currentItems as item>
            <tr>
                <#list item?keys as key>
                    <#if key != "id">
                        <td>${item[key]}</td>
                    </#if>
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