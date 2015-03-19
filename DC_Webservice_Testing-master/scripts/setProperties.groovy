import jxl.*

def groovyUtils = new com.eviware.soapui.support.GroovyUtils(context)

def BeginnZeile = x // Zeile in der Exceltabelle ab der eingelesen werden soll
def SpaltePropertyName = x // Spalte des Property Namens
def SpaltePropertyValue = x // Spalte des Testfalls 


def xlsFile = testRunner.testCase.testSuite.project.getPropertyValue( "xlsDatei" )  

Workbook BeitragsTestData = Workbook.getWorkbook(new File(xlsFile)) //öffnen der Exceltabelle
Sheet BeitragsTestDataSheet = BeitragsTestData.getSheet(0) 

def NumOfRows = BeitragsTestDataSheet.getRows() // ermitteln der Zeilenanzahl



context.testCase.properties.each  
{
    k,v ->
    context.testCase.removeProperty(k);   //Löschen aller vorhandenen Properties
}


	def xlsTestName = BeitragsTestDataSheet.getCell(SpaltePropertyValue-1,0)

	testRunner.testCase.setPropertyValue("Testfall", xlsTestName.getContents())
	

	def xlsPropertyName
	def xlsTestValue

		for(n in (BeginnZeile-1..NumOfRows-1)) {  // anlegen der Custom Properties

			xlsPropertyName = BeitragsTestDataSheet.getCell(SpaltePropertyName-1,n).getContents().toString() 
			// xlsTestValue = BeitragsTestDataSheet.getCell(SpaltePropertyValue-1,n).getContents().toString()
     		xlsTestValue = BeitragsTestDataSheet.getCell(SpaltePropertyValue-1,n).getContents().replace(',', '.').toString()	// Zahlenformat von deutsch auf englisch
                
     		testRunner.testCase.setPropertyValue(xlsPropertyName, xlsTestValue)
			
		  }	

          
BeitragsTestData.close() // schliessen der Excel

