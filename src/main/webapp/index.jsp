<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Demo</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<!--<h2>Discount</h2>
<form action="/display-discount" method="post">
    <input type="text" name="txtDescription" placeholder="Enter your description: "/>
    <input type="text" name="txtPrice" placeholder="Enter your price: "/>
    <input type="text" name="txtDiscountPercent" placeholder="Enter your discount percent: "/>

    <input type = "submit" id = "submit" value = "Calculate Discount"/>-->

<h2>Caculator</h2>
<form action="/calculate" method="post">
    <input type="text" name="txtNum1" placeholder="Enter first number"/>
    <input type="text" name="txtNum2" placeholder="Enter second number"/>
    <select name="txtOperator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <button type="submit" id="caculator-button">Calculate</button>
</form>
</body>
</html>