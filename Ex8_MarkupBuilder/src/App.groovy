import groovy.xml.MarkupBuilder
List books = [[isbn:"978-1935182443",title:"Groovy in Action", author:"Dierk Koenig", price:"50.58"],
                  [isbn:"978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: "33.96"]]
FileWriter file = new FileWriter("./out.html")
MarkupBuilder html = new MarkupBuilder(file)
html.html{
      head{
            title "books on groovy"
      }
      body{
            table {
                  tr {
                        th "ISBN"
                        th "Author"
                        th "Title"
                        th "Price"
                  }
                  books.each {book ->
                        tr {
                              td book.isbn
                              td book.author
                              td book.title
                              td book.price
                        }
                  }

            }
      }
}