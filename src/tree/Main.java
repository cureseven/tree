package tree;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello,world.");
        MyList lis = new MyList(51);
        MyList lis2 = new MyList(100);
        MyList lis3 = new MyList(32);
        lis.append(lis2);
        lis2.append(lis3);
        System.out.println(lis.withIndex(2).getContent());
    }
}
