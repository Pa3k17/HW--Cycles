package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    public void testWhenFeSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenNoSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(20, 30);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenOneSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(30, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenEqualRange() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenUnEqualRange() {
        SQRService service = new SQRService();

        int actual = service.calc(400, 300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}