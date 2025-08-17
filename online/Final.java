class Calc {
    public void show() {   // removed 'final'
        System.out.println("in calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class Advclac extends Calc {
    @Override
    public void show() {
        System.out.println("by darshan");
    }
}

public class Main {
    public static void main(String[] args) {
        Advclac obj = new Advclac();
        obj.show();      // calls overridden method
        obj.add(4, 4);
    }
}
