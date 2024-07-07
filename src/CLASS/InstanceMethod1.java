package CLASS;

public class InstanceMethod1 {

    int current;
    public void inc() {
        current++;
    }

    public int getCurrent() {
        return current;
    }

    public static void main(String[] args) {
        InstanceMethod1 obj = new InstanceMethod1();
        obj.current = 5;

        obj.inc();
        System.out.println(obj.getCurrent());
    }
}
