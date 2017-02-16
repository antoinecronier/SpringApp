<head>
<#include "../bootstrap.ftl"/>
</head>
<html>
<body>
    <table class="table table-bordered table-hover">
        <tr>
            <th>Firstname</th>
            <td>${Session.teacher.getFirstname()}</td>
        </tr>
        <tr>
            <th>Lastname</th>
            <td>${Session.teacher.getLastname()}</td>
        </tr>
        <tr>
            <th>Login</th>
            <td>${Session.teacher.getLogin()}</td>
        </tr>
        <tr>
            <th>Password</th>
            <td>${Session.teacher.getPassword()}</td>
        </tr>
        <tr>
            <th>Socity</th>
            <td>${Session.teacher.getSocity()}</td>
        </tr>
        <tr>
            <td><a href="../list">Back</a></td>
        </tr>

    </table>
</body>
</html>