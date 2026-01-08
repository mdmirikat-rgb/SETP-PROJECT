public class member {
    private String memberId;
    private String name;

    public member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
    public void displayMember() {
        System.out.println("Member Id: " + memberId);
        System.out.println("Member Name: " + name);


    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}