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

WebUI.click(findTestObject('Object Repository/Search Bar Test partial name/a'))

WebUI.setText(findTestObject('Object Repository/Search Bar Test partial name/input__keyword'), 'Fi')

WebUI.click(findTestObject('Object Repository/Search Bar Test partial name/input__searchProducts'))

WebUI.click(findTestObject('Object Repository/Search Bar Test partial name/td'))

WebUI.click(findTestObject('Object Repository/Search Bar Test partial name/td_1'))

WebUI.click(findTestObject('Object Repository/Search Bar Test partial name/td_2'))

// Get the text from td and td_1
String tdText = WebUI.getText(findTestObject('Object Repository/Search Bar Test partial name/td'))

String td1Text = WebUI.getText(findTestObject('Object Repository/Search Bar Test partial name/td_1'))

String td2Text = WebUI.getText(findTestObject('Object Repository/Search Bar Test partial name/td_2'))

// Verify both contain 'Fish'
WebUI.verifyMatch(tdText.toLowerCase(), '.*fi.*', true)

WebUI.verifyMatch(td1Text.toLowerCase(), '.*fi.*', true)

WebUI.verifyMatch(td2Text.toLowerCase(), '.*fi.*', true)

WebUI.closeBrowser()

