package demo_2

// Seeing the class name
      int integer = 1;
      // print integer.class // class java.lang.Integer
      // print integer.getClass().getName() // java.lang.Integer

// working with GStrings
      def name = "Shiv Kumar"
      def greeting2 = "Hello $name"
      assert greeting2=="Hello Shiv Kumar"

// Working with numbers
      // number types in Java: int, double, float, short, byte,

      def randomNumber = 1
      randomNumber.getClass().getName() // "Integer"

      def largeNumber = 99999999999999999999999999999 // Math.BigInteger

      def floatingPoint = 0.1f // float
      def floatingPoint2 = 0.1 // Math.BigDecimal

      def longNumber = 1.1 // we can not make this a long
      // print longNumber.class // BigDecimal

      def character = 'x' // string. Single Quotes is used for Java String literals!
      def char2 = 'x' as char // Character. We can coerce to required type using as

      assert 3/2 == 1.5
      assert 3.intdiv(2) == 1

// String Methods
      def greeting = "Hello World"
      // I want to change to "Morning World"

      /* We can NOT do the following!!!
      greeting[0..4] = "Morning"
       */

      // We can append to a string using left-shift operator (<<)
      def morningGreeting = "Morning " << greeting[greeting.indexOf('W')..greeting.length()-1]
      morningGreeting = morningGreeting.toString()
      println morningGreeting // Morning World


// Number Methods

      assert (-1).abs() == 1
      assert (2.5).toInteger() == 2
      assert (2.5 as int) == 2 // forced coercion
      assert ((int) 2.5) == 2 // cast
      assert (2.5).round() == 3
      assert (4.56531651).trunc() == 4
      assert 6 + 6 + "times" == "12times"

      // special methods:
            // .times() lets you define a closure which is executed n times:
            def sum = 0;
            10.times {Integer it -> sum+=it }