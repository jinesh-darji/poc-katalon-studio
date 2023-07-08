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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    'Sign in')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Login or Sign Up - FEjobs/h1_Already Registered'), 
    'Already Registered?')

WebUI.setText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Login or Sign Up - FEjobs/input_or_LoginEmail'), 
    'johnlee11@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Login or Sign Up - FEjobs/input_or_LoginPassword'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Login or Sign Up - FEjobs/input_Forgotten password_Log in'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Login or Sign Up - FEjobs/input_Forgotten password_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Dashboard/a_Dashboard'), 
    'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Dashboard/a_Edit profile'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Dashboard/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Dashboard/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Jobs'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.fejobs.com/jobs'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_College and teaching jobs - FEjobs/h1_College and teaching jobs'), 
    'College and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_College and teaching jobs - FEjobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_College and teaching jobs - FEjobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Tutoring Opportunities'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Tutoring Opportunities'))

WebUI.switchToWindowTitle('Education Boutique | Eteach')

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.eteach.com/education-boutique'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Education Boutique  Eteach/h1_Education Boutique'), 
    'Education Boutique')

WebUI.switchToWindowTitle('FE lecturing and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Teacher Training'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Teacher Training'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.fejobs.com/fe-education-qualifications'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Education Qualifications/h1_FE LecturingQualifications'), 
    'FE Lecturing Qualifications')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Education Qualifications/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Education Qualifications/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Become an Adviser  New'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Become an Adviser  New'))

WebUI.switchToWindowTitle('Become an Adviser | Eteach')

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.eteach.com/education-advisers'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Become an Adviser  Eteach/h1_Eteach Education Advisers'), 
    'Eteach Education Advisers')

WebUI.switchToWindowTitle('FE lecturing and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_FAQs'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_FAQs'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.fejobs.com/jobseeker-faqs'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Jobseeker FAQs/h2_Most frequently asked jobseeker questions'), 
    'MOST FREQUENTLY ASKED JOBSEEKER QUESTIONS')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Jobseeker FAQs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Jobseeker FAQs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Institution Type'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Institution Type'))

Thread.sleep(2000)

url6 = WebUI.getUrl()

url6_actual = 'https://www.fejobs.com/browse-jobs/#jinst'

WebUI.verifyMatch(url6_actual, url6, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Browse Jobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Blog'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Blog'))

Thread.sleep(2000)

url7 = WebUI.getUrl()

url7_actual = 'https://www.fejobs.com/blog'

WebUI.verifyMatch(url7_actual, url7, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Blogs/input_More Options_term'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Blogs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Blogs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Location Guides'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Location Guides'))

Thread.sleep(2000)

url8 = WebUI.getUrl()

url8_actual = 'https://www.fejobs.com/location-guides'

WebUI.verifyMatch(url8_actual, url8, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FEjobs Location Guides/h1_Location Guides'), 
    'Location Guides')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FEjobs Location Guides/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FEjobs Location Guides/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Phases'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Phases'))

Thread.sleep(2000)

url9 = WebUI.getUrl()

url9_actual = 'https://www.fejobs.com/browse-jobs/#jphas'

WebUI.verifyMatch(url9_actual, url9, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Browse Jobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Employers'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Employers'))

Thread.sleep(2000)

url10 = WebUI.getUrl()

url10_actual = 'https://www.fejobs.com/employers'

WebUI.verifyMatch(url10_actual, url10, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Further Education Recruitment Solution_c19c73/h2_FEjobs is a further education technology_a701d9'), 
    'FEjobs is a further education technology business dedicated to providing online recruitment advertising and recruitment software to colleges across the UK')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Further Education Recruitment Solution_c19c73/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Further Education Recruitment Solution_c19c73/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Dashboard'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Dashboard'))

Thread.sleep(2000)

url11 = WebUI.getUrl()

url11_actual = 'https://www.fejobs.com/jobseekers/dashboard'

WebUI.verifyMatch(url11_actual, url11, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Dashboard/a_Edit profile'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Dashboard/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Dashboard/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Edit Profile'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Edit Profile'))

Thread.sleep(2000)

url12 = WebUI.getUrl()

url12_actual = 'https://www.fejobs.com/jobseekers/aboutme'

WebUI.verifyMatch(url12_actual, url12, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_About me/h1_Profile'), 
    'Profile')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_About me/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_About me/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_CVResume'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_CVResume'))

Thread.sleep(2000)

url13 = WebUI.getUrl()

url13_actual = 'https://www.fejobs.com/jobseekers/your-cv'

WebUI.verifyMatch(url13_actual, url13, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Your CV account/button_Upload new CV Resume'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Your CV account/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Your CV account/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Preference Centre'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Preference Centre'))

Thread.sleep(2000)

url14 = WebUI.getUrl()

url14_actual = 'https://www.fejobs.com/jobseekers/preference-centre'

WebUI.verifyMatch(url14_actual, url14, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Preference centre/h1_Preference Centre'), 
    'Preference Centre')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Preference centre/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Preference centre/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Job Alerts'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Job Alerts'))

Thread.sleep(2000)

url15 = WebUI.getUrl()

url15_actual = 'https://www.fejobs.com/jobseekers/jobs-by-email'

WebUI.verifyMatch(url15_actual, url15, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Jobs by email/h1_Youve got mail'), 
    'You\'ve got mail')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Jobs by email/a_Create new job alert'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Jobs by email/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Jobs by email/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Saved Jobs'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Saved Jobs'))

Thread.sleep(2000)

url16 = WebUI.getUrl()

url16_actual = 'https://www.fejobs.com/jobseekers/shortlisted-jobs'

WebUI.verifyMatch(url16_actual, url16, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Shortlisted jobs/h1_Seen something you like'), 
    'Seen something you like?')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Shortlisted jobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Shortlisted jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Application History'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Application History'))

Thread.sleep(2000)

url17 = WebUI.getUrl()

url17_actual = 'https://www.fejobs.com/jobseekers/application-history'

WebUI.verifyMatch(url17_actual, url17, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Application History/h1_Take a look back'), 
    'Take a look back…')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Application History/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Application History/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Talent Pools'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Talent Pools'))

Thread.sleep(2000)

url18 = WebUI.getUrl()

url18_actual = 'https://www.fejobs.com/jobseekers/talent-pool-list'

WebUI.verifyMatch(url18_actual, url18, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Talent pool(s)/h1_Youre awesome, let great colleges find you'), 
    'You\'re awesome, let great colleges find you!')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Talent pool(s)/a_Join more talent pools'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Talent pool(s)/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_Talent pool(s)/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/button_Sign out'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/button_Sign out'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks2_Header_SignInUser/Page_FE lecturing and teaching jobs/span_Sign in'), 
    'Sign in')

WebUI.closeBrowser()