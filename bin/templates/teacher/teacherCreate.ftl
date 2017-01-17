<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<#import "/bootstrap.ftl" as spring />
<html>
<body>
    ...
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
    ...
</body>
</html>