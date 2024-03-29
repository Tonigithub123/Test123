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

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP05_Website MLCI_AS_Karir_Lengkap/Website MLCI_01_KARIR'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/5.Test Karir/1.Karir.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP05_Website MLCI_AS_Karir_Lengkap/Website MLCI_02_span Karir'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/5.Test Karir/2.CCM.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP05_Website MLCI_AS_Karir_Lengkap/Website MLCI_02_span Karir'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/5.Test Karir/3.CPO.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP05_Website MLCI_AS_Karir_Lengkap/Website MLCI_02_span Karir'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/5.Test Karir/4.CRA.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP05_Website MLCI_AS_Karir_Lengkap/Website MLCI_02_span Karir'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/5.Test Karir/5.CMO.png')

WebUI.closeBrowser()

