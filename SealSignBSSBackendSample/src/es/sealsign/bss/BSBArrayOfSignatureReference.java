package es.sealsign.bss;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.7.0
//
// Created by Quasar Development at 15-06-2015
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class BSBArrayOfSignatureReference extends Vector< BSBSignatureReference> implements KvmSerializable
{
    
    public BSBArrayOfSignatureReference(){}
    
    public BSBArrayOfSignatureReference(java.lang.Object inObj,BSBExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                BSBSignatureReference j1= (BSBSignatureReference)__envelope.get(j,BSBSignatureReference.class);
                add(j1);
            }
        }
}
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "SignatureReference";
        info.type = BSBSignatureReference.class;
    	info.namespace= "http://schemas.datacontract.org/2004/07/SealSignDSSTypes";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    @Override
    public String getInnerText() {
        return null;
    }

    @Override
    public void setInnerText(String s) {

    }

}