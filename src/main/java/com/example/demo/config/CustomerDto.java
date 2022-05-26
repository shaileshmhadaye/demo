package com.example.demo.config;

import com.opencsv.bean.CsvBindByName;

//Headers	Corp_Name	POS_ID	Contact_Number	DOI	RM_Name	GST	LG_Code	LC_Code	Threshold_Amount	Email_ID
// Contact_Person	Address	Pincode	State	City	Is_Bank	Account_number	IFSC_Code	Bank_Name	Bank_Address
// Branch_Name	Account_Type	Corp_Type	Application_form	Establishment_Certificate	Incorp_Certificate
// Business_Add_Proof	Address_&_Sign_Proof	PAN_Card	Aadhar_Card	GST_Reg_Cert	Partnership_Deed
// Commencement_Certificate	Partners	Authorised_Signatories	Board_Resolution	MOA	AOA
public class CustomerDto {
    /*@CsvBindByName(column = "Headers")
    private String headers;*/
    @CsvBindByName(column = "Corp_Name")
    private String corpName;
    @CsvBindByName(column = "POS_ID")
    private String posId;
    @CsvBindByName(column = "Contact_Number")
    private String contactNumber;
    @CsvBindByName(column = "DOI")
    private String doi;
    @CsvBindByName(column = "RM_Name")
    private String rmName;
    @CsvBindByName(column = "GST")
    private String gst;
    @CsvBindByName(column = "LG_Code")
    private String lgCode;
    @CsvBindByName(column = "LC_Code")
    private String lcCode;
    @CsvBindByName(column = "Threshold_Amount")
    private String thresholdAmount;
    @CsvBindByName(column = "Email_ID")
    private String emailId;
    @CsvBindByName(column = "Contact_Person")
    private String contactPerson;
    @CsvBindByName(column = "Address")
    private String address;
    @CsvBindByName(column = "Pincode")
    private String pincode;
    @CsvBindByName(column = "State")
    private String state;
    @CsvBindByName(column = "City")
    private String city;
    @CsvBindByName(column = "Is_Bank")
    private String isBank;
    @CsvBindByName(column = "Account_number")
    private String accountNumber;
    @CsvBindByName(column = "IFSC_Code")
    private String ifscCode;
    @CsvBindByName(column = "Bank_Name")
    private String bankName;
    /*@CsvBindByName(column = "Bank_Address")
    private String bankAddress;*/
    @CsvBindByName(column = "Branch_Name")
    private String branchName;
    @CsvBindByName(column = "Account_Type")
    private String accountType;
    @CsvBindByName(column = "Corp_Type")
    private String corpType;
    @CsvBindByName(column = "Application_form")
    private String applicationForm;
    @CsvBindByName(column = "Establishment_Certificate")
    private String establishmentCertificate;
    @CsvBindByName(column = "Incorp_Certificate")
    private String incorpCertificate;
    @CsvBindByName(column = "Business_Add_Proof")
    private String businessAddProof;
    @CsvBindByName(column = "Address_&_Sign_Proof")
    private String addressAndSignProof;
    @CsvBindByName(column = "PAN_Card")
    private String panCard;
    @CsvBindByName(column = "Aadhar_Card")
    private String aadharCard;
    @CsvBindByName(column = "GST_Reg_Cert")
    private String gstRegCert;
    @CsvBindByName(column = "Partnership_Deed")
    private String partnershipDeed;
    @CsvBindByName(column = "Commencement_Certificate")
    private String commencementCertificate;
    @CsvBindByName(column = "Partners")
    private String partners;
    @CsvBindByName(column = "Authorised_Signatories")
    private String authorisedSignatories;
    @CsvBindByName(column = "Board_Resolution")
    private String boardResolution;
    @CsvBindByName(column = "MOA")
    private String moa;
    @CsvBindByName(column = "AOA")
    private String aoa;
    private String filename;
    private String createdBy;


    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        this.rmName = rmName;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getLgCode() {
        return lgCode;
    }

    public void setLgCode(String lgCode) {
        this.lgCode = lgCode;
    }

    public String getLcCode() {
        return lcCode;
    }

    public void setLcCode(String lcCode) {
        this.lcCode = lcCode;
    }

    public String getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(String thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIsBank() {
        return isBank;
    }

    public void setIsBank(String isBank) {
        this.isBank = isBank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCorpType() {
        return corpType;
    }

    public void setCorpType(String corpType) {
        this.corpType = corpType;
    }

    public String getApplicationForm() {
        return applicationForm;
    }

    public void setApplicationForm(String applicationForm) {
        this.applicationForm = applicationForm;
    }

    public String getEstablishmentCertificate() {
        return establishmentCertificate;
    }

    public void setEstablishmentCertificate(String establishmentCertificate) {
        this.establishmentCertificate = establishmentCertificate;
    }

    public String getIncorpCertificate() {
        return incorpCertificate;
    }

    public void setIncorpCertificate(String incorpCertificate) {
        this.incorpCertificate = incorpCertificate;
    }

    public String getBusinessAddProof() {
        return businessAddProof;
    }

    public void setBusinessAddProof(String businessAddProof) {
        this.businessAddProof = businessAddProof;
    }

    public String getAddressAndSignProof() {
        return addressAndSignProof;
    }

    public void setAddressAndSignProof(String addressAndSignProof) {
        this.addressAndSignProof = addressAndSignProof;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public String getGstRegCert() {
        return gstRegCert;
    }

    public void setGstRegCert(String gstRegCert) {
        this.gstRegCert = gstRegCert;
    }

    public String getPartnershipDeed() {
        return partnershipDeed;
    }

    public void setPartnershipDeed(String partnershipDeed) {
        this.partnershipDeed = partnershipDeed;
    }

    public String getCommencementCertificate() {
        return commencementCertificate;
    }

    public void setCommencementCertificate(String commencementCertificate) {
        this.commencementCertificate = commencementCertificate;
    }

    public String getPartners() {
        return partners;
    }

    public void setPartners(String partners) {
        this.partners = partners;
    }

    public String getAuthorisedSignatories() {
        return authorisedSignatories;
    }

    public void setAuthorisedSignatories(String authorisedSignatories) {
        this.authorisedSignatories = authorisedSignatories;
    }

    public String getBoardResolution() {
        return boardResolution;
    }

    public void setBoardResolution(String boardResolution) {
        this.boardResolution = boardResolution;
    }

    public String getMoa() {
        return moa;
    }

    public void setMoa(String moa) {
        this.moa = moa;
    }

    public String getAoa() {
        return aoa;
    }

    public void setAoa(String aoa) {
        this.aoa = aoa;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "corpName='" + corpName + '\'' +
                ", posId='" + posId + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", doi='" + doi + '\'' +
                ", rmName='" + rmName + '\'' +
                ", gst='" + gst + '\'' +
                ", lgCode='" + lgCode + '\'' +
                ", lcCode='" + lcCode + '\'' +
                ", thresholdAmount='" + thresholdAmount + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", isBank='" + isBank + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", corpType='" + corpType + '\'' +
                ", applicationForm='" + applicationForm + '\'' +
                ", establishmentCertificate='" + establishmentCertificate + '\'' +
                ", incorpCertificate='" + incorpCertificate + '\'' +
                ", businessAddProof='" + businessAddProof + '\'' +
                ", addressAndSignProof='" + addressAndSignProof + '\'' +
                ", panCard='" + panCard + '\'' +
                ", aadharCard='" + aadharCard + '\'' +
                ", gstRegCert='" + gstRegCert + '\'' +
                ", partnershipDeed='" + partnershipDeed + '\'' +
                ", commencementCertificate='" + commencementCertificate + '\'' +
                ", partners='" + partners + '\'' +
                ", authorisedSignatories='" + authorisedSignatories + '\'' +
                ", boardResolution='" + boardResolution + '\'' +
                ", moa='" + moa + '\'' +
                ", aoa='" + aoa + '\'' +
                '}';
    }
}
