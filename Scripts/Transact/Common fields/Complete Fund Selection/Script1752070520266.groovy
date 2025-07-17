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

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Select FundSelect. Select the funds you_22d704'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Prescient Balanced Fund - A2'))

WebUI.click(findTestObject('Object Repository/Page_New Investment/label_Add a Lump Sum'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment/div_AmountRPlease enter an amount'), 0)

WebUI.setText(findTestObject('Object Repository/Page_New Investment/input_R_instruction0lump.amount'), '10000')

WebUI.scrollToElement(findTestObject('Object Repository/Page_New Investment/button_Next_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_New Investment/div_Next_1_2'))

