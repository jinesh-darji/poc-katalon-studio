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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Careers adviser (14)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Careers adviser (14)'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.fejobs.com/jobs/careers-adviser'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Careers Adviser Jobs  FEjobs/h1_Careers Adviser Jobs'), 
    'Careers Adviser Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Careers Adviser Jobs  FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Careers Adviser Jobs  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by location'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by location'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Cardiff (8)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Cardiff (8)'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.fejobs.com/jobs/cardiff'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Cardiff Jobs  FEjobs/h1_Cardiff Jobs'), 
    'Cardiff Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Cardiff Jobs  FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Cardiff Jobs  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by subject'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by subject'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Business Studies (53)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Business Studies (53)'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.fejobs.com/jobs/business-studies'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Business Studies Jobs  FEjobs/h1_Business Studies Jobs'), 
    'Business Studies Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Business Studies Jobs  FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Business Studies Jobs  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by institution'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by institution'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_University technology college'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_University technology college'))

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.fejobs.com/jobs/university-technology-college-utc/?oo=ins'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_University Technology College Utc jobs_a06495/h1_University Technology College Utc jobs'), 
    'University Technology College Utc jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_University Technology College Utc jobs_a06495/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_University Technology College Utc jobs_a06495/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by phase'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs by phase'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Sixth Form (1,053)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_FE lecturing and teaching jobs/a_Sixth Form (1,053)'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.fejobs.com/jobs/sixth-form'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Sixth Form Jobs  FEjobs/h1_Sixth Form Jobs'), 
    'Sixth Form Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Sixth Form Jobs  FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_GuestUser/Page_Sixth Form Jobs  FEjobs/img'))

WebUI.closeBrowser()