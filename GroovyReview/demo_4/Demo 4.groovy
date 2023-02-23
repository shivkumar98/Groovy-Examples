package demo_4

Closure closure = {
      key -> println key
}

 closure()

def  clothes = ["Tshirt", "Jeans"]
clothes.each {
      clotheArticle->      println(clotheArticle)
}

def log1 = ''
def log2 = ''
(1..3).each {
      log1 << it
      log2 << it
}

def count =0
// return things
def addition = {
      int x,int y ->
            return x-y
             count++// last statement is always
}

println addition(2,3)
println count


def map =[a:1,b:2]

def doubler = {
      it -> it.value = it.value*2
}

map = map.each(doubler)

println map

def doubleMethod (entry){
      entry.value = entry.value * 2
}
doubler = this.&doubleMethod



