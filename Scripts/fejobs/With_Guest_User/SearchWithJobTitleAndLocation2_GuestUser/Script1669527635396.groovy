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

WebUI.click(findTestObject('Object Repository/OR_SearchWithJobTitleAndLocation2_GuestUser/Page_FE lecturing and teaching jobs/input_The 1 job site for Further Education__727720'))

WebUI.click(findTestObject('Object Repository/OR_SearchWithJobTitleAndLocation2_GuestUser/Page_FE lecturing and teaching jobs/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.setText(findTestObject('Object Repository/OR_SearchWithJobTitleAndLocation2_GuestUser/Page_FE lecturing and teaching jobs/input_The 1 job site for Further Education__727720'), 
    'English Teacher')

WebUI.setText(findTestObject('Object Repository/OR_SearchWithJobTitleAndLocation2_GuestUser/Page_FE lecturing and teaching jobs/input_The 1 job site for Further Education__1b4861'), 
    'London')

WebUI.click(findTestObject('Object Repository/OR_SearchWithJobTitleAndLocation2_GuestUser/Page_FE lecturing and teaching jobs/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_SearchWithJobTitleAndLocation2_GuestUser/Page_English Teacher jobs - FEjobs/h1_English Teacher jobs'), 
    'English Teacher jobs')

WebUI.click(findTestObject('Object Repository/OR_SearchWithJobTitleAndLocation2_GuestUser/Page_English Teacher jobs - FEjobs/img'))

WebUI.closeBrowser()

