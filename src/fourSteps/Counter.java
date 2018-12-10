package fourSteps;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liugang
 * @create 2018/12/8 16:33
 **/
public class Counter {

    private AtomicInteger count = new AtomicInteger();

    public void add(){
        try {
            for (int i=0;i<200;i++){
                Thread.sleep(100);
                //用this锁定，一个一个来
                count.incrementAndGet();
                System.out.println(this.count);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
