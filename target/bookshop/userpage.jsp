<%@ page language="java" import="java.util.*, java.sql.*,com.bookshop.entity.Cart"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>

<script src="${ctx }/assets/js/jquery.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>BookStore</title>
</head>
<body>

<h1>Book On Sale</h1>
<button id="btn">刷新</button>
<script type="text/javascript">
    $(function(){
        $.ajax({
            url: ' ${ctx}/book/showbooks',
            type: 'POST',
            success: function (goods) {
                var products='<table><tr><th>BookID</th><th>BookName</th><th>Author</th><th>Price</th><th>Type</th></tr>';
                for(i in goods){
                    var product='<tr><td>'+goods[i].book_id+'</td><td>'+goods[i].name+'</td><td>'+goods[i].author+'</td><td>'+goods[i].price+'</td><td>'+goods[i].type+'</td></tr>' ;
					products=products+product;
                }
                document.getElementById("booklist").innerHTML=products;
            }
        });
        $("#btn").click(function(){
			alert("fuck");
            $.ajax({
                url: ' ${ctx}/book/showbooks',
                type: 'POST',
                success: function (goods) {

                    var products='<table><tr><th>BookID</th><th>BookName</th><th>Author</th><th>Price</th><th>Type</th></tr>';
                    for(i in goods){
                        var product='<tr><td>'+goods[i].book_id+'</td><td>'+goods[i].name+'</td><td>'+goods[i].author+'</td><td>'+goods[i].price+'</td><td>'+goods[i].type+'</td></tr>' ;
                        products=products+product;
                    }
                    document.getElementById("booklist").innerHTML=products;
                }
            });
		});
	});
</script>


<div id="booklist"></div>

<div id="addtocart">
	<form  action="AddtoCart" method="post" >
		BookID: <input type="text" name="id"><br><br>
		Number: <input type="text" name="number"><br><br>
		<input type="submit" value="Add to Cart">
	</form>
</div>

<div>
<h2 >Shopping Cart</h2>
<%--<%
		Cart cart=(Cart) session.getAttribute("cart");
		out.print("<table border=1 align='center'> ");
		out.print("<tr><td>Book ID</td><td>Number</td></tr>");
		int i=0;
		while(i<cart.getItem()){
		out.print("<td>" + cart.getBook(i) + "</td>");
		out.print("<td>" +cart.getNum(i) + "</td>");
		out.print("</tr>"); 
		i++;
		}
		%>	--%>
</div>
<a  href='PayAction' style="float: right;"><button>Pay Now</button></a>
</body>
</html>