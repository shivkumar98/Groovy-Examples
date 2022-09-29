package chapter6.thegroovytruth

import java.security.InvalidParameterException

class Money{
      private int       amount
      private String    currency

      Money(amountValue, currencyValue){
            amount     = amountValue
            currency   = currencyValue
      }

      int hashCode() {
            amount.hashCode() + currency.hashCode()
      }

      boolean equals (Money other){
            if (other == null)                        return false
            if (this.currency != other.currency)      return false
            if (this.amount != other.amount)          return false
            return true
      }

      Money plus(Money other){
            if (other != null && this.currency==other.currency) {
                  return new Money(this.amount+other.amount, this.currency)
            } else {
                  throw new InvalidParameterException()
            }
      }

      Money plus (Integer amount){
            return new Money(this.amount+amount, this.currency)
      }

}

def buck =  new Money(1, "USD")
def buck2 = new Money(1, "USD")

assert buck.hashCode() == buck2.hashCode()
assert buck == buck2

assert buck + buck2 == new Money(2, "USD")

assert buck+21 == new Money(22, "USD")

x =1 + 1.0
println x.class.name

Date date = new Date()

greet = 'Hello Groovy!'

assert greet.startsWith("Hello")
assert greet.startsWith("Groovy!",6)

assert greet[0] == greet.getAt(0)
assert greet[0..5] == "Hello "

assert greet.count('o') == 3

assert 'x'.padLeft(2) == ' x'
assert 'x'.padRight(2) == 'x '
assert 'x'.center(2) == 'x '

assert 'x'*4 == 'xxxx'

//
def buffer = "Hello"
assert buffer instanceof String
buffer <<= " Java!" // leftshift and assign
assert buffer instanceof StringBuffer
buffer[6..buffer.length()] = "Java!"
assert buffer.toString() == "Hello Java!"

assert "some text" ==~ /some text/