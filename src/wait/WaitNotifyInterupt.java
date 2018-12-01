package wait;

/**
 * @author liugang
 * @create 2018/12/1 16:17
 **/
public class WaitNotifyInterupt {

    public static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException{
        //create Thread
        Thread threadA = new Thread(new Runnable(){
            @Override
            public void run() {
                try{
                    System.out.println("------begin----");
                    //the current thread is blocked
                    synchronized (obj){
                        obj.wait();
                    }
                    System.out.println("--------end-------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
        Thread.sleep(1000);
        System.out.println("------------begin interrupt threadA--------------");
        threadA.interrupt();
        System.out.println("------------end interrupt threadA--------------");
    }

}
