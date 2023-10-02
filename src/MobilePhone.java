import java.util.ArrayList;

public class MobilePhone {
    String myNumber;
    ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public void setMyContacts(ArrayList<Contact> myContacts) {
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.add(contact);

            return true;
        }


    }
    public boolean updateContact (Contact oldcontact,Contact newcontact) {
        if (myContacts.contains(oldcontact)) {
           int index = myContacts.indexOf(oldcontact);
            myContacts.set(index,newcontact);
            return true;
        } else {

            return false;
        }



    }
    public boolean removeContact  (Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {

            return false;
        }



    }
    public int findContact (Contact contact){
        if(myContacts.contains(contact)){

            return myContacts.indexOf(contact);
        }
        else return -1;

    }
    public int findContact (String contact){
        for(Contact myContact:myContacts){
            if (myContact.getName().equals(contact)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;

    }
    public Contact queryContact(String name){
        for(Contact myContact:myContacts){
            if (myContact.getName().equals(name)){
                return myContact;
            }


        }

        return null;
    }

}
