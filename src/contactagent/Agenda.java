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

        boolean find = false;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = c;
                find = true;
            }
        }
        if (find) {
            System.out.println("The contact has been added");
        } else {
            System.out.println("The contact hasn't been added");
        }

    }

    public boolean existsContact(Contact c) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && c.equals(contacts[i])) {
                return true;
            }
        }
        return false;
    }

    public void listContacts() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i]);
            }
        }
    }
}
