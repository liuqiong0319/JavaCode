package soapUI.demo;

import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
import org.apache.commons.lang.StringUtils;  
  
public class WsMethodInfo  
{  
  private String methodName;  
  private String methodDesc;  
  private Map<String, Map> methodName2InputParam = new HashMap();  
  private String targetNameSpace;  
  private String methodSoapAction;  
  private String endPoint;  
  private String targetXsd;  
  private List<String> inputNames;  
  private List<String> inputType;  
  private List<String> inputDesc;  
  private List<String> outputNames;  
  private List<String> outputType;  
  private String sep = "#";  
  
  public String getMethodName()  
  {  
    return this.methodName;  
  }  
  public void setMethodName(String methodName) {  
    this.methodName = methodName;  
  }  
  public List<String> getInputNames() {  
    return this.inputNames;  
  }  
  public void setInputNames(List<String> inputNames) {  
    this.inputNames = inputNames;  
  }  
  
  public Map<String, Map> getMethodName2InputParam() {  
    return this.methodName2InputParam;  
  }  
  public void setMethodName2InputParam(Map<String, Map> methodName2InputParam) {  
    this.methodName2InputParam = methodName2InputParam;  
  }  
  public String getTargetNameSpace() {  
    return this.targetNameSpace;  
  }  
  public void setTargetNameSpace(String targetNameSpace) {  
    this.targetNameSpace = targetNameSpace;  
  }  
  public String getMethodSoapAction() {  
    return this.methodSoapAction;  
  }  
  public void setMethodSoapAction(String methodSoapAction) {  
    this.methodSoapAction = methodSoapAction;  
  }  
  public String getEndPoint() {  
    return this.endPoint;  
  }  
  public void setEndPoint(String endPoint) {  
    this.endPoint = endPoint;  
  }  
  public String getTargetXsd() {  
    return this.targetXsd;  
  }  
  public void setTargetXsd(String targetXsd) {  
    this.targetXsd = targetXsd;  
  }  
  
  public List<String> getOutputNames() {  
    return this.outputNames;  
  }  
  public void setOutputNames(List<String> outputNames) {  
    this.outputNames = outputNames;  
  }  
  public List<String> getInputType() {  
    return this.inputType;  
  }  
  public void setInputType(List<String> inputType) {  
    this.inputType = inputType;  
  }  
  public List<String> getOutputType() {  
    return this.outputType;  
  }  
  public void setOutputType(List<String> outputType) {  
    this.outputType = outputType;  
  }  
  
  public List<String> getInputDesc() {  
    return this.inputDesc;  
  }  
  public void setInputDesc(List<String> inputDesc) {  
    this.inputDesc = inputDesc;  
  }  
  
  public String madeNewString()  
  {  
    StringBuffer su = new StringBuffer();  
    su.append(this.methodName);  
    su.append(this.sep);  
    su.append(this.inputType == null ? "" : StringUtils.join(this.inputType.toArray(), "@"));  
    su.append(this.sep);  
    su.append(this.inputNames == null ? "" : StringUtils.join(this.inputNames.toArray(), "@"));  
    su.append(this.sep);  
    su.append(this.methodDesc == null ? "" : this.methodDesc);  
    su.append(this.sep);  
    su.append(this.sep);  
    su.append(this.methodSoapAction == null ? "" : this.methodSoapAction);  
    su.append(this.sep);  
    su.append(this.outputType == null ? "" : StringUtils.join(this.outputType.toArray(), "@"));  
    su.append(this.sep);  
    su.append(this.targetXsd == null ? "" : this.targetXsd);  
    return su.toString();  
  }  
  
  public String getMethodDesc() {  
    return this.methodDesc;  
  }  
  public void setMethodDesc(String methodDesc) {  
    this.methodDesc = methodDesc;  
  }  
}  