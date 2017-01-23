<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<#include "/bootstrap.ftl"/>
<html>
<body>
    <h1>${page}</h1>
    <form action="" method="POST">
        <br>Firstname :
            <input type="text" name="firstname" value="${currentItem.getFirstname()}">
        </br>
        <br>Lastname :
            <input type="text" name="lastname" value="${currentItem.getLastname()}">
        </br>
        <br>Login :
            <input type="text" name="login" value="${currentItem.getLogin()}">
        </br>
        <br>Password :
            <input type="text" name="password" value="${currentItem.getPassword()}">
        </br>
        <br>Socity :
            <input type="text" name="socity" value="${currentItem.getSocity()}">
        </br>
        <input type="hidden" name="id" value="${currentItem.getId()}">
        <br>
            <input type="submit" value="update"/>
        </br>
    </form>
    <a href="../list">Back</a>
</body>
</html>