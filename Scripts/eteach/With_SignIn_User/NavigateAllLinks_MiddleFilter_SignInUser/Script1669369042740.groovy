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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 
    'Sign in')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Login or Sign Up - Eteach/input_or_LoginEmail'), 
    'johnlee11@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Login or Sign Up - Eteach/input_or_LoginPassword'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Login or Sign Up - Eteach/input_Forgotten password_Log in'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Login or Sign Up - Eteach/input_Forgotten password_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Dashboard/a_Dashboard'), 
    'Dashboard')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Dashboard/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Dashboard/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_Teacher (906)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_Teacher (906)'))

Thread.sleep(2000)

url1 = WebUI.getUrl()
url1_actual = 'https://www.eteach.com/jobs/teacher'
WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teacher Jobs  Eteach/h1_Teacher Jobs'), 
    'Teacher Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teacher Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teacher Jobs  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by location'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by location'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_United Arab Emirates (24)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_United Arab Emirates (24)'))

Thread.sleep(2000)

url2 = WebUI.getUrl()
url2_actual = 'https://www.eteach.com/jobs/united-arab-emirates'
WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_United Arab Emirates Jobs  Eteach/h1_United Arab Emirates Jobs'), 
    'United Arab Emirates Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_United Arab Emirates Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_United Arab Emirates Jobs  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by subject'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by subject'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_ICT (56)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_ICT (56)'))

Thread.sleep(2000)

url3 = WebUI.getUrl()
url3_actual = 'https://www.eteach.com/jobs/ict'
WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_ICT Jobs  Eteach/h1_ICT Jobs'), 
    'ICT Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_ICT Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_ICT Jobs  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by institution'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by institution'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_Academy (944)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_Academy (944)'))

Thread.sleep(2000)

url4 = WebUI.getUrl()
url4_actual = 'https://www.eteach.com/jobs/academy/?oo=ins'
WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Academy jobs - Eteach/h1_Academy jobs'), 
    'Academy jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Academy jobs - Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Academy jobs - Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by phase'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs by phase'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_Preparatory (119)'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_Preparatory (119)'))

Thread.sleep(2000)

url5 = WebUI.getUrl()
url5_actual = 'https://www.eteach.com/jobs/preparatory'
WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Preparatory Jobs  Eteach/h1_Preparatory Jobs'), 
    'Preparatory Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Preparatory Jobs  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_MiddleFilter_SignInUser/Page_Preparatory Jobs  Eteach/img'))

WebUI.closeBrowser()