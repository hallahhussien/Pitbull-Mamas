<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>PitbullMama's - Home</title>
    <c:import url="../constants/header.jsp" />
    <c:import url="../constants/header.jsp" />
    <c:import url="../constants/menu.jsp" />
    <c:import url="../js/scripts.jsp" />
</head>
<body>

<div>
    <h1>Welcome Back ${user.firstName}!</h1>

    ${request}

    <div class="featured">
        <h2>Featured Products:</h2>
        <ul>
            <c:forEach var="featured" items="${featured}" >
                <li>${featured.productName} - Product Type: ${featured.productType}</li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>

</html>