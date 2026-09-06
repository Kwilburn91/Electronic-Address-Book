public class Address {

    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String firstName, String lastName, String street,
                   String city, String state, String zip) {

        setFirstName(firstName);
        setLastName(lastName);
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public void setStreet(String street) {
        if (street != null && !street.isEmpty()) {
            this.street = street;
        }
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        }
    }

    public void setState(String state) {
        if (state != null && !state.isEmpty()) {
            this.state = state;
        }
    }

    public void setZip(String zip) {
        if (zip != null && !zip.isEmpty()) {
            this.zip = zip;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName + "\n" +
                street + "\n" +
                city + ", " + state + " " + zip;
    }
}
