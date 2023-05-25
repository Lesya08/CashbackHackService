package ru.netology;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testCalculateCashbackAverageAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testCalculateCashbackBoundaryAmount1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testCalculateCashbackBoundaryAmount2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testCalculateCashbackBoundaryAmount3() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1900;
        int expected = 100;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testCalculateCashbackBoundaryAmount4() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1600;
        int expected = 400;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testCalculateCashbackAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }
}