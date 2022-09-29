package chapter4.collectivedatatypes

def list = [1,2,3,4]
list.each { list.clear()}
// throws java.util.ConcurrentModificationException