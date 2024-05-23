package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainLimitTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void belowLimitRemainTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void aboveLimitRemainTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void belowZeroRemainTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = -100;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ZeroRemainTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainTest2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }
}
