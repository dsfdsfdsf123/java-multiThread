package fiveSteps;

import static sun.misc.PostVMInitHook.run;

/**
 * @author liugang
 * @create 2018/12/10 21:45
 **/
public class Visibility {

    private static boolean bChanged;
    //volatile 保证变量的修改让所有线程可见 阻止指令排序  相对的来说
    //古老的关键字 syn优化的比较好了   不要刻意的用它
    //sync 能够解决   可见性   原子性  volatile只能解决可见性   先比较 后修改   CAS操作 compare and set
    //当第一个线程比较之后，进来修改了值，第二个线程比较之后，拿到的值还是之前原来的值，变量没有原子化
    //把变量声明为final
    //线程封闭 ： final 不要线程之间共享变量
    //堆栈 栈封闭 比如 方法内部声明   修改   不会溢出
    //ThreadLocal  线程绑定

    //
    public static void main(String[] args) throws InterruptedException {
        new Thread(() ->{
            for (;;){
                if (bChanged==true){
                    System.out.println("!=");
                    System.exit(0);
                }
            }
        }).start();
    }
}
