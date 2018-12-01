package wait;

/**
 * @author liugang
 * @create 2018/12/1 8:35
 **/
public class Wait {

    private static volatile Object resourceA = new Object();
    private static volatile Object resourceB = new Object();

    public static void main(String[] args) throws InterruptedException{

        System.out.println("我tm的能显示");

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    //get resourceA
                    synchronized (resourceA){
                        System.out.println("threadA get resourceA lock");
                        synchronized (resourceB){
                            System.out.println("threadA get resourceB lock");
                            System.out.println("threadA release resourceA lock");
                            resourceA.wait();
                        }
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });


        //创建线程
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                    synchronized (resourceA){
                        System.out.println("threadB get reousceA lock");
                        System.out.println("threadB try get resourceB lock ...");

                        synchronized (resourceB){
                            System.out.println("threadB get resourceB lock ");

                            //线程B阻塞，并且释放获取到的resourceA的琐
                            System.out.println("threadB release resourceA lock");
                            resourceA.wait();
                        }
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
        System.out.println("main over");
    }
}
