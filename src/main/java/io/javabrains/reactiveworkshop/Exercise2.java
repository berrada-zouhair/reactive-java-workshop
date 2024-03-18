package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFlux;
import static io.javabrains.reactiveworkshop.ReactiveSources.userFlux;

import java.io.IOException;

public class Exercise2 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

    // Print all numbers in the ReactiveSources.intNumbersFlux stream
    // TODO: Write code here
    intNumbersFlux().subscribe(System.out::println);

    // Print all users in the ReactiveSources.userFlux stream
    // TODO: Write code here
    userFlux().subscribe(System.out::println);

    System.out.println("Press a key to end");
    System.in.read();
  }

}
