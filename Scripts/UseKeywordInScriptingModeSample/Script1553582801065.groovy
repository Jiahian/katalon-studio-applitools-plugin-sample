import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.RemoteWebElement as RemoteWebElement
import com.applitools.eyes.Location as Location
import com.applitools.eyes.RectangleSize as RectangleSize
import com.applitools.eyes.selenium.Eyes as Eyes
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//-----------------------------------------check eyesOpen/checkWindow/checkRegion/eyesClose ------------------------------------------------------------
//use 'https://applitools.com/helloworld2?diff1' to make changes to page
WebUI.openBrowser('https://applitools.com/helloworld2?diff2')

//WebUI.setViewPortSize(800, 600)

//initialize eyes
Eyes eyes = CustomKeywords.'com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen'('batchname', null)

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.id('name')).sendKeys('random name test')

By locatorBy = By.id('name')

eyes.checkRegion(locatorBy, 'stepname: check checkRegion by selector keyword')

driver.findElement(By.tagName('button')).click()

WebElement element = driver.findElement(By.xpath('//img[contains(@class,\'diff2\')]'))

//check region by web element
CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkElement'(eyes, element)

//check window not including eyes set up
eyes.checkWindow('stepname: check checkWindow')

CustomKeywords.'com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose'(eyes)

WebUI.closeBrowser()

