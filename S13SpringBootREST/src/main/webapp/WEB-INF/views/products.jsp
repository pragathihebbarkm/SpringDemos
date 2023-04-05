<%@ page language="java" contentType="text/html" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>
<head>
<title>Products
</title>
</head>
<body>
<h2>Manage Products</h2>

<form action="products" method="post">
	<pre>
		Name: <input type="text" name="name"/>
		Description: <input type="text" name="description"/>
		Price: <input type="text" name="price"/>
		
		<input type="submit" name="Add Product"/>
	</pre>
</form>

<p>${message}</p>

<ul>
<c:forEach items="${products}" var="product" >
			<li>
			${product.id} |  ${product.name} | ${product.description} | | ${product.price} 
			</li>
		</c:forEach>
</ul>
</body>
</html>
