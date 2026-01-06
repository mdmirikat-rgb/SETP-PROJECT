public class loan {
    private book book;
    private member member;

    public loan(book book, member member) {
        this.book = book;
        this.member = member;
    }

    public boolean issueBook() {
        if (book.borrowBook()) {
            System.out.println("Book issued to " + member.getName());
            return true;
        } else {
            System.out.println("Book is not available");
            return false;
        }
    }

    public void returnBook() {
        book.returnBook();
        System.out.println("Book returned by " + member.getName());
    }
}