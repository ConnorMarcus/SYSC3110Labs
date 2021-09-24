public class BuddyInfo {

    private String name;
    private String phoneNumber;
    private String address;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jack", "613-333-3333", "249 Main Street");
        System.out.println("Hello " + buddy.getName());
    }

    public BuddyInfo() {
        this("John", "000-000-0000", "123 Main Street");
    }

    public BuddyInfo(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }
}
