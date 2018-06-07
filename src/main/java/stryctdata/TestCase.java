package stryctdata;

import stryctdata.dataType.AcsessType;
import stryctdata.dataType.TypeClass;

import java.util.List;
import java.util.Map;

public class TestCase {
    private String nameClass;
    private AcsessType acsessTypeClass;
    private TypeClass typeClassName;
    private List<DataField> dataFieldss;
    private List<MethodStryct> methodsContracts;

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public AcsessType getAcsessTypeClass() {
        return acsessTypeClass;
    }

    public void setAcsessTypeClass(AcsessType acsessTypeClassName) {
        this.acsessTypeClass = acsessTypeClassName;
    }

    public List<DataField> getDataFieldss() {
        return dataFieldss;
    }

    public void setDataFieldss(List<DataField> dataFieldss) {
        this.dataFieldss = dataFieldss;
    }

    public List<MethodStryct> getMethodsContracts() {
        return methodsContracts;
    }

    public void setMethodsContracts(List<MethodStryct> methodsContracts) {
        this.methodsContracts = methodsContracts;
    }

    public TypeClass getTypeClassName() {
        return typeClassName;
    }

    public void setTypeClassName(TypeClass typeClassName) {
        this.typeClassName = typeClassName;
    }
}

class MethodStryct{
    private String accessModifier = "packeg";
    private String nameMethod;
    private String returnParam = "void";
    private Map<String, String> inputParam;//Name, Type
    private String body;
    private boolean returnParamFlag = false;

    public String getNameMethod() {
        return nameMethod;
    }

    public void setNameMethod(String nameMethod) {
        this.nameMethod = nameMethod;
    }

    public String getReturnParam() {
        return returnParam;
    }

    public void setReturnParam(String returnParam) {
        this.returnParam = returnParam;
    }

    public Map<String, String> getMapInputParam() {
        return inputParam;
    }

    public void setMapInputParam(Map<String, String> inputParam) {
        this.inputParam = inputParam;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isReturnParamFlag() {
        return returnParamFlag;
    }

    public void setReturnParamFlag(boolean returnParamFlag) {
        this.returnParamFlag = returnParamFlag;
    }

    public String getTypeInputParam(String nameParam) {
        return inputParam.get(nameParam);
    }

    public void addInputParam(String nameParam, String typeParam) {
        this.inputParam.put(nameParam, typeParam);
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }
}

class DataField{
    private String name;
    private String type;
    private String typeAcsess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeAcsess() {
        return typeAcsess;
    }

    public void setTypeAcsess(String typeAcsess) {
        this.typeAcsess = typeAcsess;
    }
}