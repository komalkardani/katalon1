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
//WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ui.cogmento.com/')
//WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_Login_email (4)'), Email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cogmento CRM/input_Login_password (4)'), Password)

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/div_Login (4)'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/a_Contacts'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/button_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_First Name_first_name (3)'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_Last Name_last_name (3)'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_Middle Name(s)_middle_name (3)'), MiddleName)

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_Company_search (3)'), CompanyName)

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/i_Save_save icon (1)'))

WebUI.closeBrowser()

