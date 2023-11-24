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

WebUI.navigateToUrl('https://ticketing.mitsuilease.co.id/index.php')

WebUI.setText(findTestObject('Object Repository/Test PR List/Page_MLCI - E-Ticketing/input_E-Ticketing_username'), 'ahmad_sultoni')

WebUI.setEncryptedText(findTestObject('Object Repository/Test PR List/Page_MLCI - E-Ticketing/input_E-Ticketing_password'), 
    'PFA+Z2vfs8T5XiOknglIKQ==')

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - E-Ticketing/i_E-Ticketing_icon-arrow-right icon-large'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - E-Ticketing/a_PR List'))

WebUI.switchToWindowTitle('MLCI - PR LIST')

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_HOME'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_PR List'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/input__search'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_Change Priority'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_Live'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/input_-_from'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/a_1'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/input_-_to'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/a_8'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/input_-_search'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_On Hand'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_In Progress'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/select_Allahmad_sultoniAndreas MichaelARDIA_d2b35b'), 
    '9074', true)

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_Finished'))

WebUI.click(findTestObject('Object Repository/Test PR List/Page_MLCI - PR LIST/span_LOGOUT'))

WebUI.closeBrowser()

