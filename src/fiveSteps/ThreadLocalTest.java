package fiveSteps;

import java.util.concurrent.TimeUnit;

/**
 * @author liugang
 * @create 2018/12/10 23:42
 **/
public class ThreadLocalTest {

    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>();

    public static final void start(){
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static final long end(){
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalTest.start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(ThreadLocalTest.end());
    }
}
