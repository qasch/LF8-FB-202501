# Übungen zu Schleifen in Java

## **1. Zahlen von 1 bis 10 ausgeben**

- Schreibe ein Programm, das die Zahlen von `1` bis `10` auf der Konsole ausgibt.  
- Nutze dafür einmal eine `while` und dann auch eine `for`-Schleife.  

> [!IMPORTANT] 
> **Zusatz:** Gib die Zahlen untereinander oder nebeneinander mit einem Komma getrennt aus.  

## **2. Summieren von Zahlen**
- Schreibe ein Programm, das die Summe der Zahlen von `1` bis `100` berechnet.  
- Gib die Summe aus.  

> [!IMPORTANT] 
> **Zusatz:** Modifiziere das Programm, sodass der Benutzer eine Obergrenze (z. B. `200`) eingeben kann.  

## **3. Gerade Zahlen ausgeben**
- Gib alle *geraden* Zahlen zwischen `1` und `50` aus.  
- Nutze eine `for`-Schleife und eine `if`-Bedingung.  

> [!IMPORTANT]
> **Zusatz:** Lass den Benutzer eine Start- und Endzahl eingeben.  

## **4. Benutzer-Eingaben summieren**
- Schreibe ein Programm, das Zahlen vom Benutzer einliest und die Summe berechnet.  
- Die Eingabe wird beendet, wenn der Benutzer `0` eingibt.  

> [!IMPORTANT] 
> **Zusatz:** Prüfe, ob die Eingabe eine gültige Zahl ist (z. B. keine Buchstaben).  

## **5. Zahlenraten-Spiel**
- Schreibe ein Programm, das eine Zufallszahl zwischen `1` und `100` generiert.  
- Der Benutzer muss die Zahl erraten. Das Programm gibt Hinweise wie "zu hoch" oder "zu niedrig".  
- Beende die Schleife, wenn der Benutzer die Zahl erraten hat.  

> [!IMPORTANT] 
> **Zusatz:** Zeige am Ende an, wie viele Versuche der Benutzer gebraucht hat.  

## **6. Umgekehrte Zeichenfolge**
- Schreibe ein Programm, das eine Zeichenfolge vom Benutzer einliest und diese umgedreht ausgibt.  
  Beispiel: Eingabe: `Java` -> Ausgabe: `avaJ`.  

> [!NOTE] 
> 1. Nutze die Methode `.charAt(index)`, um einzelne Zeichen der Zeichenkette zu erhalten.  
> 2. Iteriere von der letzten Position der Zeichenkette bis zur ersten.  
> 3. Füge die Zeichen in umgekehrter Reihenfolge in eine neue Zeichenkette ein.  

> [!IMPORTANT] 
> **Zusatz:** Prüfe, ob die umgekehrte Zeichenfolge ein Palindrom ist.  


## **7. Einfaches Menü mit Schleifen**
- Erstelle ein Programm, das ein Menü mit drei Optionen anzeigt:  
  1. Zahlen summieren  
  2. Multiplikationstabelle anzeigen  
  3. Programm beenden  
- Nutze eine `do-while`-Schleife, um das Menü immer wieder anzuzeigen, bis der Benutzer die dritte Option wählt, verlasse dann die Schleife und gib die Meldung "Programm beendet" aus.

> [!NOTE]
> 1. Verwende eine Variable, um die Benutzerwahl zu speichern.  
> 2. Nutze eine `switch`-Anweisung, um die Wahl des Benutzers zu behandeln.  
> 3. Stelle sicher, dass die Schleife bei der Option "Programm beenden" endet.  


## **8. FizzBuzz**
- Schreibe ein Programm, das die Zahlen von 1 bis 50 ausgibt, aber:  
  - Für Zahlen, die durch 3 teilbar sind, schreibe "Fizz".  
  - Für Zahlen, die durch 5 teilbar sind, schreibe "Buzz".  
  - Für Zahlen, die durch 3 und 5 teilbar sind, schreibe "FizzBuzz".  


## **9. Multiplikationstabelle**

### Was ist eine Multiplikationstabelle?
Eine Multiplikationstabelle zeigt die Ergebnisse der Multiplikation zweier Zahlen in Tabellenform an. Beispiel für eine Tabelle von 1 bis 5:
```
    1   2   3   4   5
1   1   2   3   4   5
2   2   4   6   8  10
3   3   6   9  12  15
4   4   8  12  16  20
5   5  10  15  20  25
```
### Aufgabe
- Schreibe ein Programm, das die Multiplikationstabelle von 1 bis 10 auf der Konsole ausgibt.  

> [!IMPORTANT]  
- **Zusatz:** Lass den Benutzer entscheiden, für welche Zahl die Tabelle ausgegeben werden soll.  

## **10. Einfache Sternmuster**
**Ziel:** Arbeiten mit verschachtelten Schleifen.  
- Schreibe ein Programm, das ein Sternmuster wie folgt ausgibt:  
```
*
**
***
****
*****
```
> [!IMPORTANT]  
- **Zusatz:** Lass den Benutzer die Anzahl der Zeilen eingeben.  
- Gib das Muster umgekehrt aus (z. B. 5 Sterne in der ersten Zeile, 4 in der zweiten usw.).  
