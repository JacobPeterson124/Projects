package phonebook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
			displayMenu();
		
	}
	
	public static void addEntry(Person person, Address address, long phoneNumber) {
	    System.out.println("\nAdding entry: " + person + ": " +  address + ": " + phoneNumber);
	    
	    try (PrintWriter pw = new PrintWriter(new FileWriter("file.text", true))){
	    
	    pw.println(person + ": " + address + "; " + phoneNumber + ".");
	    
	     }catch(IOException e) {
	    	System.out.println(e.getMessage());
	    }
	}
	
	public static void searchByFullName(String name) {
		
		System.out.println("\nSearching: " + name);
		
		try(Scanner in = new Scanner (new File("file.text"))){
			String t[];
			
			boolean foundPerson = false;
			
			while(in.hasNext()) {
				t = in.nextLine().split(":");
				if(t[0].equals(name)) {
					System.out.println("\nResults: " + name + t[1]);
				foundPerson = true;
				}
			}	
		if(!foundPerson) {
			System.out.println("\nCould not find: " + name);
		}
			
		
	} catch(IOException e) {
			System.out.println(e.getMessage());
	}			
}
	
	public static void searchByFirstName(String firstName) {
		
	System.out.println("\nSearching: " + firstName);
		
		try(Scanner in = new Scanner (new File("file.text"))){
			String t[];
			
			boolean foundPerson = false;
			
			while(in.hasNext()) {
				t = in.nextLine().split(" ");
				if(t[0].equals(firstName)) {
					System.out.println("\nResults: " + firstName + t[1] + t[2] + t[3] + t[4] + t[5] + t[6]);
				foundPerson = true;
				}
			}	
		if(!foundPerson) {
			System.out.println("\nCould not find: " + firstName);
		}
			
		
	} catch(IOException e) {
			System.out.println(e.getMessage());
	}	
		
	}
	
      public static void searchByLastName(String lastName) {
		
           System.out.println("\nSearching: " + lastName);
		
		try(Scanner in = new Scanner (new File("file.text"))){
			String t[];
			
			boolean foundPerson = false;
			
			while(in.hasNext()) {
				t = in.nextLine().split("[ :]");
				if(t[1].equals(lastName)) {
					System.out.println("\nResults: " + t[0] + lastName + t[3] + t[4] + t[5] + t[6] + t[7]);
				foundPerson = true;
				}
			}	
		if(!foundPerson) {
			System.out.println("\nCould not find: " + lastName);
		}
			
		
	} catch(IOException e) {
			System.out.println(e.getMessage());
	}	
		
}
	
	    public static void deleteRecord(String name) throws IOException {
		
	    System.out.println("\nDeleting record for: " + name);
        File file = new File("file.text");
        File temp = new File("temp");
        PrintWriter out = new PrintWriter(new FileWriter(temp));
        Files.lines(file.toPath())
            .filter(line -> !line.contains(name))
            .forEach(out::println);
        out.flush();
        out.close();
        temp.renameTo(file);
    }
	
         public static void updateRecord(String fullName) {
		
		 Scanner in = new Scanner(System.in);
		
	     String path = System.getProperty("user.file.text") + "file.text";
	    
	     
	     System.out.println("\nEnter new name.(fist, last) New address.(Street name, city, state, zip) new phone number.");
	         String text = in.nextLine();

	        try {
	            FileWriter fw = new FileWriter(path, true);
	            fw.write(text);
	            fw.close();
	            in.close();
	            
	            System.out.println("\nEntry updated.");
	            
	        }
	        
	        catch(IOException e) {
	        }
	    }

        public static void displayMenu() throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What would you like to do?");
		System.out.println("1. Add entry");
		System.out.println("2. Search by full name");
		System.out.println("3. Search by first name");
		System.out.println("4. Search by last name");
		System.out.println("5. Delete record");
		System.out.println("6. Update record");
		System.out.println("7. Exit phonebook");
		
		Person person = new Person();
		Address address = new Address(null, null, null, 0);
		
		int choice = in.nextInt();
		in.nextLine();
		
		switch(choice) {
		
		case 1:
            System.out.println("\nWho would you like to add? (first name, last name)");
            person.setFirstName(in.next()); person.setLastName(in.next());
			
			System.out.println("\nWhat is their address? (street name, city, state, zip)");
			address.setStreetName(in.next()); address.setCity(in.next()); 
			address.setState(in.next()); address.setZip(in.nextInt());
			
			System.out.println("\nWhat is their phone number?");
			long phoneNumber = in.nextLong();
			
			addEntry(person, address, phoneNumber);
			break;
		
		case 2:
			System.out.println("\nPlease enter person's full name. (first name, last name)");
			String name = in.nextLine();
			
			searchByFullName(name);
			break;
			
		case 3:
			System.out.println("\nPlease enter person's first name. (first name)");
			String firstName = in.nextLine();
			
			searchByFirstName(firstName);
			break;
			
	    case 4:
			System.out.println("\nPlease enter person's last name. (last name)");
			String lastName = in.nextLine();
			
			searchByLastName(lastName);
			break;
			
		case 5:
			System.out.println("\nPlease enter name of entry you want to delete: ");
			deleteRecord(in.nextLine());
			in.close();
			break;
			
		case 6:
			System.out.println("\nPlease enter full name of person of entry you want to update: ");
			String fullName = in.next();
			updateRecord(fullName);
			break;
				
		default:
			System.out.println("Have a great life!");
			System.exit(choice);
			break;
		}
}
}