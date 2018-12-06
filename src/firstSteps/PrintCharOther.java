package firstSteps;

/**
 * @author liugang
 * @create 2018/12/6 20:36
 **/
public class PrintCharOther extends Thread {


    private char c;
    private Integer times;

    public PrintCharOther(char c, Integer times) {
        this.c = c;
        this.times = times;
    }

    public PrintCharOther() {
    }

    @Override
    public void run() {

        for(int i=0;i<times;i++){
            System.out.println(c);
        }
    }
}


