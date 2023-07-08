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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    'Sign in')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Login or Sign Up - FEjobs/h1_Already Registered'), 
    'Already Registered?')

WebUI.setText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Login or Sign Up - FEjobs/input_or_LoginEmail'), 
    'johnlee11@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Login or Sign Up - FEjobs/input_or_LoginPassword'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Login or Sign Up - FEjobs/input_Forgotten password_Log in'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Login or Sign Up - FEjobs/input_Forgotten password_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Dashboard/a_Dashboard'), 
    'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Dashboard/a_Edit profile'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Dashboard/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Dashboard/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Learning Support (133)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Learning Support (133)'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.fejobs.com/jobs/learning-support'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Learning Support Jobs  FEjobs/h1_Learning Support Jobs'), 
    'Learning Support Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Learning Support Jobs  FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Learning Support Jobs  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by location'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by location'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Winchester (17)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Winchester (17)'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.fejobs.com/jobs/winchester/?oo=lf5'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_jobs in Winchester - FEjobs/h1_jobs in Winchester'), 
    'jobs in Winchester')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_jobs in Winchester - FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_jobs in Winchester - FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by subject'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by subject'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_English (67)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_English (67)'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.fejobs.com/jobs/english'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_English Jobs  FEjobs/h1_English Jobs'), 
    'English Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_English Jobs  FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_English Jobs  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by institution'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by institution'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Academy (201)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Academy (201)'))

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.fejobs.com/jobs/academy/?oo=ins'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Academy jobs - FEjobs/h1_Academy jobs'), 
    'Academy jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Academy jobs - FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Academy jobs - FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by phase'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs by phase'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Higher Education (40)'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/a_Higher Education (40)'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.fejobs.com/jobs/higher-education'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Higher Education Jobs  FEjobs/h1_Higher Education Jobs'), 
    'Higher Education Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Higher Education Jobs  FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_Higher Education Jobs  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/button_Sign out'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/button_Sign out'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_MiddleFilter_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    'Sign in')

WebUI.closeBrowser()