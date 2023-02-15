import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://docs.katalon.com/docs/author/keywords/using-keywords-in-katalon-studio/web-testing/applitools-integration-in-katalon-studio#use-applitools-functions-in-recording')

//WebUI.setViewPortSize(800, 600)

//WebUI.click(findTestObject('Object Repository/Page_The Internet/input_Username_username'))

//WebUI.click(findTestObject('Object Repository/Page_The Internet/button_Login'))

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('scrollpage')

//CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject'(findTestObject('Page_The Internet/div_Your username is invalid'), 'uniqueString2')

WebUI.closeBrowser()

