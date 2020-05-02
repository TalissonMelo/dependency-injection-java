package com.talissonmelo.di.notification;

import com.talissonmelo.di.model.Client;

public class NotificationEmail implements Notification{

	@Override
	public void notification(Client client, String msg) {
		System.out.println("Notificando : " 
								+ client.getName() 
								+ ", através do email: " 
								+ client.getEmail() 
								+ ", msg: " 
								+ msg);
	}
}
