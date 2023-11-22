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

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_02__Cara Angsuran Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_03_Persyaratan Kredit'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_04_Suku Bunga'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_05_Simulasi Kredit'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_06_Daftar Rekanan Asuransi'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_07_Aplikasi Kredit'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_08_Dokumen Persyaratan Pengambilan BPKB'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_01_Prosedur Pembiayaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP03_Website MLCI_AS_Prosedur Pembiayaan/Website MLCI_09_Formulir Permohonan Pengecekan Data'))

WebUI.closeBrowser()

