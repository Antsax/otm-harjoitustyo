package com.mycompany.unicafe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

 // @author antsax

public class KassapaateTest {
    
    Kassapaate kassapaate;
    Maksukortti kortti;
    
    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        kortti = new Maksukortti(1000);
    }
    
    @Test
    public void oikeaRahamaara() {
        assertTrue(kassapaate.kassassaRahaa()/100==1000);
    }
    
    @Test
    public void lounaitaAlussa() {
        assertTrue(kassapaate.maukkaitaLounaitaMyyty()==0);
        assertTrue(kassapaate.edullisiaLounaitaMyyty()==0);
    }
    
    @Test
    public void riittavaMaksuKortilla() {
        kassapaate.syoEdullisesti(kortti);
        assertTrue(kassapaate.syoEdullisesti(kortti)==true);
        assertTrue(kassapaate.syoMaukkaasti(kortti)==true);
        assertTrue(kassapaate.maukkaitaLounaitaMyyty()==1);
        assertTrue(kassapaate.edullisiaLounaitaMyyty()==2);
        assertTrue(kassapaate.kassassaRahaa()==100000);
    }
    
    @Test
    public void riittavaMaksuKateisella() {
        assertTrue(kassapaate.syoEdullisesti(1000)==760);
        assertTrue(kassapaate.syoEdullisesti(240)==0);
        assertTrue(kassapaate.syoMaukkaasti(1000)==600);
        assertTrue(kassapaate.syoMaukkaasti(400)==0);
        assertTrue(kassapaate.maukkaitaLounaitaMyyty()==2);
        assertTrue(kassapaate.edullisiaLounaitaMyyty()==2);
    }
    
    @Test
    public void puuttellinenMaksuKortilla() {
        kassapaate.syoMaukkaasti(kortti);
        kassapaate.syoMaukkaasti(kortti);
        assertTrue(kassapaate.syoMaukkaasti(kortti)==false);
        assertTrue(kassapaate.syoEdullisesti(kortti)==false);
        assertTrue(kortti.saldo()==200);
        assertTrue(kassapaate.maukkaitaLounaitaMyyty()==2);
        assertTrue(kassapaate.edullisiaLounaitaMyyty()==0);
    }
    
    @Test
    public void puuttellinenMaksuKateisella() {
        assertTrue(kassapaate.syoMaukkaasti(240)==240);
        assertTrue(kassapaate.syoEdullisesti(100)==100);
        assertTrue(kassapaate.kassassaRahaa()==100000);
        assertTrue(kassapaate.maukkaitaLounaitaMyyty()==0);
        assertTrue(kassapaate.edullisiaLounaitaMyyty()==0);
    }
    
    @Test
    public void kortilleLadataanRahaa() {
        kassapaate.lataaRahaaKortille(kortti, 1000);
        assertTrue(kassapaate.kassassaRahaa()==101000);
        assertTrue(kortti.saldo()==2000);
    }
}
