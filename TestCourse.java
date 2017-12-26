package q4;

import q3.Address;
import q3.Student;

/**
 * Class TestCourse
 * <p>
 * Creates a courese, adds students, prints roll and the overall course test
 * average.
 * </p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-11-10
 */
public class TestCourse {
    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        final int score11 = 78;
        final int score12 = 67;
        final int score13 = 90;
        final int score21 = 86;
        final int score22 = 73;
        final int score23 = 93;
        final int score31 = 60;
        final int score32 = 77;
        final int score33 = 88;

        Course c = new Course("Math");
        Address home = new Address("Imperial", "Burnaby", "BC", "V5J1A2");
        Address school = new Address("Symour", "Richmond", "BC", "3N24V1");
        Student s1 = new Student("Jade", "Jay", home, school, score11, 
            score12, score13);
        Student s2 = new Student("Bob", "Will", home, school, score21, 
            score22, score23);
        Student s3 = new Student("David", "Beckham", home, school, score31, 
            score32, score33);
        Student s4 = new Student("Lady", "Gaga", home, school, score11, 
            score12, score13);
        Student s5 = new Student("Hagens", "Frederik", home, school, score21, 
            score22, score23);
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        c.addStudent(s4);
        c.addStudent(s5);

        c.roll();
        System.out.println("the average of all students' test score averages " 
            + "is: " + c.average());
        System.out.println("Question four was called and ran sucessfully.");
    }

};
