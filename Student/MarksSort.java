import java.util.*;
public class MarksSort implements Comparator<Student> {
 public int compare(Student s1 , Student s2){
    return Double.compare(s1.marks , s2.marks);
}

}