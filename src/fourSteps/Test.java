package fourSteps;

import fiveSteps.ReaderThread;
import fiveSteps.Visibility1;

/**
 * @author liugang
 * @create 2018/12/8 16:34
 **/
public class Test {

    public static void main(String[] args) {
        new ReaderThread().start();
        Visibility1.number=42; //42 0 没有进入循环
        Visibility1.ready=true;  //指令排序 是一种优化手段
        int a = 3;
        int b = 5;
        int c = a+b;
        int d = 6;
    }
//        Counter counter = new Counter();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                counter.add();
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                counter.add();
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                counter.add();
//            }
//        }).start();
//    }
}
