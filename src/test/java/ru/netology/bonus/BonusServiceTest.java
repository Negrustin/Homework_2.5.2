package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class    BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv", numLinesToSkip = 1)

    void bonusTest (long excepted, long amount, boolean registered){
        BonusService service = new BonusService();

        long actual = service.calculateBonus(amount,registered);
        Assertions.assertEquals(excepted,actual);
    }


}
