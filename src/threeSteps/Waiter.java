package threeSteps;

/**
 * @author liugang
 * @create 2018/12/6 23:32
 **/
public class Waiter implements Runnable{

    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        //当前线程，执行到了msg.wait()就会导致，持有这个锁的线程阻塞在这里了，进行等待，一直到他被唤醒为止
        synchronized (msg){
            try {
                System.out.println(name+"等待时间："+System.currentTimeMillis());
                msg.wait();
                System.out.println(name+msg.getMsg()+"唤醒时间："+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
