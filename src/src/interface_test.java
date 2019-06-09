package src;

public interface interface_test{

    int getNext();                                          //"normal" interface method

    default int[] getNextArray(int n){                      //default method
        return getArray(n);
    }

    static int getId(){                                     //Static method 不能被实现类继承，也不能被子接口继承
        return 2016217679;
    }

    private int [] getArray(int n){                         //private Method只能在接口内部使用(被调用)
        int []array=new int [n];
        for(int i=0;i<n;i++)    array[i]=getNext();
        return array;
    }
}
