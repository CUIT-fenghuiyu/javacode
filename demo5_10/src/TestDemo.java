import java.util.Arrays;

class Student implements Comparable{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student) {
            Student s = (Student) o;
            if (this.age > s.age) {
                return 1;
            } else if (this.age == s.age){
                return this.name.compareTo(s.name);
            }else {
                return -1;
            }
        }
        return 0;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("s1",12),
                new Student("s2",22),
                new Student("s3",14),
                new Student("s4",14)

        };
        Arrays.sort(students);

        for(Student x: students){
            System.out.println(x);
        }
    }
}

