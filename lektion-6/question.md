# Lektion 6

## __0__ _VE_  
Skapa en funktion _halvera_ som tar ett heltal som parameteer och returnerar en __double__ som är halva värdet av parametern.

## __1__ _VE_  
Gör en funktion som tar ett heltal och skriver ut "hej" lika många hgånger som heltalet. Varje "hej" ska vara på en ny rad. 

## __2__ _E_  
De finns de som ogillar operator sås om "+","-", "\*" och så vidare. Vi ska hjälpa dem! Skapa först en funktion _add_ som tar två decimaltal och returnerar summan av dessa decimaltal. Denna funktion kan nu användas istället för "+". Gör sedan på samma sätt för "-", "\*" och "/". 

## __3__ _E_  
Använd funktionen du definerat ovan och beräkna "1+2\*3", "2\*3+5\*7" och "3\*3\*3\*3". Skriv ut svaret i konsolen.

## __4__ _N_  
Du ska göra en funktion som tar en sträng, med max 20 tecken, som parameter och sedan skriver ut en pingvin som säger detta i en pratbubla.
__Tips:__ Använd dessa två strängar:

start=" ______________________\n< "; 

end=
```

">\n ----------------------\n   \\\n    \\\n        .--.\n       |o_o |\n       |:_/ |\n      //   \\ \\\n     (|     | )\n    /'\\_   _/`\\n    \\___)=(___/";

```

## __5__ _N_  

Gör en funktion _buy_ som tar två parametrar, _gold_ - som motsvarar hur mycket pengar du har och _cost_ -som motsvarar hur mycket en vara har kostad. _bye_ ska returnerar _gold_ minus _cost_. Gör sedan en funktion _sell_ som fungerar liknade men kostnaden läggs till gold istället men först efter att moms på 25% är bort taget. Gör ett litet program som demonstrerar dessa två funktioner i konsolen. 

## __6__ _N_  

Gör en funktion som löser andragradsekvationer och skriver ut lösningen i konsolen. Utgå ifrån pq-formlen:

x = -p/2 +- \sqrt((p/2)^2 - q)

där x^2 + px + q = 0

Tänk på att du måste kontrollera om (p/2)^2 - q är störe än 0. Om det inte är det så ska du skriva ut "Finns inga reella rötter" alternativ räkna ut de komplexa rötterna.

## __7__ _H_

Du ska göra ett program som beräknar arean av ett område som är sammansatt av trianglar, rektanglar och cirklar. Låt användaren ange vilket del område som hen vill börja mata in. Låt "t" stå för triangel, "r" för rektangel, "k" för kvadrat och "c" för cirkel. Om använjdaren skriver ett "c" så ska användaren sedan ange en radie som ett heltal. Om det är en rektangel ska användaren ange två heltal för bred och höjd. På samma sätt för kvadrat och triangel. När användaren är klar skriver hen "a" och programmet räknar då ut den totala arean. När du implementerar denna uppgift måste du använda funktioner på ett sådant sätt att din kod får en bra struktur. Se till att alla area beräkningar sker i separata funktioner.

## __8__ _VH_

Fibonaccis tal är en mycket vanlig förekommand uppgift på diverse programmerings prov och tävlingar. Ofta maskerade på ett heller annat sätt. Det finns olika sätt att beräkna dem men här ska vi använda oss av recursion, dvs att vår funktion ska anropa sig själv. Vi ska ha en funktion, som vi kallar f, som tar en heltals parameter, somm vi här kallar _x_ och som dessutom måste vara större än 0. Om x är lika med 0 eller 1 ska funktionen returnera 1. I annat fall ska funktionen returnera f(x-1)+f(x-2), dvs den ska anropa sig själv igen men minska på in parametern.
  * Vilket är det högsta Fibonaccis tal du kna beräkna med den här metoden? 


## __9__ _X_ 

En anna rolig funktion som finns är den så kallade Ackerman funktionen, här presenterad i en förenklat form. Ackerman växer så snabbt att den har teoretiska implikationer för datavetenskapen. Nedan följer en definition:

Ack(0,y)=y+1

Ack(x,0)=Ack(x-1,1)

Ack(x,y)=Ack(x-1,y-1)

Implementera denna funktion.

## __10__ _NM_

Skriv ut en matris över värderna för x opch y. Böra med x=0 och y=0. Du kommer märka att öven för låga värden på x oxh y kan du få problem med att beräkna värder på Ack. Om du inte lyckas beräkna Ack för ett par av värden så skriv ut ett "X". Välj själv ett lämpligt värde på största x och y.
