<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>地址</td>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.address}</td>
        </tr>
    </#list>
</table>
</body>
</html>