import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Contact> contactList = new ArrayList<>();
        MobilePhone phone =new MobilePhone("234234",contactList) ;
Contact anil = new Contact("Anil","1355");
phone.addNewContact(new Contact("Ali","56486"));
        phone.addNewContact(new Contact("Veli","54682"));
        phone.addNewContact(new Contact("Sami","2334"));
        phone.addNewContact(new Contact("Deichman","13123"));
        phone.addNewContact(anil);
       for (int i = 0 ; i<contactList.toArray().length;i++){
           System.out.println(i+1+". "+contactList.get(i));
       }
        changeArray.changeArray();
    }


}






