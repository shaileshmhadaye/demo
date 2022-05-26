package com.example.demo.config;

import com.opencsv.bean.CsvBindByName;

public class DisputeFileDto {
    @CsvBindByName(column = "Report Date")
    private String reportDate;
    @CsvBindByName(column = "Dispute Raise Date")
    private String disputeRaiseDate;
    @CsvBindByName(column = "Dispute Raised Settlement Date")
    private String disputeRaisedSettlementDate;
    @CsvBindByName(column = "Case Number")
    private String caseNumber;
    @CsvBindByName(column = "FunctionCode")
    private String functionCode;
    @CsvBindByName(column = "Function Code and Description")
    private String functionCodeAndDescription;
    @CsvBindByName(column = "Transaction Sequence Number")
    private String transactionSequenceNumber;
    @CsvBindByName(column = "Tag ID")
    private String tagId;
    @CsvBindByName(column = "TID")
    private String tid;
    @CsvBindByName(column = "Transaction Date and time")
    private String transactionDateAndTime;
    @CsvBindByName(column = "Reader Read Date and Time")
    private String readerDateTIme;
    @CsvBindByName(column = "Transaction Settlement Date")
    private String transactionSettlementDate;
    @CsvBindByName(column = "Transaction Amount")
    private String transactionAmount;
    @CsvBindByName(column = "Settlement Amount")
    private String settlementAmount;
    @CsvBindByName(column = "Settlement Currency Code")
    private String settlementCurrencyCode;
    @CsvBindByName(column = "Note")
    private String note;
    @CsvBindByName(column = "Transaction ID")
    private String transactionId;
    @CsvBindByName(column = "Transaction Type")
    private String transactionType;
    @CsvBindByName(column = "Merchant ID")
    private String merchantId;
    @CsvBindByName(column = "Lane_Id")
    private String laneId;
    @CsvBindByName(column = "Merchant type")
    private String merchantType;
    @CsvBindByName(column = "Sub Merchant Type")
    private String subMerchantType;
    @CsvBindByName(column = "Transaction Status")
    private String transactionStatus;
    @CsvBindByName(column = "TAG Status")
    private String tagStatus;
    @CsvBindByName(column = "AVC")
    private String avc;
    @CsvBindByName(column = "WIM")
    private String wim;
    @CsvBindByName(column = "Originator Point")
    private String originatorPoint;
    @CsvBindByName(column = "Acquirer ID")
    private String acquirerId;
    @CsvBindByName(column = "Transaction Originator Institution PID")
    private String transactionOriginatorInstitutionPID;
    @CsvBindByName(column = "Acquirer Name and Country")
    private String acquirerNameAndCountry;
    @CsvBindByName(column = "IIN")
    private String iin;
    @CsvBindByName(column = "Transaction Destination  Institution PID")
    private String transactionDestinationInstitutionPID;
    @CsvBindByName(column = "Issuer Name and Country")
    private String issuerNameAndCountry;
    @CsvBindByName(column = "Vehicle Registration Number")
    private String vehicleRegistrationCode;
    @CsvBindByName(column = "Vehicle Class")
    private String vehicleClass;
    @CsvBindByName(column = "Vehicle Type")
    private String vehicleType;
    @CsvBindByName(column = "Financial/Non-Financial Indicator")
    private String financialNonFinancialIndicator;
    @CsvBindByName(column = "Dispute Reason code")
    private String disputeReasonCode;
    @CsvBindByName(column = "Dispute Reason code description")
    private String disputeReasonCodeDescription;
    @CsvBindByName(column = "Disputed Amount")
    private String disputedAmount;
    @CsvBindByName(column = "Full / Partial Indicator")
    private String fullPartialIndicator;
    @CsvBindByName(column = "Member Message text")
    private String mmt;
    @CsvBindByName(column = "Document Indicator")
    private String documentIndicator;
    @CsvBindByName(column = "Document Attached Date")
    private String documentAttachedDate;
    @CsvBindByName(column = "Deadline date")
    private String deadlineDate;
    @CsvBindByName(column = "Days to act")
    private String  daysToAct;
    @CsvBindByName(column = "Direction of Dispute")
    private String directionOfDispute;

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getDisputeRaiseDate() {
        return disputeRaiseDate;
    }

    public void setDisputeRaiseDate(String disputeRaiseDate) {
        this.disputeRaiseDate = disputeRaiseDate;
    }

    public String getDisputeRaisedSettlementDate() {
        return disputeRaisedSettlementDate;
    }

    public void setDisputeRaisedSettlementDate(String disputeRaisedSettlementDate) {
        this.disputeRaisedSettlementDate = disputeRaisedSettlementDate;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionCodeAndDescription() {
        return functionCodeAndDescription;
    }

    public void setFunctionCodeAndDescription(String functionCodeAndDescription) {
        this.functionCodeAndDescription = functionCodeAndDescription;
    }

    public String getTransactionSequenceNumber() {
        return transactionSequenceNumber;
    }

    public void setTransactionSequenceNumber(String transactionSequenceNumber) {
        this.transactionSequenceNumber = transactionSequenceNumber;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTransactionDateAndTime() {
        return transactionDateAndTime;
    }

    public void setTransactionDateAndTime(String transactionDateAndTime) {
        this.transactionDateAndTime = transactionDateAndTime;
    }

    public String getReaderDateTIme() {
        return readerDateTIme;
    }

    public void setReaderDateTIme(String readerDateTIme) {
        this.readerDateTIme = readerDateTIme;
    }

    public String getTransactionSettlementDate() {
        return transactionSettlementDate;
    }

    public void setTransactionSettlementDate(String transactionSettlementDate) {
        this.transactionSettlementDate = transactionSettlementDate;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(String settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    public void setSettlementCurrencyCode(String settlementCurrencyCode) {
        this.settlementCurrencyCode = settlementCurrencyCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getLaneId() {
        return laneId;
    }

    public void setLaneId(String laneId) {
        this.laneId = laneId;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getSubMerchantType() {
        return subMerchantType;
    }

    public void setSubMerchantType(String subMerchantType) {
        this.subMerchantType = subMerchantType;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(String tagStatus) {
        this.tagStatus = tagStatus;
    }

    public String getAvc() {
        return avc;
    }

    public void setAvc(String avc) {
        this.avc = avc;
    }

    public String getWim() {
        return wim;
    }

    public void setWim(String wim) {
        this.wim = wim;
    }

    public String getOriginatorPoint() {
        return originatorPoint;
    }

    public void setOriginatorPoint(String originatorPoint) {
        this.originatorPoint = originatorPoint;
    }

    public String getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public String getTransactionOriginatorInstitutionPID() {
        return transactionOriginatorInstitutionPID;
    }

    public void setTransactionOriginatorInstitutionPID(String transactionOriginatorInstitutionPID) {
        this.transactionOriginatorInstitutionPID = transactionOriginatorInstitutionPID;
    }

    public String getAcquirerNameAndCountry() {
        return acquirerNameAndCountry;
    }

    public void setAcquirerNameAndCountry(String acquirerNameAndCountry) {
        this.acquirerNameAndCountry = acquirerNameAndCountry;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public String getTransactionDestinationInstitutionPID() {
        return transactionDestinationInstitutionPID;
    }

    public void setTransactionDestinationInstitutionPID(String transactionDestinationInstitutionPID) {
        this.transactionDestinationInstitutionPID = transactionDestinationInstitutionPID;
    }

    public String getIssuerNameAndCountry() {
        return issuerNameAndCountry;
    }

    public void setIssuerNameAndCountry(String issuerNameAndCountry) {
        this.issuerNameAndCountry = issuerNameAndCountry;
    }

    public String getVehicleRegistrationCode() {
        return vehicleRegistrationCode;
    }

    public void setVehicleRegistrationCode(String vehicleRegistrationCode) {
        this.vehicleRegistrationCode = vehicleRegistrationCode;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getFinancialNonFinancialIndicator() {
        return financialNonFinancialIndicator;
    }

    public void setFinancialNonFinancialIndicator(String financialNonFinancialIndicator) {
        this.financialNonFinancialIndicator = financialNonFinancialIndicator;
    }

    public String getDisputeReasonCode() {
        return disputeReasonCode;
    }

    public void setDisputeReasonCode(String disputeReasonCode) {
        this.disputeReasonCode = disputeReasonCode;
    }

    public String getDisputeReasonCodeDescription() {
        return disputeReasonCodeDescription;
    }

    public void setDisputeReasonCodeDescription(String disputeReasonCodeDescription) {
        this.disputeReasonCodeDescription = disputeReasonCodeDescription;
    }

    public String getDisputedAmount() {
        return disputedAmount;
    }

    public void setDisputedAmount(String disputedAmount) {
        this.disputedAmount = disputedAmount;
    }

    public String getFullPartialIndicator() {
        return fullPartialIndicator;
    }

    public void setFullPartialIndicator(String fullPartialIndicator) {
        this.fullPartialIndicator = fullPartialIndicator;
    }

    public String getMmt() {
        return mmt;
    }

    public void setMmt(String mmt) {
        this.mmt = mmt;
    }

    public String getDocumentIndicator() {
        return documentIndicator;
    }

    public void setDocumentIndicator(String documentIndicator) {
        this.documentIndicator = documentIndicator;
    }

    public String getDocumentAttachedDate() {
        return documentAttachedDate;
    }

    public void setDocumentAttachedDate(String documentAttachedDate) {
        this.documentAttachedDate = documentAttachedDate;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getDaysToAct() {
        return daysToAct;
    }

    public void setDaysToAct(String daysToAct) {
        this.daysToAct = daysToAct;
    }

    public String getDirectionOfDispute() {
        return directionOfDispute;
    }

    public void setDirectionOfDispute(String directionOfDispute) {
        this.directionOfDispute = directionOfDispute;
    }

    @Override
    public String toString() {
        return "DisputeFileDto{" +
                "reportDate='" + reportDate + '\'' +
                ", disputeRaiseDate='" + disputeRaiseDate + '\'' +
                ", disputeRaisedSettlementDate='" + disputeRaisedSettlementDate + '\'' +
                ", caseNumber='" + caseNumber + '\'' +
                ", functionCode='" + functionCode + '\'' +
                ", functionCodeAndDescription='" + functionCodeAndDescription + '\'' +
                ", transactionSequenceNumber='" + transactionSequenceNumber + '\'' +
                ", tagId='" + tagId + '\'' +
                ", tid='" + tid + '\'' +
                ", transactionDateAndTime='" + transactionDateAndTime + '\'' +
                ", readerDateTIme='" + readerDateTIme + '\'' +
                ", transactionSettlementDate='" + transactionSettlementDate + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", settlementAmount='" + settlementAmount + '\'' +
                ", settlementCurrencyCode='" + settlementCurrencyCode + '\'' +
                ", note='" + note + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", laneId='" + laneId + '\'' +
                ", merchantType='" + merchantType + '\'' +
                ", subMerchantType='" + subMerchantType + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", tagStatus='" + tagStatus + '\'' +
                ", avc='" + avc + '\'' +
                ", wim='" + wim + '\'' +
                ", originatorPoint='" + originatorPoint + '\'' +
                ", acquirerId='" + acquirerId + '\'' +
                ", transactionOriginatorInstitutionPID='" + transactionOriginatorInstitutionPID + '\'' +
                ", acquirerNameAndCountry='" + acquirerNameAndCountry + '\'' +
                ", iin='" + iin + '\'' +
                ", transactionDestinationInstitutionPID='" + transactionDestinationInstitutionPID + '\'' +
                ", issuerNameAndCountry='" + issuerNameAndCountry + '\'' +
                ", vehicleRegistrationCode='" + vehicleRegistrationCode + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", financialNonFinancialIndicator='" + financialNonFinancialIndicator + '\'' +
                ", disputeReasonCode='" + disputeReasonCode + '\'' +
                ", disputeReasonCodeDescription='" + disputeReasonCodeDescription + '\'' +
                ", disputedAmount='" + disputedAmount + '\'' +
                ", fullPartialIndicator='" + fullPartialIndicator + '\'' +
                ", mmt='" + mmt + '\'' +
                ", documentIndicator='" + documentIndicator + '\'' +
                ", documentAttachedDate='" + documentAttachedDate + '\'' +
                ", deadlineDate='" + deadlineDate + '\'' +
                ", daysToAct='" + daysToAct + '\'' +
                ", directionOfDispute='" + directionOfDispute + '\'' +
                '}';
    }
}
