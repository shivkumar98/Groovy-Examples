package chapter4.collectivedatatypes

def quicksort(list)  {
      if (list.size<2){
            return list
      }
      def pivot = list[list.size().intdiv(2)]
      def left = list.findAll { item -> item<pivot}
      def middle = list.findAll{item->item == pivot}
      def right = list.findAll {item -> item>pivot}
      return quicksort(left)+middle+quicksort(right)
}

println quicksort([1,2,1,2,1,2]) //[1, 1, 1, 2, 2, 2]

println quicksort([1.0,3, 5L]) // [1.0, 3, 5]

println quicksort(['a', 'shiv', 'degf']) //[a, degf, shiv]

println quicksort('shivskdhidh')

