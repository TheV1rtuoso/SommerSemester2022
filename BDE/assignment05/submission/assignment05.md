## 1 Deanonymisierung

a) Man kann den anonymisierten Namen wiederherstellen, indem man die Tabellen 1 und 2 anhand der (Lieblings-)Filme/Serie verknüpft, da jemand für seinen Lieblingsfilm eine sehr gute Bewertung hinterlassen wird. Ein weiterer Vorteil ist, dass man mit der Annahme, dass alle Personen enthalten sind, weitergehende schussfolgerungen Anstellen kann und durch Ausschluss weitere 

1. Tobias hat ausschließlich eine positive Preferenz für _Spieder-Man 2_ angegeben. Die beiden anderen die _Spider-Man 2_ bewertet haben sind: Dan, mit einer negativen Bewertung und Camilla, eine Frau, was beide für den einzigen Eintrag zu _Spider-Man 2_ in der Tabelle 1 ausschließt, da der Eintrag besagt, dass der Fan ein Mann ist und unter anderem _Breaking Bad_ mag, in der Tabelle ist nur eine Positive Bewertung zu _Breaking Bad_ und die von Lisa, also kann man sagen, dass:

   ​	Tobias ein 20-23 Jahre alter Mann aus Merzig ist, auch _Breaking Bad_ mag und in einer Beziehung ist.

2. Bei David ist es etwas uneindeutiger, da es 2 Männer gibt die _Game of Thrones_ gut finden, David und Dan.

   und man es nicht weiter mit dem Lieblingsfilm weiter einschränken kann. Man kann aber sehen, dass sich beide Einträge kaum unterscheiden und dass:

   ​	David, 24-27 Jahre ist und aus Zweibrücken kommt, man kann aber nicht sicher sagen ob er _Star Wars 8_ oder 	     	_Die Verurteilten_ als Lieblingsfilm hat oder ob er Single oder in einer Beziehung ist. Für weitere Aussagen kann 	      	eine Genreanalyse der weiteren Filmkritiken von Dan und David Aufschluss bieten. 

b) 

- Eintrag 1: Lisa, wegen der einzigen guten Bewertung einer Frau für _Scream_ 
- Eintrag 3: Camilla, da sie wie Tina _El Camino_ mag, aber im Gegensatz _The Big Bang Theorie_ nicht negativ bewertet hat.
- Eintrag 4: Tina, nach Ausschlussverfahren.



## 2 Krankenkassen und Datenzugriffe

1. Getreu der Redewendung _"Man ist was man isst"_, kann man von der Ernährung eines Kunden große Rückschlüsse auf dessen Gesundheit schließen und Korrelationen aufstellen, die teure Behandlungen oder schwere Krankheitsverläufe mit den Metadaten der Ernährungsgewohnheit (Nährwerte) oder einzelnen Artikeln (Qualitative) verbinden. Genaueres in 2.

2. Gebe für jeden Artikel eine, nach durchschnittliche Behandlungskosten und Anzahl, sotierte Liste der Bandlungen aus, die für die Kunden, welche den Artikel gekauft habe, durchgeführt wurde. 

   Gebe die Kunden mit den schlechtesten _(geringsten)_ Nährwerten _(avg)_ an.  

## 

## 3 Von SQL zum logischen Plan



a)
$$
R1:= Personen \times Lehrer*innen \times unterrichten\\ 
R2:= \sigma_{Lehrer*in=LID \land Fach = 'Deutsch' \land Geburtsjahr< 2000 \land Gehalt \ge 500 \land PID=LID}(R1)\\\\
\pi_{Name, Wohnort, Hauptfach, Gehalt}(R2)
$$
