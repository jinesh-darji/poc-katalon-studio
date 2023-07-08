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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 
    'Sign in')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Login or Sign Up - Eteach/h1_Already Registered'), 
    'Already Registered?')

WebUI.setText(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Login or Sign Up - Eteach/input_or_LoginEmail'), 
    'johnlee11@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Login or Sign Up - Eteach/input_or_LoginPassword'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Login or Sign Up - Eteach/input_Forgotten password_Log in'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Login or Sign Up - Eteach/input_Forgotten password_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Dashboard/a_Dashboard'), 
    'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Dashboard/a_Edit profile'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Dashboard/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Slider_SignInUser/Page_Dashboard/img'))

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Featured Jobs_swiper-pagination-bullet_e5321c'))

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Featured Jobs_swiper-pagination-bullet_e5321c'))

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/a_MIS, Recruitment and Admissions Assistant'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.eteach.com/job/mis-recruitment-and-admissions-assistant-1281505'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_MIS, Recruitment and Admissions Assist_4991c9/span_MIS, Recruitment and Admissions Assistant'), 
    'MIS, Recruitment and Admissions Assistant')

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_MIS, Recruitment and Admissions Assist_4991c9/img'))

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span'))

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span'))

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_1'))

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Teaching jobs and Recruitment - Eteach/img_SalaryBand 3135 - 40,26544,243 dep. on _cc7929'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://tefluk.com/partners/eteach'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Slider_SignInUser/Page_Eteach - TEFL UK/h1_Learn how to teach TEFL and kick-start y_32c0be'), 
    'Learn how to teach TEFL and kick-start your teaching career with our award winning, internationally recognized TEFL training')

WebUI.closeBrowser()