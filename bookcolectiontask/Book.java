package bookcolectiontask;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void printTheBookDetail() {
        System.out.println("The book title is: " + getTitle() + " is written by : " + getAuthor());
    }
}
