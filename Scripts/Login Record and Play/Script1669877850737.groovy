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

WebUI.navigateToUrl(GlobalVariable.AlertsURL)

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_KatalonWebsite/button_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/select_Facility'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/select_Facility'), 
    'Seoul CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/select_Facility'), 
    'Tokyo CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/checkbox_Hospital readmission'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Healthcare setup/radio_BTN_Medicaid'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Healthcare setup/radio_BTN_Medicare'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Healthcare setup/radio_BTN_None'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/input_set Visit Date'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_Month'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_Year'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_set_Year to 2024'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_set_Month to July'))

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_set_Day to 24'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/button_Confirm Appointment_GTHomepage'))

WebUI.verifyElementPresent(findTestObject('Page_katalon-demo-cura - Website/Page_KatalonWebsite/An_element verification_String_We Care About Your Health'), 
    0)

WebUI.closeBrowser()

