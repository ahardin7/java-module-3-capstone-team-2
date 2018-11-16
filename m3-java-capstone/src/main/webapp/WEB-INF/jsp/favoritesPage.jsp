<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:forEach var="favorite" items="${allFavoriteParks}">
<ul>
<li>${favorite.parkName} ${favorite.count}</li>
</ul>



</c:forEach>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />