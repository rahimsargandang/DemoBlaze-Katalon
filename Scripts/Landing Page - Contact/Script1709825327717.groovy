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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Contact'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/div_New message'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_New message'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/div_Contact Email                          _7ccb06'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Contact Email                          _7ccb06'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/label_Contact Email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/input_Contact Email_recipient-email'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/div_Contact Name'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Contact Name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/label_Contact Name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/input_Contact Name_recipient-name'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/div_Message'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Message'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/label_Message'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/textarea_Message_message-text'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/div_Close          Send message'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/div_Close          Send message'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/button_Close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/button_Send message'))

WebUI.closeBrowser()

