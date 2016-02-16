package tree;

public class MyList {
    private int content;
    private MyList next;

    MyList (int cont) {
        content = cont;
        next = null;
    }

    int getContent() {
        return content;
    }

    MyList getNext() {
        return next;
    }

    void append(MyList lis) {
        next = lis;
    }

    MyList withIndex(int n) {
        if (n == 0) {
            return this;
        } else {
            return next.withIndex(n - 1);
        }
    }
}
