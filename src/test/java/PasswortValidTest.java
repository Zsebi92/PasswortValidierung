import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswortValidTest {


    @Test
    void pwLengthTest(){
        // Given
        String password = "DasPasswortIstLangGenug";

        // When
        boolean actual = PasswortValid.pwCheckForLength(password);

        // Then
        assertEquals(true ,actual);
    }
    @Test
    void pwCheckforNumberTest(){
        // Given
        String password = "0IstEineZahl";

        // When
        boolean actual = PasswortValid.pwCheckForNumber(password);

        // Then
        assertEquals(true, actual);
    }
    @Test
    void pwCheckforLowerCaseTest(){
        // Given
        String password = "GrossBuchstaben";

        // When
        boolean actual = PasswortValid.pwCheckForLowerCase(password);

        // Then
        assertEquals(true, actual);
    }
    @Test
    void pwCheckforUpperCaseTest(){
        // Given
        String password = "GrossBuchstaben";

        // When
        boolean actual = PasswortValid.pwCheckForUpperCase(password);

        // Then
        assertEquals(true, actual);
    }
    @Test
    void pwUnsafe(){
        // Given
        String password = "LSJIVNEOWJJVO";

        // When
        boolean actual = PasswortValid.pwUnsafe(password);

        // Then
        assertEquals(true, actual);
    }
}
