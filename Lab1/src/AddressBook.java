import java.util.HashSet;

//Comment from Github
public class AddressBook {
    private HashSet<BuddyInfo> buddyCollection = new HashSet<BuddyInfo>();


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John Smith", "613-424-1921", "Main St.");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            this.buddyCollection.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddyCollection.remove(buddy);
    }
}
