import org.example.Main;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class test {
    private final Main object = new Main();

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("testProvider")
    public void method1(String expected, String param) {
        assertEquals(expected, object.purposeByIf(param));
        assertEquals(expected, object.purposeBySwitch(param));
        assertEquals(expected, object.purposeByMap(param));
    }

    static Stream<Arguments> testProvider() {
        return Stream.of(
                arguments("Я дверь машины, я вам не дам выйти!", "Дверь"),
                arguments("Я корпус машины, я держу все детали вместе", "Кузов"),
                arguments("Я колесо, я двигаю автомобиль вперед", "Колесо"),
                arguments("Не знаю такой детали", "")
        );
    }
}
