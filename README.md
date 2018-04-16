# Swervin' Derwin

Helsingin Yliopiston keväällä 2018 toteutettu **Ohjelmistotekniikan menetelmät** kurssin projekti. Kyseessä on tasohyppelypeli, jossa pelaaja ohjaa Derwin nimistä hahmoa. Pelin ideana on selvitä mahdollisimman pitkään, kun kentän reunilta sinkoaa vihollisia.

## Dokumentaatio

[Vaatimusmäärittely](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/tyoaikakirjanpito.md)

## Komentorivitoiminnot

### Testaus

Testit suoritetaan komennolla 

`mvn test`

Testikattavuusraportti luodaan komennolla

`mvn test jacoco:report`

Kattavuusraporttia voi tarkastella selaimella avaamalla tiedosto *target/site/jacoco/index.html*

### Käynnistys

Sovelluksen voi käynnistää suorittamalla komento 

`mvn compile exec:java -Dexec.mainClass=swervinderwin.ui.MainMenu`

### CheckStyle

Tiedoston [checkstyle.xml](https://github.com/Antsax/otm-harjoitustyo/blob/master/SwervinDerwin/checkstyle.xml) määrittelemät tarkistukset suoritetaan komennolla

`mvn jxr:jxr checkstyle:checkstyle`

Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto *target/site/checkstyle.html*
