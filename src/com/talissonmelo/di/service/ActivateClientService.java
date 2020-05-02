package com.talissonmelo.di.service;

import com.talissonmelo.di.model.Client;
import com.talissonmelo.di.notification.Notification;

public class ActivateClientService {

	private Notification notification;

	public ActivateClientService(Notification notification) {
		this.notification = notification;
	}

	public void activate(Client client) {
		client.setStatus();

		this.notification.notification(client, "Cadastro no sistema está ativo!.");
	}
}
