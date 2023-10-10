package bookcolectiontask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
        Book book1 = new Book("Alfabet", "Poporul");
        Book book2 = new Book("Crima si Pedeapsa", "Dostoevskii");
        Book book3 = new Book("Fratii Caramazov", "Dostoevskii");
        Book book4 = new Book("Too Kill a Machingbird", "Harper L.");
        Book book5 = new Book("1984", "George O.");

        book1.printTheBookDetail();
        book2.printTheBookDetail();
        book3.printTheBookDetail();
        book4.printTheBookDetail();
        book5.printTheBookDetail();


        Library draftLibrary = new Library("Draft");
        draftLibrary.addBook(book1);
        draftLibrary.addBook(book3);
        draftLibrary.addBook(book5);
        draftLibrary.addBook(book4);

        System.out.println(draftLibrary.getTheStockStatus());
        System.out.println(draftLibrary.isThereSuchABookInTheStock(book2));
        draftLibrary.deteleABookIfExist(book1);
        System.out.println(draftLibrary.isThereSuchABookInTheStock(book1));
        draftLibrary.addBook(book1);
        System.out.println(draftLibrary.isThereSuchABookInTheStock(book1));
        draftLibrary.deteleABookIfExist(book1);
        draftLibrary.deteleABookIfExist(book1);
        System.out.println(draftLibrary.getTheStockStatus());
        draftLibrary.printAllTheBooks();


        Library proNoi = new Library("ProNoi");
        proNoi.addBook(book1);
        proNoi.addBook(book3);
        proNoi.addBook(book5);

        System.out.println(proNoi.getTheStockStatus());
        proNoi.printAllTheBooks();

        Map<String,Library> libraryMap = new HashMap<>();
        libraryMap.put("Str. Chisinau", proNoi);
        libraryMap.put("Str. Uzinilor", draftLibrary);
        libraryMap.get("Str. Uzinilor").printAllTheBooks();
        System.out.println(libraryMap.get("Str. Uzinilor").isThereSuchABookInTheStock(book1));

        int [] dataTable = {4,85,78,3,5,4};
        int [] dataTable2 = {96,45,1,7,4};
        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.findMax(dataTable2));




        }

    }

