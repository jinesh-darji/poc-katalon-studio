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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_software'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_software'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.eteach.com/employers/education-recruitment-software'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Education Recruitment Software  Eteach/h2_Recruitment software'), 
    'Recruitment software')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Education Recruitment Software  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Education Recruitment Software  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_services'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_services'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.eteach.com/employers/services/'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Education Services  Eteach/h2_Our services'), 
    'Our services')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Education Services  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Education Services  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_education recruitment solutions'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_education recruitment solutions'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.eteach.com/employers/specialist-recruiters'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Specialist Recruiters  Eteach/h2_Delivering the best recruitment service'), 
    'Delivering the best recruitment service')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Specialist Recruiters  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Specialist Recruiters  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_latest jobs'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_latest jobs'))

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.eteach.com/jobs'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_School and teaching jobs - Eteach/h1_School and teaching jobs'), 
    'School and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_School and teaching jobs - Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_School and teaching jobs - Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_About Us'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_About Us'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.eteach.com/about-us'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_About us  Eteach/h1_About us'), 
    'About us')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_About us  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_About us  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Who we are'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Who we are'))

Thread.sleep(2000)

url6 = WebUI.getUrl()

url6_actual = 'https://www.eteach.com/about-us'

WebUI.verifyMatch(url6_actual, url6, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_About us  Eteach/h1_About us'), 
    'About us')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_About us  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_About us  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Contact us'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Contact us'))

Thread.sleep(2000)

url7 = WebUI.getUrl()

url7_actual = 'https://www.eteach.com/contact-us'

WebUI.verifyMatch(url7_actual, url7, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Contact us  Eteach/h1_Contact us'), 
    'Contact us')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Contact us  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Contact us  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Mission and vision'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Mission and vision'))

Thread.sleep(2000)

url8 = WebUI.getUrl()

url8_actual = 'https://www.eteach.com/mission-and-vision'

WebUI.verifyMatch(url8_actual, url8, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Mission and vision  Eteach/h1_Mission and vision'), 
    'Mission and vision')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Mission and vision  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Mission and vision  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Work for us'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Work for us'))

Thread.sleep(2000)

url9 = WebUI.getUrl()

url9_actual = 'https://eteachgroup.recruitee.com/'

WebUI.verifyMatch(url9_actual, url9, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Careers - Jobs - Eteach Group/h2_Welcome to the Eteach Group Career Site'), 
    'Welcome to the Eteach Group Career Site')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Careers - Jobs - Eteach Group/a_Company website'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Careers - Jobs - Eteach Group/a_Company website'))

WebUI.switchToWindowTitle('Teaching jobs and Recruitment - Eteach')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Partners'),30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Partners'))

Thread.sleep(2000)

url10 = WebUI.getUrl()

url10_actual = 'https://www.eteach.com/our-partners'

WebUI.verifyMatch(url10_actual, url10, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Our Partners  Eteach/h1_Our Partners'), 
    'Our Partners')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Our Partners  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Our Partners  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Terms and conditions'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Terms and conditions'))

Thread.sleep(2000)

url11 = WebUI.getUrl()

url11_actual = 'https://www.eteach.com/terms-and-conditions'

WebUI.verifyMatch(url11_actual, url11, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Eteach UK and International Terms and _8820a0/h1_Terms and Conditions'), 
    'Terms and Conditions')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Eteach UK and International Terms and _8820a0/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Eteach UK and International Terms and _8820a0/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Privacy policy'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Privacy policy'))

Thread.sleep(2000)

url12 = WebUI.getUrl()

url12_actual = 'https://www.eteach.com/privacy-policy'

WebUI.verifyMatch(url12_actual, url12, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Privacy policy  Eteach/h2_PRIVACY POLICY'), 
    'PRIVACY POLICY')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Privacy policy  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Privacy policy  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Cookies'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Cookies'))

Thread.sleep(2000)

url13 = WebUI.getUrl()

url13_actual = 'https://www.eteach.com/cookies'

WebUI.verifyMatch(url13_actual, url13, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Cookie policy  Eteach/h1_Cookie Policy'), 
    'Cookie Policy')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Cookie policy  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Cookie policy  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Accessibility'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Accessibility'))

Thread.sleep(2000)

url14 = WebUI.getUrl()

url14_actual = 'https://www.eteach.com/accessibility'

WebUI.verifyMatch(url14_actual, url14, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Accessibility statement  Eteach/h1_Accessibility'), 
    'Accessibility')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Accessibility statement  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Accessibility statement  Eteach/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Connect with us_inline-flex items-center _83c404'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/path_Connect with us_Path_14515'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/path_Connect with us_Path_14514'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Connect with us_inline-flex items-center _0376f1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/svg'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Connect with us_inline-flex items-center _eb65bc'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Connect with us_inline-flex items-center _eb65bc'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_0845 226 1906'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_Send us a message'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Footer_GuestUser/Page_Teaching jobs and Recruitment - Eteach/a_1 Arlington Square, Bracknell, Berkshire _a319e5'), 
    0)

WebUI.closeBrowser()

