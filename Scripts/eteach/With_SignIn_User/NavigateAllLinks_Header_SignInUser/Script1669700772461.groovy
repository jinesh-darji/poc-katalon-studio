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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 
    'Sign in')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Login or Sign Up - Eteach/h1_Already Registered'), 
    'Already Registered?')

WebUI.setText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Login or Sign Up - Eteach/input_or_LoginEmail'), 
    'johnlee11@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Login or Sign Up - Eteach/input_or_LoginPassword'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Login or Sign Up - Eteach/input_Forgotten password_Log in'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Login or Sign Up - Eteach/input_Forgotten password_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Dashboard/a_Dashboard'), 
    'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Dashboard/a_Edit profile'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Dashboard/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Dashboard/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.eteach.com/jobs'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_School and teaching jobs - Eteach/h1_School and teaching jobs'), 
    'School and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_School and teaching jobs - Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_School and teaching jobs - Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Supply Teaching'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Supply Teaching'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.eteach.com/recruitment-agency'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Agency for Teach_09d380/h3_Join Eteach'), 
    'Join Eteach')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Agency for Teach_09d380/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Agency for Teach_09d380/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Tutoring Opportunities'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Tutoring Opportunities'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.eteach.com/education-boutique'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Boutique  Eteach/h1_Education Boutique'), 
    'Education Boutique')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Boutique  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Boutique  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Teacher Training'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Teacher Training'))

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.eteach.com/1st-steps-in-teaching'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_1st steps in my teaching career/h1_Your gateway into teaching'), 
    'Your gateway into teaching')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_1st steps in my teaching career/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_1st steps in my teaching career/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Become an Adviser  New'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Become an Adviser  New'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.eteach.com/education-advisers'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Become an Adviser  Eteach/h1_Eteach Education Advisers'), 
    'Eteach Education Advisers')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Become an Adviser  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Become an Adviser  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Permanent Recruitment'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Permanent Recruitment'))

Thread.sleep(2000)

url6 = WebUI.getUrl()

url6_actual = 'https://www.eteach.com/permanent-teaching'

WebUI.verifyMatch(url6_actual, url6, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Agency for Perma_f95c1b/h2_Permanent teaching'), 
    'Permanent teaching')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Agency for Perma_f95c1b/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Agency for Perma_f95c1b/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_International Recruitment'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_International Recruitment'))

Thread.sleep(2000)

url7 = WebUI.getUrl()

url7_actual = 'https://www.eteach.com/international'

WebUI.verifyMatch(url7_actual, url7, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_International Education Recruitment  Eteach/h3_International education recruitment specialists'), 
    'International education recruitment specialists')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_International Education Recruitment  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_International Education Recruitment  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_ECT Community'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_ECT Community'))

Thread.sleep(2000)

url8 = WebUI.getUrl()

url8_actual = 'https://www.eteach.com/ect-home'

WebUI.verifyMatch(url8_actual, url8, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_ECT Community  Eteach Eteach/h1_Early Careers Teachers Community'), 
    'Early Careers Teachers Community')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_ECT Community  Eteach Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_ECT Community  Eteach Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_CPD'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_CPD'))

Thread.sleep(2000)

url9 = WebUI.getUrl()

url9_actual = 'https://www.eteach.com/watch-everything-ect-series'

WebUI.verifyMatch(url9_actual, url9, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Everything ECT webinar series  Eteach/h1_Everything ECT'), 
    'Everything ECT')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Everything ECT webinar series  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Everything ECT webinar series  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_FAQs'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_FAQs'))

Thread.sleep(2000)

url10 = WebUI.getUrl()

url10_actual = 'https://www.eteach.com/jobseeker-faqs'

WebUI.verifyMatch(url10_actual, url10, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Jobseeker FAQs/h1_Most frequently asked job seeker questions'), 
    'Most frequently asked job seeker questions')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Jobseeker FAQs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Jobseeker FAQs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Teaching in the UK'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Teaching in the UK'))

Thread.sleep(2000)

url11 = WebUI.getUrl()

url11_actual = 'https://www.eteach.com/coming-to-the-uk-from-overseas'

WebUI.verifyMatch(url11_actual, url11, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Coming to the UK from overseas/h1_Coming to the UK from overseas'), 
    'Coming to the UK from overseas')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Coming to the UK from overseas/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Coming to the UK from overseas/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Institution Type'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Institution Type'))

Thread.sleep(2000)

url12 = WebUI.getUrl()

url12_actual = 'https://www.eteach.com/browse-jobs/#jinst'

WebUI.verifyMatch(url12_actual, url12, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Browse Jobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Blog'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Blog'))

Thread.sleep(2000)

url13 = WebUI.getUrl()

url13_actual = 'https://www.eteach.com/blog'

WebUI.verifyMatch(url13_actual, url13, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Blogs/input_More Options_term'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Blogs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Blogs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Location Guides'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Location Guides'))

Thread.sleep(2000)

url14 = WebUI.getUrl()

url14_actual = 'https://www.eteach.com/location-guides'

WebUI.verifyMatch(url14_actual, url14, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Eteach Location Guides/h1_Location Guides'), 
    'Location Guides')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Eteach Location Guides/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Eteach Location Guides/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Phases'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Phases'))

Thread.sleep(2000)

url15 = WebUI.getUrl()

url15_actual = 'https://www.eteach.com/browse-jobs/#jphas'

WebUI.verifyMatch(url15_actual, url15, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Browse Jobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Curriculum'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Curriculum'))

Thread.sleep(2000)

url16 = WebUI.getUrl()

url16_actual = 'https://www.eteach.com/national-curriculum'

WebUI.verifyMatch(url16_actual, url16, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_National Curriculum/h2_The National Curriculum'), 
    'THE NATIONAL CURRICULUM')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_National Curriculum/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_National Curriculum/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Employers'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Employers'))

Thread.sleep(2000)

url17 = WebUI.getUrl()

url17_actual = 'https://www.eteach.com/employers'

WebUI.verifyMatch(url17_actual, url17, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Solutions  Eteach/h1_Eteach is an education technology busine_147cbe'), 
    'Eteach is an education technology business dedicated to providing online recruitment advertising, direct recruitment services and recruitment software to more than 7,500 schools and colleges globally')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Solutions  Eteach/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Education Recruitment Solutions  Eteach/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Dashboard'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Dashboard'))

Thread.sleep(2000)

url18 = WebUI.getUrl()

url18_actual = 'https://www.eteach.com/jobseekers/dashboard'

WebUI.verifyMatch(url18_actual, url18, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Dashboard/a_Edit profile'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Dashboard/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Dashboard/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Edit Profile'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Edit Profile'))

Thread.sleep(2000)

url19 = WebUI.getUrl()

url19_actual = 'https://www.eteach.com/jobseekers/aboutme'

WebUI.verifyMatch(url19_actual, url19, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_About me/h1_Profile'), 
    'Profile')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_About me/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_About me/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_CVResume'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_CVResume'))

Thread.sleep(2000)

url20 = WebUI.getUrl()

url20_actual = 'https://www.eteach.com/jobseekers/your-cv'

WebUI.verifyMatch(url20_actual, url20, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Your CV account/button_Upload new CV Resume'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Your CV account/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Your CV account/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Preference Centre'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Preference Centre'))

Thread.sleep(2000)

url21 = WebUI.getUrl()

url21_actual = 'https://www.eteach.com/jobseekers/preference-centre'

WebUI.verifyMatch(url21_actual, url21, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Preference centre/h1_Preference Centre'), 
    'Preference Centre')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Preference centre/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Preference centre/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Job Alerts'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Job Alerts'))

Thread.sleep(2000)

url22 = WebUI.getUrl()

url22_actual = 'https://www.eteach.com/jobseekers/jobs-by-email'

WebUI.verifyMatch(url22_actual, url22, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Jobs by email/h1_Youve got mail'), 
    'You\'ve got mail')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Jobs by email/a_Create new job alert'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Jobs by email/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Jobs by email/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Saved Jobs'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Saved Jobs'))

Thread.sleep(2000)

url23 = WebUI.getUrl()

url23_actual = 'https://www.eteach.com/jobseekers/shortlisted-jobs'

WebUI.verifyMatch(url23_actual, url23, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Shortlisted jobs/h1_Seen something you like'), 
    'Seen something you like?')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Shortlisted jobs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Shortlisted jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Application History'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Application History'))

Thread.sleep(2000)

url24 = WebUI.getUrl()

url24_actual = 'https://www.eteach.com/jobseekers/application-history'

WebUI.verifyMatch(url24_actual, url24, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Application History/h1_Take a look back'), 
    'Take a look back…')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Application History/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Application History/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Talent Pools'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Talent Pools'))

Thread.sleep(2000)

url25 = WebUI.getUrl()

url25_actual = 'https://www.eteach.com/jobseekers/talent-pool-list'

WebUI.verifyMatch(url25_actual, url25, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Talent pool(s)/h1_Youre awesome, let great schools find you'), 
    'You\'re awesome, let great schools find you!')

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Talent pool(s)/a_Join more talent pools'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Talent pool(s)/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Talent pool(s)/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/div_JL'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/button_Sign out'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/button_Sign out'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_SignInUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 
    'Sign in')

WebUI.closeBrowser()