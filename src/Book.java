public class Book {
    protected String title;
    protected String author;
    protected int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookInfo(){
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year: " + yearPublished + "\n";
    }

    public void printBookDetails(){
        System.out.println("Title:" + title);
        System.out.println("Autor:" + author);
        System.out.println("Year:" + yearPublished);
    }
}

class PrintedBook extends Book {
    int numberOfPages;
    String publisher;

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher){
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() +
                "Number of pages" + numberOfPages;
    }

    @Override
    public void printBookDetails(){
        super.printBookDetails();
        System.out.println("Number of pages:" + numberOfPages);
        System.out.println("Publisher" + publisher);
    }

    public void bookType(){
        System.out.println("This is an printed book");
    }
}

class EBook extends Book {
    double fileSizeMB;
    String fileFormat;

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() +
                "File size MB:" + fileSizeMB + "\n" +
                "File format" + fileFormat;
    }

    @Override
    public void printBookDetails(){
        super.printBookDetails();
        System.out.println("File size MB:" + fileSizeMB);
        System.out.println("File format:" + fileFormat);
    }

    public void bookType(){
        System.out.println("This is an ebook");
    }
}

class testBook{
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, "Scribner");

        EBook eBook = new EBook("1984", "George Orwell", 1949, 1.5, "EPUB");

        System.out.println("=== Printed Book Details ===");
        printedBook.printBookDetails();
        printedBook.bookType();

        System.out.println();

        System.out.println("=== EBook Details ===");
        eBook.printBookDetails();
        eBook.bookType();
    }
}