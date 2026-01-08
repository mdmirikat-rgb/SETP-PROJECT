import java.util.Date;

public class Loan {
    private static int counter = 1;
    private int loanId;
    private Date loanDate;
    private Date returnDate;
    private boolean active;
    private Member member;
    private Book book;
    private String loanType; // new variable

    public Loan(Member member, Book book, String loanType) {
        this.loanId = counter++;
        this.loanDate = new Date();
        this.active = true;
        this.member = member;
        this.book = book;
        this.loanType = loanType;
    }

    public int getLoanId() { return loanId; }
    public Date getLoanDate() { return loanDate; }
    public Date getReturnDate() { return returnDate; }
    public boolean isActive() { return active; }
    public Member getMember() { return member; }
    public Book getBook() { return book; }
    public String getLoanType() { return loanType; }

    public void closeLoan() {
        this.returnDate = new Date();
        this.active = false;
    }
}
