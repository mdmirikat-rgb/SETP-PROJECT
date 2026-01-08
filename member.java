import java.util.Date;

public class Loan {

    private static int counter = 1;

    private final int loanId;
    private final Date loanDate;
    private Date returnDate;
    private boolean active;

    private final Member member;
    private final Book book;

    // Constructor
    public Loan(Member member, Book book) {
        if (member == null || book == null) {
            throw new IllegalArgumentException("Member and Book must not be null.");
        }

        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is already borrowed.");
        }

        this.loanId = counter++;
        this.loanDate = new Date();
        this.active = true;
        this.member = member;
        this.book = book;

        borrowBook();
    }

    // Borrow book: sets the book as unavailable
    private void borrowBook() {
        book.setAvailable(false);
    }

    // Return book: marks loan as inactive and book as available
    public void returnBook() {
        if (!active) {
            throw new IllegalStateException("This loan is already closed.");
        }

        this.returnDate = new Date();
        this.active = false;
        book.setAvailable(true);
    }

    // Getters
    public int getLoanId() {
        return loanId;
    }

    public Date getLoanDate() {
        return new Date(loanDate.getTime()); // Immutable copy
    }

    public Date getReturnDate() {
        return returnDate == null ? null : new Date(returnDate.getTime());
    }

    public boolean isActive() {
        return active;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    // Helper: simple textual representation
    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", active=" + active +
                ", member=" + member.getName() +
                ", book=" + book.getTitle() +
                '}';
    }
}
