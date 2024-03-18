package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumberMono;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumberMono()

    // Print the value from intNumberMono when it emits
    // TODO: Write code here
    intNumberMono().subscribe(System.out::println);

    // Get the value from the Mono into an integer variable
    // TODO: Write code here
    Integer integer = intNumberMono().block();
    Optional<Integer> integer2 = intNumberMono().blockOptional();

    System.out.println(integer);
    System.out.println(integer2.get());

    System.out.println("Press a key to end");
    System.in.read();
  }

}
