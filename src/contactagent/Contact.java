package contactagent;

public class Contact {

    private String name;
    private String telephone;

    public Contact(String name, String telephone) {
        this.name = name;
        this.name = telephone;
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

    public boolean equals(Contact cont) {
        return this.name.equalsIgnoreCase(cont.getName());
    }

    @Override
    public String toString() {
        return "Name: " + name + " Telephone: " + telephone;
    }
}
