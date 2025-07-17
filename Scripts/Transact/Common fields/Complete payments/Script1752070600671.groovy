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

WebUI.click(findTestObject('Object Repository/Page_New Investment/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Collect from my account'))

not_run: WebUI.rightClick(findTestObject('Object Repository/Page_New Investment/div_Payment TypeCollect from my account'))

not_run: WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Collect from my account_react-select__i_c529bd'))

not_run: WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Collect from my account_react-select__i_1aae62'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Select a bank account_react-select__inp_72e609'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_FNB, 3778'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Confirm Details'))

