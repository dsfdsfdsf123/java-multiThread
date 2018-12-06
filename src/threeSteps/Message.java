package threeSteps;

/**
 * 以这个类作为锁，让其他的类去等待，去唤醒
 * @author liugang
 * @create 2018/12/6 23:30
 **/
public class Message {

    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public Message() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
