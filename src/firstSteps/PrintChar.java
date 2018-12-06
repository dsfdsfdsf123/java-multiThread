package firstSteps;

/**
 * @author liugang
 * @create 2018/12/6 20:28
 **/
public class PrintChar implements Runnable{

    private char c;
    private Integer times;

    public PrintChar(char c, Integer times) {
        this.c = c;
        this.times = times;
    }

    public PrintChar() {
    }

    @Override
    public void run() {

            int i=0;
            for(i=0;i<times;i++){
                //当前线程的对象，的线程标志位有没有被修改啊
                if (Thread.currentThread().isInterrupted()){
                    break;
                }
//                if (i==30){
//                    //interrupted()重置中断标志位
//                    Thread.interrupted();
//                }
                //看看是不是intertupt我了，然后顺便清除interrupt状态
                if (Thread.interrupted()){
                    System.out.println(Thread.currentThread().isInterrupted() );
                }
                System.out.println(c);
                //sleep（）方法是让线程睡一会儿,里面的millis是毫秒
//                if (i>=10){
//                    Thread.sleep(3000);
//                }
            }
            //终止不终止，由线程本身决定
        System.out.println(i+"打印完了");

    }
}
