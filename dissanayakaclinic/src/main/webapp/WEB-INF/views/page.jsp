<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="resources/css" />
<spring:url var="images" value="resources/images" />
<spring:url var="js" value="resources/js" />
<spring:url var="scss" value="resources/scss" />
<spring:url var="vendor" value="resources/vendor" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dissanayaka Clinic - ${title}</title>
    
    <script>
    	window.menu = '${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    	<%@include file="./shared/navbar.jsp" %>
    <!-- /Navigation -->

    <!-- Page Content -->
    <c:if test="${UserClickedHome == true}">
    <%@include file="home.jsp" %>
    </c:if>
    <!-- /Page Content -->
    
    <!-- When Only Clicked About Us -->
    <c:if test="${UserClickedAbout == true}">
    <%@include file="about.jsp" %>
    </c:if>
    <!-- /When Only Clicked About Us -->
    
    <!-- When Only Clicked Contact Us -->
    <c:if test="${UserClickedContact == true}">
    <%@include file="contact.jsp" %>
    </c:if>
    <!-- /When Only Clicked Contact Us -->

    <!-- Footer -->
    <%@include file="./shared/footer.jsp" %>
    <!-- /Footer -->

    <!-- Bootstrap core JavaScript -->
    <script src="${jquery}/jquery.min.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>

  </body>

</html>

