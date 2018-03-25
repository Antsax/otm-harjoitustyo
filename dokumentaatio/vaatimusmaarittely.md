# Vaatimuusmäärittely

## Sovelluksen tarkoitus

Pelin ideana on selvitä mahdollisimman pitkään kun vaikeustaso kasvaa progressiivisesti. Peli on tasohyppelipeli ja pelaajan on tarkoitus väistää tulevia vihollisia ja ohjuksia. High Score tallentuu pelin loputtua. 

## Pelin toiminallisuus

Pelaajalla on neljä eri mahdollisuutta liikkumiseen: hyppy, alas laskeutuminen, liikkuminen oikealla ja vasemmalle. Pelaajalla on 3 elämää. Iskun vastaanotettua hahmosta tulee hetkellisesti immuunii ja pelaaja menettää yhden elämän. Piirakoita syömällä (jotka ilmestyvät kentälle tietyn välein) antavat pelaajalle yhden elämän (silti siten, että niitä on maksimissaaan kolme). 

![Image of Functionalities](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/settings.jpg)

## Peruversion tarjoama mahdollisuus

### Main menu

![Image of Main Menu](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/mainmenu.jpg)

- Pelaaja näkee aloitusruudussa pelattavan hahmon (Derwin)
- Aloitusruudussa on napit pelin aloittamiseen ja pelistä poistumiseen sekä high score -lista
  - Start -nappia painamalla pelaaja viedään peliin
  - Exit -nappia painamalla tulee varmistusviesti, joka kysyy halutaanko sovellus varmasti sulkea. Myönteinen vastaus sulkee ohjelman, kielteinen sulkee viestin.
  - High Scores -nappi vie korkeimpien pisteiden listalle

### Game screen

![Image of Game Screen](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/gamescreen.jpg)

- Pelin aloitusruutu
- Pelaaja aloittaa toiseksi alimman tason keskeltä
- Pelin alussa kerrotaan liikkumisasetukset
- Peli alkaa lähtölaskennasta

### High Scores

![Image of High Scores](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/highscores.jpg)

- Lista pelaajista, jotka ovat saaneet korkeimmat pisteet pelissä
- Käyttäjänimi saa olla maksimissaan 8 kirjainta pitkä
- Käyttäjä voi palata takaisin aloitusvalikkoon BACK -nappia painamalla

## Jatkokehitysideoita

Jos aikaa riittää, voi pelia kehittää ja laajentaa esimerkiksi seuraavilla toiminnalisuuksilla:

- Peli tarjoaa mahdollisuuden toisen pelaajan lisäämiselle
- Hahmoja on useita, joista voi valita mieluisimman
- Pelaaja voi kehittää omia kenttiään
- Pelissä on erikoisvoimia, esim. miekan nostaminen antaa pelaajalle mahdollisuuden tuhota tulevia ohjuksia lyömällä niitä oikeaan aikaan
- Valikkoruudussa on SETTINGS -nappi, joka vie käyttäjän asetuksiin, missä voi muokata pelin asetuksia (esim. väriasetusten tai key bindingsien muokkaaminen)
- Pomo -taisteluita
- Peliin voi luoda erilaisia ääniefektejä ja jopa oman tunnuskappaleen
- Grafiikka voi muokata paremmaksi
- Uusien vihollisten lisääminen
