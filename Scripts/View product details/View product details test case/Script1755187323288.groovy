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

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/a'))

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/img'))

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/a_1'))

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/td'))

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/a_2'))

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/table'))

WebUI.verifyElementPresent(findTestObject('View product details Objects/View product details test case/table'), 10)

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/td_1'))

WebUI.click(findTestObject('Object Repository/View product details Objects/View product details test case/td_2'))

String productID = WebUI.getText(findTestObject('Object Repository/View product details Objects/View product details test case/a_2'))

// Get text from td, td_1, and td_2
String tdText = WebUI.getText(findTestObject('Object Repository/View product details Objects/View product details test case/td'))
String td1Text = WebUI.getText(findTestObject('Object Repository/View product details Objects/View product details test case/td_1'))
String td2Text = WebUI.getText(findTestObject('Object Repository/View product details Objects/View product details test case/td_2'))

WebUI.verifyMatch(td1Text, productID, false)
WebUI.verifyMatch(td2Text, tdText, false)

WebUI.closeBrowser()

