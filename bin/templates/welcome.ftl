<!DOCTYPE html>

<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    Date: ${time?date}
    <br>
    Time: ${time?time}
    <br>
    Message: ${message}

    <div class="container">
        <ul>
            <#list controllers as controller>
                <li>
                    <a href="/${controller}/">${controller}</a>
                </li>
            </#list>
        </ul>
    </div>
</body>

</html>
