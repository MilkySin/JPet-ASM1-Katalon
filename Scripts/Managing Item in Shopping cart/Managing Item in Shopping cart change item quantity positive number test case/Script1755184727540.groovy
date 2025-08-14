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

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/a'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/img'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/a_1'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/a_16.50_Button'))

WebUI.setText(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/input_false_EST-1'), 
    '6')

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/input_Sub Total 16.50_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/td'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/td_1'))

// Get text from the elements
String originalPriceText = WebUI.getText(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/td'))

String totalPriceText = WebUI.getText(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/td_1'))

// Remove currency symbols and commas, then convert to BigDecimal
BigDecimal originalPrice = new BigDecimal(originalPriceText.replaceAll('[^0-9\\.]', ''))

BigDecimal totalPrice = new BigDecimal(totalPriceText.replaceAll('[^0-9\\.]', ''))

String quantityText = WebUI.getAttribute(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart change item quantity positive number test case/input_false_EST-1'), 
    'value')

int quantity = Integer.parseInt(quantityText)

WebUI.verifyEqual(totalPrice, originalPrice.multiply(new BigDecimal(quantity)))

WebUI.closeBrowser()

