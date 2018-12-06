package secondSteps;

/**
 * @author liugang
 * @create 2018/12/6 22:49
 **/
public class Start {

    public static void main(String[] args) {
//        SellTicket ticket = new SellTicket();
        Thread t1 = new Thread(new SellTicket(),"窗口1");
        Thread t2 = new Thread(new SellTicket(),"窗口2");
        Thread t3 = new Thread(new SellTicket(),"窗口3");
        Thread t4 = new Thread(new SellTicket(),"窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
