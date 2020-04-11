package contactagent;

import java.util.Objects;

public class Contact {

    private String name;
    private String telephone;

    public Contact(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(telephone, contact.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telephone);
    }

    //    @Override
//    public boolean equals(Object cont) {
//        if (!(cont instanceof Contact)) {
//            return false;
//        }
//        Contact that = (Contact) cont;
//        return this.name.equalsIgnoreCase(that.getName());
//    }

    @Override
    public String toString() {
        return "Name: " + name + " Telephone: " + telephone;
    }
}
