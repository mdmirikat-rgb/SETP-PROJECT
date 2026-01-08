import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter book title");
        String Title=scanner.nextLine();
        System.out.println("Please enter book author");
        String Author=scanner.nextLine();
        System.out.println("Please enter member name");
        String MemberName=scanner.nextLine();
        System.out.println("Please enter member Id");
        String MemberId=scanner.nextLine();

        book book1 = new book(Title,Author);
        member member1 = new member(MemberId, MemberName);
        book1.displayStatus();
        member1.displayMember();


    }
}
