package io.tuna.concertreservation;

import org.springframework.boot.SpringApplication;

public class TestConcertReservationApplication {

    public static void main(String[] args) {
        SpringApplication.from(ConcertReservationApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
