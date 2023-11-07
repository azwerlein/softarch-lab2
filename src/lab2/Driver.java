package lab2;

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

    /*
     * I think interface inheritance is great because it leaves the low-level implementation details entirely
     * to the subclasses. However, with a project like this, I think abstract classes are the better play.
     * In the context of a course registration and scheduling system, all courses have the same types of properties.
     * They have course titles, course numbers, credits, and usually prerequisites. It's much easier to store these
     * properties in a common super class rather than redefining them in each subclass.
     */
}
