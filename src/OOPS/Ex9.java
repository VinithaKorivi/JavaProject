package OOPS;

class Student {
    String name;
    Student(String name) { this.name = name; }
}

public class Ex9 {
    public static void main(String[] args) {
        Student[] s = new Student[3];

        s[0] = new Student("A");
        s[1] = new Student("B");
        s[2] = new Student("C");

        for(Student st : s) {
            System.out.println(st.name);
        }
    }
}
