<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${MEM==1}">
	<script> alert("회원가입 성공"); location.replace("<c:url value='/DataRoom/Index.jsp'/>")</script>	
</c:if>

<c:if test="${MEM!=1}">
	<script> alert("회원가입 실패"); history.back()</script>
</c:if>