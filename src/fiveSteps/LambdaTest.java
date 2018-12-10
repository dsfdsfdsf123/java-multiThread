package fiveSteps;

/**
 * @author liugang
 * @create 2018/12/10 22:11
 **/
public class LambdaTest {

    public static void main(String[] args) {
        new Thread(() ->{
            System.out.println("测试lambda");
        }).start();
    }
}
