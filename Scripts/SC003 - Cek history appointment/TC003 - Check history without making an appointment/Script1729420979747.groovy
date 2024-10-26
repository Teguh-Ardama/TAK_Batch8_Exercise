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

WebUI.callTestCase(findTestCase('SC001 - Login/TC002 - Login success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/i_Navbar'))

WebUI.click(findTestObject('Navbar/a_History'))

WebUI.verifyElementPresent(findTestObject('History/h2_History'), 0)

WebUI.verifyElementVisible(findTestObject('History/p_No appointment'))

WebUI.verifyElementNotPresent(findTestObject('History/p_Result-Facility'), 0)

WebUI.verifyElementNotPresent(findTestObject('History/p_Result-Apply'), 0)

WebUI.verifyElementNotPresent(findTestObject('History/p_Result-Healthcare Program'), 0)

WebUI.verifyElementNotPresent(findTestObject('History/p_Result-Comment'), 0)

WebUI.closeBrowser()

