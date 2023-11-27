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

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/1.Beranda.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_01_PROFIL'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_02_Tentang Mitsui Leasing'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/2.Tentang Mitsui Leasing.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_03_Laporan Tahunan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/3.Laporan Tahunan.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_04_Misi, Visi dan Nilai'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/4.Misi, Visi dan Nilai.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_05_Struktur Organisasi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/5.Struktur Organisasi.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_06_Manajemen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/6.Manajemen.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_03_Laporan Tahunan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/7.Laporan Tahunan.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_07_Tata Kelola'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/8. Tata Kelola.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_08_Tanggung Jawab Sosial Lingkungan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/9.Tanggung Jawab Sosial Lingkungan.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_09_Artikel 1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/10.Artikel 1.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_08_Tanggung Jawab Sosial Lingkungan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_10_Artikel 2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/11.Artikel 2.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_08_Tanggung Jawab Sosial Lingkungan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_11_Artikel 3'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/12.Artikel 3.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_08_Tanggung Jawab Sosial Lingkungan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_12_Artikel 4'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/13.Artikel 4.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_08_Tanggung Jawab Sosial Lingkungan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_13_Artikel 5'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/14.Artikel 5.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_08_Tanggung Jawab Sosial Lingkungan'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_14_Artikel 6'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/15.Artikel 6.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_20_Berita dan Acara'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/16.Berita dan Acara.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_15_Artikel 1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/17.Artikel 1.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_20_Berita dan Acara'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_16_Artikel 2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/18.Artikel 2.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_20_Berita dan Acara'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_17_Artikel 3'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/19.Artikel 3.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_20_Berita dan Acara'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_18_Artikel 4'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/20.Artikel 4.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_20_Berita dan Acara'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_19_Artikel 5'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/21.Artikel 5.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_21_Kantor Pusat'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/22.Kantor Pusat.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_22_Kantor Cabang'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/23.Kantor Cabang 1.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_23_Paginate 2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/24.Kantor Cabang 2.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_24_Paginate 3'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/25.Kantor Cabang 3.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_25_Kantor Selain Kantor Cabang (KSKC)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/26.Kantor Selain Kantor Cabang].png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_26_Laporan Keberlanjutan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/27.Laporan Keberlanjutan.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_27_Laporan 2020'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/28.Laporan tahun 2020.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_28_Laporan 2021'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/29.Laporan tahun 2021.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP01_Website MLCI_AS_Profil_Lengkap/Website MLCI_29_Laporan 2022'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/1.Test Profil/30.Laporan tahun 2022.png')

WebUI.closeBrowser()

