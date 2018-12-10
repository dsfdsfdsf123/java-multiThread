package fourSteps;

/**
 * @author liugang
 * @create 2018/12/10 21:27
 **/
public class Brother extends Sister {
    @Override
    public synchronized void doSomething() {
        super.doSomething();
    }
}
