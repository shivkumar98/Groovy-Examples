package com.code_exercises

/*
The Ceasar cipher is a basic encryption technique used by Julius Ceasar
to securely communicate with his generals.
 Each letter is replaced by another letter N positions down the english alphabet.
  For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'.
   In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
Implement a decoder for the Ceasar cipher where N = 5.
 */

def static decode(String code){
      def alphabet = "abcdefghijklmnopqrstuvwxyz"
      def decodedString = ""
      for (int i =0; i<code.length(); i++){
            if (code.charAt(i)== ' '){
                  decodedString+= " "
                  continue
            } else {
                  def index = alphabet.indexOf(code.charAt(i).toString())
                  int decodedIndex = 0
                  if (index>=5){
                        decodedIndex = (alphabet.indexOf(code.charAt(i).toString())-5)
                  } else {
                        decodedIndex = alphabet.indexOf(code.charAt(i).toString())-5+26
                  }

                  decodedString+=alphabet.charAt(decodedIndex)
            }

      }
      println "decoded text: $decodedString"
      return decodedString.toString()

}

assert decode("abcdefghijklmnopqrstuvwxyz") == "vwxyzabcdefghijklmnopqrstu"
assert decode("ijrts xqfdjw nx sty ymfy ltti tk fs fsnrj") ==
        "demon slayer is not that good of an anime"


