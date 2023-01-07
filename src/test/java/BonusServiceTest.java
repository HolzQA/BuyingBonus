import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


/*    void shouldCalculateForRegisteredAndOverLimit(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    void shouldCalculateForUnRegisteredAndUnderLimit(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = false;
//        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    void shouldCalculateForUnRegisteredAndOverLimit(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = false;
//        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    } */
}