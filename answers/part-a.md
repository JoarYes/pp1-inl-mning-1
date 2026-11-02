# Del A: Regler för ett resekort

## Regler som borde gälla

1. Balance får inte vara negativt
2. Användaren får inte ändra interna variabler direkt
3. Interna fält borde inte deklareras av användaren utan genom metoder

## Varför skyddar inte dataclassen mot felen?
För att alla fält i @dataclass är publika och det går inte att ändra på det