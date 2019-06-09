package src;
public class Main {

    public static void main(String[] args) {
        test1 t1=new test1();
        StdOut.println(t1.getNext());
    }

}

class test1 implements interface_test{



    @Override
    public int getNext() {
        return interface_test.getId();
    }

}
