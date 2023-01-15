package pl.edu.wszib.stream;

import java.util.Optional;

public class Task1 {

    public static void main(String[] args) {
        Person person1 = new Person("Test1", Optional.empty());
        Person person2 = new Person("Test2",
                Optional.of(
                        new Address(Optional.empty(),
                                "44-100",
                                "Gliwice",
                                "13",
                                Optional.empty()))
        );
        Person person3 = new Person("Test3",
                Optional.of(
                        new Address(Optional.of("Pszczyńska"),
                                "44-100",
                                "Gliwice",
                                "13",
                                Optional.of("1")))
        );
//        Optional<Optional<String>> person3AddressStreet = person3.address()
//                .map(address -> address.street);
        Optional<String> person3AddressStreet = person3.address()
                .flatMap(address -> address.street);
    }

    record Person(
            String name,
            Optional<Address> address
    ) {
    }

    record Address(
            Optional<String> street,
            String postalCode,
            String city,
            String buildingNumber,
            Optional<String> flatNumber
    ) {
    }
}
