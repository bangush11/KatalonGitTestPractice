import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.farmers.gov/')

WebUI.setText(findTestObject('Object Repository/TestingSearchBox/input_Search Farmersgov_query'), 'soil')

WebUI.click(findTestObject('Object Repository/TestingSearchBox/button_Search'))

WebUI.click(findTestObject('Object Repository/TestingSearchBox/a_Soil Health  Farmers'))

WebUI.click(findTestObject('Object Repository/TestingSearchBox/h1_Soil Health'))

WebUI.click(findTestObject('Object Repository/TestingSearchBox/h1_Soil Health'))

WebUI.click(findTestObject('Object Repository/TestingSearchBox/img'))

WebUI.closeBrowser()

