import groovy.transform.ToString

@ToString
class Tweet {
      String username
      String message
      Date createdOn
      Integer favorites
      Integer retweets

      public Tweet(String user, String tweet) {
            username = user
            message = tweet
            retweets = 0
            favorites = 0
            createdOn = new Date()
      }

      void retweet(){
            retweets++
      }
      void favorite(){
            favorites++
      }

}
