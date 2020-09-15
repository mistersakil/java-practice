import javax.print.DocFlavor;
import java.text.RuleBasedCollator;
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<String> sons;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        sons = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sakilVai(ArrayList<Integer> sv) {
        for(int lulu: sv){
            System.out.println(lulu);
        }
    }

    public Boolean addSon(String sonName) {
        sons.add(sonName);
        return true;
    }
    public void viewSon(){
        System.out.println("all sons");
//        for(String soneName: sons){
//            System.out.println(soneName);
//        }
        for(int i = 0; i < sons.size(); i++){
            System.out.println(sons.get(i));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
