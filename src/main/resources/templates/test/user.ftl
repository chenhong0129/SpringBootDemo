<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta content="text/html;charset=utf-8"></meta>
    <title>Hello World!</title>
    <script src="/static/bootstrap/js/jquery-1.11.1.min.js"></script>
    <link rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css"></link>
    <script src="/static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h4>亲爱的${toUserName}，你好！</h4>

<p style="color:blue;"> ${message}</p>

祝：开心！
</br>
${fromUserName}
</br>

</body>
</html>