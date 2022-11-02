package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary {
    public void getBook(){
        System.out.println("We take the book in UniLibrary");
    }
    public void returnBook(){
        System.out.println("We return the book in UniLibrary");
    }
    public void getMagazine(){
        System.out.println("We take the magazine in UniLibrary");
    }
    public void returnMagazine(){
        System.out.println("We return the magazine in UniLibrary");
    }
    public void addBook(){
        System.out.println("We add the book in UniLibrary");
    }
    public void addMagazine(){
        System.out.println("We add the magazine in UniLibrary");
    }
}
