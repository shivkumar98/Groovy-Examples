import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingDeque
import java.util.concurrent.LinkedBlockingQueue

BlockingQueue sharedQueue = [] as LinkedBlockingQueue
Thread.start {
      10.times {
            try {
                  println "${Thread.currentThread().name}\t: ${it}"
                  sharedQueue << it
                  sleep 100
            } catch (InterruptedException ignore){

            }
      }
}

Thread.start('pop'){
      for (i in 0..9){
            sleep 200
            println ${Thread.currentThread().name}
      }
}