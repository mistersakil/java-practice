package p1;

public class ArrayList {
    int myname[];
    int size = 0;
    public  ArrayList(){
        this.myname = new int[10];
    }

    public void add(int item) {
        myname[size] = item;
        size++;
    }


}
