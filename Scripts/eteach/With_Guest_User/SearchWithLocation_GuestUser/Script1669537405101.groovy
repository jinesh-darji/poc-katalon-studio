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

WebUI.click(findTestObject('Object Repository/OR_SearchWithLocation_GuestUser/Page_Teaching jobs and Recruitment - Eteach/button_Cookie settings_onetrust-close-btn-h_cbb2a4'))

WebUI.setText(findTestObject('Object Repository/OR_SearchWithLocation_GuestUser/Page_Teaching jobs and Recruitment - Eteach/input_mic_none_mat-input-1'), 
    'London')

WebUI.click(findTestObject('Object Repository/OR_SearchWithLocation_GuestUser/Page_Teaching jobs and Recruitment - Eteach/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_SearchWithLocation_GuestUser/Page_School and teaching jobs - Eteach/h1_School and teaching jobs'), 
    'School and teaching jobs')

WebUI.click(findTestObject('Object Repository/OR_SearchWithLocation_GuestUser/Page_School and teaching jobs - Eteach/img'))

WebUI.closeBrowser()

