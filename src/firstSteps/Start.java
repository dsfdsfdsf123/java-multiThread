package firstSteps;

/**
 * @author liugang
 * @create 2018/12/6 20:30
 **/
public class Start {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrintChar('A',200));
//        Thread t2 = new Thread(new PrintChar('B',100));
//        Thread t3 = new Thread(new PrintNum(100));
        t1.start();
        //设置优先级 MIN_PRIORITY 1优先级很低 MAX_PRIORITY很高 NORM_PRIORITY默认的优先级
//        t1.setPriority(Thread.NORM_PRIORITY);
//        t2.start();
//        t3.start();
        for (int i=0;i<200;i++){
            System.out.println(i);
            if (i==50){
//                //i等于50的时候，打断t1执行的方法，相对于stop（）这么粗暴来说，礼貌的方法
//                //改了t1方法的标志位，不会造成脏数据
                t1.interrupt();
            }

//            System.out.println(Thread.currentThread().getPriority());
            //当i等于20的时候，让t1加入进来
//            if (i==20){
//                //join（）方法 是这个方法比较急，先把这个线程加进去
//                t1.join();
//            }
        }

//        PrintCharOther t1 = new PrintCharOther('a',100);
//        PrintCharOther t2 = new PrintCharOther('b',100);
//        t1.start();
//        t2.start();

    }
}
