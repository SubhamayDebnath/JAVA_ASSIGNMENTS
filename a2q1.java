import java.util.*;
class Book{
    private String title;
    private String author;
    private int yearPublished;
    public Book(String title,String author,int yearPublished){
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

}
public class a2q1 {
    public static void main(String[] args) {
        Book [] library=new Book[3];
        library[0]=new Book("Java Programming","John Smith",2010);
        library[1]=new Book("Python ","h",2001);
        library[2]=new Book("C++","John",2005);
        for(int i=0;i<library.length;i++){
            library[i].displayBookInfo();
        }
    }    
}
