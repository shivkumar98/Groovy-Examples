package chapter4.collectivedatatypes

def result = ""
(5..9).each {element -> result+=element}
println(result)


assert  (5..9).isCase(6)

age= 36
def yourAge = ""
switch (age){
      case 0..17:
      yourAge = "You are a child"
      break
      case 18..49:
            yourAge = "You are an adult"
            break
      case 50..79:
            yourAge = "You are middle aged"
            break
      default: throw new IllegalArgumentException()
}
println yourAge // prints: You are an adult

def list = [1,2,4]

println list.grep(2..4) //prints [2, 4]