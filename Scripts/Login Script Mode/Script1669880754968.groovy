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

//Open Browser
WebUI.openBrowser(null)

WebUI.maximizeWindow()

//Navigate to website URL
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

//Click Make Appointment Button
WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_KatalonWebsite/button_Make Appointment'))

//Input username
WebUI.setText(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), 
    'John Doe')

//Input password
WebUI.setText(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Password'), 
    'ThisIsNotAPassword')

//Click login button
WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/button_Login'))

//Select facility **for this test, all 3 where clicked but Tokyo was lastly picked
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/select_Facility'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/select_Facility'), 
    'Seoul CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/select_Facility'), 
    'Tokyo CURA Healthcare Center', true)

//Check apply for readmission
WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Facility setup/checkbox_Hospital readmission'))

//Select Healthcare *for this test, all 3 where clicked but None was lastly picked
WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Healthcare setup/radio_BTN_Medicaid'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Healthcare setup/radio_BTN_Medicare'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Healthcare setup/radio_BTN_None'))

//Schedule Date
WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/input_set Visit Date'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_Month'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_Year'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_set_Year to 2024'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_set_Month to July'))

WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/Appointment_Date setup/button_set_Day to 24'))

//Set delay				
WebUI.delay(3)

//Book Appointment
WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/button_Book Appointment'))

//Click go to homepage
WebUI.click(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_Appointment - KatalonWebsite/button_Confirm Appointment_GTHomepage'))

//Verify if the element string "We Care About Your Health" is visible in the specific page
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_katalon-demo-cura - Website/Page_KatalonWebsite/An_element verification_String_We Care About Your Health'), 
    0)

WebUI.closeBrowser()

