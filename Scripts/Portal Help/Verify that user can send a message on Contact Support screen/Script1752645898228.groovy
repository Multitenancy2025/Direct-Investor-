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

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/a_Portal Help'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Portal Help/h3_Portal Help'), 0)

WebUI.click(findTestObject('Object Repository/Page_Portal Help/button_Contact Support'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/div_Please Select_react-select__input-conta_bf7886'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/div_Pages are slow or not loading'))

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/input_Name_name'), 'Sam')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/input_Contact Number_contact.contactNumber.number'), '081 345 5623')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/input_Email address_email'), 'themba@nml.co.za')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_p'), 'p')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pa'), 'pa')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pag'), 'pag')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_page'), 'page')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages'), 'pages')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages_1'), 'pages ')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages i'), 'pages i')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is'), 'pages is')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is_1'), 'pages is ')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is t'), 'pages is t')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is tq'), 'pages is tq')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is tqa'), 'pages is tqa')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is tq'), 'pages is tq')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is t'), 'pages is t')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is ta'), 'pages is ta')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is tak'), 'pages is tak')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taki'), 'pages is taki')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is takin'), 'pages is takin')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking'), 'pages is taking')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking_1'), 'pages is taking ')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking t'), 'pages is taking t')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to'), 'pages is taking to')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to_1'), 'pages is taking to ')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to l'), 'pages is taking to l')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to lo'), 'pages is taking to lo')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to lon'), 'pages is taking to lon')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long'), 'pages is taking to long')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long_1'), 'pages is taking to long ')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long t'), 'pages is taking to long t')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long to'), 'pages is taking to long to')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long to_1'), 'pages is taking to long to ')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long to l'), 'pages is taking to long to l')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long to lo'), 'pages is taking to long to lo')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long to loa'), 'pages is taking to long to loa')

WebUI.setText(findTestObject('Object Repository/Page_Portal Help/textarea_pages is taking to long to load'), 'pages is taking to long to load')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Portal Help/div_Send Message'), 0)

WebUI.click(findTestObject('Object Repository/Page_Portal Help/div_Send Message'))

