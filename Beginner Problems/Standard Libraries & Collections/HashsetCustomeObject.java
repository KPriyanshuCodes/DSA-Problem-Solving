import java.util.HashSet;
import java.util.Objects;

class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }


    //For custom object in Hashset must override equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }
}


public class HashsetCustomeObject {
    static void main(String[] args) {
        HashSet<Student>set=new HashSet<>();
        Student s1=new Student(01,"John");
        Student s2=new Student(02,"Wick");
        Student s3=new Student(02,"Wick");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
