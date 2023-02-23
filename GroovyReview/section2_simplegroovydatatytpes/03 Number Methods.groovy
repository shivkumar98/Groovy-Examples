package section2_simplegroovydatatytpes

def sum = 0
10.times {Integer it -> sum+=sum}

// Given n guests in a dinner party, if each guest clinks glasses with each other
// what is the total number of clinks?

// Class Java Way

class DinnerParty {
      static int numberOfClinks(int n){
            // n is number of guests
            int sum = 0;
            for (int i=1;i<=n;i++){
                  // i = guest number
                  sum+=n-1
            }
            return sum/2
      }
}

// Groovy way:
def clinks = 0
1.upto(4) {
      clinks+= 3
}
println clinks/2


// how can I append some text n times in Java?
def text1 = "Hello"
for (int i=0; i<4;i++){
      text1+="Shiv"
}
println text1

def text = "Hello"
4.times({
      text << "Shiv"
      println "it "+it
})

// suppose I want to print 5 4 3 2 1 Boom!
5.downto(0){
      if (it==0) println "Boom"
      else println it+ "..."
}

// suppose I want to create an array from 0 to 1.0 in steps of 0.1, 0.2, 0.3
List<Double> numbers = new ArrayList<>();
numbers.add(0.0)
for (double i=0.1; i<1;i+=0.1) {
      numbers.add(i)
}
println numbers

def nums = [0]
for (num in 1..5){
      nums << nums[nums.size()-1] + 0.1*num
}
println nums

// ranges
'a'..'z'.each {
      println it
}