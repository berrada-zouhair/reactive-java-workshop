package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFluxWithException;

import java.io.IOException;
import reactor.core.publisher.Flux;

public class Exercise8 {


  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumbersFluxWithException()

    // Print values from intNumbersFluxWithException and print a message when error happens
    // TODO: Write code here
//    intNumbersFluxWithException()
//        .subscribe(System.out::println,
//            throwable -> {
//              System.out.println(throwable.getMessage());
//            }
//        );

    // Print values from intNumbersFluxWithException and continue on errors
    // TODO: Write code here
//    intNumbersFluxWithException()
//        .onErrorContinue((e, item) -> {
//          System.out.println("Error!! " + item.toString());
//        })
//        .subscribe(System.out::println);

    // Print values from intNumbersFluxWithException and when errors
    // happen, replace with a fallback sequence of -1 and -2
    // TODO: Write code here
    intNumbersFluxWithException()
        .onErrorResume(throwable -> Flux.just(-1, -2))
        .subscribe(System.out::println);

    System.out.println("Press a key to end");
    System.in.read();
  }

}
