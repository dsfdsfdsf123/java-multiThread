package threeSteps;

/**
 * 进行唤醒
 * @author liugang
 * @create 2018/12/6 23:38
 **/
public class Notifier implements Runnable{

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg){
            msg.setMsg("唤醒线程工作");
//            msg.notify();
            msg.notifyAll();
        }
    }
}
