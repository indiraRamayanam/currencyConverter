<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>CURRENCY CONVERTER </title>
</head>
<body style="background: powderblue">
<center>
    <div>1$ USDollar = 83.68Rs</div>
    <div>1$ UKPound =100Rs</div>
    <div>1Won korea=0.060Rs</div>
    <div>1yen Japan=0.54Rs</div>

<form method="post" action="currencyApp">
<i> <h1>currency converter </h1></i>
    <label for="india">Enter Indian currency :</label>
    <input type="number" id="india" name="india">
    <label for="country">Choose a country:</label>
    <select id="country" name="country">
        <option value="USA">USA</option>
        <option value="UK">UK</option>
        <option value="KOREA">Korea</option>
        <option value="JAPAN">japan</option>
    </select>
    <br><br>
    <div>Entered Currency Rs${number}</div>
    <input type="submit">

</form>
</center>



</body>
</head>
</html>