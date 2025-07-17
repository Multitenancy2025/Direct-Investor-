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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.portal.prescientplatform.net/')

WebUI.waitForElementVisible(findTestObject('Login/button_Allow'), 5)

WebUI.click(findTestObject('Object Repository/Login/button_Allow'))

WebUI.setText(findTestObject('Object Repository/Login/Email Address'), 'nml_ifa@grr.la')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Password'), 'xg4icQonAS8J36vzIMfIIA==')

WebUI.click(findTestObject('Object Repository/Login/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/span_Welcome to'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/strong_Prescient'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/h3_Welcome   NML'))

