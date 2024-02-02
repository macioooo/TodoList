import org.example.HelloService;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloServiceTest {
    private HelloService SUT = new HelloService();
    @Test
    public void test_null_prepareGreeting_returnsFallbackValue() throws  Exception {
        //given
        String name = null;

        //when

        var result = SUT.

    }
}
