package com.factura.portlet;


public class Factura {
	
	String id, client, clientIdentifier, organization, creationDate, createdByIdentifier, 
	documentNo, documentStatus, documentAction, documentType, transactionDocument, salesOrder, 
	description, invoiceDate, accontingDate, businessPartner, businessPartnerIdentifier, 
	partnerAddress, orderDate, currency, paymentTerms, priceList, salesCampaign, paymentMethod,
	feTimbreDate, feTimbreUuid, grandTotalAmount;
	
	public Factura(String id){
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreatedByIdentifier() {
		return createdByIdentifier;
	}

	public void setCreatedByIdentifier(String createdByIdentifier) {
		this.createdByIdentifier = createdByIdentifier;
	}

	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	public String getDocumentStatus() {
		return documentStatus;
	}

	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}

	public String getDocumentAction() {
		return documentAction;
	}

	public void setDocumentAction(String documentAction) {
		this.documentAction = documentAction;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getTransactionDocument() {
		return transactionDocument;
	}

	public void setTransactionDocument(String transactionDocument) {
		this.transactionDocument = transactionDocument;
	}

	public String getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getAccontingDate() {
		return accontingDate;
	}

	public void setAccontingDate(String accontingDate) {
		this.accontingDate = accontingDate;
	}

	public String getBusinessPartner() {
		return businessPartner;
	}

	public void setBusinessPartner(String businessPartner) {
		this.businessPartner = businessPartner;
	}

	public String getBusinessPartnerIdentifier() {
		return businessPartnerIdentifier;
	}

	public void setBusinessPartnerIdentifier(String businessPartnerIdentifier) {
		this.businessPartnerIdentifier = businessPartnerIdentifier;
	}

	public String getPartnerAddress() {
		return partnerAddress;
	}

	public void setPartnerAddress(String partnerAddress) {
		this.partnerAddress = partnerAddress;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public String getSalesCampaign() {
		return salesCampaign;
	}

	public void setSalesCampaign(String salesCampaign) {
		this.salesCampaign = salesCampaign;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getFeTimbreDate() {
		return feTimbreDate;
	}

	public void setFeTimbreDate(String feTimbreDate) {
		this.feTimbreDate = feTimbreDate;
	}

	public String getFeTimbreUuid() {
		return feTimbreUuid;
	}

	public void setFeTimbreUuid(String feTimbreUuid) {
		this.feTimbreUuid = feTimbreUuid;
	}

	public String getGrandTotalAmount() {
		return grandTotalAmount;
	}

	public void setGrandTotalAmount(String grandTotalAmount) {
		this.grandTotalAmount = grandTotalAmount;
	}

	

}
