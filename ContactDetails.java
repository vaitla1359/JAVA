import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContactDetails {
 
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
 
        HashMap<String, String> list = new HashMap<>();
       
        list.put("ravi", "96358712");
        list.put("govind", "65543235");
        list.put("arun", "49649666");
        
 
        
        Set entrySet = list.entrySet();
 
       
        Iterator it = entrySet.iterator();
 
        System.out.println("enter contact number: ");
        while (it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println("contact name: " + me.getKey() + " ; " + " contact number: " + me.getValue());
        }
       
        System.out.println("----Would you like to add a contact----Type YES or NO: ");
        String a = in.next();
 
        if (a.equalsIgnoreCase("yes")) {
            String b = in.nextLine();
            System.out.println("Enter a new contact: ");
            String name = in.next();
            System.out.println("Enter a new contact number: ");
            String phone = in.next();
            list.put(name, phone);
        } else if (a.equalsIgnoreCase("no")) {
        }
 
        
        System.out.println("----Would you like to remove a Contact----Type YES or NO: ");
        String c = in.next();
 
        if (c.equalsIgnoreCase("yes")) {
            String d = in.nextLine();
            System.out.println("Remove a contact:");
            String name = in.next();
            list.remove(name);
        } else if (c.equalsIgnoreCase("no")) {
 
        }
 
        System.out.println("----Would you like to change a contact number----Type YES or NO: ");
 
        String e = in.next();
 
        if (c.equalsIgnoreCase("yes")) {
            String f = in.nextLine();
            System.out.println(" Who's contact number do you want to change: ");
            String name3 = in.next();
            System.out.println(" Enter a new contact number: ");
            String phone3 = in.next();
            list.put(name3, phone3);
        } else if (a.equalsIgnoreCase("no")) {
 
        }
 

        Iterator it1 = entrySet.iterator();
        System.out.println(" UPDATED Contact Number: ");
        while (it1.hasNext())
        {
            Map.Entry me = (Map.Entry) it1.next();
            System.out.println(" Contact Name: " + me.getKey() + " and their Contact Number: " + me.getValue());
        }
 
    }
}


