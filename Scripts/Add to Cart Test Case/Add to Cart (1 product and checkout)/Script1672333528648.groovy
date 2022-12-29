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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Add to Cart Repo/Login Page/input_swagLabs_Username'), 'standard_user')

WebUI.setText(findTestObject('Add to Cart Repo/Login Page/input_swagLabs_Password'), 'secret_sauce', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add to Cart Repo/Login Page/button_swagLabs_Login'))

WebUI.verifyElementVisible(findTestObject('Add to Cart Repo/Products Page/Check the Text - Products'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Add to Cart Repo/Products Page/click_first_Product_array1'))

'Add to cart First product = Backpack'
WebUI.click(findTestObject('Add to Cart Repo/Products Page/button_backpack_Add to cart'))

WebUI.click(findTestObject('Add to Cart Repo/Products Page/icon_Shopping_Cart'))

WebUI.click(findTestObject('Add to Cart Repo/Products Page/button_Checkout'))

WebUI.delay(2)

WebUI.closeBrowser()

