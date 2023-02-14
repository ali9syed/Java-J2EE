import java.util.*;
public class AgeSort implements Comparator<Student> {
 public int compare(Student s1 , Student s2){
    return Integer.compare(s2.age , s1.age);
}

}