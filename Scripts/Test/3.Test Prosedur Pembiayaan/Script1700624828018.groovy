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

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Cara Pembayaran Angsuran Pembiayaan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/1.png')

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/span_Cara Pembayaran Angsuran Pembiayaan_btn-title'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/span_Cara Pembayaran Angsuran Pembiayaan_btn-title'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Persyaratan Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/2.png')

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Suku Bunga'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/3.png')

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Simulasi Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/4.png')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/select_Pilih                               _5f2a32'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/select_PilihSedanMinibusJeep'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/select_Pilih Jenis Mobil                   _9450ef'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/input_Harga(Rp)_harga'), 
    '10000000000')

WebUI.setText(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/input_Uang Muka(Rp)_uangmuka'), 
    '500000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/select_Pilih Tenor12243648'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/select_Pilih WilayahWilayah 1(Sumatera dan _2e8d3f'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/input_Wilayah Asuransi_submit-contact'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_/input_Rp.4.893.900.000,00_btn input-submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/5.png')

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Daftar Rekanan Asuransi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/6.png')

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/span_Cara Pembayaran Angsuran Pembiayaan_btn-title'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/span_Cara Pembayaran Angsuran Pembiayaan_btn-title'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/span_Cara Pembayaran Angsuran Pembiayaan_btn-title'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/span_Cara Pembayaran Angsuran Pembiayaan_btn-title'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/span_Cara Pembayaran Angsuran Pembiayaan_btn-title'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Aplikasi Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/7.png')

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Dokumen Persyaratan Pengambilan BPKB'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/8.png')

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Test Prosedur Pembiayaan/Page_Mitsui Leasing Capital Indonesia/a_Formulir Permohonan Pengecekan Data'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/3.Test Prosedur Pembiayaan/9.png')

WebUI.closeBrowser()

