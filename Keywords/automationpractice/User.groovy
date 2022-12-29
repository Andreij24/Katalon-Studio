package automationpractice

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class User {
	/**
	 * Login to CURA Healthcare Service
	 * @param username for logging in	
	 * @param password for logging in
	 */

	@Keyword
	def Login(String username, String password) {
		WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_KatalonWebsite/button_Make Appointment'))
		WebUI.setText(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Username'), username)
		WebUI.setText(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/input_Password'), password)
		WebUI.click(findTestObject('Page_katalon-demo-cura - Website/Page_Login - KatalonWebsite/button_Login'))
	}
	/**
	 * Logout from CURA Healthcare Service
	 */

	@Keyword
	def Logout() {
		WebUI.closeBrowser()
	}
}
