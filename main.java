public class main {
    public static void main(String[] args) {

        // Create a book
        book book1 = new book("ISBN001", "Java Programming");

        // Create a member
        member member1 = new member("M001", "Sisay");

        // Create a loan
        loan loan1 = new loan(book1, member1);

        // Issue the book
        loan1.issueBook();

        // Try issuing again (should fail)
        loan1.issueBook();

        // Return the book
        loan1.returnBook();

        // Issue again (should work)
        loan1.issueBook();

        // Display book details
        System.out.println(book1);
    }
}