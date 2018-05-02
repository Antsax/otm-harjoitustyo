### Käyttöohje

## Ohjelman käynnistäminen

Ohjelma käynnistetään komennolla 

`java -jar SwervinDerwin-1.0-SNAPSHOT.jar`

## Aloitusruutu

Aloitusruudussa sinua tervehtii pelin päähahmo Derwin. Päävalikossa sinulle tarjotaan kolme nappia, josta kullakin on oma toiminallisuutensa. *Exit* -nappi sulkee pelin, *Highscores* -nappi vie korkeimpien pisteiden listalle ja *Start* -nappi vie itse peliin.

![Image of Main Menu](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/mainemenu.png)

## Highscores

Highscoresissa näet parhaimmat pelaajat ja heidän pisteensä. Back -nappia painamalla sinut viedään takaisin aloitusvalikkoon. 

![Image of Highscores](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/highscores.png)

## Peli

### Liikkuminen

Pelissä voi liikkua neljään eri suuntaan: ylös, alas, oikealle ja vasemmalle. Pelin rajana toimii seinät. Likkuminen taphtuu nuolinäppäimillä. Hyppääminen taphahtuu ylänuolella, liikkuminen vasemmalle ja oikealle vastaavilla nuolilla ja tippuminen alasnuolella. 

### Pelin idea

Pelin tarkoituksena on selvitä mahdollisimman pitkään samalla kun sivuilta tulee vihollisia. Pisteet näkyvät oikeassa yläkulmassa ja elämät vasemmassa yläkulmassa. Vihollisen osuttua Derwiniin menetät elämän.

![Image of Map](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/game.png)

Vihollisen osuttua Derwiniin hänestä tulee hetkellisesti immuuni, jonka indikaattorina toimii Derwinin värin muuttuminen keltaiseksi. Tällöin ohjukset eivät tehoa Derwiniin ja ne eivät vie elämiä pois häneltä.

![Image of Immunity](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/immune.png)

Kun Derwin on menettänyt kaikki kolme elämäänsä, peli päättyy ja ruudulle ilmestyy lomake, jonka täyttämällä voit tallettaa pisteesi Highscores -listaan.

![Image of Game Ending](https://github.com/Antsax/otm-harjoitustyo/blob/master/dokumentaatio/kuvat/gameover.png)
