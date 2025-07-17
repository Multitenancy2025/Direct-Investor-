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

WebUI.click(findTestObject('Object Repository/Page_Transactions/span_Withdrawal'))

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/div_Select_react-select__input-container cs_9cc69a'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Withdrawal/div_Select_react-select__input-container cs_9cc69a'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/span_Prescient Unit Trust Investments (PRE0_38315a'))

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/div_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Withdrawal/td_Prescient Corporate Money Market Fund B2'), 0)

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/div_Select_react-select__input-container cs_9cc69a_1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Withdrawal/div_Prescient Income Provider Fund - B3'))

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/div_Prescient Income Provider Fund - B3_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Withdrawal/label_Once-off Withdrawal'), 0)

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/label_Once-off Withdrawal'))

WebUI.setText(findTestObject('Object Repository/Page_Withdrawal/input_R_onceOffWithdrawal0.amount'), '500')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Withdrawal/div_Next_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/div_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Withdrawal/div_Confirm Details'))

