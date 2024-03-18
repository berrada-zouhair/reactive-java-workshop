package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFlux;

import java.io.IOException;

public class Exercise9 {


  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumbersFlux()

    // Print size of intNumbersFlux after the last item returns
    // TODO: Write code here
    //intNumbersFlux().count().subscribe(System.out::println);

    // Collect all items of intNumbersFlux into a single list and print it
    // TODO: Write code here
//    intNumbersFlux().collectList().subscribe(integers -> {
//      System.out.println(integers.size());
//      System.out.println(integers);
//    });

    // Transform to a sequence of sums of adjacent two numbers
    // TODO: Write code here
    intNumbersFlux().buffer(2)
        .map(list -> list.get(0) + list.get(1))
        .subscribe(System.out::println);

    System.out.println("Press a key to end");
    System.in.read();
  }

}
