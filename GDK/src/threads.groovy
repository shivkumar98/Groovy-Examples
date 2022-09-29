def t = new Thread(){
}
t.start()

Thread.start {} // works statically

Thread.start{'some thread name'}

