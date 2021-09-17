import java.util.HashSet;

public class AddressBook {
    private HashSet<BuddyInfo> buddyCollection = new HashSet<BuddyInfo>();


    public static void main(String[] args) {
        System.out.println("Main: AddressBook.java");
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddyCollection.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddyCollection.remove(buddy);
    }
}
