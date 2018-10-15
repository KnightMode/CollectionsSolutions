import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>(Arrays.asList(new Student(23, "Shreeghanesh", "Android"),
            new Student(24, "Someone", "IOS"),
            new Student(29, "SomeoneElse", "IOS")));

    studentList.sort(Comparator.comparingInt(Student::getAge));

    System.out.println(studentList.toString());
  }
}
