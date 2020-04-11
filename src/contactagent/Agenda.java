package contactagent;

public class Agenda {

    private Contact[] contacts;

    public Agenda() {
        this.contacts = new Contact[10];
    }

    public Agenda(int size) {
        this.contacts = new Contact[size];
    }

    public void addContact(Contact c) {

        if (existsContact(c.getName())) {
            System.out.println("The contact already exists");
        } else {
            boolean find = false;
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] == null) {
                    contacts[i] = c;
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println("The contact has been added");
            } else {
                System.out.println("The contact hasn't been added");
            }
        }
    }

    public boolean existsContact(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && name.equalsIgnoreCase(contacts[i].getName())) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        int s = 0;
        for (Contact contact : contacts) {
            if (contact != null) {
                s++;
            }
        }
        return s;
    }

    public Contact[] listContacts() {

        Contact[] result = new Contact[size()];
        int j = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i]);
                result[j++] = contacts[i];
            }
        }
        return result;
    }

    public String searchingForName(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(name)) {
                return contacts[i].getTelephone();
            }
        }
        return null;
    }

    public boolean deleteContact(String c) {

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equals(c)) {
                contacts[i] = null;
                return true;
            }
        }
        return false;


    }
}
