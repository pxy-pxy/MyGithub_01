<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>是个人物</title>
</head>
<body>
     <#list emps as emp >
     <h1>${emp.empno}</h1>
     <h1>${emp.ename}</h1>
     <h1>${emp.salary}</h1>
     <h1>${emp.hiredate}</h1>

     </#list>
</body>
</html>