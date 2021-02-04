<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebCalculator</title>
</head>
<body>
<form action="/secondServlet" method="post">
    <h3>Simple calculate form</h3>
    <p>
        <label for="firstNum">First Num</label>
    </p>
    <p>
        <input id="firstNum" name="firstNum" type="text" placeholder="Enter num"/>
    </p>
    <p>
        <label for="secondNum">Second Num</label>
    </p>
    <p>
        <input id="secondNum" name="secondNum" type="text" placeholder="Enter num"/>
    </p>
    <p>
        <label for="operation">Operation</label>
    </p>
    <p>
        <select id="operation" name="operation">
            <option selected="selected" value="plus">plus</option>
            <option value="minus">minus</option>
            <option value="multiply">multiply</option>
            <option value="divide">divide</option>
        </select>
    <p>
        <input type="submit" value="Send..">
</form>
</body>
</html>
