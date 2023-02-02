package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .log()
//                .filter(number -> number > 5)
//                .subscribe(number -> System.out.println(number));

        // Print 10 multiplied by each value from intNumbersFlux that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .filter(number -> number > 5)
//                .map(number -> number * 10)
//                .subscribe(number -> System.out.println(number));

        // Print 10 multiplied by each value from intNumbersFlux
        // for the first 3 numbers emitted that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .filter(number -> number > 5)
//                .map(number -> number * 10)
//                .take(3)
//                .subscribe(number -> System.out.println(number));

        // Print each value from intNumbersFlux that's greater than 20.
        // Print -1 if no elements are found
//        ReactiveSources.intNumbersFlux()
//                .filter(number -> number > 20)
//                .defaultIfEmpty(-1)
//                .subscribe(number -> System.out.println(number));

        // Switch ints from intNumbersFlux to the right user from userFlux
//        ReactiveSources.intNumbersFlux()
//                .flatMap(id -> ReactiveSources.userFlux().filter(user -> user.getId() == id))
//                .subscribe(user -> System.out.println(user));


        // Print only distinct numbers from intNumbersFluxWithRepeat
//        ReactiveSources.intNumbersFluxWithRepeat()
//                .log()
//                .distinct()
//                .subscribe(distinctNumber -> System.out.println(distinctNumber));


        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        ReactiveSources.intNumbersFluxWithRepeat()
                .distinctUntilChanged()
                .subscribe(number -> System.out.println(number));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
