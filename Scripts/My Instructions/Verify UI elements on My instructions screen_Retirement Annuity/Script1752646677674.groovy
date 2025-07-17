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

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/a_My Instructions'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Instructions/h3_My Instructions'), 0)

WebUI.click(findTestObject('Object Repository/Page_My Instructions/button_Retirement Annuity'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Instructions/span_Prescient Retirement Annuity FundPRA00194'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Instructions/h3_Debit Orders'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Instructions/span_Start Date'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Instructions/span_End Date'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Instructions/span_Amount'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Instructions/span_Allocation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Instructions/span_Fund Name'))

WebUI.closeBrowser()

