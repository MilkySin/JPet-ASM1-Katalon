import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when not logged in test case/a'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when not logged in test case/img'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when not logged in test case/a_1'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when not logged in test case/a_16.50_Button'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when not logged in test case/a_Sub Total 16.50_Button'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when not logged in test case/li'))

WebUI.verifyElementText(findTestObject('Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when not logged in test case/li'), 
    'You must sign on before attempting to check out. Please sign on and try checking out again.')

WebUI.closeBrowser()

