package programingWithClasses.classesAndObjects.library;

import programingWithClasses.classesAndObjects.Customer;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BookStore {
    private Book[] books = new Book[6];

    public  BookStore(){

    }

    public void printBooks(){
        for (Book book: books) {
            System.out.println(book.toString()+"\n");
        }
    }


    public void findBooksListByAuthor(String author){
        System.out.println("List of books");

        boolean flag = true;
        for (Book book:books) {
            if(book.getAuthor().equals( author)){
                System.out.println(book.toString());
                flag = false;
            }
        }

        if(flag){
            System.out.println("We haven't books from author - " + author);

        }
    }

    public void findBooksListByPublisher(String publisher){
        System.out.println("List of books");
        boolean flag = true;

        for (Book book:books) {
            if(book.getPublisher().equals( publisher)){
                System.out.println(book.toString());
                flag = false;

            }
        }

        if(flag){
            System.out.println("We haven't books from publisher - " + publisher);

        }
    }

    public void findBooksListByPublishYear(int publishYear){
        System.out.println("List of books");
        boolean flag = true;

        for (Book book:books) {
            if(book.getPublishYear() > publishYear){
                System.out.println(book.toString());
                flag = false;

            }
        }

        if(flag){
            System.out.println("We haven't books which publish after - " + publishYear + " year");
        }
    }
    public void setBookList(){
        Scanner scanner = new Scanner(System.in);
        String[] titles = {"Divergent", "Insurgent", "13 reason why"};
        String[] authors = {"Veronica Roth","Erick Maria Remark"};
        String[] publishers = {"Moscow", "Minsk", "Berlin"};
        String[] bindingTypes = {"Hard cover", "Soft cover"};
        Random random = new Random();

        for (int i = 0; i < books.length; i++) {

            int id = i+1;
            String title = titles[random.nextInt(3)];


            String author = authors[random.nextInt(2)];
            String publisher = publishers[random.nextInt(3)];
            int publishYear = random.nextInt(30)+1990;
            int pagesCount = random.nextInt(1000)+600;
            double price = (double) random.nextInt(10000)/100;
            String bindingType = bindingTypes[random.nextInt(2)];

            Book book = new Book(id,title,author,publisher,publishYear,pagesCount,price,bindingType);
            books[i] = book;
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
