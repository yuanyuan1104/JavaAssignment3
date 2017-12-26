/**
 * 
 */
package q1;

/**
 * Class Word.
 * <p>
 * Implements Comparable interface to decide words order in
 * the word list.
 * </p>
 * @author Zhang Yuanyuan
 * @version 2017-11-10
 */
public class Word implements Comparable<Word> {
    /**string word.*/
    private final String word;
    /**frequency appears in the file.*/
    private int frequency;
    
    /**
     * Constructs Word objects.
     * @param word sets the word as string
     */
    public Word(String word) {
        this.word = word;
        frequency = 1;
    }

    /**
     * Returns the word as a string.
     * @return word as a string
     */
    public String getWord() {
        return word;
    }

    /**
     * Returns the word frequency as an int.
     * @return frequency as an int
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * Increments the frequency of words in the
     * word list.
     */
    public void increment() {
        frequency++;
    }
    
    /**
     * Returns a description for word and requency.
     * @return word and its frequency
     */
    public String toString() {
        return "[word: " + word + ", frequency: " + frequency + "]";
    }

    @Override
    public int compareTo(Word wd) throws IllegalArgumentException {
        if (frequency > wd.getFrequency()) {
            return -1;
        } else if (frequency == wd.getFrequency()) {
            return 0;
        } else {
            return 1;
        }
    }
    
    
}
