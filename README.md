# Electronic-Address-Book
Name: Kelly Wilburn
Course: Software Development I CEN-3024C
Project Description:
This project is a Java console-based electronic address book. The application allows users to manage a collection of addresses through a simple menu-driven interface.

Users can:
-Add a new address
-Delete an existing address
-Search for an address by last name
-View the total number of stored addresses
-Display all stored addresses
-Exit the application
-The application uses a HashMap to store Address objects, with each person's last name serving as the key.

2. Important Programming Concepts and Tools
The project demonstrates several important Java programming concepts:

-Object-Oriented Programming (OOP): The application is organized into multiple classes, including Address, AddressBook, AddressBookController, and ConsoleIO.
-Encapsulation: Class fields are declared private and are accessed or modified through methods.
-Classes and Objects: Address objects are created to represent individual contacts.
-Maps and HashMaps: A HashMap<String, Address> is used to store and retrieve addresses using a last name as the key.
-Collections: The Collection<Address> type is used to retrieve all addresses from the address book.
-Methods: Separate methods handle tasks such as adding, deleting, finding, and displaying addresses.
-Control Flow: if/else, switch, while, and for statements control the application's behavior.
-Input/Output: Java's Scanner class collects user input, while System.out.println() displays information.
-String Manipulation: Last names are converted to lowercase with toLowerCase() to make searches and deletions case-insensitive.
-Input Validation: Setter methods check that values are not null or empty before assigning them.

3. Expected Inputs and Outputs
Inputs:
The application accepts the following user inputs:

Menu selection:
Add Address
Delete Address
Find Address
List Address Count
List All Addresses
Exit

When adding an address, the user is prompted to enter the following:
-First name
-Last name
-Street address
-City
-State
-ZIP code

When deleting or finding an address, the user is prompted to enter the following:
-Last name of the person

Outputs:
The application displays different messages depending on the selected operation:

-Add Address: Confirms that the address was added.
-Delete Address: Indicates that the address was removed if it existed.
-Find Address: Displays the person's name and complete address if found.
-List Address Count: Displays the total number of addresses.
-List All Addresses: Displays all stored names and addresses.
-Empty Address Book: Informs the user that an address must be added first.
-Invalid Menu Selection: Displays an error message when an invalid menu option is entered.
-Exit: Terminates the application.
