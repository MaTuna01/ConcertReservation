package io.tuna.concertreservation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ConcertReservationApplicationTests {

    @Test
    void contextLoads() {
    }

}
