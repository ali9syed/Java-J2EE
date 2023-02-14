import java.util.*;
public class Name implements Comparator<Student> {
 public int compare(Student s1 , Student s2){
    if(s2.name.compareTo(s1.name)==0){
        return Integer.compare(s1.age,s2.age);
    }
    return s2.name.compareTo(s1.name);
}

}