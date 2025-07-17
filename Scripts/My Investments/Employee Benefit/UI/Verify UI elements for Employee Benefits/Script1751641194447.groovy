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

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_My Investments'))

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/a_Employee Benefit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/h4_Employee Benefit'), 0)

WebUI.rightClick(findTestObject('Object Repository/Page_My Employee Benefit/span_Prescient Centralised Services (Pty) L_f740f5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/div_Transact'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/div_Instructions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Market Value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Unit Price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Units'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_of Portfolio'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Fund'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Show Base Currency'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Show Zeros'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/button_Investor Reporting'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/button_Activity Summary'))

WebUI.click(findTestObject('Object Repository/Page_My Employee Benefit/button_Investor Reporting'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/h4_Download Reports'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Prescient Centralised Services (Pty) L_f740f5_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/div_Download'))

WebUI.click(findTestObject('Object Repository/Page_My Employee Benefit/button_Activity Summary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Total Employee Benefit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/small_Total Value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Show Base Currency_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/span_Show Zeros_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Employee Benefit/h4_Long Beach Managed Prescient Fund - A1PLUF00003'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_My Employee Benefit/h4_Long Beach Managed Prescient Fund - A1PLUF00003'), 
    0)

WebUI.closeBrowser()

