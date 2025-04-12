package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Take a book from UniLibrary");
        System.out.println("--------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Pull a book to UniLibrary");
        return "War and peace";
    }

    public void getMagazine() {
        System.out.println("Take a magazine from UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Pull a magazine to UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("add a book to UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void addMagazine() {
        System.out.println("add a Magazine to UniLibrary");
        System.out.println("--------------------------------------");
    }
}
