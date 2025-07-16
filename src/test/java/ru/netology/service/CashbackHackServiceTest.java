package ru.netology.service;

import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(actual, 100);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(actual, 0);
    }
}