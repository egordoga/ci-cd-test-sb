import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServTest {

    @Test
    void sum() {
        int sum = new Serv().sum(1, 2);
        Assertions.assertEquals(3, sum);
    }
}