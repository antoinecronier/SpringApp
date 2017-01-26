<!-- freemarker macros have to be imported into a namespace. We strongly
recommend sticking to spring -->
<head>
<#include "../bootstrap.ftl"/>
</head>
<html>
<body>
    <h1>${page}</h1>
    <form action="" method="POST">
        <br>Firstname : ${currentItem.getFirstname()}</br>
        <input type="hidden" name="firstname" value="${currentItem.getFirstname()}">
        <br>Lastname : ${currentItem.getLastname()}</br>
        <input type="hidden" name="lastname" value="${currentItem.getLastname()}">
        <br>Login : ${currentItem.getLogin()}</br>
        <input type="hidden" name="login" value="${currentItem.getLogin()}">
        <br>Password : ${currentItem.getPassword()}</br>
        <input type="hidden" name="password" value="${currentItem.getPassword()}">
        <br>Socity : ${currentItem.getSocity()}</br>
        <input type="hidden" name="socity" value="${currentItem.getSocity()}">
        <input type="hidden" name="id" value="${currentItem.getId()}">
        <br>
            <input type="submit" value="delete"/>
        </br>
    </form>
    <a href="../list">Back</a>
</body>
</html>