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

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_My Investments'), 0)

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_My Investments'))

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/a_Unit Trust'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/h4_Unit Trust Investments'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Current Holdings'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Investor Reporting'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Activity Summary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Show Base Currency'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Show Zeros'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/h4_Unit Trust Investments'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/div_Transact'))

WebUI.rightClick(findTestObject('Object Repository/Page_My Unit Trust Investments/div_Instructions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Fund'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_of Portfolio'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Units'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Unit Price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Market Value'))

WebUI.click(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Investor Reporting'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/h4_Download Reports'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/h4_Download Reports'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Prescient Unit Trust Investments'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Select a report'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/h3_Download Unit Trust Investments Pricing _277175'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/div_Download'))

WebUI.click(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Activity Summary'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Total Unit Trust Investments'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Show Base Currency_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/span_Show Zeros_1'))

WebUI.closeBrowser()

