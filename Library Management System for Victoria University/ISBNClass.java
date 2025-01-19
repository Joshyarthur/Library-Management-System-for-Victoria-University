package vu.isbnclass;

/**
 *
 * @author JOSHY
 */
import java.util.Scanner;

public class ISBNClass {

    private String isbn;

    public ISBNClass(String isbn) {
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }

    public boolean isValid() {
        // Basic format check (10 digits)
        if (isbn == null || isbn.length() != 10) {
            return false;
        }

        // Check digit calculation
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            sum += (10 - i) * digit;
        }

        int checkDigit = sum % 11;
        if (checkDigit == 10) {
            checkDigit = 'X'; // Check digit can be 'X'
        }

        return Character.toUpperCase(isbn.charAt(9)) == (char) checkDigit;
    }

      public static void main(String[] args) {
        // Create an ISBN object with the specific ISBN 
        ISBNClass isbn = new ISBNClass("0941831396"); 

        // Print the book information directly
        System.out.println("Book Title: Object-oriented Programming with Java");
        System.out.println("Book Author: David j. Barnes and Michael Kolling");
        System.out.println("Publisher: Prentice Hall");
        System.out.println("ISBN: " + isbn.getISBN()); 
    }
}