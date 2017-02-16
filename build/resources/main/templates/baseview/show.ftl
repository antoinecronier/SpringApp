<head>
<#include "../bootstrap.ftl"/>
</head>
<html>
<body>
    <h1>${page}</h1>
    <table class="table table-bordered table-hover">
        <#list currentItem?keys as key>
            <#if key != "id">
                <tr>
                    <th>${key}</th>
                    <td>${currentItem[key]}</td>
                </tr>
            </#if>
        </#list>
        <tr>
            <td><a href="update">Update</a></td>
        </tr>
        <tr>
            <td><a href="delete">Delete</a></td>
        </tr>
        <tr>
            <td><a href="../list">Back</a></td>
        </tr>

    </table>
</body>
</html>