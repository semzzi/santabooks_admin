<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SantaBooks :: Admin</title>

  <!-- Custom fonts for this template-->
  <link href="/resources/bootstrap/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="/resources/bootstrap/css/sb-admin-2.min.css" rel="stylesheet">
	
<style type="text/css">
#content {
	position: relative;
}

.ml-3, .mx-3 {
    margin-left: 0 !important;
}

.btn {
	color: white;
}

.container-fluid {
	padding-top: 24px;
}
</style>
</head>
<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-success sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/admin/main">
        <div class="sidebar-brand-icon">
          <h3 style="position: relative; right: 3px;">🎅</h3>
        </div>
        <div class="sidebar-brand-text mx-3">SantaBooks</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

	<c:if test="${login }">
      <!-- Nav Item - 회원관리 -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="/admin/member/list">
          <i class="fas fa-user"></i>
          <span>회원 관리</span>
        </a>
      </li>

      <!-- Nav Item - 게시글 관리 -->
      <li class="nav-item">
        <a class="nav-link" href="index.html" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
 		  <i class="fas fa-table"></i>       
           <span>회원 게시글 관리</span></a>
            <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="/admin/board/novel">웹소설 관리</a>
            <a class="collapse-item" href="/admin/board/review">리뷰 관리</a>
          </div>
        </div>
      </li>


      <!-- Nav Item - Utilities Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="/admin/board/comment">
          <i class="fas fa-comment-dots"></i>
          <span>댓글 관리</span>
        </a>
      </li>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="/admin/shipment/list">
          <i class="fas fa-truck"></i>
          <span>배송 관리</span>
        </a>
      </li>
      
      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="/admin/book/list">
          <i class="fas fa-book"></i>
          <span>도서 관리</span>
        </a>
      </li>
      
<!--       Nav Item - Pages Collapse Menu -->
<!--       <li class="nav-item"> -->
<!--         <a class="nav-link collapsed" href="#"> -->
<!--           <i class="far fa-clipboard"></i> -->
<!--           <span>공지사항 관리</span> -->
<!--         </a> -->
<!--       </li> -->
	</c:if>
 <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Tables -->
      <c:if test="${empty login }">
      <li class="nav-item">
        <a class="nav-link" href="admin/login" data-toggle="modal" data-target="#loginModal">
          <i class="fas fa-user-cog"></i>
          <span>로그인</span></a>
      </li>
      </c:if>

	  <c:if test="${login }">
      <li class="nav-item">
        <a class="nav-link" href="admin/logout" data-toggle="modal" data-target="#logoutModal">
          <i class="fas fa-user-cog"></i>
          <span>로그아웃</span></a>
      </li>
      </c:if>

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    
    
    <!-- End of Sidebar -->
    
    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

       
        




