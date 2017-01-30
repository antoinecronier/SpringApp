<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<head>
<#include "../bootstrap.ftl"/>
</head>
<html>
<body>
    <h1>${page}</h1>
    <form action="" method="POST">
        <#list currentItem?keys as key>
            <#if key != "id">
                <br>${key} :
                    <input type="text" name="${key}" value="${currentItem[key]}">
                </br>
            <#else>
                <input type="hidden" name="id" value="${currentItem[key]}">
            </#if>
        </#list>

        <br>
            <input type="submit" value="update"/>
        </br>
    </form>
    <a href="../list">Back</a>
</body>
</html>