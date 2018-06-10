<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><c:out value="${model.movie_title}"/></p>
    <h3>Movie details</h3>
      <c:out value="${model.director_name}"/> <br>
      <c:out value="${model.title_year}"/><br><br>
    <br>
    <br>
  </body>
</html>