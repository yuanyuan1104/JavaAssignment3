package q3;

/**
 * Class TestStudent.
 * <p>
 * Creates Student objects and tests the methodes of Student class.
 * </p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-11-10
 */
public class TestStudent {
    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args unused
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
        Address home = new Address("Imperial", "Burnaby", "BC", "V5J1A2");
        Address school = new Address("Symour", "Richmond", "BC", "3N24V1");
        Student s1 = new Student("Jade", "Jay", home, school, score11, 
            score12, score13);
        Student s2 = new Student("Bod", "Will", home, school, score21, 
            score22, score23);
        Student s3 = new Student("David", "Beckham", home, school, score31, 
            score32, score33);
        Student s4 = new Student("Lady", "Gaga", home, school, score11, 
            score12, score13);
        Student s5 = new Student("Hagens", "Frederik", home, school, 
            score21, score22, score23);
        System.out.println("student1:\n\n" + s1 + "\n\nstudent2:\n\n" + s2
            + "\n\nstudent3:\n\n" + s3 + "\n\nstudent4:\n\n" + s4 
            + "\n\nstudent5:\n\n" + s5);
        System.out.println("\nstudent1: modify test2 score to 60");
        s1.setTestScore(2, score31);
        System.out.println("student2: modify test1 score to 88");
        s2.setTestScore(1, score33);
        System.out.println(s1.getTestScore(2));
        System.out.println(s2.getTestScore(1));
        System.out.println("\nstudent1(modified score):\n");
        System.out.println(s1);
        System.out.println("\nstudent2(modified score):\n");
        System.out.println(s2);
        System.out.println("Question three was called and ran sucessfully.");
    }

};
