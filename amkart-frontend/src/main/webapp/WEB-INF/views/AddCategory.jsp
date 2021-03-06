<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/AddEntities.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
  </head>
<body>
<div class="container">
<form:form method="POST" action="addCategory" modelAttribute="category" id="categoryAddForm">
	  <h1>ADD CATEGORY:</h1>
	  <div class="input-group">
	  
	  <!-- One "tab" for each step in the form: -->
	  <label for="categoryID">ID:</label>
	    <p><form:input class="form-control" path="categoryID" placeholder="category ID.." name="categoryID"/></p>
	  	<div class="alert alert-danger fade in">
	  		<form:errors path="categoryID"/>
			</div>  
	  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>   
    </div>
    
    <div class="input-group">
	  <label for="categoryName">NAME:</label>
	    <p><form:input class="form-control" path="categoryName" placeholder="category Name..." name="categoryName"/></p>
	  	<div class="alert alert-danger fade in">
	  		<form:errors path="categoryName"/>
			</div>  
	  <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>   
    </div>
       
        <button type="submit" class="button"><span>ADD</span></button>
     <div class="table-responsive">          
  		<table class="table table-striped" border="1" >
  		<tr class="success"><th>CategoryID</th><th>CategoryName</th></tr>  
			<c:forEach items="${categoryList}" var="categoryList">
			<tr><td>${categoryList.categoryID}</td><td>${categoryList.categoryName}</td></tr> 

		</c:forEach>  
		</table>    

</form:form>
</div>
<%@ include file="footer.jsp"%> 

</div>


</body>
</html>