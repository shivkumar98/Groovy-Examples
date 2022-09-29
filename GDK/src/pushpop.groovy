List numbers = []
10.times {
      println "push:\t ${it}"
      numbers << it
}

//pop
for (i in 9..0){
      println "pop:\t ${i}"
      numbers.pop()
}

println numbers
