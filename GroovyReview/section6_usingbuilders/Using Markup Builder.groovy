package section6_usingbuilders

import groovy.xml.MarkupBuilder


def text = """1 For more information about XML processing in Groovy see chapter 14. 2 For any given x the factors are all numbers y such that x % y == 0.
    Listing 11.1 XML example data: Squares and factors of 10–15
    www.it-ebooks.info
    346 CHAPTER 11 Working with builders"""

def xml = new MarkupBuilder().numbers(text) {
      description("Squares and factors of 10..15")
      number([value: "10", square: "100"]) {
            factor([value:2])
            factor([value:5])
      }
      number([value:11, square:111])
}