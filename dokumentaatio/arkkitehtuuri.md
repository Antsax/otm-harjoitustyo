# Arkkitehtuurikuvaus

## Rakenne

Ohjelman rakenne jakautuu neljään eri pakkaukseen:

- käyttöliittymä (ui)
- logiikka (gamelogic)
- oliot / hahmot (objects)
- satunnaiset (miscellaneous)

Jokainen pakkaus hyödyntää ja importtaa toisessa pakkauksessa olevia luokkia. Rakenteella ei ole yksikäsitteistä arkkitehtuurirakennetta.

![Image of Package Diagram](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/packagediagram.png)

## Käyttöliittymä

Käyttöliittymässä on kolme eri näkymää:

- aloitusvalikko
- korkeimmat pisteet
- peli

Pakkauksessa *ui* oleva luokka [MainMenu](https://github.com/Antsax/otm-harjoitustyo/blob/master/SwervinDerwin/src/main/java/swervinderwin/ui/MainMenu.java) toimii pääruutuna. Sillä on ainut Stage -olio koko ohjelmassa. Muut käyttyöliittymään liittyvät luokat tuottavat uuden Scene -olion, joka asetetaan MainMenussa olevan stagen sceneksi. 

Käyttöliittymässä ei ole yhtään sovelluslogiikkaa. Se vain ja ainoastaan luo ruudussa näkyvän kuvan. Napit on yritetty eriyttää käyttöliittymästä myös kokonaan ja scenejen vaihto tapahtuu omassa luokassa [SceneSwitcher](https://github.com/Antsax/otm-harjoitustyo/blob/master/SwervinDerwin/src/main/java/swervinderwin/miscellaneous/SceneSwitcher.java)

Animaatio tapahtuu luokassa [AnimationHandler](https://github.com/Antsax/otm-harjoitustyo/blob/master/SwervinDerwin/src/main/java/swervinderwin/gamelogic/AnimationHandler.java)

## Sovelluslogiikka 

Suurin osuus logiikasta on toteutettu itse peliin, eikä niin paljon aloitusvalikkoon tai scenejen vaihtoon. Aloitusvalikossa painamalla Start -nappia, luodaan uusi kartta **Map** joka asetetaan uudeksi sceneksi. 

Map kutsuu luokkia, jotka luovat pelattavan hahmon, viholliset, alustat, animaation ja pisteet. Suurin ja tärkein luokka on AnimationHandler, joka vastaa lähes yksinomaisesti koko pelin toiminnasta. Se pitää huolta pelin päättymisestä, pisteistä, elämistä ja vihollisen sekä Derwinin liikkumisesta. Se myös muuttuvat esineet pelissä (pisteet, elämät, hahmot). 

Nuolinäppäimillä tapahtuva liikkuminen on toteutettu *EventHandlereillä* jotka käsittelevät eri napinpainallukset.


![Image of Sequence Diagram](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/startSequence.png)

## Ohjelman rakenteeseen jääneet heikkoudet

### Animaatio

Lähes kaikki animaation liittyvät ja muut satunnaiset tapahtumat on tungettu *AnimationHandler* luokkaan. Niiden eriyttäminen toisiin luokkiin osoittautui hyvin hankalaksi. Erityisen hankalaa oli saada Stage -muuttujaa toimimaan kunnolla testeissä, minkä takia se jouduttiin poistamaan luokan luovasta parametreistä. Piirtäminen olisi voinut eriyttää omaan luokkaan. Samoin pelin aiheuttavat muutokset tulostaulussa ja elämissä.

### Liikkumisen logiikka

Liikkuminen pelissä on muuten hyvin koodattu, mutta hyppy- ja tippumistoiminnot olisi voinut toteuttaa paremmin. Tippumisen ja hyppimisen sallitut alueet on kovakoodattu suoraan koodiin, mikä tekee koodista hankalasti luettavan ja muutenkin kehnon. Alustoiden sijainnit olisi voinut toteuttaa erilliselle listalle. Tämän jälkeen katsotaan jos hahmon sijainti on listassa ja tämän mukaan tarjotaan mahdollisuudet hyppyyn tai putoamiseen.
