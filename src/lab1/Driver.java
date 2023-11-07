package lab1;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        courses.add(new AdvancedJavaCourse("Advanced Java", "250"));
        courses.add(new IntroJavaCourse("Intro to Java", "102"));
        courses.add(new IntroToProgrammingCourse("Intro to Programming", "101"));

        courses.forEach(c -> System.out.println(c.getCourseName()));
    }
}
