import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter book title");
        String title = scanner.nextLine();

        System.out.println("Please enter book author");
        String author = scanner.nextLine();

        System.out.println("Please enter member name");
        String memberName = scanner.nextLine();

        System.out.println("Please enter member Id");
        String memberId = scanner.nextLine();

        System.out.println("Please enter book price");
        double bookPrice = scanner.nextDouble();

        System.out.println("Please enter book page number");
        int bookPageNumber = scanner.nextInt();

        Book book1 = new Book(title, author);
        Member member1 = new Member(memberId, memberName);

        book1.displayStatus();
        member1.displayMember();

        // Display extra details
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Book Page Number: " + bookPageNumber);
         book1.printData();
        scanner.close();
    }
}
