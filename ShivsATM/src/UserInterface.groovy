class UserInterface {
      static void displayMainMenu(Account account){
            println "Please select one of the following options:"
            println "Enter 1 to see balance"
            println "Enter 2 to withdraw"
            println "Enter 3 to deposit"
            println "Enter 4 to Exit"

            Scanner scanner = new Scanner(System.in)
            def userInput = scanner.nextInt()
            if (userInput==1){
                  account.displayBalance()
                  sleep(2000)
                  displayMainMenu(account)
            } else if (userInput == 2){
                  def withdrawSuccessful = false
                  account.displayBalance()
                  while (!withdrawSuccessful){

                        sleep(500)
                        println "Please enter how much you would like to withdraw"
                        userInput = scanner.nextDouble()
                        if (userInput*100 == (int)(userInput*100)){

                              if (account.withdraw(userInput)){
                                    withdrawSuccessful = true
                              } else {
                                    continue
                              }
                        } else {
                              println "You can only enter a number to two decimal places"
                              continue
                        }

                  }
                  displayMainMenu(account)
            } else if (userInput == 3){
                 def depositSuccessful = false
                  while (!depositSuccessful){
                        println("Please enter how much you would like to deposit")
                        userInput = scanner.nextDouble()
                        if (account.deposit(userInput)){
                              depositSuccessful = true
                              sleep(1500)
                        }
                  }
                  displayMainMenu(account)
            } else if (userInput == 4){
                  println "Thank you for banking with us! Goodbye!"

            } else {
                  println "Returning to main menu..."
                  displayMainMenu(account)
            }


      }
}
