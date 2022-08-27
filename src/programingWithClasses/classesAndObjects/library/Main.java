package programingWithClasses.classesAndObjects.library;

public class Main {
    public static void main(String[] args) {
        //Task9
        BookStore bookStore = new BookStore();
        bookStore.setBookList();
        bookStore.printBooks();

        bookStore.findBooksListByAuthor("Veronica Roth");
        bookStore.findBooksListByPublisher("Minsk");
        bookStore.findBooksListByPublishYear(2020);
    }
}
