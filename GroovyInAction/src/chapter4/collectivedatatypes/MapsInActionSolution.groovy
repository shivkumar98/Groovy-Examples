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

def words = textCorpus.tokenize()

def wordFrequency = [:]

words.each {word-> wordFrequency[word] = wordFrequency.get(word, 0) + 1}

wordFrequency = wordFrequency.sort{entry1, entry2
      -> entry2.value <=> entry1.value
}

def statistic = ""

wordFrequency.keySet().toList()[0..6].each { key ->
      statistic+="$key:"+ wordFrequency[key] +"\n"
}

println statistic