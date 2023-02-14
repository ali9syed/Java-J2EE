class Student {
    String name, usn;
    int age;
    double marks;

    Student (String name , String usn , int age , double marks){
        this.name = name;
        this.usn = usn;
        this.age = age;
        this.marks = marks;
    }
public String toString(){
    return name+" " +usn+" "+age+" "+ marks+" ";
}

}