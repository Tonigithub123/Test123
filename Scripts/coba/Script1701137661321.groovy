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

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/a_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_ _Aplikasi Kredit_AS'))

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nama_nama'), 'asasa')

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Jenis Kelamin_gender'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/select_Pilih Kartu Identitas               _7680ec'), 
    'KTP', true)

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nomor Kartu Identitas_nokartu'), 
    '123131231232131')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Email_email'), 'aadqwdqwd@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_No Telepon_no_telp'), '0821312312321')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/textarea_Alamat_alamat'), 'svsdvdsvdsvds')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Pekerjaan_kerja'), 'wfwefewfe')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/select_Pilih Jenis Mobil                   _9450ef'), 
    'Baru', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_33_Pilih Merk Mobil_AS'), 
    'RENAULT', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_34_Pilih Model Mobil_AS'), 
    'Kangoo', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_35_Pilih Tipe Mobil_AS'), 
    'M/T', false)

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/a_Dokumen Persyaratan Pengambilan BPKB'))

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/a_Formulir Permohonan Pengecekan Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_36_Pilih Individu-AS'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_37_Pilih Balikpapan_AS'), 
    '15', true)

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_38_input Nama Pemohon Npwp_AS'), 
    'sdfdsfsd')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/Website MLCI_39_input Nomor NPWP_AS'), '2134324232423423423423234')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/textarea_Alamat sesuai NPWP_alamat_npwp'), 
    'sddsfdfdvdev')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nama PIC dari Pemohon_nama_pic'), 
    'dfe')

WebUI.setText(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_Nomor Telepon_phone_npwp'), 
    '12412')

WebUI.uploadFile(findTestObject('Page_Mitsui Leasing Capital Indonesia/telusuri'), 'D:/_Doc/Acer/Acer/Gambar 4.png')

WebUI.click(findTestObject('Object Repository/Page_Mitsui Leasing Capital Indonesia/input_copy_form_agree'))

WebUI.closeBrowser()

