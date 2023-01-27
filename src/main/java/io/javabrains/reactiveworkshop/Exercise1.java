package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("main is running...");

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream()
                .forEach(number -> System.out.println(number));
        System.out.println("end");

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream()
                .filter(number -> number < 5)
                .forEach(number -> System.out.println(number));
        System.out.println("end");

        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream()
                .filter(number -> number > 5)
                .skip(1)
                .limit(2)
                .forEach(number -> System.out.println(number));
        System.out.println("end");

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        Integer value = StreamSources.intNumbersStream()
                .filter(el -> el > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(value);
        System.out.println("end");


        // Print first names of all users in userStream
        StreamSources.userStream()
                .map(user -> user.getFirstName())
                .forEach(userName -> System.out.println(userName));
        System.out.println("end");

        // Print first names in userStream for users that have IDs from number stream
        StreamSources.intNumbersStream()
                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
                .map(user -> user.getFirstName())
                .forEach(userName -> System.out.println(userName));

        System.out.println("end 1");

        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(id -> id == user.getId()))
                .map(user -> user.getFirstName())
                .forEach(userName -> System.out.println(userName));
        
        System.out.println("end 2");


    }

}
