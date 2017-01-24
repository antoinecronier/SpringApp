<head>
<#include "../bootstrap.ftl"/>
</head>
<html>
<body>
    <h1>${page}</h1>
    <table class="table table-bordered table-hover">
        <tr>
            <th>Firstname</th>
            <td>${currentItem.getFirstname()}</td>
        </tr>
        <tr>
            <th>Lastname</th>
            <td>${currentItem.getLastname()}</td>
        </tr>
        <tr>
            <th>Login</th>
            <td>${currentItem.getLogin()}</td>
        </tr>
        <tr>
            <th>Password</th>
            <td>${currentItem.getPassword()}</td>
        </tr>
        <tr>
            <th>Socity</th>
            <td>${currentItem.getSocity()}</td>
        </tr>
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