import java.util Scanner;
public class book {
    private String title;
    private String author;
    private boolean isAvailable;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

   public void displayStatus() {
       System.out.println("Title: " + title);
       System.out.println("author: " + author);
       System.out.println("isAvailable: " + isAvailable);
   }
    Scanner.scanner=new Scanner(System.in);
public void printData(){
    System.out.println("BookPage:"+ bookpage);
    System.out.println("bookPrice:"+bookprice);

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isAvailable = true;
    }
    private boolean available;

public boolean isAvailable() {
    return available;
}

public void setAvailable(boolean available) {
    this.available = available;
}
}
