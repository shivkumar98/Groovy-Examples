package demo_2

// upto
// n dinner guest
def clinks = 0
1.upto(3){
      clinks+= 2
}
println clinks/2

clinks = 0
1.upto(4){
      clinks+3
}
println clinks/2

// times
def str = "Hello"
// append 4 times "Shiv"
4.times {
      str+= "Shiv "
}
println str

4.downto(1){

}

/*
(0.1).upto(3.2){
      println it
}

 */

// arr = [0.0, 0.1, 0.3, 0.6, 1.0]

List list = new ArrayList()
list.add(0.0)
for (int i=1;i<=4;i++){
      list.add(list.get(i-1) + 0.1*i)
}
println list

// Groovy Way:

list = [0]
for (num in 1..4)
      list << list[num-1] + 0.1*num

println list