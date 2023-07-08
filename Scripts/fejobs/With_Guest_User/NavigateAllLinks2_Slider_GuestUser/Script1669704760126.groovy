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

WebUI.navigateToUrl('https://www.fejobs.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_FE lecturing and teaching jobs/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_FE lecturing and teaching jobs/a_Information Services Manager'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_FE lecturing and teaching jobs/a_Information Services Manager'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.fejobs.com/job/information-services-manager-1289094'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_Information Services Manager - FEjobs/span_Information Services Manager'), 
    'Information Services Manager')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_Information Services Manager - FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_Information Services Manager - FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_FE lecturing and teaching jobs/img_SalaryBand 3135 - 40,26544,243 dep. on _cc7929'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_FE lecturing and teaching jobs/img_SalaryBand 3135 - 40,26544,243 dep. on _cc7929'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.fejobs.com/careers/ttf'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_GuestUser/Page_/h3_Support the future of your industry'), 
    'SUPPORT THE FUTURE OF YOUR INDUSTRY')

WebUI.closeBrowser()

