package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Take a book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("Pull a book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Take a magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Pull a magazine to UniLibrary");
    }

    public void addBook() {
        System.out.println("add a book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("add a Magazine to UniLibrary");
    }
}
