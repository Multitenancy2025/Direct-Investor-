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

WebUI.callTestCase(findTestCase('Transact/Common fields/Navigate to Transact'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transact/Common fields/Navigate to Transact Now'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Transactions/span_Switch'))

WebUI.click(findTestObject('Object Repository/Page_Switch/svg'))

WebUI.click(findTestObject('Object Repository/Page_Switch/span_Prescient Retirement Annuity Fund (PRA_b74cb8'))

WebUI.click(findTestObject('Object Repository/Page_Switch/div_Next'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Switch/td_Prescient Positive Return QuantPlus Fund - A1'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Switch/span_Switch From'), 0)

WebUI.click(findTestObject('Object Repository/Page_Switch/div_Select Fund to Switch from_react-select_69dc3b'))

WebUI.click(findTestObject('Object Repository/Page_Switch/div_Prescient Balanced Fund - B3'))

WebUI.setText(findTestObject('Object Repository/Page_Switch/input_R_switch.amount'), '1000')

WebUI.click(findTestObject('Object Repository/Page_Switch/div_Select_react-select__input-container cs_9cc69a'))

WebUI.click(findTestObject('Object Repository/Page_Switch/div_Prescient Balanced Fund - A2'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Switch/button_Next'), 0)

WebUI.click(findTestObject('Object Repository/Page_Switch/div_Next_1'))

WebUI.callTestCase(findTestCase('Transact/Common fields/Complete Terms and Conditions'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_New Investment - Summary/div_Confirm'))

WebUI.callTestCase(findTestCase('CommonFields/Enter OTP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OTP/h3_Success'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OTP/p_Transaction Submitted'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OTP/p_Your transaction has been submitted, and _97f3ac'))

WebUI.closeBrowser()

