# Del D: Reflektion

Alla regler som jag kom fram till i part-a.md blir uppfylda
i det Java program jag gjort. Alla fält är private så att
det inte går att ändra på direkt av användaren. Varje gång
man kör .toUp() görs en kontroll för om balance kommer att 
uppfylla kraven som max 200 eller inte vara negativt.

En metod som .setBalance() skulle göra att användaren kan
direkt ändra på balance vilket går emot regeln om att inte
få ändra på fält direkt, det skulle vara motsägelsefullt.

nextCardNumber är static för att det är inget som är specifikt
för ett individuellt TravelCard, skulle balance däremot vara
static så skulle alla TravelCard's dela på samma balance vilket
inte skulle göra så mycket nytta i det här sammanhanget.

Det finns endast ett Trip objekt och både Adas och Bos lastTrip
pekar på det objektet, men vad som än ändras på Adas kort kommer
inte att göra något till Bos lastTrip pekare, eftersom att fälten 
i Trip inte går att ändra på kommer Bos sensate resa vara densamma
oavsett hur mycket man försöker ändra på Adas TravelCard.

## Tidsåtgång (fråga 5)

| Del | Timmar |
|-----|--------|
| A   |ca. 20m     |
| B   |ca. 1h        |
| C   |ca. 3.5h        |
| D   |ca. 15m        |
