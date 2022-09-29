class PinValidator {

            static boolean validatePin(){
                  def validPin = false
                  while (!validPin){
                        Scanner scanner = new Scanner(System.in)
                        println "Please enter pin"
                        def pinNumber = []
                        for (int i = 0; i< 4; i++){
                              println "Please enter pin digit ${i+1}"
                              def integer = scanner.nextInt()
                              if (integer>=0 && integer<=9 ){
                                    pinNumber << integer
                                    println "* "*(i+1)
                              } else {
                                    println "Please enter a single digit"
                                    i =i-1 // restarting this loop
                              }
                        }

                        if (pinNumber.size()==4){
                              if (pinNumber.equals([1,2,3,4])) {
                                    println "Your pin has been verified"
                                    println "--------------------------\n"
                                    validPin = true
                                    return validPin
                                    break
                              } else {
                                    println "ATM: invalid pin, please reenter pin to continue"
                              }
                        }
                  }
            }
}