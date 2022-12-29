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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.delay(1)

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_KatalonWebsite/button_Make Appointment'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), 'John Dork')

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'))

WebUI.sendKeys(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), Keys.chord(
        Keys.DELETE))

WebUI.sendKeys(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), 'Doe')

WebUI.setEncryptedText(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/button_Login'))

WebUI.delay(2)

WebUI.rightClick(findTestObject('Page_katalon-demo-cura - Website/Page_KatalonWebsite/button_Make Appointment'))

WebUI.delay(3)

WebUI.closeBrowser()

