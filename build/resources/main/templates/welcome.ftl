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
    The current locale is: ${.locale}
    <br>
    Time: ${time?time}
    <br>
    Message: ${message}
    <br>
    ${redirectTest}
    <br>
    Welcome ${Session["SPRING_SECURITY_CONTEXT"].authentication.name}
    <br>
    <div class="container">
        <ul>
            <#list controllers as controller>
                <li>
                    <a href="/${controller}/">${controller}</a>
                </li>
            </#list>
        </ul>
    </div>

    <button onclick="coockieIncreaser()">Click for coockie!</button>
    <script>
        function getCookie(name) {
          var value = "; " + document.cookie;
          var parts = value.split("; " + name + "=");
          if (parts.length == 2) return parts.pop().split(";").shift();
        }
        function setCookie(cname, cvalue, exdays) {
            var d = new Date();
            d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
            var expires = "expires="+d.toUTCString();
            document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
        }
        function coockieIncreaser() {
            var x = getCookie("hitCookie");
            x = parseInt(x) + 1;
            setCookie("hitCookie",x,new Date());
        }
    </script>
</body>

</html>
