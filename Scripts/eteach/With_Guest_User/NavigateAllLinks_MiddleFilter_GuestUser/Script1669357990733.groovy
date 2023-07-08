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

WebUI.navigateToUrl('https://www.eteach.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Teaching Assistant (610)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Teaching Assistant (610)'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.eteach.com/jobs/teaching-assistant'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching Assistant Jobs  Eteach/h1_Teaching Assistant Jobs'), 
    'Teaching Assistant Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching Assistant Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching Assistant Jobs  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by location'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by location'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_London (360)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_London (360)'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.eteach.com/jobs/london'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_London Jobs  Eteach/h1_London Jobs'), 
    'London Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_London Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_London Jobs  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by subject'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by subject'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Engineering  Technology (24)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Engineering  Technology (24)'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.eteach.com/jobs/engineering--and--technology'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Engineering  Technology Jobs  Eteach/h1_Engineering  Technology Jobs'), 
    'Engineering & Technology Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Engineering  Technology Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Engineering  Technology Jobs  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by institution'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by institution'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Independent School (185)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Independent School (185)'))

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.eteach.com/jobs/independent-school/?oo=ins'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Independent School jobs - Eteach/h1_Independent School jobs'), 
    'Independent School jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Independent School jobs - Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Independent School jobs - Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by phase'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by phase'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Secondary (1,742)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Secondary (1,742)'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.eteach.com/jobs/secondary'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Secondary Jobs  Eteach/h1_Secondary Jobs'), 
    'Secondary Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Secondary Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_GuestUser/Page_Secondary Jobs  Eteach/img'))

WebUI.closeBrowser()