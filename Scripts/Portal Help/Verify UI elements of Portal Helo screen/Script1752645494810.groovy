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

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Portal Help/button_Transact Online Guide'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/h3_I need help with Transacting'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Explore answers to common questions about_e955db'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/h2_What is TransactOnline'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/h2_What is TransactOnline'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_TransactOnline is an efficient means of i_4a43f2'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Portal Help/p_The transaction options available to you _fae99f'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_The transaction options available to you _fae99f'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/div_What is a Contribution'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Contributions allow you to add additional_f100ec'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_The lump sum would be paid either by elec_dbe3ce'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/h2_What is a Withdrawal'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_A withdrawal will redeem units in the sel_323c6e'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Some investment types, such as Living Ann_efcd4f'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Portal Help/div_What is a Switch'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Portal Help/h2_What is a Withdrawal'), 0)

WebUI.click(findTestObject('Object Repository/Page_Portal Help/div_What is a Switch'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_A switch instruction is a way to move mon_fecb20'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Switch instructions between different Man_ea3718'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/div_What is a Debit Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Creating a debit order is a convenient wa_9d82d0'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Please allow a few days for this process._0739bb'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/h2_What is a Regular Withdrawal'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Creating a regular withdrawal is a conven_02ee5a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Note that there may be tax consequences r_313146'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/h2_Important Information about CIS Investments'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Collective Investment Schemes in Securiti_91312a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_The value may go up as well as down and p_fab60b'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Portal Help/p_Forward pricing is used. The Funds Total _c0bf81'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_The total return is made up of interest r_aa31ac'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_A Feeder Fund is a portfolio that invests_c92f94'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Portal Help/h2_What is a Politically Exposed Person (PEP)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Portal Help/h2_What is a Politically Exposed Person (PEP)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_A Politically Exposed Person is someone w_667bcc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_If you believe yourself to have become a _3ea4c5'))

WebUI.click(findTestObject('Object Repository/Page_Portal Help/div_Where to get Further Assistance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_Before making investment decisions please_f1acf4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Portal Help/p_If you have any trouble with this Portal _deb557'))

