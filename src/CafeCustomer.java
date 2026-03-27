import java.util.Objects;

public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(String email, String lastName, String firstName, int customerId) {
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFullCustomerData() {
        return "ID: " + customerId +
                " | Name: " + firstName + " " + lastName +
                " | Email: " + email;

    }

    @Override
    public String toString() {
        return "CafeCustomer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CafeCustomer that = (CafeCustomer) o;
        return customerId == that.customerId && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, email);
    }
}
