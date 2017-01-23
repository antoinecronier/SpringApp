<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<#include "/bootstrap.ftl"/>
<html>
<body>
    <h1>${page}</h1>
    <form action="" method="POST">
        <#list attributs as attribut>
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