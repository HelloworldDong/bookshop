<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="utf-8">
    <title>BookShop</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <link href="${ctx }/assets/css/font.css" rel='stylesheet'
          type='text/css'>
    <link rel="stylesheet" type="text/css"
          href="${ctx}/assets/js/bootstrap/css/bootstrap.css">
    <link rel="stylesheet"
          href="${ctx}/assets/js/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="${ctx }/assets/css/font-awesome.css">
    <script src="${ctx}/assets/js/jquery-1.11.1.min.js"
            type="text/javascript"></script>
    <script src="${ctx }/assets/js/bootstrap/js/bootstrap.js"></script>


    <link rel="stylesheet" type="text/css"
          href="${ctx}/assets/css/theme.css">


</head>
<body class=" theme-blue" >

<style type="text/css">
    #line-chart {
        height: 300px;
        width: 800px;
        margin: 0px auto;
        margin-top: 1em;
    }

    .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover {
        color: #AEEEEE;
    }
</style>




<div class="navbar navbar-default" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed"
                data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">navigation</span> <span class="icon-bar"></span>
            <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <span class="navbar-brand"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>在线书店</span>
    </div>

    <div class="navbar-collapse collapse" style="height: 1px;">
        <ul id="main-menu" class="nav navbar-nav navbar-right">
            <li class="dropdown hidden-xs"><a href="#"
                                              class="dropdown-toggle" data-toggle="dropdown"> <span
                    class="glyphicon glyphicon-user padding-right-small"
                    style="position: relative; top: 3px;"></span> <i
                    class="fa fa-caret-down"></i>
            </a>

                <ul class="dropdown-menu">
                    <li><a href="${ctx }/login.jsp">登录</a></li>
                    <li><a href="${ctx }/log/out">退出</a></li>
                </ul></li>
        </ul>

    </div>
</div>
</div>

<div class="sidebar-nav">
    <ul>
        <li><a href="#" data-target=".novels-menu" class="nav-header collapsed"
               data-toggle="collapse"><i class="fa  fa-certificate"></i> 小说<i
                class="fa fa-collapse"></i></a></li>
        <li><ul class="novels-menu nav nav-list collapse ">

            <li><a href="${ctx }/book/showbooks?type=history novel"><span
                    class="fa fa-caret-right"></span> 历史小说 </a></li>
            <li><a href="${ctx }/book/showbooks?type=love novel"><span
                    class="fa fa-caret-right"></span> 言情小说 </a></li>
        </ul></li>



        <li><a href="#" data-target=".accounts-menu"
               class="nav-header collapsed" data-toggle="collapse"><i
                class="fa fa-fw fa-certificate"></i> 计算机图书 <i class="fa fa-collapse"></i></a></li>
        <li><ul class="accounts-menu nav nav-list collapse">
            <li><a href="${ctx }/book/showbooks?type=c"><span
                    class="fa fa-caret-right"></span> C</a></li>
            <li><a href="${ctx }/book/showbooks?type=java"><span
                    class="fa fa-caret-right"></span> Java</a></li>
        </ul></li>

        <li><a href="#" data-target=".person-menu"
               class="nav-header collapsed" data-toggle="collapse"><i
                class="fa fa-fw fa-certificate"></i> 个人中心<i
                class="fa fa-collapse"></i></a></li>
        <li><ul class="person-menu nav nav-list collapse">
            <li><a href="${ctx }/cart.jsp"><span
                    class="fa fa-caret-right"></span> 我的购物车</a></li>
            <li><a href="${ctx }"><span
                    class="fa fa-caret-right"></span> 我的订单</a></li>
        </ul></li>

        <li><a href="#" data-target=".legal-menu"
               class="nav-header collapsed" data-toggle="collapse"><i
                class="fa fa-fw fa-certificate"></i> 管理员<i
                class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu nav nav-list collapse">
            <li><a href="${ctx }/user/show"><span
                    class="fa fa-caret-right"></span> 管理用户</a></li>
            <li><a href="#"><span
                    class="fa fa-caret-right"></span> 管理图书</a></li>
        </ul></li>

    </ul>
</div>

<div class="content"
     style="height:800px;">
    <div class="main-content">
        <p style="text-align: center; font-size: 25px">
            <B>我的购物车</B>
        </p>

        <table class="table">
            <thead>
            <tr>
                <th>BookID</th>
                <th>Name</th>
                <th>Author</th>
                <th>Price</th>
                <th>Type</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="i" items="${cart}">
                <tr>
                    <td>${i.book_id }</td>
                    <td>${i.name }</td>

                    <td>${i.author }</td>
                    <td>${i.price }</td>
                    <td>${i.type }</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="btn-toolbar list-toolbar">
            <a href="{ctx}/pay"><button id="btn" class="btn btn-primary">
                <i class="fa fa-check"></i>付款
            </button></a>
            <div class="btn-group"></div>
        </div>
    </div>
</div>



</body>
</html>
