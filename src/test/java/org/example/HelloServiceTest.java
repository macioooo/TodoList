package org.example;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloServiceTest {
    private final static String WELCOME = "Hello";

    @Test
    public void test_prepareGreeting_nullName_returnsGreetingWithFallbackName() {
        //given
        var mockRepository = alwaysReturnHelloRepository();
        var SUT = new HelloService(mockRepository);
        //when
        var result = SUT.prepareGreeting(null, "-1");

        //then
        assertEquals(WELCOME + " " + HelloService.FALLBACK_NAME + "!", result);

    }
    @Test
    public void test_prepareGreeting_name_WithFallbackIdLang() {
        //given
        var SUT = new HelloService();
        var name = "test";
        //when
        var result = SUT.prepareGreeting(name, null);
        //then
        assertEquals(WELCOME + " " + name + "!", result);
    }

    @Test
    public void test_prepareGreeting_name_returnsNonNullValue() {
        //given
        var SUT = new HelloService();
        var name = "test";
        //when
        var result = SUT.prepareGreeting(name, "-1");
        //then
        assertEquals(WELCOME + " " + name + "!", result);
    }

    @Test
    public void test_prepareGreeting_inPolish() {
        //given
        var SUT = new HelloService();
        var name = "test";
        //when
        var result = SUT.prepareGreeting(name, "2");
        //then
        assertEquals("Witaj " + name + "!", result);
    }

    @Test
    public void test_prepareGreeting_idAsText() {
        //given
        var SUT = new HelloService();
        var id = "abc";
        var name = "test";
        //when
        var result = SUT.prepareGreeting(name, id);
        //then
        assertEquals(WELCOME + " " + name + "!", result);

    }
    @Test
    public void test_prepareGreeting_nonExistingLang_returnsGreetingWithFallbackLang() {
        //given
        var SUT = new HelloService();
        var id = "9991";
        var name = "test";
        //when
        var result = SUT.prepareGreeting(name, id);
        //then
        assertEquals(WELCOME + " " + name + "!", result);
    }
    private LangRepository alwaysReturnHelloRepository() {
        return new LangRepository() {
            @Override
            Optional<Lang> findById(Integer id) {
                return Optional.of(new Lang(null, WELCOME, null));
            }
        };
    }
}
