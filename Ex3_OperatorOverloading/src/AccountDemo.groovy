/*•	Create a new script called AccountDemo.groovy
      -    	Create a class called Account
      -    	Create a property called balance of type BigDecimal and initialize it to 0
      -	Create a property called type of type String
      -	Create a deposit method that will add to the balance
      -	Create a withdraw method that will subtract from the balance
      -	no need for this to check if they have that amount available (keep it simple)
•	With that code in place the following lines should work
      -	Account checking = new Account(type:"Checking")
      -	checking.deposit(100.00)
      -	Account savings = new Account(type:"Savings")
      -	savings.deposit(50.00)
•	We know that the String class has on overloaded method called plus that allows us to concatenate 2 strings right? So how could we take that logic and make it so we can make the following lines work.
      -	BigDecimal total = checking + savings
      -	println total
*/

import groovy.transform.ToString

@ToString
class Account{
      BigDecimal balance = 0
      String type


      void deposit(BigDecimal amount) {
            if (amount>0){
                  balance = balance + amount
            } else {
                  throw new Exception("Invalid deposit amount, please provide a positive amount")
            }

      }

      void withdraw(BigDecimal amount){
            if (amount>0){
                  balance = balance- amount
            } else {
                  throw new Exception("Invalid withdrawal amount, please provide a positive amount")
            }

      }

      BigDecimal plus(Account account){
           return this.balance + account.balance
      }


}

Account checking = new Account(type: "Checking")
checking.deposit(100.00)
Account savings = new Account(type: "Savings")
savings.deposit(50.00)

BigDecimal total = checking + savings
println total //result: 150.00