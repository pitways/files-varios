DC_Webservice_Testing
=====================


Es handelt sich hierbei um einen Framework, bestehend aus einem Groovy Script und einer Exceldatei, um automatisiert Daten aus Excel
in SoapUI als Custom Properties zu übernehmen. Danach können diese dann z.B. für einen SOAP Request genutzt werden.

Folgende Dateien sind nötig:


- setProperties.groovy
	
		Dieses Script muß in SoapUI zuerst in einem TestCase gestartet werden um die Custom Properties anzulegen.
		

		
- Testfaelle.xls
	
		In dieser Exceldatei werden die Testdaten verwaltet. Wie die Tabelle gefüllt wird siehe Beispiel Projekt.
		In SoapUI wird der Dateiname und der Pfad der Tabelle als Custom Property "xlsDatei" des Projects angegeben.
		
		z.B.: C:\\Temp\\BeitragsTestFaelle.xls
		
		
- jxl.jar

		Hierbei handelt es sich um eine Java Excel API um per Groovy die Daten aus der Exceldatei zu lesen.
		
		Homepage: http://jexcelapi.sourceforge.net
		
		Bitte kopieren Sie die Datei in ihr SOAPUI-Verzeichnis/bin/ext
		
		