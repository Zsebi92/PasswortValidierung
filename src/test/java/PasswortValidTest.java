import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswortValidTest {

    @Test
    void pwLength(){

        // Given
        String passwort = "einsehrlangeswort";

        // When
        String actual = PasswortValid.pwLength(passwort);

        // Then
        assertEquals("einsehrlangeswort", actual);

    }

    @Test
    void checkForNum(){

        // Given
        String passwort = ;

        // When
        String actual = PasswortValid.checkForNum(passwort);

        // Then
        assertEquals(, actual);
    }
}
