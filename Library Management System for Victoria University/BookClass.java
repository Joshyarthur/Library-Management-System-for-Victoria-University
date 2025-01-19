package vu.isbnclass;

/**
 *
 * @author JOSHY
 */
public class BookClass{

    private String title;
    private String author;
    private String publisher;
    private String city;
    private String dateOfPublication;
    private double price;
    private ISBNClass isbnNum;

    public BookClass(String title, String author, String publisher, String city, String dateOfPublication, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
    }

    public void setBookISBN(ISBNClass isbnNum) {
        this.isbnNum = isbnNum;
    }

    public String getAuthor() {
        return author;
    }

    public ISBNClass getBookISBN() {
        return isbnNum;
    }

    public void printDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("City: " + city);
        System.out.println("Date of Publication: " + dateOfPublication);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + (isbnNum != null ? isbnNum.getISBN() : "N/A")); 
    }
}