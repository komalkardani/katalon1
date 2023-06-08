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

WebUI.navigateToUrl('https://ui.cogmento.com/')

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_Login_email (10)'), 'komal.k@simformsolutions.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cogmento CRM/input_Login_password (10)'), '65/Ef64GkYkZWvKQaZF9Sg==')

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/div_Login (10)'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/span_Contacts (4)'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/button_Create (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_First Name_first_name (6)'), 'Komal')

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_Last Name_last_name (6)'), 'Rajpara')

WebUI.setText(findTestObject('Object Repository/Page_Cogmento CRM/input_Middle Name(s)_middle_name (6)'), 'Chintan')

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/button_Save (5)'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/span_Contacts (5)'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/label (4)'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/i_Komal Chintan Rajpara_trash icon (2)'))

WebUI.click(findTestObject('Object Repository/Page_Cogmento CRM/button_Delete (4)'))

WebUI.closeBrowser()

