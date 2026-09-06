import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {

    private Map<String, Address> addressMap;

    public AddressBook() {
        setAddressMap(new HashMap<String, Address>());
    }

    private void setAddressMap(Map<String, Address> addressMap) {
        if (addressMap != null) {
            this.addressMap = addressMap;
        }
    }

    public void addAddress(Address address) {
        if (address != null) {
            addressMap.put(address.getLastName().toLowerCase(), address);
        }
    }

    public void removeAddress(String lastName) {
        if (lastName != null) {
            addressMap.remove(lastName.toLowerCase());
        }
    }

    public Address findAddress(String lastName) {
        if (lastName != null) {
            return addressMap.get(lastName.toLowerCase());
        }
        return null;
    }

    public int getAddressCount() {
        return addressMap.size();
    }

    public Collection<Address> getAllAddresses() {
        return addressMap.values();
    }
}
