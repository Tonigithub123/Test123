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

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_01_FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/1.FAQ 1.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/2.FAQ 2.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/3.FAQ 3.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/4.FAQ 4.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/5.FAQ 5.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/6.FAQ 6.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/6.FAQ 6.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/7.FAQ 7.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/8.FAQ 8.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP06_Website MLCI_AS_FAQ_Lengkap/Website MLCI_02_span FAQ'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/6.Test FAQ/9.FAQ 9.png')

WebUI.closeBrowser()

