package q3;


/**
 * Class Student.
 * <p>
 * Represents a BCIT student.
 * </p>
 * 
 * @author Zhang Yuanyuan
 * @version 2017-11-10
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student. Can be shared by other students */
    private Address schoolAddress;
    
    /**Score for the first test.*/
    private double score1;
    
    /**Score for the second test.*/
    private double score2;
    
    /**Score for the third test.*/
    private double score3;
    
    /**
     * Constructor. Constructs Student objects.
     */
    public Student() {
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }

    /**
     * Constructs a Student object that contains the specified values.
     * 
     * @param first
     *            a String representing the first name
     * @param last
     *            a String representing the last name
     * @param home
     *            an Address object containing the home address
     * @param school
     *            an Address object containing the school address
     * @param score1
     *            a double representing the first test score
     * @param score2
     *            a double representing the second test score
     * @param score3    
     *            a double representing the third test score       
     */
    public Student(String first, String last, Address home, Address school, 
        double score1, double score2, double score3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    /**
     * Sets the test score.
     * @param testNumber an int to set test number
     * @param testScore a double to set test score
     */
    public void setTestScore(int testNumber, double testScore) {
        final int i = 3;
        final int j = 1;
        if (testNumber <= i && testNumber >= j) {
            switch(testNumber) {
                case 1:
                    score1 = testScore;
                    break;
                case 2:
                    score2 = testScore;
                    break;
                case i:
                    score3 = testScore;
                    break;
                default:
                    break;   
            }
        } else {
            throw new IllegalArgumentException("test number should "
                    + "be 1, 2 or 3");
        }
    }
    /**
     * Gets the test score.
     * @param testNumber an int to set test number
     * @return the test score
     * @throws IllegalArgumentException throws exceptions if the parameter
     *         is illegal
     */
    public double getTestScore(int testNumber) throws IllegalArgumentException {
        final int upperBound = 3;
        if (testNumber <= upperBound && testNumber >= 1) {
            switch(testNumber) {
                case 1:
                    return score1;
                case 2:
                    return score2;
                case upperBound:
                    return score3;
                default:
                    return 0;
            }
        } else {
            System.out.println("valid test number should be 1, 2 or 3");
            return 0;
        }
    }
    /**
     * Calculates the average score.
     * @return average score of all 3 courses
     */
    public double average() {
        final int scoreNumber = 3;
        return (score1 + score2 + score3) / scoreNumber;
    }

    /**
     * Returns a String description of this Student object.
     * 
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "test 1:\n" + score1 + "\n";
        result += "test 2:\n" + score2 + "\n";
        result += "test 3:\n" + score3 + "\n";
        result += "average score:\n" + average();

        return result;
    }
}
