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

public void displayInfo() {
    System.out.println(
            "Title: " + title +
                    ", Author: " + author +
                    ", Status: " + (isAvailable ? "Available" : "Borrowed"));
}
