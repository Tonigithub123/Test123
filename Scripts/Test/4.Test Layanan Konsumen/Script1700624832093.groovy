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

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_KomentarSaran'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/4.Test Layanan Konsumen/1.png')

WebUI.setText(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/input_KomentarSaran_name'), 
    'Toni')

WebUI.setText(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/input_KomentarSaran_email'), 
    'ahmadsultoni@gmail.com')

WebUI.setText(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/textarea_KomentarSaran_message'), 
    'Semangat')

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/input_KomentarSaran_submit-comment'))

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_Contact Us'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/4.Test Layanan Konsumen/2.png')

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_Prosedur Pengaduan Konsumen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/4.Test Layanan Konsumen/3.png')

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_Lembaga Alternatif Penyelesaian Sengketa (LAPS)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/4.Test Layanan Konsumen/4.png')

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/Test Layanan Konsumen/Page_Mitsui Leasing Capital Indonesia/a_Ringkasan Informasi Produk dan Layanan Ve_100725'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/4.Test Layanan Konsumen/5.png')

WebUI.closeBrowser()

