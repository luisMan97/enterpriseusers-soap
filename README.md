# enterpriseusers-soap

## Installation
Run git clone to download proyect

```ruby
git clone https://github.com/luisMan97/enterpriseusers-soap.git
```
First clone the next soap web service project

https://github.com/luisMan97/enterpriseusers-soap

IMPORTANT: check the README.md

#### Use
1) Open the project with Eclpise for Enterprise Java Developers (https://www.eclipse.org/downloads/packages/release/2020-03/r/eclipse-ide-enterprise-java-developers-includes-incubating-components)
2) Go to EmployeePublish class.
4) Tap on the Run button.

Check the wsdl 

```ruby
http://localhost:1515/soap/employeedb?wsdl
```

xml response:

```ruby
<definitions targetNamespace="http://enterprise.luis.com/" name="EmployeeDBImplementService">
  <types>
    <xsd:schema>
      <xsd:import namespace="http://enterprise.luis.com/" schemaLocation="http://localhost:1515/soap/employeedb?xsd=1"/>
    </xsd:schema>
  </types>
  <message name="setEmployee">
    <part name="parameters" element="tns:setEmployee"/>
  </message>
  <message name="setEmployeeResponse">
    <part name="parameters" element="tns:setEmployeeResponse"/>
  </message>
  <portType name="EmployeeDB">
    <operation name="setEmployee">
      <input wsam:Action="http://enterprise.luis.com/EmployeeDB/setEmployeeRequest" message="tns:setEmployee"/>
      <output wsam:Action="http://enterprise.luis.com/EmployeeDB/setEmployeeResponse" message="tns:setEmployeeResponse"/>
    </operation>
  </portType>
  <binding name="EmployeeDBImplementPortBinding" type="tns:EmployeeDB">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="document"/>
    <operation name="setEmployee">
      <soap:operation soapAction=""/>
      <input>
        <soap:body use="literal"/>
      </input>
      <output>
        <soap:body use="literal"/>
      </output>
    </operation>
  </binding>
  <service name="EmployeeDBImplementService">
    <port name="EmployeeDBImplementPort" binding="tns:EmployeeDBImplementPortBinding">
      <soap:address location="http://localhost:1515/soap/employeedb"/>
    </port>
  </service>
</definitions>
```
