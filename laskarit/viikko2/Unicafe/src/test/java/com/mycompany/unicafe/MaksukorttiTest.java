package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void kortinSaldoAlussaOikein() {
        assertTrue(kortti.saldo()==10);
    }
    
    @Test
    public void rahanLataaminenKasvattaaSaldoa() {
        Kassapaate kassapaate = new Kassapaate();
        kassapaate.lataaRahaaKortille(kortti, 5);
        kassapaate.lataaRahaaKortille(kortti, 3);
        kassapaate.lataaRahaaKortille(kortti, -2);
        assertTrue(kortti.saldo()==18);
    }
    
    @Test
    public void saldoVaheneeJosRahaa() {
        kortti.otaRahaa(3);
        kortti.otaRahaa(4);
        assertTrue(kortti.saldo()==3);
    }
    
    @Test
    public void saldoEiMuutuJosEiRahaa() {
        kortti.otaRahaa(4);
        kortti.otaRahaa(12);
        assertTrue(kortti.saldo()==6);
    }
    
    @Test
    public void tulostusOikea() {
        assertEquals("saldo: 0.10", kortti.toString());
    }
}
