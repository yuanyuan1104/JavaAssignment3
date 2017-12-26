package q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class WordCounter sorts the bible.txt.
 * <p>
 * Loops through each word in the bible.txt, increments the frequency of 
 * the words not found. Adds the new words to the word list and prints out 
 * the top 10 most frequent words.
 * </p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-11-10
 */
public class WordCounter {
    /**ArrayList for word list.*/
    private List<Word> word = new ArrayList<Word>();
    /**
     * Go through the file by words, increments the frequency for the words 
     * found in the word list otherwise adds the new words into the word list.
     * @param file accepts the file to open
     * @return size of the word list
     * @throws IOException throws exceptions if the 
     *         argument is illegal
     */
    public int parseBook(String file) throws IOException {
        Scanner scanLine = new Scanner(new File(file));
        String str; 
        while (scanLine.hasNext()) {
            str = scanLine.next();
            Word wordNew = new Word(str);
            boolean control = false;
            for (Word wordSearch : word) {
                if (wordSearch.getWord().equalsIgnoreCase(str)) {
                    wordSearch.increment();
                    control = true;
                    break;
                } 
            }
            if (!control) {
                word.add(wordNew);
            }    
        }
        scanLine.close();   
        return word.size();
    }
    /**
     * Prints the n most frequent words in order.
     * @param n sets the n for print
     * @throws IllegalArgumentException throws exceptions if the 
     *         argument is illegal
     */
    public void printTopWords(int n) throws IllegalArgumentException {
        word.sort(null);
        System.out.println(word.get(n));
    }

    /**
     * <p>
     * Drives the program.
     * </p>
     *
     * @param args
     *            unused.
     * @throws IOException throws exception if the document is not found
     */
    public static void main(String[] args) throws IOException {
        final int topTen = 10;
        WordCounter wc = new WordCounter();
        int i = wc.parseBook("src/bible.txt");
        System.out.println("the number of words in the text: " + i);
        for (int j = 0; j < topTen; j++) {
            wc.printTopWords(j);
        }
        System.out.println("Question one was called and ran sucessfully.");
    }

}
