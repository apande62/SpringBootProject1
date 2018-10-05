package com.akash.ws;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class WsTest {

	public static void main(String[] args) {
		System.out.println("Hi");
		UpdatePatientPreferenceSOAPV300QSService updatePatientPreference=new UpdatePatientPreferenceSOAPV300QSService();
		UpdatePatientPreferenceV300 portType=updatePatientPreference.getUpdatePatientPreferenceSOAPV300QSPort();
		UpdatePatientPreferenceRequest parameters=new UpdatePatientPreferenceRequest();
		
		PreferencesType preferences=(PreferencesType)parameters.getPreferences();
		NamedValueType preference=new NamedValueType();
		
		preference.setName("ABC");
		preference.setValue("y");
		System.out.println("preference list"+preferences.getPreference());
		preferences.getPreference().add(preference);
		
		HeaderType headerType=new HeaderType();
		headerType.setFrom("NAV");
		headerType.setMessageId("IRIS - GetPatient3601000000raju2041922796");
		headerType.setTo("IRIS");
		
		XMLGregorianCalendar result=null;
		try {
			result = DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-11-20T03:55:22.325-06:00");
		} catch (DatatypeConfigurationException e) {
			
			e.printStackTrace();
		}
		headerType.setSentTime(result);
		
		parameters.setPreferences(preferences);
		parameters.setPatientId("10930279");
		parameters.setRequestHeader(headerType);
		
		PreferenceResponseType response=portType.updatePatientPreference(parameters);
		
		System.out.println("response="+response);
		
		
		
	}

}
