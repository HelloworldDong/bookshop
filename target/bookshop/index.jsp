<<%@ page language="java" contentType="text/html; charset=UTF-8"
		  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta  charset='UTF-8'>

<title>在线书店</title>
	<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link
			href="${ctx }/assets/plugins/font-awesome/css/font-awesome.min.css"
			rel="stylesheet" type="text/css">
	<link href="${ctx }/assets/plugins/bootstrap/css/bootstrap.min.css"
		  rel="stylesheet" type="text/css">
	<!-- Global styles END -->

	<!-- Page level plugin styles START -->
	<link href="${ctx }/assets/plugins/fancybox/source/jquery.fancybox.css"
		  rel="stylesheet">
	<link rel="stylesheet"
		  href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
	<!-- for slider-range -->
	<link href="${ctx }/assets/plugins/bxslider/jquery.bxslider.css"
		  rel="stylesheet">
	<link href="${ctx }/assets/plugins/rateit/src/rateit.css"
		  rel="stylesheet" type="text/css">
	<link href="${ctx }/assets/plugins/uniform/css/uniform.default.css"
		  rel="stylesheet" type="text/css">
	<!-- Page level plugin styles END -->
	<!-- Theme styles START -->
	<link href="${ctx }/assets/css/style-metronic.css" rel="stylesheet"
		  type="text/css">
	<link href="${ctx }/assets/css/style.css" rel="stylesheet"
		  type="text/css">
	<link href="${ctx }/assets/css/style-responsive.css" rel="stylesheet"
		  type="text/css">
	<link href="${ctx }/assets/css/custom.css" rel="stylesheet"
		  type="text/css">
	<!-- Theme styles END -->
	<script src="${ctx }/assets/js/jquery.min.js"></script>
	<script src="${ctx }/assets/js/jquery.js"></script>
</head>
<body>
	<section class="container">
	<div class="login">
		<h1>Login</h1>
		<form method="post" action="${ctx }/log/login">
			<p>
				<input type="text" name="username" value="" placeholder="Username"
					validate="{required:true}">
			</p>
			<p>
				<input type="password" name="password" value=""
					placeholder="Password" validate="{required:true}">
			</p>
			<p class="submit">
				<input type="submit" value="Login">
			</p>
		</form>
	</div>
	<div class="login-help">
		<p>
			Don't have an account? <a href="register.jsp">Click here to
				register</a>
		</p>
	</div>
	</section>

</body>
</html>