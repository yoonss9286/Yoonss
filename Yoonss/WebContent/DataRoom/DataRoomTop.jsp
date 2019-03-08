<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>		
	body{			
		padding-top: 70px; 
	}
</style>

<nav class="navbar navbar-default navbar-fixed-top"><!-- 상단 메뉴 시작-->
	<div class="container">
		<!-- 화면 크기가 작을때 보여지는 네비게이션바(모바일용) -->
		<div class="navbar-header">
			<button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#collapseMenu">
				<span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>				
			</button>
			<a class="navbar-brand" href="<c:url value='/DataRoom/List.kosmo'/>">자료실 프로젝트</a>
		</div><!-- navbar-header -->
		<!-- 화면 크기가 클때 상단에 보여지는 메뉴(데스크탑용) -->
		<div class="collapse navbar-collapse" id="collapseMenu">
			
			<ul class="nav navbar-nav navbar-right">
				<li ><a href="<c:url value='/DataRoom/Index.yss'/>">HOME</a></li>
				<li ><a href="<c:url value='/DataRoom/Member.yss'/>">회원가입</a></li>
				<li ><a href="#">로그인</a></li>
				<li ><a href="#">자료실</a></li>
				<li ><a href="#">Q&A</a></li>				
			</ul>
		</div>
		
	</div><!-- container-->
</nav><!-- 상단 메뉴 끝 -->