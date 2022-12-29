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

WebUI.openBrowser('file:///C:/Users/mabel/Downloads/Katalon_Studio_Windows_64-8.5.2/Download-Sample-Site/learnks1-home.html')

WebUI.click(findTestObject('Alert Buttons/button_Open an ALERT box'))

if (WebUI.waitForAlert(1)) {
    println(WebUI.getAlertText())
}

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Alert Buttons/button_Open a CONFIRM box'))

if (WebUI.waitForAlert(1)) {
    println(WebUI.getAlertText())
}

WebUI.dismissAlert()

WebUI.delay(3)

WebUI.click(findTestObject('Alert Buttons/button_Open a PROMPT box'))

WebUI.waitForAlert(1)

WebUI.setAlertText('andrei')

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.closeBrowser()

