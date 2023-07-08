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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    'Sign in')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Login or Sign Up - FEjobs/h1_Already Registered'), 
    'Already Registered?')

WebUI.setText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Login or Sign Up - FEjobs/input_or_LoginEmail'), 
    'johnlee11@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Login or Sign Up - FEjobs/input_or_LoginPassword'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Login or Sign Up - FEjobs/input_Forgotten password_Log in'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Login or Sign Up - FEjobs/input_Forgotten password_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Dashboard/a_Dashboard'), 
    'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Dashboard/a_Edit profile'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Dashboard/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Dashboard/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_software'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_software'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.fejobs.com/employers/education-recruitment-software'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Education Recruitment Software  FEjobs/h2_Further education recruitment software'), 
    'Further education recruitment software')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Education Recruitment Software  FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Education Recruitment Software  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_services'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_services'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.fejobs.com/employers/services/'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Education Services  FEjobs/h2_Our services'), 
    'Our services')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Education Services  FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Education Services  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_education recruitment solutions'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_education recruitment solutions'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.fejobs.com/employers/explore-packages'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Explore Packages  FEjobs/h2_Advertise better, smarter, faster'), 
    'Advertise better, smarter, faster')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Explore Packages  FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Explore Packages  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_latest jobs'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_latest jobs'))

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.fejobs.com/jobs'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_College and teaching jobs - FEjobs/h1_College and teaching jobs'), 
    'College and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_College and teaching jobs - FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_College and teaching jobs - FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_About Us'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_About Us'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.fejobs.com/about-us'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_About us  FEjobs/h1_About us'), 
    'About us')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_About us  FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_About us  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Who we are'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Who we are'))

Thread.sleep(2000)

url6 = WebUI.getUrl()

url6_actual = 'https://www.fejobs.com/about-us'

WebUI.verifyMatch(url6_actual, url6, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_About us  FEjobs/h1_About us'), 
    'About us')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_About us  FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_About us  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Contact us'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Contact us'))

Thread.sleep(2000)

url7 = WebUI.getUrl()

url7_actual = 'https://www.fejobs.com/contact-us'

WebUI.verifyMatch(url7_actual, url7, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Contact Us/h1_Contact us'), 
    'Contact us')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Contact Us/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Contact Us/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Mission and vision'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Mission and vision'))

Thread.sleep(2000)

url8 = WebUI.getUrl()

url8_actual = 'https://www.fejobs.com/mission-and-vision'

WebUI.verifyMatch(url8_actual, url8, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Mission and vision  Eteach/h1_Mission and vision'), 
    'Mission and vision')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Mission and vision  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Mission and vision  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Partners'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Partners'))

Thread.sleep(2000)

url10 = WebUI.getUrl()

url10_actual = 'https://www.fejobs.com/our-partners'

WebUI.verifyMatch(url10_actual, url10, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Our Partners/h1_Our Partners'), 
    'Our Partners')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Our Partners/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Our Partners/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Terms and conditions'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Terms and conditions'))

Thread.sleep(2000)

url11 = WebUI.getUrl()

url11_actual = 'https://www.fejobs.com/terms-and-conditions'

WebUI.verifyMatch(url11_actual, url11, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Terms and Conditions/h1_Terms and Conditions'), 
    'Terms and Conditions')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Terms and Conditions/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Terms and Conditions/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Privacy policy'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Privacy policy'))

Thread.sleep(2000)

url12 = WebUI.getUrl()

url12_actual = 'https://www.fejobs.com/privacy-policy'

WebUI.verifyMatch(url12_actual, url12, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Privacy policy/h2_PRIVACY POLICY'), 
    'PRIVACY POLICY')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Privacy policy/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Privacy policy/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Cookies'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Cookies'))

Thread.sleep(2000)

url13 = WebUI.getUrl()

url13_actual = 'https://www.fejobs.com/cookies'

WebUI.verifyMatch(url13_actual, url13, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Cookie policy  FEjobs/h1_Cookie Policy'), 
    'Cookie Policy')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Cookie policy  FEjobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_Cookie policy  FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Accessibility'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Accessibility'))

Thread.sleep(2000)

url14 = WebUI.getUrl()

url14_actual = 'https://www.fejobs.com/accessibility'

WebUI.verifyMatch(url14_actual, url14, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_accessibility/h1_Accessibility'), 
    'Accessibility')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_accessibility/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_accessibility/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Connect with us_inline-flex items-center _83c404'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Connect with us_inline-flex items-center _83c404_1'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/div_Connect with us_sci flex mb-4'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/div_Connect with us_sci flex mb-4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Connect with us_inline-flex items-center _eb65bc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_0845 226 1906'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_Send us a message'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Footer_SignInUser/Page_FE lecturing and teaching jobs/a_1 Arlington Square, Bracknell, Berkshire _a319e5'), 
    0)

WebUI.closeBrowser()

