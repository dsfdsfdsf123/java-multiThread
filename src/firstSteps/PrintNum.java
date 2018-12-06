package firstSteps;

/**
 * @author liugang
 * @create 2018/12/6 20:47
 **/
public class PrintNum implements Runnable{

    private int num;

    public PrintNum(int num) {
        this.num = num;
    }

    public PrintNum() {
    }

    @Override
    public void run() {

        for(int i=0;i<num;i++){
            System.out.println(i);
            //打印一次，让出线程
            //yield() 执行这个代码的时候，让出线程，让出线程并不代表下一次不执行，可能下一次cpu还可能选中
            //让出cpu的执行权
            Thread.yield();
        }
    }
}
