package example;

import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {
    @Test
    void main(){
        String expected = "Testing pull requests here";
        Assertions.assertEquals(expected, Main.test());
    }

}
