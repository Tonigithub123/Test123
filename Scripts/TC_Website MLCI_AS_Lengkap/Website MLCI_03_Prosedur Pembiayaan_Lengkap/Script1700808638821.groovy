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

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_02_Cara Pembayaran Angsuran Pembiayaan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/1.Cara Pembayaran Angsuran Pembiayaan.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_03_GIRO'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/2.Giro.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_04_BANK TRANSFER'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/3.Bank Transfer.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_05_Persyaratan Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/4.Persyaratan Kredit.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_06_Suku Bunga'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/5.Suku Bunga.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_07_Simulasi Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/6.Simulasi Kredit.png')

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_08_Pilih Mobil Penumpang'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_09_Pilih Tipe Mobil'), 
    '28', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_10_Pilih Jenis Mobil'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_11_input Harga(Rp)'), 
    '100000000')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_12_input Uang Muka(Rp)'), 
    '40000000')

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_13_Pilih Tenor'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_14_Pilih Wilayah'), 
    '2', true)

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/7.Simulasi Kredit yang sudah diinput.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_15_Daftar Rekanan Asuransi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/8.Daftar Rekanan Asuransipng')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_16_PT ASURANSI MITSUI SUMITOMO INDONESIA'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/9.PT Asuransi Mutsui Sumimoto Indonesia.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_17_PT ASURANSI CENTRAL ASIA'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/10.Asuransi Central Asia.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_18_PT ASURANSI SINAR MAS'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/11.Asuransi Sinar Mas.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_19_PT ASURANSI RAKSA PRATIKARA'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/12.Asuransi Raksa Pratikara.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_20_PT ASURANSI PAN PACIFIC'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/13.Asuransi Nan Pacific.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_21_Aplikasi Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/14.Aplikasi Kredit.png')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_22_input_Nama'), 
    'Toni')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_23_input_Jenis Kelamin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_24_Pilih Kartu Identitas'), 
    'KTP', true)

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_25_input Nomor Kartu Identitas'), 
    '1277022407010005')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_26_input Email'), 
    'ahmadsultoni24@gmail.com')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_27_input No Telepon'), 
    '0813769488878')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_28_input Alamat'), 
    'Jl imam bonjol')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_29_input Pekerjaan'), 
    'tester')

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_30_Pilih Jenis Mobil'), 
    'Baru', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/select_Pilih Merk Mobil                    _53c778'), 
    'RENAULT', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/select_Pilih Model MobilClioKangooMeganeScenic'), 
    'Kangoo', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/select_Pilih Tipe MobilMT'), 
    'M/T', false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/15.Aplikasi Kredit yang sudah diinput.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_31_Dokumen Persyaratan Pengambilan BPKB'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/16.Dokumen Persyaratan Pengambilan BPKB.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_32_Formulir Permohonan Pengecekan Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/select_Individu                            _09a40e'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/select_Balikpapan                          _adfa16'), 
    '15', true)

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nama Pemohon_nama_pemohon_npwp'), 
    'sdfdsfsd')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nomor NPWP_no_npwp'), '2134324232423423423423234')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/textarea_Alamat sesuai NPWP_alamat_npwp'), 
    'sddsfdfdvdev')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nama PIC dari Pemohon_nama_pic'), 
    'dfe')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nomor Telepon_phone_npwp'), 
    '12412')

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_copy_form_agree'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/_Doc/KATALON/Test Lengkap/3.Test Prosedur Pembiayaan/17.Formulir Permohonan Pengecekan Data.png')

WebUI.closeBrowser()

