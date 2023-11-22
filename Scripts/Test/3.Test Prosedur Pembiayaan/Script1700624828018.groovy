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

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/1.Cara Pembayaran Angsuran Pembiayaan.png')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/2.Persyaratan Kredit.png')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/3.Suku Bunga.png')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/4.Simulasi Kredit.png')

WebUI.selectOptionByValue(findTestObject('null'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '1', true)

WebUI.setText(findTestObject('null'), 
    '10000000000')

WebUI.setText(findTestObject('null'), 
    '500000000')

WebUI.selectOptionByValue(findTestObject('null'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '2', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/5.Aplikasi Kredit Sudah diinput.png')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/6.Daftar Rekanan Asuransi.png')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/7.Aplikasi Kredit.png')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/8.Dokumen Persyaratan Pengambilan BPKB.png')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/9.Formulir Permohonan Pengecekan Data.png')

WebUI.closeBrowser()

