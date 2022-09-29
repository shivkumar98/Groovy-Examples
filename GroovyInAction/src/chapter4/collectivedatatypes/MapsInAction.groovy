package chapter4.collectivedatatypes

def textCorpus =
        """
Look for the bare necessities
The simple bare necessities
Forget about your worries and your strife
I mean the bare necessities
Old Mother Nature's recipes
That bring the bare necessities of life
"""

def wordFrequency = [:]

def words = textCorpus.replace('\n', ' ').split(" ")


for (word in words){
      word = word.toLowerCase()
      if (wordFrequency.containsKey(word)){
            wordFrequency[word] = wordFrequency[word]+1
      } else {
            wordFrequency[word] = 1
      }


}

wordFrequency= wordFrequency.sort {a,b -> b.value <=>a.value}
println wordFrequency


//// Book solution:

