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

WebUI.navigateToUrl('https://www.mitsuilease.co.id/')

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/div_Connect_dolphin-chat-icon'))

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Do you have questions Come chat with _33a405'), 
    'adasfas')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_land Islands_dolphin-telephone'), 
    '+6281232445')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_land Islands_dolphin-email'), 
    'sgsdgg@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/button_Please tell us about yourself_dolphi_fa9299'))

WebUI.closeBrowser()

