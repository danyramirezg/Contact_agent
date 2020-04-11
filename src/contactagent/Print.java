package contactagent;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Print {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean logout = false;
        int option; //To save user option

        Agenda contactAgent = new Agenda(20);
        String name;
        String telephone;

        Contact c;

        while (!logout) {

            System.out.println("Choose any option:");
            System.out.println("1. Add contacts");
            System.out.println("2. List contacts");
            System.out.println("3. Delete contacts");
            System.out.println("4. Logout");

            try {
                option = sn.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Write a name");
                        name = sn.next();

                        System.out.println("Write a telephone number");
                        telephone = sn.next();

                        c = new Contact(name, telephone);
                        contactAgent.addContact(c);

                        break;

                    case 2:
                        contactAgent.listContacts();
                        break;

                    case 3:
                        System.out.println("Write a name");
                        name = sn.next();
                        contactAgent.deleteContact(name);
                        break;

                    case 4:
                        logout = true;
                        break;

                    default:
                        System.out.println("Only numbers from 1 to 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("You should insert a number");
                sn.next();
            }
        }
    }
}
