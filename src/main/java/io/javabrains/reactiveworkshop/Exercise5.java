package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFlux;

import java.io.IOException;
import org.reactivestreams.Subscription;
import reactor.core.Disposable;
import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

    // Subscribe to a flux using the error and completion hooks
    // TODO: Write code here
    Disposable subscribe = intNumbersFlux()
        .subscribe(
            System.out::println,
            System.out::println,
            () -> System.out.println(" completion hooks")
        );

    subscribe.dispose(); // kill the subscription

    // Subscribe to a flux using an implementation of BaseSubscriber
    // TODO: Write code here
    intNumbersFlux().subscribe(new MySubscriber<>());

    System.out.println("Press a key to end");
    System.in.read();
  }

}

class MySubscriber<T> extends BaseSubscriber<T> {

  @Override
  protected void hookOnSubscribe(Subscription subscription) {
    System.out.println("Subscription happened");
    request(1);
  }

  @Override
  protected void hookOnNext(T value) {
    System.out.println(value.toString() + " received");
    request(1);
  }
}
