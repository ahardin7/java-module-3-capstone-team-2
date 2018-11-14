<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div>

	<ul class="parkDisplay>
		<c:set var="image" value="${park.parkCode}" />
		<c:set var="imageLowerCase" value="${fn:toLowerCase(image)}" />
		<li><img src="img/parks/${imageLowerCase}.jpg" /></li>
		<li>${park.parkName}</li>
		<li>${park.description}</li>
	</ul>
	
	<ul class="weather">
		<div class="today">
			<ul id="todayList">
				<li id="dayTitle">Today</li>
				<li><img src="img/weather${weather.forecast}.png"/></li>
				<li id="highLow">High ${weather.high} Low ${weather.low}</li>
				<li id 
				
			
			</ul>
		</div>
	
		<li id="today">
		
		
		
		
		
		</li>
	
	
	
	</ul>






</div>















<c:import url="/WEB-INF/jsp/common/footer.jsp" />

