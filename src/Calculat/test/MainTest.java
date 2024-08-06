package test;
import Calculat.Main;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    Main mai = new Main();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("test setup1");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("test setup2");
    }

    @org.junit.jupiter.api.Test
    void add() {
        System.out.println("test add\n");
        assertEquals(9,mai.add(8,1));
        assertEquals(19,mai.add(17,2));
        assertEquals(2,mai.add(2,0));
        assertEquals(5,mai.add(2,3));
        assertEquals(6,mai.add(2,4));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        System.out.println("test sub\n");
        assertEquals(4,mai.sub(5,1));
        assertEquals(3,mai.sub(0,-3));
        assertEquals(5,mai.sub(5,0));
        assertEquals(8,mai.sub(5,-3));
        assertEquals(9,mai.sub(15,6));
    }

    @org.junit.jupiter.api.Test
    void mul() {
        System.out.println("test mul\n");
        assertEquals(56,mai.mul(7,8));
        assertEquals(44,mai.mul(4,11));
        assertEquals(-344,mai.mul(-43,8));
        assertEquals(312,mai.mul(78,4));
        assertEquals(69,mai.mul(23,3));
    }

    @org.junit.jupiter.api.Test
    void div() {
        System.out.println("test div");
        assertEquals(5,mai.div(90,15));
        assertEquals(6,mai.div(219,32));
        assertEquals(7,mai.div(91,13));
        assertEquals(8,mai.div(40,5));
        assertEquals(9,mai.div(72,8));
    }


    @org.junit.jupiter.api.Test
    void exp() {
        System.out.println("test exp\n");
        assertEquals(1024,mai.exp(2,10));
        assertEquals(125,mai.exp(5,3));
        assertEquals(429981696,mai.exp(12,8));
        assertEquals(1728,mai.exp(12,3));
        assertEquals(161052,mai.exp(11,5));
    }

}