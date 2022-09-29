/*
Ranges:
•	create an enum for days of the week. ex Sunday, Monday, etc...
•	Create a range from that enum
•	Print the size of the Range
•	Use the contains method to see if Wednesday is in that Range
•	Print the from element of this range
•	Print the to element of this range
Lists:
•	Create a list days (Sun - Sat)
•	Print out the list
•	Print the size of the list
•	Remove Saturday from the list
•	Add Saturday back by appending it to the list
•	Print out the Wednesday using its index

 */
enum daysOfTheWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

def myRange =  daysOfTheWeek.Monday..daysOfTheWeek.Sunday
println myRange.size() // result: 7
assert myRange.contains(daysOfTheWeek.Wednesday) // result: true
println myRange.from // result: Monday
println myRange.to // result: Sunday

//////////////////////////////////////////////////////////////////////////////
List listOfDays = []
for (i in daysOfTheWeek){
      listOfDays << i
}

println listOfDays //result:  [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
println listOfDays.size() // result: 7

listOfDays.remove(daysOfTheWeek.Saturday)
println listOfDays

listOfDays.pop()
println() // result: [Monday, Tuesday, Wednesday, Thursday, Friday, Sunday]

listOfDays.add(daysOfTheWeek.Saturday)
println listOfDays // result: [Tuesday, Wednesday, Thursday, Friday, Sunday, Saturday]

println listOfDays[1] // result: Wednesday

//////////////////////////////////////////////////////////////////////////
Map days = [1:"Sunday", 2: "Monday", 3: "Tuesday", 4: "Wednesday", 5: "Thursday", 6: "Friday", 7:"Saturday"]

println days //[1:Sunday, 2:Monday, 3:Tuesday, 4:Wednesday, 5:Thursday, 6:Friday, 7:Saturday]

println days.getClass().name // result: java.util.LinkedHashMap

println days.size() // result: 7

println days.values() //[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
