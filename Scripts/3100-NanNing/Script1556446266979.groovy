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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.80.133')

WebUI.setText(findTestObject('Page_Login/input_ _iptUsername'), 'admin')

WebUI.setText(findTestObject('Page_Login/input_ _iptPassword'), 'admin')

WebUI.click(findTestObject('Page_Login/input_ _btnLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_/div_IPPBX'))

WebUI.click(findTestObject('Page_/span_configVoipNetwork'))

WebUI.click(findTestObject('Page_/span__SBC'))

WebUI.click(findTestObject('Object Repository/Page_/span_IMS_om-combo-trigger om-icon-carat-1-s'))

WebUI.click(findTestObject('Page_/static_ip/Page_/static_ip'))

WebUI.click(findTestObject('Page_/config_SBC/input__aucPrimarySBC'))

WebUI.setText(findTestObject('Page_/config_SBC/input__aucPrimarySBC'), '111.12.98.9')

WebUI.click(findTestObject('Page_/config_SBC/input__aucSecondarySBC'))

WebUI.setText(findTestObject('Page_/config_SBC/input__aucSecondarySBC'), '111.12.99.9')

WebUI.click(findTestObject('Page_/config_SBC/apply_SBC'))

WebUI.click(findTestObject('Page_/config_SBC/Page_/button_confirmSBC'))

WebUI.click(findTestObject('Page_/config_IMSServer/Page_/IMS_Server'))

WebUI.click(findTestObject('Page_/config_IMSServer/Page_/input__aucImsServer'))

WebUI.setText(findTestObject('Page_/config_IMSServer/Page_/input__aucImsServer'), 'ims.gx.chinamobile.com')

WebUI.click(findTestObject('Page_/config_IMSServer/Page_/apply_IMSserver'))

WebUI.click(findTestObject('Page_/config_IMSServer/confirmIMS/Page_/button_confirmIMSSrv'))

WebUI.click(findTestObject('Page_regFlowCtrl/span_SIP'))

WebUI.click(findTestObject('Page_regFlowCtrl/input__ulFlowctlNum'))

WebUI.setText(findTestObject('Page_regFlowCtrl/input__ulFlowctlNum'), '10')

WebUI.click(findTestObject('Page_regFlowCtrl/button_applySIPproxyconf'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_FlowCtrlConfirm/button_confirm'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_/Page_/config_trunk'))

WebUI.click(findTestObject('Page_/Page_/span_SIPtrunk'))

WebUI.click(findTestObject('Page_/Page_/button_addTrunk'))

WebUI.setText(findTestObject('Page_/Page_/input__usTrunkId'), '201')

WebUI.setText(findTestObject('Page_/Page_/input__aucTrunkName'), 'ims')

WebUI.setText(findTestObject('Page_/Page_/input__aucOfiiceUrl'), 'ims.gx.chinamobile.com')

WebUI.click(findTestObject('Page_/Page_/button_applyNewTrunk'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_/Page_/span_Route'))

WebUI.click(findTestObject('Page_/Page_/span_office'))

office1 = WebUI.waitForElementPresent(findTestObject('Page_office1/div_office1'), 1)

if (!(office1)) {
    WebUI.click(findTestObject('Page_/Page_/button_addOffice'))

    WebUI.setText(findTestObject('Page_/Page_/input__usOfficeIds'), '1')

    WebUI.setText(findTestObject('Page_/Page_/input__aucOfficeName'), 'ims')

    WebUI.click(findTestObject('Page_/Page_/button_applyOffice'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_/Page_/img__imgBtnSetOffice_Trunk'))

    WebUI.click(findTestObject('Page_/Page_/button_newOfficeTrunk'))

    WebUI.click(findTestObject('Page_/Page_/input__validTrunk'))

    WebUI.click(findTestObject('Page_/Page_/div_Trunk201'))

    WebUI.click(findTestObject('Page_/Page_/button_applyOfficeTrunk'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Page_/Page_/span_closeOfficeTrunk'))
}

WebUI.click(findTestObject('Page_/Page_/div_FXS'))

WebUI.click(findTestObject('Page_/Page_/span_FXSsystem'))

WebUI.setText(findTestObject('Page_/Page_/textarea__iptFxsDigitmap'), '[*#][0-9][0-9*].#|**xx|*#xx#|##|*57*00|*4[01]*00|#9|10xxx.|11[02479]|11[13568]Sx.|12[026789]|121xx|12[3-5]Sx.|168xxxxx|17[29]xSx.|19xSx.|20[01]|400[016-9]xxxxxx|600x.|800xxxxxxx|9xxxxSx.|70*xxxSx.|71*|72*xxxxxxx|16[0-79]Sxxxx|9669xxxxxxSx.|96801xxxxSx.|[2-8]xxxxxx|1[34578]xxxxxxxxx|01[34578]xxxxxxxxx|010xxxSxxxxx|02xxxxSxxxxx|0[3-9]xxxxxSxxxx|0311xxxSxxxxx|037[179]xxxSxxxxx|04[135]1xxxSxxxxx|051[0-9]xxxSxxxxx|052[37]xxxSxxxxx|053[12]xxxSxxxxx|057[13-79]xxxSxxxxx|059[15]xxxSxxxxx|075[57]xxxSxxxxx|0769xxxSxxxxx|0898xxxSxxxxx|00xxSx.|07548xxxxxxSx|0760[28]xxxxxxSx|0731[825]xxxxxxSx|04326xxxxxxSx|0791xxxSxxxxx|08716xxxxxxSx|0551[68]xxxxxxSx|0851[238]xxxxxxSx')

WebUI.click(findTestObject('Page_/Page_/button_applyDigitMap'))

WebUI.click(findTestObject('Page_/Page_/a_WriteConfig'))

