import java.util.*;
public class MyList {
    public static void main(String[] args) {
        ArrayList  list1 = new ArrayList(3);
        list1.add('A');
        list1.add(2);
        list1.add("sakil");
        list1.add(2);
        list1.add(0,11);
        ArrayList list2 = new ArrayList();
        list2.add('A');
        list2.add('D');
        list2.add('C');
        list1.addAll(list2);
//        for(int i=0; i < list1.size(); i++){
//            System.out.println(list1[i]);
//        }
        Iterator i1 = list1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
        list1.clear();
        if(list1.size() >1 ) {
            Iterator it2 = list1.iterator();
            while (it2.hasNext()) {
                System.out.println(it2.next());
            }
        }else{
            System.out.println("Nothing Found After Clear");
        }


    }
}
