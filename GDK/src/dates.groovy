Date today = new Date()
println today //Mon Jan 31 09:12:32 GMT 2022

Date bday = new Date("06/03/1998")
println bday.format("dd/MM/yyyy") //03/06/1998 12:00

println bday.format("dd MMM YY hh:mm a") //03 Jun 98 12:00 AM

println today.plus(7) // one week from today: Mon Feb 07 09:21:07 GMT 2022
println today.minus(7) //7 days ago:Mon Jan 24 09:21:50 GMT 2022

println today +7  //Mon Feb 07 09:22:33 GMT 2022

Date oneWeekAgo = today-7
Date oneWeekAhead = today+7

println "----------"
Range twoWeekSpan = oneWeekAgo..oneWeekAhead
twoWeekSpan.each {date ->println date}
//Mon Jan 24 09:26:40 GMT 2022
//Tue Jan 25 09:26:40 GMT 2022
//Wed Jan 26 09:26:40 GMT 2022
//Thu Jan 27 09:26:40 GMT 2022
//Fri Jan 28 09:26:40 GMT 2022
//Sat Jan 29 09:26:40 GMT 2022
//Sun Jan 30 09:26:40 GMT 2022
//Mon Jan 31 09:26:40 GMT 2022
//Tue Feb 01 09:26:40 GMT 2022
//Wed Feb 02 09:26:40 GMT 2022
//Thu Feb 03 09:26:40 GMT 2022
//Fri Feb 04 09:26:40 GMT 2022
//Sat Feb 05 09:26:40 GMT 2022
//Sun Feb 06 09:26:40 GMT 2022
//Mon Feb 07 09:26:40 GMT 2022
//

Date newYear = new Date(2022,1,1)
println newYear.next() //Thu Feb 02 00:00:00 GMT 3922
println newYear.previous() //Tue Jan 31 00:00:00 GMT 3922
