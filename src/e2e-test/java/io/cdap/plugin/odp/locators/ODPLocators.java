/*
 * Copyright © 2021 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package io.cdap.plugin.odp.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * ODPLocators.
 */
public class ODPLocators {

  @FindBy(how = How.XPATH, using = "//*[@data-cy=\"plugin-SapOdp-batchsource\"]")
  public static WebElement sapODPSource;

  @FindBy(how = How.XPATH, using = "//*[@title=\"SAP ODP\"]/following-sibling::div")
  public static WebElement sapODPProperties;

  @FindBy(how = How.XPATH, using = "//*[@placeholder='Name used to identify this source for lineage']")
  public static WebElement referenceName;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='project' and @class='MuiInputBase-input']")
  public static WebElement projectID;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.client' and @class='MuiInputBase-input']")
  public static WebElement sapClient;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.sysnr' and @class='MuiInputBase-input']")
  public static WebElement systemNumber;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='gcsPath' and @class='MuiInputBase-input']")
  public static WebElement gcsPath;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.ashost' and @class='MuiInputBase-input']")
  public static WebElement sapApplicationServerHost;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='sapSourceObjName' and @class='MuiInputBase-input']")
  public static WebElement dataSourceName;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='numSplits' and @class='MuiInputBase-input']")
  public static WebElement splitRow;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='packageSize' and @class='MuiInputBase-input']")
  public static WebElement packageSize;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.user' and @class='MuiInputBase-input']")
  public static WebElement usernameCredentials;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.passwd' and  @type='password']")
  public static WebElement passwordCredentials;

  @FindBy(how = How.XPATH, using = "//*[contains(text(),'Get Schema')]")
  public static WebElement getSchemaButton;

  @FindBy(how = How.XPATH, using = "//*[@name='extractType' and @value='Sync']")
  public static WebElement syncRadio;

  @FindBy(how = How.XPATH, using = "//*[@class='fa fa-remove']")
  public static WebElement closeButton;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='plugin-endpoint-SapOdp-batchsource-right']")
  public static WebElement fromODP;

  @FindBy(how = How.XPATH, using = "//*[@value='msgServer']")
  public static WebElement loadServer;

  @FindBy(how = How.XPATH, using = "//*[@data-cy=\"jco.client.mshost\" and @type='text']")
  public static WebElement msHost;

  @FindBy(how = How.XPATH, using = "//*[@placeholder='Ex: sapms02 or 3602']")
  public static WebElement portNumber;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.r3name' and @class='MuiInputBase-input']")
  public static WebElement systemID;

  @FindBy(how = How.XPATH, using = "//*[contains(text(),'M') and contains(@class,'jss')]")
  public static List<WebElement> macros;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='plugin-properties-validate-btn']")
  public static WebElement validateButton;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='plugin-validation-success-msg']")
  public static WebElement pluginValidationSuccessMessage;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.lang' and @class='MuiInputBase-input']")
  public static WebElement language;

  @FindBy(how = How.XPATH, using = "//*[@data-cy=\"jco.client.group\" and @type='text']")
  public static WebElement logonGroup;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='property-row-error']")
  public static WebElement rowError;

  @FindBy(how = How.XPATH, using = "//*[contains(text(),\"SAP connection test failed\")]")
  public static WebElement mainStreamError;

  @FindBy(how = How.XPATH, using = "//*[@class=\"text-danger\"]")
  public static WebElement jcoError;

  @FindBy(how = How.XPATH, using = "(//*[@data-cy='filterOptionsRange'])[2]/div/div/div[1]/input")
  public static WebElement filterRangeKey;

  @FindBy(how = How.XPATH, using = "(//*[@data-cy='filterOptionsRange'])[2]")
  public static WebElement filterRangeMacros;

  @FindBy(how = How.XPATH, using = "//*[@placeholder=\"'ACT-DCD-00' AND 'ACT-DCD-12'\"]")
  public static WebElement filterRangeVal;

  @FindBy(how = How.XPATH, using = "(//*[@data-cy=\"filterOptionsEq\"])[2]/div/div/div[1]/input")
  public static WebElement filterEqualKey;

  @FindBy(how = How.XPATH, using = "//*[@placeholder=\"'FERT'\"]")
  public static WebElement filterEqualVal;

  @FindBy(how = How.XPATH, using = "(//*[@data-cy='filterOptionsEq'])[2]")
  public static WebElement filterEqualMacros;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.passwd' and  @type='text']")
  public static WebElement macroPass;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='extractType' and @class='MuiInputBase-input']")
  public static WebElement extractType;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='jco.client.saprouter' and  @type='text']")
  public static WebElement sapRouter;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='gcpProjectId' and  @type='text']")
  public static WebElement gcsProjectID;

  @FindBy(how = How.XPATH, using = "//*[@data-cy='subscriberName' and  @type='text']")
  public static WebElement subsName;
}
