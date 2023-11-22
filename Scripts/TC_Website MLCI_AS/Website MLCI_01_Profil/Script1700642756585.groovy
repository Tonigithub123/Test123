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

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/1.Beranda.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_02_Tentang Mitsui Leasing'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/2.Tentang Mitsui.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_03_Misi, Visi dan Nilai'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/3.Visi, Misi dan Nilai.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_04_Struktur Organisasi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/4.Struktur Organisasi.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_05_Manajemen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/5.Manajemen.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_06_Laporan Tahunan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/6.Laporan Tahunan.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_07_Tata Kelola'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/7.Tata Kelola.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_08_Kegiatan Perusahaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_09_Tanggung Jawab Sosial Lingkungan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/8.Tanggung Jawab Sosial Lingkungan.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_08_Kegiatan Perusahaan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_10_Berita dan Acara'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/9.Berita dan Acara.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_13_Kantor Pusat'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/10.Kantor Pusat.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_12_Kantor Cabang'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/11.Kantor Cabang.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_14_Kantor Selain Kantor Cabang (KSKC)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/12.Kantor Selain Kantor Cabang.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_01_Profil'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS/REP01_Website MLCI_AS_Profil/Website MLCI_15_Laporan Keberlanjutan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/TEST/1.Test Profil/13.Laporan Keberlanjutan.png')

WebUI.closeBrowser()

