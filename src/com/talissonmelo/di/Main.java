package com.talissonmelo.di;

import com.talissonmelo.di.model.Client;
import com.talissonmelo.di.notification.Notification;
import com.talissonmelo.di.notification.NotificationSMS;
import com.talissonmelo.di.service.ActivateClientService;

public class Main {

	public static void main(String []args) {
		Client talisson = new Client("Talisson", "talisson@gmail.com", "3242-3415");
		Client tales = new Client("Tales", "tales@gmail.com", "3246-3415");
		
		Notification notification = new NotificationSMS();
		
		ActivateClientService activate = new ActivateClientService(notification);
		activate.activate(talisson);
		activate.activate(tales);
	}
}
