
package com.akash.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akash.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdatePatientPreferenceResponse_QNAME = new QName("http://optumrx.unitedhealthgroup.com/AM/PatientPreferenceAM/v3_00", "updatePatientPreferenceResponse");
    private final static QName _CodeDescPairTypeStatus_QNAME = new QName("http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", "status");
    private final static QName _StatusUrl_QNAME = new QName("http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", "url");
    private final static QName _StatusDescription_QNAME = new QName("http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", "description");
    private final static QName _StatusProcess_QNAME = new QName("http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", "process");
    private final static QName _StatusNode_QNAME = new QName("http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", "node");
    private final static QName _HeaderTypeRelatesToMessageId_QNAME = new QName("http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", "relatesToMessageId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akash.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalledByAndCalledForPatientDetailsType }
     * 
     */
    public CalledByAndCalledForPatientDetailsType createCalledByAndCalledForPatientDetailsType() {
        return new CalledByAndCalledForPatientDetailsType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link NamedValueType }
     * 
     */
    public NamedValueType createNamedValueType() {
        return new NamedValueType();
    }

    /**
     * Create an instance of {@link GetPatientPreferenceRequest }
     * 
     */
    public GetPatientPreferenceRequest createGetPatientPreferenceRequest() {
        return new GetPatientPreferenceRequest();
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link PreferenceResponseType }
     * 
     */
    public PreferenceResponseType createPreferenceResponseType() {
        return new PreferenceResponseType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link UpdatePatientPreferenceRequest }
     * 
     */
    public UpdatePatientPreferenceRequest createUpdatePatientPreferenceRequest() {
        return new UpdatePatientPreferenceRequest();
    }

    /**
     * Create an instance of {@link CodeDescPairType }
     * 
     */
    public CodeDescPairType createCodeDescPairType() {
        return new CodeDescPairType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link GetPatientPreferenceResponse }
     * 
     */
    public GetPatientPreferenceResponse createGetPatientPreferenceResponse() {
        return new GetPatientPreferenceResponse();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link PreferencesType }
     * 
     */
    public PreferencesType createPreferencesType() {
        return new PreferencesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreferenceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optumrx.unitedhealthgroup.com/AM/PatientPreferenceAM/v3_00", name = "updatePatientPreferenceResponse")
    public JAXBElement<PreferenceResponseType> createUpdatePatientPreferenceResponse(PreferenceResponseType value) {
        return new JAXBElement<PreferenceResponseType>(_UpdatePatientPreferenceResponse_QNAME, PreferenceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", name = "status", scope = CodeDescPairType.class)
    public JAXBElement<String> createCodeDescPairTypeStatus(String value) {
        return new JAXBElement<String>(_CodeDescPairTypeStatus_QNAME, String.class, CodeDescPairType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", name = "url", scope = Status.class)
    public JAXBElement<String> createStatusUrl(String value) {
        return new JAXBElement<String>(_StatusUrl_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", name = "description", scope = Status.class)
    public JAXBElement<String> createStatusDescription(String value) {
        return new JAXBElement<String>(_StatusDescription_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", name = "process", scope = Status.class)
    public JAXBElement<String> createStatusProcess(String value) {
        return new JAXBElement<String>(_StatusProcess_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", name = "node", scope = Status.class)
    public JAXBElement<String> createStatusNode(String value) {
        return new JAXBElement<String>(_StatusNode_QNAME, String.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optumrx.unitedhealthgroup.com/schema/pharmacy/base/common/v11_00", name = "relatesToMessageId", scope = HeaderType.class)
    public JAXBElement<String> createHeaderTypeRelatesToMessageId(String value) {
        return new JAXBElement<String>(_HeaderTypeRelatesToMessageId_QNAME, String.class, HeaderType.class, value);
    }

}
