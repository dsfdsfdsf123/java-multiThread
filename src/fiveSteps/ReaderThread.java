package fiveSteps;

/**
 * @author liugang
 * @create 2018/12/10 21:33
 **/
public class ReaderThread extends Thread{

    @Override
    public void run() {
        while (!Visibility1.ready){
            Thread.yield();
            System.out.println(Visibility1.number);
        }
    }
}
