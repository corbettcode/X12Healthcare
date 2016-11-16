package com.xiaoerge.x12.message.benefit.inquiry;

import com.xiaoerge.x12.message.MessageBase;
import com.xiaoerge.x12.util.StringQueue;
import com.xiaoerge.x12.message.segment.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoerge on 6/5/16.
 */
public class BenefitInquiryInformationReceiver extends MessageBase {
    private HL hierarchicalLevel;
    private NM1 individualOrOrganizationalName;
    private List<REF> referenceInformations;
    private N3 address;
    private N4 cityStateZip;
    private PRV providerInformation;

    private List<BenefitInquirySubscriber> benefitSubscribers;

    public BenefitInquiryInformationReceiver() {
        hierarchicalLevel = new HL();
        individualOrOrganizationalName = new NM1();
        referenceInformations = new ArrayList<REF>();
        address = new N3();
        cityStateZip = new N4();
        providerInformation = new PRV();
        benefitSubscribers = new ArrayList<BenefitInquirySubscriber>();
    }

    public BenefitInquiryInformationReceiver(String s) {
        this();
        StringQueue stringQueue = new StringQueue(s);

        if (stringQueue.hasNext() && stringQueue.peekNext().startsWith("HL"))
            hierarchicalLevel = new HL(stringQueue.getNext());
        if (stringQueue.hasNext() && stringQueue.peekNext().startsWith("NM1"))
            individualOrOrganizationalName = new NM1(stringQueue.getNext());
        while (stringQueue.hasNext() && stringQueue.peekNext().startsWith("REF"))
            referenceInformations.add(new REF(stringQueue.getNext()));
        if (stringQueue.hasNext() && stringQueue.peekNext().startsWith("N3"))
            address = new N3(stringQueue.getNext());
        if (stringQueue.hasNext() && stringQueue.peekNext().startsWith("N4"))
            cityStateZip = new N4(stringQueue.getNext());
        if (stringQueue.hasNext() && stringQueue.peekNext().startsWith("PRV"))
            providerInformation = new PRV(stringQueue.getNext());

        //todo multiple subscribers

        //find inquiry receiver
        StringBuilder stringBuilder = new StringBuilder();
        while (stringQueue.hasNext()) {
            stringBuilder.append(stringQueue.getNext());
        }
        benefitSubscribers.add(new BenefitInquirySubscriber(stringBuilder.toString()));
    }

    public void loadDefinition() {
        messagesDefinition.clear();
        messagesDefinition.add(hierarchicalLevel);
        messagesDefinition.add(individualOrOrganizationalName);
        messagesDefinition.addAll(referenceInformations);
        messagesDefinition.add(address);
        messagesDefinition.add(cityStateZip);
        messagesDefinition.add(providerInformation);
        messagesDefinition.addAll(benefitSubscribers);
    }

    public HL getHierarchicalLevel() {
        return hierarchicalLevel;
    }

    public void setHierarchicalLevel(HL hierarchicalLevel) {
        this.hierarchicalLevel = hierarchicalLevel;
    }

    public NM1 getIndividualOrOrganizationalName() {
        return individualOrOrganizationalName;
    }

    public void setIndividualOrOrganizationalName(NM1 individualOrOrganizationalName) {
        this.individualOrOrganizationalName = individualOrOrganizationalName;
    }

    public List<REF> getReferenceInformations() {
        return referenceInformations;
    }

    public void setReferenceInformations(List<REF> referenceInformations) {
        this.referenceInformations = referenceInformations;
    }

    public N3 getAddress() {
        return address;
    }

    public void setAddress(N3 address) {
        this.address = address;
    }

    public N4 getCityStateZip() {
        return cityStateZip;
    }

    public void setCityStateZip(N4 cityStateZip) {
        this.cityStateZip = cityStateZip;
    }

    public PRV getProviderInformation() {
        return providerInformation;
    }

    public void setProviderInformation(PRV providerInformation) {
        this.providerInformation = providerInformation;
    }

    public List<BenefitInquirySubscriber> getBenefitSubscribers() {
        return benefitSubscribers;
    }

    public void setBenefitSubscribers(List<BenefitInquirySubscriber> benefitSubscribers) {
        this.benefitSubscribers = benefitSubscribers;
    }
}