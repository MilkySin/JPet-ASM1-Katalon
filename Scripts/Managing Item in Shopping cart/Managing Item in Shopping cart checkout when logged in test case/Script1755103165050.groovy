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

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/a'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/img'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/a_1'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/a_16.50_Button'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/a_Sub Total 16.50_Button'))

WebUI.setText(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/input_Need a user name and password_stripes_c24f9c'), 
    'TestUser')

WebUI.setEncryptedText(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/input_Need a user name and password_password'), 
    'qPDWtMYEx+8=')

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/input_Need a user name and password_signon'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/img_Sign Out_img_cart'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/a_Sub Total 16.50_Button'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/table'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/input_Ship to different address_newOrder'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/table_1'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/a_USB_Button'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/li'))

WebUI.click(findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/table_2'))

TestObject tableBefore = findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/table_1')

TestObject tableAfter = findTestObject('Object Repository/Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/table_2')

WebUI.waitForElementVisible(tableBefore, 10)

WebUI.waitForElementVisible(tableAfter, 10)

String beforeText = WebUI.getText(tableBefore)

String afterText = WebUI.getText(tableAfter)

String beforeNorm = normalizeTable(beforeText)

String afterNorm = normalizeTable(afterText)

WebUI.verifyEqual(beforeNorm, afterNorm)

WebUI.verifyElementText(findTestObject('Managing Item in Shopping cart Objects/Managing Item in Shopping cart checkout when logged in test case/li'), 
    'Thank you, your order has been submitted.')

WebUI.closeBrowser()

String normalizeTable(String raw) {
    if (raw == null) {
        return ''
    }
    
    String s = raw

    s = s.replaceAll('\\s+', ' ').trim()

    s = s.replaceAll('Order\\s+\\d+\\s+\\d{8}\\s+\\d{6}', 'Order <IGNORED>')

    return s
}

