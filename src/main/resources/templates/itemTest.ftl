<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<#import "/bootstrap.ftl" as spring />
<html>
    ...
    <form action="" method="POST">
        Name:Hey
        <input type="text"
            name="harder"
            value="" />
        <input type="text"
            name="better"
            value="" />
        <input type="text"
            name="faster"
            value="" />
        <input type="text"
            name="stronger"
            value="" />
        <input type="submit" value="submit"/>
    </form>
    ...
</html>