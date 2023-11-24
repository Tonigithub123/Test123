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

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/a_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/a_KomentarSaran'))

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/input_KomentarSaran_name'), 
    'ASASSAS')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/input_KomentarSaran_email'), 
    'QWQWQWQW')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/textarea_KomentarSaran_message'), 
    'sazxcqwe')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/a_Hubungi Kami'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/a_Prosedur Pengaduan Konsumen'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/select_---                                 _4d5531'), 
    '13', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/select_---                                 _4d5531'), 
    '9', true)

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/a_Lembaga Alternatif Penyelesaian Sengketa (LAPS)'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/a_Ringkasan Informasi Produk dan Layanan Ve_100725'))

WebUI.closeBrowser()

