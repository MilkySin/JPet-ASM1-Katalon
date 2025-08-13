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

WebUI.click(findTestObject('Object Repository/Add product test suite Objects/Add product from product ID/a'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Add product test suite Objects/Add product from product ID/area'),3)

WebUI.enhancedClick(findTestObject('Object Repository/Add product test suite Objects/Add product from product ID/area'))

WebUI.click(findTestObject('Object Repository/Add product test suite Objects/Add product from product ID/a_1'))

WebUI.click(findTestObject('Object Repository/Add product test suite Objects/Add product from product ID/a_16.50_Button'))

WebUI.click(findTestObject('Object Repository/Add product test suite Objects/Add product from product ID/td'))

String cellText = WebUI.getText(findTestObject('Object Repository/Add product test suite Objects/Add product from product ID/td'))

WebUI.verifyMatch(cellText.toLowerCase(), 'remove', true)

WebUI.closeBrowser()

