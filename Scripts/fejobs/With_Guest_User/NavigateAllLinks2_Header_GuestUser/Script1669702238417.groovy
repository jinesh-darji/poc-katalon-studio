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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Jobs'))

url1 = WebUI.getUrl()

url1_actual = 'https://www.fejobs.com/jobs'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_College and teaching jobs - FEjobs/h1_College and teaching jobs'), 
    'College and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_College and teaching jobs - FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_College and teaching jobs - FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Tutoring Opportunities'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Tutoring Opportunities'))

WebUI.switchToWindowTitle('Education Boutique | Eteach')

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.eteach.com/education-boutique'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Education Boutique  Eteach/h1_Education Boutique'), 
    'Education Boutique')

WebUI.switchToWindowTitle('FE lecturing and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Teacher Training'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Teacher Training'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.fejobs.com/fe-education-qualifications'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Education Qualifications/h1_FE LecturingQualifications'), 
    'FE Lecturing Qualifications')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Education Qualifications/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Education Qualifications/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Become an Adviser  New'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Become an Adviser  New'))

WebUI.switchToWindowTitle('Become an Adviser | Eteach')

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.eteach.com/education-advisers'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Become an Adviser  Eteach/h1_Eteach Education Advisers'), 
    'Eteach Education Advisers')

WebUI.switchToWindowTitle('FE lecturing and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_FAQs'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_FAQs'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.fejobs.com/jobseeker-faqs'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Jobseeker FAQs/h2_Most frequently asked jobseeker questions'), 
    'MOST FREQUENTLY ASKED JOBSEEKER QUESTIONS')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Jobseeker FAQs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Jobseeker FAQs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Institution Type'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Institution Type'))

Thread.sleep(2000)

url6 = WebUI.getUrl()

url6_actual = 'https://www.fejobs.com/browse-jobs/#jinst'

WebUI.verifyMatch(url6_actual, url6, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Browse Jobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Blog'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Blog'))

Thread.sleep(2000)

url7 = WebUI.getUrl()

url7_actual = 'https://www.fejobs.com/blog'

WebUI.verifyMatch(url7_actual, url7, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Blogs/input_More Options_term'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Blogs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Blogs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Location Guides'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Location Guides'))

Thread.sleep(2000)

url8 = WebUI.getUrl()

url8_actual = 'https://www.fejobs.com/location-guides'

WebUI.verifyMatch(url8_actual, url8, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FEjobs Location Guides/h1_Location Guides'), 
    'Location Guides')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FEjobs Location Guides/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FEjobs Location Guides/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Phases'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Phases'))

Thread.sleep(2000)

url9 = WebUI.getUrl()

url9_actual = 'https://www.fejobs.com/browse-jobs/#jphas'

WebUI.verifyMatch(url9_actual, url9, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Browse Jobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Employers'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Employers'))

Thread.sleep(2000)

url10 = WebUI.getUrl()

url10_actual = 'https://www.fejobs.com/employers'

WebUI.verifyMatch(url10_actual, url10, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Further Education Recruitment Solution_c19c73/h2_FEjobs is a further education technology_a701d9'), 
    'FEjobs is a further education technology business dedicated to providing online recruitment advertising and recruitment software to colleges across the UK')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Further Education Recruitment Solution_c19c73/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_Further Education Recruitment Solution_c19c73/img'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_GuestUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    'Sign in')

WebUI.closeBrowser()