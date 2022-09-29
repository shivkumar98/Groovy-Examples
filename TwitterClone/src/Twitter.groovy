/*
Task 1:
•Create a class called Tweet
      -Add properties to this class.
      -What properties would be present in a class that holds information about a tweet
      -Think about what their data types would be
•What methods would go in this class?
      -How about a constructor to create a new tweet.
      -How about methods to change some of your properties?
      -How about a toString method (or AST Transformation)
Task 2:
•Create a script called Twitter.
      -In this script create one or more Tweets.
      -print the Tweet instances to the console (and have their string representations shown)
Bonus:
•Create a file called Tweet.groovy.
•Inside this file create a class called Tweet (the one you created above)
•Then in the same file outside of the class declaration try to create a new tweet.
•What is the error you get and why is this happening?
*/




def tweet = new Tweet("@ShivKumar", "hello world, this is my first tweet")
def tweet2 = new Tweet("@ShivKumar", "I like music from @KanyeWest")
tweet.retweet()
tweet2.favorite()
println tweet
//Tweet(@ShivKumar, hello world, this is my first tweet, Mon Jan 31 16:00:05 GMT 2022, 0, 1)
println tweet2
//Tweet(@ShivKumar, I like music from @KanyeWest, Mon Jan 31 16:00:05 GMT 2022, 1, 0)


