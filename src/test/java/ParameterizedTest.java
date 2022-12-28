import org.example.Main;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParameterizedTest {
    private final Main object = new Main();

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("testProvider")
    public void method1(int[] expected, int[] param) {
        assertArrayEquals(expected, object.streams(param));
        assertArrayEquals(expected, object.loops(param));
    }

    static Stream<Arguments> testProvider() {
        return Stream.of(
                arguments(new int[]{10, -65}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}),
                arguments(new int[]{8, -50}, new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}),
                arguments(new int[0], new int[0]),
                arguments(new int[0], null)
        );
    }
}
