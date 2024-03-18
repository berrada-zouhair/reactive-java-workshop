package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFlux;
import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFluxWithRepeat;
import static io.javabrains.reactiveworkshop.ReactiveSources.userFlux;

import java.io.IOException;

public class Exercise7 {


  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

    // Print all values from intNumbersFlux that's greater than 5
    // TODO: Write code here
//    intNumbersFlux().log().filter(integer -> integer > 5).subscribe(System.out::println);

    // Print 10 times each value from intNumbersFlux that's greater than 5
    // TODO: Write code here
//    intNumbersFlux()
//        .filter(integer -> integer > 5)
//        .map(integer -> integer * 10)
//        .log()
//        .subscribe(System.out::println);

    // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
    // TODO: Write code here
//    intNumbersFlux()
//        .filter(integer -> integer > 5)
//        .map(integer -> integer * 10)
//        .take(3)
//        .log()
//        .subscribe(System.out::println);

    // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
    // TODO: Write code here
//    intNumbersFlux()
//        .filter(integer -> integer > 20)
//        .defaultIfEmpty(-1)
//        .subscribe(System.out::println);

    // Switch ints from intNumbersFlux to the right user from userFlux
    // TODO: Write code here
    intNumbersFlux()
        .flatMap(integer -> userFlux().filter(user -> user.getId() == integer))
        .subscribe(System.out::println);

    // Print only distinct numbers from intNumbersFluxWithRepeat
    // TODO: Write code here
//    intNumbersFluxWithRepeat().distinct().subscribe(System.out::println);

    // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
    // TODO: Write code here
    intNumbersFluxWithRepeat().distinctUntilChanged().subscribe(System.out::println);

    System.out.println("Press a key to end");
    System.in.read();
  }

}
