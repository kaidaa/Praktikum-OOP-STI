/**
 * American.java
 * Memodelkan kewarganegaraan Amerika
 * @author 18220032 Rifki Kaida
 */

public class American extends Citizenship {
    private String state;

    public American(String surname, String givenName, String state) {
        // Konstruktor
        super(surname, givenName);
        this.state = state;

    }

    public String getState() {
        // Mengembalikan atribut state
        return this.state;
    }

    @Override
    public void speak() {
        // Mencetak "Hello buddy!" diakhiri newline
        System.out.println("Hello buddy!");
    }
}