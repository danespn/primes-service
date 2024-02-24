package edu.iu.danespen.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {
    PrimesService primesService = new PrimesService();

    @Test
    void _45isnotPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _100000000isnotPrime() {
        int n = 100000000;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _285191isPrime() {
        int n = 285191;
        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }
}