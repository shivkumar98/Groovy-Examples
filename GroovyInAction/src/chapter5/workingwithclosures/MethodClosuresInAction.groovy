package chapter5.workingwithclosures

class MethodClosureSample {
      int limit
      MethodClosureSample (int limit) {
            this.limit = limit
      }

      boolean validate (String value){
            return value.length() <= limit
      }
}

// normal constructor calls@
MethodClosureSample first = new MethodClosureSample (6)
MethodClosureSample second = new MethodClosureSample(5)

// method closure assignment
Closure firstClosure = first.&validate

def words = ['long string', 'medium', 'short', 'tiny']

println words.find(firstClosure) // medium
println words.find(second.&validate) // short