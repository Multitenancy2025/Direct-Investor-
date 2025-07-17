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

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/a_Retirement Annuity'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/h4_Retirement Annuity'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Prescient Retirement Annuity Fund'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Fund'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_of Portfolio'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Units'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Unit Price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Market Value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Show Base Currency'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Show Zeros'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/button_Investor Reporting'), 0)

WebUI.click(findTestObject('Object Repository/Page_My Retirement Annuity/button_Investor Reporting'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/h4_Download Reports'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Prescient Retirement Annuity Fund_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/div_Download'))

WebUI.click(findTestObject('Object Repository/Page_My Retirement Annuity/button_Activity Summary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Total Retirement Annuity'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/small_Total Value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Show Base Currency_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/span_Show Zeros_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_My Retirement Annuity/h4_Prescient Balanced Fund - B3PRA00194'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Retirement Annuity/h4_Prescient Balanced Fund - B3PRA00194'))

WebUI.closeBrowser()

