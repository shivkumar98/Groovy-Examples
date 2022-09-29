import groovy.transform.Canonical

@Canonical
class Account {
      String FirstName
      String LastName
      BigDecimal balance

      void displayBalance(){
            println "Your current balance is: " +balance
            println "--------------------\n"
      }

      boolean withdraw(BigDecimal amount){
            if (amount>balance){
                  println "You are unable to withdraw this much money. Please enter a different amount"
                  println "------------------------------------------------------------------------"
                  sleep(1000)
                  false
            } else if (amount<=0){
                  println("Please enter a positive amount")
            } else {
                  balance = balance - amount
                  sleep(1000)
                  println "\nYou have successfully withdrawn $amount from your current account"
                  println "Your current balance is $balance"
                  println "------------------------------------------------------------------------\n"
                  sleep(2000)
                  true
            }
      }

      boolean deposit(BigDecimal amount){
            if (amount<=0){
                  println "Please enter a value greater than 0 to deposit"
                  println "----------------------------------------------\n"
                  sleep(1500)
                  false
            } else {
                  amount = amount + balance
                  println "You have successfully deposited your money into your current account"
                  println "Your new balance is: $amount"
                  println "--------------------------------------------------------------------\n"
                  sleep(2000)
                  true
            }
      }

}
