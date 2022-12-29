import org.example.Main;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MainTest {
    private final Main object = new Main();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                arguments("Я дверь машины, я вам не дам выйти!", "Дверь"),
                arguments("Я корпус машины, я держу все детали вместе", "Кузов"),
                arguments("Я колесо, я двигаю автомобиль вперед", "Колесо"),
                arguments("Не знаю такой детали", ""),
                arguments("Не знаю такой детали", null)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void method1(String expected, String param) {
        assertEquals(expected, object.ifPurpose(param));
        assertEquals(expected, object.switchPurpose(param));
        assertEquals(expected, object.mapPurpose(param));
    }
}
