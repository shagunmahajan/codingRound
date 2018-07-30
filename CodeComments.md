Fixes:
1. flightBookingPageFunction
	i) changed the "toTag" to "ToTag"
	ii) added Extra wait time as it was taking time to load the page
	iii) changed the xpath of the date field, as the available date was in the second div tag
	iv) changed the xpath of the city list -to and from both
	
2. hotelBookingPageFunction
	i) added element localityList to select the locality from the suggestion box
	ii) added Extra wait time as it was taking time to load the list
	
3. signInPageFunction
	i) added frame element to switch to the sign in window
	ii) added Extra wait time as it was taking time to load the sign in window
	
followed the POM pattern to recreate the framework
Used pageFactory for maintenance purpose
added testng.xml file for batch execution
added common functions in commonFunction file
 
