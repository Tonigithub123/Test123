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

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_02_KomentarSaran'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/1.Komentar Saran.png')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_03_input Komentar Saran name'), 
    'ASASSAS')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_04_input_Komentar Saran'), 
    'QWQWQWQW')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_05_input Komentar Saran message'), 
    'sazxcqwe')

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/2.Komentar Saran yang sudah diinput.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_06_Hubungi Kami'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/3.Hubungi Kami.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_07_Prosedur Pengaduan Konsumen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/4.Prosedur Pengaduan Konsumen.png')

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_08_Pilih cabang'), 
    '13', true)

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/5.Pilih Cabang 1.png')

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_08_Pilih cabang'), 
    '9', true)

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/6.Pilih Cabang 2.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_09_Lembaga Alternatif Penyelesaian Sengketa (LAPS)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/7.Lembaga Alternatif Penyelesaian sengketa(LAPS).png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP04_Website MLCI_AS_Layanan Konsumen_Lengkap/Website MLCI_10_Ringkasan Informasi Produk dan Layanan Ve_100725'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/4.Test Layanan Konsumen/8.Ringkasan Informasi Produk dan Layanan.png')

WebUI.closeBrowser()

