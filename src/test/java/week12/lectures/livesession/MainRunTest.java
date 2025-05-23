package week12.lectures.livesession;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainRunTest {

    @Test
    void checkAge() {
        assertEquals(true, MainRun.checkAge(15));
    }

    @Test
    void onNegativeInputShouldThrowException() {
        assertThrows(AgeOutOfAllowedBounds.class, () -> {
            MainRun.checkAge(-5);
        });
    }
}