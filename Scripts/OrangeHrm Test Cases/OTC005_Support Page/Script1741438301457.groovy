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

WebUI.callTestCase(findTestCase('OrangeHrm Test Cases/OTC002_Login with Valid Credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-userdropdown-i'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/a_Support'), 0)

WebUI.click(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/a_Support'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/h6_Getting Started with OrangeHRM'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/p_Learning how to use a new application can be c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/p_Customer Support'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/p_Should you experience any issues, please do no'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Page/Page_OrangeHRM/i_oxd-icon bi-question-lg'), 
    0)

WebUI.closeBrowser()

