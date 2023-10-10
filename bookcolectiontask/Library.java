package bookcolectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> libraryStock;
    private String libraryName;

    public Library(String name) {
        libraryStock = new ArrayList<>();
        this.libraryName = name;
    }

    public void addBook(Book bookElement) {
        boolean operationStatus = libraryStock.add(bookElement);
        if (operationStatus) {
            System.out.println("The book " + bookElement.getTitle() + " has been added");
        } else System.out.println("The book " + bookElement.getTitle() + " has not been added");
    }

    public int getTheStockStatus() {
        return libraryStock.size();
    }

    public boolean isThereSuchABookInTheStock(Book book) {
        return libraryStock.contains(book);
    }

    public void deteleABookIfExist(Book book) {
        if (libraryStock.remove(book)) {
            System.out.println("The book " + book.getTitle() + " Has been deleted");
        } else System.out.println("The book " + book.getTitle() + " has not been found");
    }

    public void printAllTheBooks() {
        for (int i = 0; i < libraryStock.size(); i++) {
            libraryStock.get(i).printTheBookDetail();

        }
    }


}



