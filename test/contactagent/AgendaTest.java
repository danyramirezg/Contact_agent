package contactagent;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgendaTest {

    @Test
    public void showHowClientCanMessUp() {
        Agenda agenda = new Agenda();
        agenda.addContact(new Contact("Dany", "2691677"));
        assertTrue(agenda.existsContact("Dany"));

        Contact[] list = agenda.listContacts();
        list[0].setName("Nathalia");

        assertFalse(agenda.existsContact("Dany"));
    }

    @Test
    public void addOneContact() {
        Agenda agenda = new Agenda();

        agenda.addContact(new Contact("Dany", "2691677"));

        assertTrue(agenda.existsContact("Dany"));

    }

    @Test
    public void addExistingContact() {
        Agenda agenda = new Agenda();

        agenda.addContact(new Contact("Kristina", "12345"));
        agenda.addContact(new Contact("Kristina", "12345"));
        assertTrue(agenda.existsContact("Kristina"));
    }

    @Test
    public void addTwoContacts() {
        Agenda agenda = new Agenda();

        agenda.addContact(new Contact("Dany", "2691677"));
        agenda.addContact(new Contact("Caro", "4848760"));

        assertTrue(agenda.existsContact("Dany"));
        assertTrue(agenda.existsContact("Caro"));
    }

    @Test
    public void contactNotAdded() {
        Agenda agenda = new Agenda();

        agenda.addContact(new Contact("Natalia", "12344"));

        assertFalse(agenda.existsContact("Dany"));

    }

    @Test
    public void listTheContacts() {
        Agenda agenda = new Agenda();
        //I want this array of 3 contact [3]


        Contact[] expected = {
                new Contact("Darago", "56897"),
                new Contact("Katona", "9282020"),
                new Contact("Natalia", "00392329"),
        };

        agenda.addContact(new Contact("Darago", "56897"));
        agenda.addContact(new Contact("Katona", "9282020"));
        agenda.addContact(new Contact("Natalia", "00392329"));

        assertArrayEquals(expected, agenda.listContacts());
    }

    @Test
    public void delete() {
        Agenda agenda = new Agenda();

        agenda.addContact(new Contact("Dany", "2691677"));
        agenda.deleteContact("Dany");

        assertFalse(agenda.existsContact("Dany"));
    }

    @Test
    public void deleteTwoContacts() {
        Agenda agenda = new Agenda();

        agenda.addContact(new Contact("Dany", "2453534"));
        agenda.addContact(new Contact("Camila", "3890283"));
        agenda.deleteContact("Dany");
        agenda.deleteContact("Camila");

        assertFalse(agenda.existsContact("Dany"));
        assertFalse(agenda.existsContact("Camila"));

    }

    @Test
    public void deleteNotExistingContact() {
        Agenda agenda = new Agenda();

        agenda.addContact(new Contact("Dany", "235353"));
        agenda.deleteContact("Cristina");

        assertFalse(agenda.existsContact("Cristina"));
        assertTrue(agenda.existsContact("Dany"));

    }

}