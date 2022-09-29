void someMethod(name, Closure c){
      c(name)
}

def c = { println "Hello $it"}

someMethod("shiv",c)
// result: Hello shiv

def myList = ['Shiv','Tommy','Ellie','Joe']
myList.each {it -> println it}
/*result:
Shiv
Tommy
Ellie
Joe
*/

def myMap = [1:'Apple',2:'banana']
myMap.each{ k,v -> println "$k: $v" }
/*
1: Apple
2: banana
 */

//currying example
def myDiary =  { Date date, String message -> println date.format("dd MMM")+": $message"}
def myDiaryForToday = myDiary.curry(new Date())
myDiaryForToday("This is my second attempt at this exercise")
myDiaryForToday("Closures are fun")
/*
01 Feb: This is my second attempt at this exercise
01 Feb: Closures are fun
 */

// GDK
// what is the difference between find and findAll?
List friends = ['Jacob', 'Tommy', 'Rohan', 'Khizer']
println friends.find {friend -> friend.contains("o")}
//result: Jacob
println friends.findAll { friend -> friend.contains("o")}
// result: [Jacob, Tommy, Rohan]
// difference: 'find' returns the first instance of match
// 'findAll' returns all instances of a match

// what is the difference between any and every?
println friends.any(friend -> friend.contains("o"))
//result: true
println friends.every(friend -> friend.contains("o"))
//result: false
// the any method sees if there exists an element which matches
// the every method sees if all elements match

def friends1 = [[name:"shiv", city:"Birmingham"],[name:"khizer", city:"Birmingham"], [name:"sammy", city:"penkridge"]
               , [name:"Rohan", city:"Bilston"]]
println friends1.groupBy {friend -> friend.city}
//[Birmingham:[[name:shiv, city:Birmingham], [name:khizer, city:Birmingham]], penkridge:[[name:sammy, city:penkridge]], Bilston:[[name:Rohan, city:Bilston]]]
