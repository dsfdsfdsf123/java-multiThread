package secondSteps;

/**
 * 卖票
 * @author liugang
 * @create 2018/12/6 22:43
 **/
public class SellTicket implements Runnable {

    private static Integer ticketCount = 100;

    private Object obj = new Object();

    @Override
    public void run() {
        try {
            while (ticketCount>0){
                sellTicket();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized static void sellTicket() {
        //同步代码块 锁 任何一个对象
        synchronized (SellTicket.class) {
            if (ticketCount > 0) {
                ticketCount--;
                System.out.println("线程的名称：" + Thread.currentThread().getName() + "卖票 还剩" + ticketCount + "张");
            } else {
                System.out.println("票卖完了");
            }
        }
    }
    //如果不考虑多线程的环境，肯定不会出问题
}
