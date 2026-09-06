public class AddressBookController {

    private AddressBook addressBook;
    private ConsoleIO consoleIo;

    public AddressBookController() {
        setAddressBook(new AddressBook());
        setConsoleIo(new ConsoleIO());
    }

    private void setAddressBook(AddressBook addressBook) {
        if (addressBook != null) {
            this.addressBook = addressBook;
        }
    }

    private void setConsoleIo(ConsoleIO consoleIo) {
        if (consoleIo != null) {
            this.consoleIo = consoleIo;
        }
    }

    public void run() {

        boolean runningProgram = true;

        while (runningProgram) {
            consoleIo.printLine("Please select the operation you wish to perform:");
            consoleIo.printLine("1. Add Address");
            consoleIo.printLine("2. Delete Address");
            consoleIo.printLine("3. Find Address");
            consoleIo.printLine("4. List Address Count");
            consoleIo.printLine("5. List All Addresses");
            consoleIo.printLine("6. Exit");

            String choice = consoleIo.readString("Enter choice:");

            switch (choice) {
                case "1":
                    addAddress();
                    break;
                case "2":
                    deleteAddress();
                    break;
                case "3":
                    findAddress();
                    break;
                case "4":
                    listCount();
                    break;
                case "5":
                    listAll();
                    break;
                case "6":
                    runningProgram = false;
                    break;
                default:
                    consoleIo.printLine("Invalid choice.");
            }
        }
    }

    private void addAddress() {

        String firstName = consoleIo.readString("Please enter first name:");
        String lastName = consoleIo.readString("Please enter last name:");
        String street = consoleIo.readString("Please enter street address:");
        String city = consoleIo.readString("Please enter city:");
        String state = consoleIo.readString("Please enter state:");
        String zip = consoleIo.readString("Please enter zip:");

        Address address = new Address(firstName, lastName, street, city, state, zip);
        addressBook.addAddress(address);

        consoleIo.printLine(".");
        consoleIo.printLine(".");
        consoleIo.printLine(".");

        boolean waitingForMenu = true;

        while (waitingForMenu) {
            String input = consoleIo.readString("Address Added. Press 1 to go to Main Menu.");

            if (input.equals("1")) {
                waitingForMenu = false;
            }
        }
    }

    private void deleteAddress() {

        if (addressBook.getAddressCount() == 0) {
            consoleIo.printLine("Address book is empty. Please add a name first.");
        } else {
            String lastName = consoleIo.readString("Enter last name to delete:");
            addressBook.removeAddress(lastName);
            consoleIo.printLine("Address removed if it existed.");
        }
    }

    private void findAddress() {

        if (addressBook.getAddressCount() == 0) {
            consoleIo.printLine("Address book is empty. Please add a name first.");
        } else {
            String lastName = consoleIo.readString("Enter last name to find:");
            Address address = addressBook.findAddress(lastName);

            if (address != null) {
                consoleIo.printLine(address.toString());
            } else {
                consoleIo.printLine("Address not found.");
            }
        }
    }

    private void listCount() {
        consoleIo.printLine("Total addresses: " + addressBook.getAddressCount());
    }

    private void listAll() {

        if (addressBook.getAddressCount() == 0) {
            consoleIo.printLine("Address book is empty. Please add a name first.");
        } else {
            for (Address address : addressBook.getAllAddresses()) {
                consoleIo.printLine(address.toString());
                consoleIo.printLine("--------------------");
            }
        }
    }
}
