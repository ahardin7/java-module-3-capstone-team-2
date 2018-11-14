<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="parks">
	<c:forEach var="park" items="${allParks}">
	<div id="park">
	<c:set var="image" value="${park.parkCode}" />
	<c:set var="imageLowerCase" value="${fn:toLowerCase(image)}" />
		<img src="img/parks/${imageLowerCase}.jpg" />
		<ul class="info">
		<li id="name">${park.parkName}</li>
		<li id="description">${park.description}</li>
		</ul>
		</div>
	</c:forEach>


</div>





<c:import url="/WEB-INF/jsp/common/footer.jsp" />