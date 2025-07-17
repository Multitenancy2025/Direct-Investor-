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

WebUI.click(findTestObject('Object Repository/Page_Investor Summary Dashboard/a_Contact Us'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Contact Us/h3_Contact Us'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Get in Touch'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Have a question or need assistance Reach _34f670'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h3_Cape Town Office'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Contact Details'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Physical Address'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Prescient House           Westlake Busine_64164c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Yoshu House Westlake Business Park Otto C_40d299'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/a_021 700 3600'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/a_infoprescient.co.za'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/li_Fax 021 7000 3700'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/li_Toll-Free 0800 11 899'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h3_Johannesburg Office'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Contact Details_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Physical Address_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Postal Address'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Contact Us/p_Suite 7, First Floor'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Katherine  West'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_114 West Street,Sandton'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_2196'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h3_Stellenbosch Office'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Contact Details_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/a_infoprescient.co.za_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Physical Address_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_12 Herold Street'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Stellenbosch'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_7600'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h3_China Office'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Contact Details_1_2_3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/a_86 21 58770808'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/a_infoprescient.co.za_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/li_Fax 86 21 58771989'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Physical Address_1_2_3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Office 2851, Huaihai Plaza'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_No. 1045 Middle Huaihai Road'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Shanghai 200031'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Peoples Rebublic of China'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Postal Address_1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_No. 1045 Middle Huaihai Road_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Shanghai 200031_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Peoples Rebublic of China_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Contact Us/h3_Dublin Office'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Contact Details_1_2_3_4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/a_353 1 676 6959'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/a_infoprescient.ie'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/li_Fax 353 1 662 4276'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Physical Address_1_2_3_4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_49 Upper Mount Street'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Dublin 2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Ireland'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/h5_Postal Address_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_49 Upper Mount Street_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Dublin 2_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Contact Us/p_Ireland_1'))

not_run: WebUI.closeBrowser()

