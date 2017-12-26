/**
 * 
 */
package q4;

import java.util.ArrayList;
import q3.Student;

/**
 * Class Course.
 * <p>
 * Represents a course taken at a school.
 * </p>
 * 
 * @author Zhang Yuanyuan
 * @version 2017-11-10
 */
public class Course {
    /** list for students take this course. */
    private ArrayList<Student> courseStudent;

    /** name of this course. */
    @SuppressWarnings("unused")
    private String courseName;

    /**
     * Constructs course objects.
     * 
     * @param courseName
     *            a string to set course name
     * @throws IllegalArgumentException
     *             throws exceptions if the parameter is illegal
     */
    public Course(String courseName) throws IllegalArgumentException {
        final int arrayLength = 5;
        this.courseName = courseName;
        courseStudent = new ArrayList<Student>(arrayLength);
    }

    /**
     * Adds new students to array list.
     * 
     * @param newStudent
     *            a Student to add students
     */
    public void addStudent(Student newStudent) {
        final int maxNumber = 5;
        courseStudent.add(newStudent);
        if (courseStudent.size() > maxNumber) {
            throw new IllegalArgumentException("At most 5 students in this "
                + "course");
        }
    }

    /**
     * Computes average score for all students.
     * 
     * @return average test score average of all students
     */
    public double average() {
        int i = 0;
        double sumScore = 0;
        double average = 0;
        while (i < courseStudent.size()) {
            sumScore += courseStudent.get(i).average();
            average = sumScore / (i + 1);
            i++;
        }
        return average;
    }
    
    /**
     * Prints all students in the course.
     */
    public void roll() {
        for (Student s : courseStudent) {
            System.out.println(s + "\n");
        }
    }
}
