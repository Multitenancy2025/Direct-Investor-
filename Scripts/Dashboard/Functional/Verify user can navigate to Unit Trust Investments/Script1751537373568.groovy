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

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Unit Trust Investments'), 
    0)

WebUI.click(findTestObject('Page_Investor Summary Dashboard/div_View_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/h3_My Investments'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/h4_Unit Trust Investments'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Current Holdings'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Investor Reporting'))

WebUI.rightClick(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Activity Summary'))

WebUI.click(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Investor Reporting'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Unit Trust Investments/button_Activity Summary'))

WebUI.closeBrowser()

