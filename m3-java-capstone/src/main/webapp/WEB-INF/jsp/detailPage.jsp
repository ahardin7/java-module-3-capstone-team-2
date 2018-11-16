<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div id="descriptionTop">
	<c:set var="parkCode" value="${park.parkCode}" />
	<c:set var="parkCodeLowercase" value="${fn:toLowerCase(parkCode)}" />


	<ul class="parkDisplay">
		<li><img src="img/parks/${parkCodeLowercase}.jpg" /></li>
		<li id="parkName">${park.parkName}</li>
		<li id="parkDescription">${park.description}</li>
		<li id="state"> State: ${park.state}</li>
		<li id="acreage"> Acreage: ${park.acreage}</li>
		<li id="elevationInFeet"> Elevation In Feet: ${park.elevationInFeet}</li>
		<li id="milesOfTrail"> Miles Of Trail: ${park.milesOfTrail}</li>
		<li id="numberOfCampsites"> Number Of Campsites: ${park.numberOfCampsites}</li>
		<li id="climate"> Climate: ${park.climate}</li>
		<li id="yearFounded"> Year Founded: ${park.yearFounded}</li>
		<li id="annualVisitorCount"> Annual Visitor Count: ${park.annualVisitorCount}</li>
		<li id="quote"> Quote: ${park.quote} -  ${park.quoteSource}</li>
		<li id="entryFee"> Entry Fee: ${park.entryFee}</li>
		<li id="numberOfAnimalSpecies"> Number Of Animal Species: ${park.numberOfAnimalSpecies}</li>

</div>
		<ul class="weather">
	<c:forEach var="weather" items="${allWeather}">
		
		<c:if test="${weather.day == 1}">
				<div id="today">
				<li id="dayTitle">Today</li>
				<li><img src="img/weather/${weather.forecast}.png" /></li>
				
				<div id="highLow">
				<li class="high">High ${weather.high}</li>
				<li class="low">Low ${weather.low}</li>
				</div>
				
				<li id="advisory">${weather.advisory.advisory}</li>
				</div>
		</c:if>
		<c:if test="${weather.day != 1}">
			<div id="otherDays">
			<li><img src="img/weather/${weather.forecast}.png" /></li>
			<li class="high">High ${weather.high}</li>
			<li class="low">Low ${weather.low}</li>
			</div>
		</c:if>
		
</div>
</c:forEach>
		</ul>



























<c:import url="/WEB-INF/jsp/common/footer.jsp" />

