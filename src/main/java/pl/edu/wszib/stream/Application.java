package pl.edu.wszib.stream;

import java.util.Optional;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
//        Optional.of("");
//        Optional.empty();
//        Optional.ofNullable(null);
//        Optional<String> optional = Optional.of("Hello world");
        Optional<String> optional = Optional.empty();
//        Functional
//        optional.map()
//        optional.flatMap()
//        optional.ifPresent();
//        optional.ifPresentOrElse();
//        optional.filter();
//        optional.or();
//        optional.orElse();
//        optional.orElseGet();
//        optional.orElseThrow();
//        optional.orElseThrow(() -> new RuntimeException());

//        Imperative
//        optional.isPresent();
//        optional.isEmpty();
//        optional.get();
        Optional<String> prefixed1 = addPrefixImperative(optional);
        Optional<String> prefixed2 = addPrefixFunctional(optional);

//        optional.flatMap(value -> {
//            return Optional.of("PREFIX " + value);
//        });
        Optional<Person> optionalPerson = Optional.of(new Person(Optional.of(new Address(""))));
//        Optional<Optional<Address>> address = optionalPerson.map(person -> person.address());
        Optional<Address> address = optionalPerson.flatMap(person -> person.address());
        optional.ifPresent(value -> System.out.println(value));
        optional.ifPresentOrElse(
                value -> System.out.println(value),
                () -> System.out.println("No value")
        );
        Optional<String> result = prefixed1.filter(value -> value.startsWith("PREFIX"));
        System.out.println(result);

        Optional<String> noPrefixFound = result.or(
                () -> Optional.of("No prefix found")
        ).or(() -> Optional.empty()
        ).or(() -> Optional.empty());
        System.out.println(noPrefixFound);

        String noPrefixFound1 = result.orElse("No prefix found");
        String noPrefixFound2 = result.orElseGet(() -> "No prefix found");
//        String s = result.orElseThrow();
        String s = result.orElseThrow(() -> new RuntimeException());

        // Zadanie:
        // Utwórz record Person z właściwościami: name, address (optional)
        // Utwórz record Address z właściwościami: street (optional), postalCode, city, buildingNumber, flatNumber (optional)
        // utwórz 3 przykładowe obiekty z wypełnionymi optionalmi na różnym poziomie:
        // 1 bez adresu
        // 2 z adresem, ale bez ulicy i flatNumber
        // 3 z pełnym adresem
    }

    private static Optional<String> addPrefixImperative(final Optional<String> optional) {
        if (optional.isPresent()) {
            String value = optional.get();
            return Optional.of("PREFIX " + value);
        } else {
            return Optional.empty();
        }
    }

    private static Optional<String> addPrefixFunctional(Optional<String> optional) {
        return optional.map(value -> "PREFIX " + value);
    }

    record Person(
            Optional<Address> address
    ){}

    record Address(
            String street
    ){}
}
