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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_PRODUCT STORE'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_Home (current)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_Contact'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_About us'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_Log in'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/a_Sign up'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/span_Previous_carousel-control-next-icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/span_Cart_carousel-control-prev-icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/img_Cart_d-block img-fluid'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_CATEGORIES'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_Phones'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_Laptops'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/a_Monitors'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/img_CATEGORIES_card-img-top img-fluid'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Samsung galaxy s6360The Samsung Galaxy _59570d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/img_360_card-img-top img-fluid'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Nokia lumia 1520820The Nokia Lumia 1520_ffd702'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/img_820_card-img-top img-fluid'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/div_Nexus 6650The Motorola Google Nexus 6 i_1f3be3'))

