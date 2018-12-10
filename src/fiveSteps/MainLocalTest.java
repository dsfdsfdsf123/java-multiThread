package fiveSteps;

/**
 * @author liugang
 * @create 2018/12/10 23:53
 **/
public class MainLocalTest {

    private static ThreadLocal<LocalTest> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        LocalTest local = new LocalTest();

        new Thread(){
            @Override
            public void run() {
                for (;;){
                    threadLocal.set(local);
                    LocalTest l = threadLocal.get();
                    l.setNum(20);
                    System.out.println(Thread.currentThread().getName()+"--------------"+threadLocal.get().getNum());
                    Thread.yield();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (;;){
                    threadLocal.set(local);
                    LocalTest l = threadLocal.get();
                    l.setNum(30);
                    System.out.println(Thread.currentThread().getName()+"--------------"+threadLocal.get().getNum());
                    Thread.yield();
                }
            }
        }.start();
    }
}
