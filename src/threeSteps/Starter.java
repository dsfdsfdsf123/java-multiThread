package threeSteps;

/**
 * @author liugang
 * @create 2018/12/6 23:41
 **/
public class Starter {

    public static void main(String[] args) {
        Message msg = new Message("锁");
        //同一个对象，同一个锁才行
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter").start();

        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1,"waiter1").start();

        Notifier notifier = new Notifier(msg);
        new Thread(notifier,"waiter").start();
    }
}
