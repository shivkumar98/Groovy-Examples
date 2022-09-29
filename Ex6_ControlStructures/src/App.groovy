import groovy.transform.ToString
@ToString
class Account {
      BigDecimal balance = 0.0
      void deposit(BigDecimal amount){
            try{

                  if (amount<=0){
                        throw new Exception("Please enter a value greater than 0!")
                  } else {
                        balance = balance+amount
                  }
            }
            catch (Exception e){
                  println("exception caught: "+ e.message)
            }
      }
      void deposit(List amounts){
            for (amount in amounts){
                  deposit(amount)
            }
      }
}

Account account = new Account()
account.deposit(0)
println account // without try catch this will not execute
//result: Account(0.0) as expected

account.deposit([1,0,3,4])
println account
//result: Account(8.0) as expected

