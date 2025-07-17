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

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Transact'), 0)

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Transact'))

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/a_Transact Now'))

WebUI.click(findTestObject('Object Repository/Page_Transactions/span_New Investments'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_New Investment/h4_South African Unit Trust'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Invest Now'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment/div_Invest Now'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Next_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment/div_Select_react-select__indicator react-se_e5b04d_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Select_react-select__indicator react-se_e5b04d_1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_SMS'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Select_react-select__indicator react-se_e5b04d'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_ChildSpousal Support Payments'))

WebUI.scrollToElement(findTestObject('Page_New Investment/div_Next'), 0)

WebUI.click(findTestObject('Page_New Investment/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Select FundSelect. Select the funds you_22d704'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Prescient Balanced Fund - A2'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/label_Add a Lump Sum'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment/div_AmountRPlease enter an amount'), 0)

WebUI.setText(findTestObject('Object Repository/Page_New Investment/input_R_instruction0lump.amount'), '10000')

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment/button_Next_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Collect from my account'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Select a bank account_react-select__inp_72e609'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_FNB, 3778'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Confirm Details'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment - Summary/p_I confirm that I have authority to conclu_3e8c21'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_New Investment - Summary/label_I confirm that I have authority to co_290dd8'))

WebUI.click(findTestObject('Object Repository/Page_New Investment - Summary/label_I have read and fully understood the _9eae22'))

WebUI.click(findTestObject('Object Repository/Page_New Investment - Summary/label_I understand the risks associated wit_90ec3a'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment - Summary/div_Confirm'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Investment - Summary/div_Confirm'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_OTP/input_tel'), '0')

WebUI.callTestCase(findTestCase('CommonFields/Enter OTP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Page_OTP/input_tel_1'), '0')

not_run: WebUI.setText(findTestObject('Object Repository/Page_OTP/input_tel_1_2'), '0')

not_run: WebUI.setText(findTestObject('Object Repository/Page_OTP/input_tel_1_2_3'), '0')

not_run: WebUI.setText(findTestObject('Object Repository/Page_OTP/input_tel_1_2_3_4'), '0')

not_run: WebUI.setText(findTestObject('Page_OTP/input_tel_1_2_3_4 _5'), '0')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OTP/h3_Success'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OTP/p_Transaction Submitted'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OTP/p_Your transaction has been submitted, and _97f3ac'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OTP/div_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_OTP/div_Back to Dashboard'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/span_Total Investments'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Investor Summary Dashboard/h3_Welcome   NML'))

WebUI.closeBrowser()

