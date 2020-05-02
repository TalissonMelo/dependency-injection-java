package com.talissonmelo.di.service;

import com.talissonmelo.di.model.Client;
import com.talissonmelo.di.model.Product;
import com.talissonmelo.di.notification.Notification;

public class IssueInvoiceService {

	private Notification notification;
	
	public IssueInvoiceService(Notification notification) {
		this.notification = notification;
	}
	
	public void issue(Client client, Product product) {

		this.notification.notification(client, "Nota fiscal do produto : " 
											+ product.getName() 
											+ " foi emitida.");
	}
}
