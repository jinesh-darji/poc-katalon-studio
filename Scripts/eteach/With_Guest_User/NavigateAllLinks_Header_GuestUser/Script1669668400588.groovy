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

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Jobs'))

Thread.sleep(2000)

url1 = WebUI.getUrl()

url1_actual = 'https://www.eteach.com/jobs'

WebUI.verifyMatch(url1_actual, url1, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_School and teaching jobs - Eteach/h1_School and teaching jobs'), 
    'School and teaching jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_School and teaching jobs - Eteach/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_School and teaching jobs - Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Supply Teaching'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Supply Teaching'))

Thread.sleep(2000)

url2 = WebUI.getUrl()

url2_actual = 'https://www.eteach.com/recruitment-agency'

WebUI.verifyMatch(url2_actual, url2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Agency for Teach_09d380/h3_Join Eteach'), 
    'Join Eteach')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Agency for Teach_09d380/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Agency for Teach_09d380/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Tutoring Opportunities'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Tutoring Opportunities'))

Thread.sleep(2000)

url3 = WebUI.getUrl()

url3_actual = 'https://www.eteach.com/education-boutique'

WebUI.verifyMatch(url3_actual, url3, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Boutique  Eteach/h1_Education Boutique'), 
    'Education Boutique')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Boutique  Eteach/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Boutique  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Teacher Training'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Teacher Training'))

Thread.sleep(2000)

url4 = WebUI.getUrl()

url4_actual = 'https://www.eteach.com/1st-steps-in-teaching'

WebUI.verifyMatch(url4_actual, url4, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_1st steps in my teaching career/h1_Your gateway into teaching'), 
    'Your gateway into teaching')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_1st steps in my teaching career/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_1st steps in my teaching career/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Become an Adviser  New'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Become an Adviser  New'))

Thread.sleep(2000)

url5 = WebUI.getUrl()

url5_actual = 'https://www.eteach.com/education-advisers'

WebUI.verifyMatch(url5_actual, url5, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Become an Adviser  Eteach/h1_Eteach Education Advisers'), 
    'Eteach Education Advisers')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Become an Adviser  Eteach/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Become an Adviser  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Permanent Recruitment'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Permanent Recruitment'))

Thread.sleep(2000)

url6 = WebUI.getUrl()

url6_actual = 'https://www.eteach.com/permanent-teaching'

WebUI.verifyMatch(url6_actual, url6, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Agency for Perma_f95c1b/h2_Permanent teaching'), 
    'Permanent teaching')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Agency for Perma_f95c1b/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Agency for Perma_f95c1b/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_International Recruitment'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_International Recruitment'))

Thread.sleep(2000)

url7 = WebUI.getUrl()

url7_actual = 'https://www.eteach.com/international'

WebUI.verifyMatch(url7_actual, url7, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_International Education Recruitment  Eteach/h3_International education recruitment specialists'), 
    'International education recruitment specialists')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_International Education Recruitment  Eteach/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_International Education Recruitment  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Career Pathways'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_ECT Community'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_ECT Community'))

Thread.sleep(2000)

url8 = WebUI.getUrl()

url8_actual = 'https://www.eteach.com/ect-home'

WebUI.verifyMatch(url8_actual, url8, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_ECT Community  Eteach Eteach/h1_Early Careers Teachers Community'), 
    'Early Careers Teachers Community')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_ECT Community  Eteach Eteach/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_ECT Community  Eteach Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_CPD'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_CPD'))

Thread.sleep(2000)

url9 = WebUI.getUrl()

url9_actual = 'https://www.eteach.com/watch-everything-ect-series'

WebUI.verifyMatch(url9_actual, url9, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Everything ECT webinar series  Eteach/h1_Everything ECT'), 
    'Everything ECT')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Everything ECT webinar series  Eteach/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Everything ECT webinar series  Eteach/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_FAQs'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_FAQs'))

Thread.sleep(2000)

url10 = WebUI.getUrl()

url10_actual = 'https://www.eteach.com/jobseeker-faqs'

WebUI.verifyMatch(url10_actual, url10, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Jobseeker FAQs/h1_Most frequently asked job seeker questions'), 
    'Most frequently asked job seeker questions')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Jobseeker FAQs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Jobseeker FAQs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Teaching in the UK'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Teaching in the UK'))

Thread.sleep(2000)

url11 = WebUI.getUrl()

url11_actual = 'https://www.eteach.com/coming-to-the-uk-from-overseas'

WebUI.verifyMatch(url11_actual, url11, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Coming to the UK from overseas/h1_Coming to the UK from overseas'), 
    'Coming to the UK from overseas')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Coming to the UK from overseas/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Coming to the UK from overseas/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Institution Type'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Institution Type'))

Thread.sleep(2000)

url12 = WebUI.getUrl()

url12_actual = 'https://www.eteach.com/browse-jobs/#jinst'

WebUI.verifyMatch(url12_actual, url12, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Browse Jobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Blog'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Blog'))

Thread.sleep(2000)

url13 = WebUI.getUrl()

url13_actual = 'https://www.eteach.com/blog'

WebUI.verifyMatch(url13_actual, url13, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Blogs/input_More Options_term'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Blogs/img'), 30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Blogs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Location Guides'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Location Guides'))

Thread.sleep(2000)

url14 = WebUI.getUrl()

url14_actual = 'https://www.eteach.com/location-guides'

WebUI.verifyMatch(url14_actual, url14, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Eteach Location Guides/h1_Location Guides'), 
    'Location Guides')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Eteach Location Guides/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Eteach Location Guides/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Phases'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Phases'))

Thread.sleep(2000)

url15 = WebUI.getUrl()

url15_actual = 'https://www.eteach.com/browse-jobs/#jphas'

WebUI.verifyMatch(url15_actual, url15, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Browse Jobs/h1_Browse Jobs'), 
    'Browse Jobs')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Browse Jobs/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Browse Jobs/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Resources'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Curriculum'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Curriculum'))

Thread.sleep(2000)

url16 = WebUI.getUrl()

url16_actual = 'https://www.eteach.com/national-curriculum'

WebUI.verifyMatch(url16_actual, url16, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_National Curriculum/h2_The National Curriculum'), 
    'THE NATIONAL CURRICULUM')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_National Curriculum/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_National Curriculum/img'))

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Employers'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Employers'))

Thread.sleep(2000)

url17 = WebUI.getUrl()

url17_actual = 'https://www.eteach.com/employers'

WebUI.verifyMatch(url17_actual, url17, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Solutions  Eteach/h1_Eteach is an education technology busine_147cbe'), 
    'Eteach is an education technology business dedicated to providing online recruitment advertising, direct recruitment services and recruitment software to more than 7,500 schools and colleges globally')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Solutions  Eteach/img'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Education Recruitment Solutions  Eteach/img'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/span_Sign in'), 
    'Sign in')

WebUI.waitForElementClickable(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/img_Jobs_darkhidden w-auto'), 
    30)

WebUI.click(findTestObject('Object Repository/OR_NavigateAllLinks_Header_GuestUser/Page_Teaching jobs and Recruitment - Eteach/img_Jobs_darkhidden w-auto'))

WebUI.closeBrowser()