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

WebUI.callTestCase(findTestCase('Login/Direct Investor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/small_Total Value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/small_Total Value_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Retirement Annuity'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/small_Total Value_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Employee Benefit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/small_Total Value_1_2_3'))

WebUI.scrollToElement(findTestObject('Page_Investor Summary Dashboard/h5_Securities Account'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/h2_Pending Transactions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/div_View_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/h2_Portfolio Overview'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/h5_Unit Trust Investments'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/h5_Retirement Annuity'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/h5_Employee Benefit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Performance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_What would you like to do next'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_New Investment'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_New Investment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Contribute'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Switch'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Withdraw'))

WebUI.closeBrowser()

