package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void testBonusCalculate(long amount, boolean registered, long expected) {

        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}
