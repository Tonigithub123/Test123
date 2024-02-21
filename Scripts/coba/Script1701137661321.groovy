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

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_ _Aplikasi Kredit_AS'))

WebUI.setText(findTestObject('null'), 'asasa')

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 
    'KTP', true)

WebUI.setText(findTestObject('null'), 
    '123131231232131')

WebUI.setText(findTestObject('null'), 'aadqwdqwd@gmail.com')

WebUI.setText(findTestObject('null'), '0821312312321')

WebUI.setText(findTestObject('null'), 'svsdvdsvdsvds')

WebUI.setText(findTestObject('null'), 'wfwefewfe')

WebUI.selectOptionByValue(findTestObject('null'), 
    'Baru', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_33_Pilih Merk Mobil_AS'), 
    'RENAULT', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_34_Pilih Model Mobil_AS'), 
    'Kangoo', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_35_Pilih Tipe Mobil_AS'), 
    'M/T', false)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_36_Pilih Individu-AS'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_37_Pilih Balikpapan_AS'), 
    '15', true)

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_38_input Nama Pemohon Npwp_AS'), 
    'sdfdsfsd')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_39_input Nomor NPWP_AS'), '2134324232423423423423234')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_40_txt Alamat sesuai NPWP_AS'), 
    'sddsfdfdvdev')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_41_input Nama PIC dari Pemohon_AS'), 
    'dfe')

WebUI.setText(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_42_input Nomor Telepon_AS'), 
    '12412')

WebUI.uploadFile(findTestObject('null'), 'D:/_Doc/Acer/Acer/Gambar 4.png')

WebUI.click(findTestObject('Object Repository/REP_Website MLCI_AS_Lengkap/REP03_Website MLCI_AS_Prosedur Pembiayaan_Lengkap/Website MLCI_43_input copy form agree_AS'))

WebUI.closeBrowser()

