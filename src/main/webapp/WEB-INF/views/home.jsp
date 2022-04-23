<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Spring Web Application</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
    <table class="table table-bordered">
        <caption>${msg}</caption>
        <tr>
            <th scope="col">Index</th>
            <th scope="col">Id</th>
            <th scope="col">Code</th>
            <th scope="col">Value</th>
        </tr>
        <c:forEach varStatus="loop" items="${parameters}" var="parameter">
            <tr>
                <td>${loop.index + 1}</td>
                <td>${parameter.id}</td>
                <td>${parameter.parameterCode}</td>
                <td>${parameter.parameterValue}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>