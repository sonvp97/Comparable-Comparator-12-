import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien",30,"ht");
        Student student1 = new Student("Tung",26,"hn");
        Student student2 = new Student("Anh",38,"ht");
        Student student3 = new Student("Nam",38,"ht");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st);
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists){
            System.out.println(st);
        }
    }
}