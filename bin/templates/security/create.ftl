<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<head>
<#include "../bootstrap.ftl"/>
</head>
<html>
<body>
    <h1>${page}</h1>
    <#if error?has_content>
        <h1>Error : ${error}</h1>
    </#if>
    <form action="/security/create/user" method="POST">
        <#list userAttributs as attribut>
            <br>
                Name:${attribut}
                <input type="text"
                    name="${attribut}"
                    value="" />
            </br>
        </#list>
        <br>
            <input type="submit" value="submit"/>
        </br>
    </form>

    <form action="/security/create/role" method="POST">
        <#list roleAttributs as attribut>
            <br>
                Name:${attribut}
                <input type="text"
                    name="${attribut}"
                    value="" />
            </br>
        </#list>
        <br>
            <input type="submit" value="submit"/>
        </br>
    </form>
    <a href="list">Back</a>
</body>
</html>