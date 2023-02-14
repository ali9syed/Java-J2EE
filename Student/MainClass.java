import java.util.*;

public class MainClass 
{
        public static void main( String []args)
        {
            ArrayList<Student> sList = new ArrayList<Student>();
            Student s1 = new Student("Lola Benson", "123", 20, 98);
            Student s2 = new Student("Tamanna", "1213", 20, 99.99);
            Student s3 = new Student("Reehan", "124", 22, 100);
            Student s4 = new Student("Rishith", "129", 21, 89);
            Student s5 = new Student("Ryan", "100", 25, 29);
            Student s6 = new Student("Ryan", "100", 29, 30);
            sList.add(s1);  
            sList.add(s2);
            sList.add(s3);
            sList.add(s4);
            sList.add(s5);
            sList.add(s6);
            ArrayList<Double> plist = new ArrayList<Double>();  
            plist.add(323.2);
            plist.add(323.5);
            plist.add(333.2);
            Collections.sort(plist);
            System.out.println(" Before Sorting");
            for(Student s :sList){
                System.out.println(s);
            }    
            Collections.sort(sList , new Sort());
            System.out.println();
            System.out.println("Sorted Collection based on names");
            for(Student s: sList){
                System.out.println(s);
            }
            System.out.println();
            System.out.println("Sorted Collection based on marks");
            Collections.sort(sList , new MarksSort());
            for(Student s: sList){
                System.out.println(s);
            }
            System.out.println();
            System.out.println("Sorted Collection based on age");
            Collections.sort(sList , new AgeSort());
            for(Student s: sList){
                System.out.println(s);
            }

            System.out.println();
            System.out.println("Sorted based on Age and Name  based on Name");
            Collections.sort(sList , new Name());
            for(Student s: sList){
                System.out.println(s);
            }

        }
    
}           

