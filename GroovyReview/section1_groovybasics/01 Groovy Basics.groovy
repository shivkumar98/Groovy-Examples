package section1_groovybasics

import org.fusesource.jansi.internal.Kernel32

/* Declaring Literals in Groovy */

      // declaring literals:
      def nestedArray = [[63]]

      // 'Classic' Java:
      ArrayList<ArrayList<Integer>> nestedArray2 = new ArrayList<ArrayList<Integer>>();
      nestedArray2.add(Arrays.asList(63) );

      println nestedArray // same result
      println nestedArray2 // same result


/* Using assertions as mini unit tests */

      assert true
      // assert false // throws exception

/* Regular Expressions */

      assert '12345' =~ /\d+/ // finds digit match
      def result = '123'.replaceAll(/\d/, 'x')
      assert result == 'xxx'

/* Numbers ARE objects */

      def x = 1;
      assert x.toString() == "1"
      assert x.toLong() == 1L;

/* Defining functions */
      def add10(x){
            return x+10;
      }
      assert add10(10.2) == 20.2
      assert add10("hello") == "hello10"

/* Groovy Collections */

      // LISTS ------------------------------------------------
      def list = [1,4,7]
      // we can access list indexes using bracket notation
      assert list[1] == 4
      // we can go beyond the limits of indexes:
      assert list[-1] == 7
      assert list[3] == null

      // we can assign a list beyond its index bounds
      // list.set(4, 10); // this would throw exception in Java (and Groovy)
      list[4] = 10
      assert list == [1,4,7,null,10]
      // LISTS ------------------------------------------------

      // MAPS --------------------------------------------------------------------
      // class Java way
      Map<Integer, String> javaMap = new HashMap<Integer, String>();
      javaMap.put(100,"CONTINUE")
      javaMap.put(200,"OK")
      javaMap.put(400,"BAD REQUEST")

      // Groovy way: declare literal
      def map = [ 100:'CONTINUE', 200:'OK', 300:'BAD REQUESR']
      assert map[100] == 'CONTINUE'
      // MAPS --------------------------------------------------------------------

      // RANGES -------------------------------------------------
      Range range = 1..10
      assert range.to == 10
      assert range.from == 1
      assert range.size() == 10

      // we can also create ranges for characters
      def alphabet = 'a'..'z'
      alphabet[1] == 'b'
      for (def c:alphabet){
            print c // abcdefghijklmnopqrstuvwxyz
      }
      // RANGES -------------------------------------------------

      // CLOSURES --------------------------------------------------
      // we can write a closure without any assignment
      def someNumber = 246; // colon here is important
      {    println "from someClosure"
       }

      def someClosure = {
            123
      }
      assert someClosure() == 123

      // creating closures  with parameters
      def closureWithParameters = {
            String name -> "hello ${name}"
      }
      assert closureWithParameters("Shiv") == "hello Shiv"

      def users = ["Shiv", "Lohit", "Kushal"]
      users.each {
            println "hello ${it}"
      }
      // CLOSURES --------------------------------------------------

      // GROOVY TRUTH ---------------------------------------------------
      String user;
      String greeting = "hello ";
      if (user){
            greeting += user;
      } else {
            greeting += "random user"
      }
      assert greeting == "hello random user"
      // GROOVY TRUTH ---------------------------------------------------