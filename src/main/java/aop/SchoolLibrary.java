package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    //@Override
    public void getBook() {
        System.out.println("Take a book from SchoolLibrary");
    }

    public String returnBook() {
        System.out.println("Return a book from SchoolLibrary");
        return "OK";
    }
}
