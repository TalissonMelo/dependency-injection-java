package com.talissonmelo.di.notification;

import com.talissonmelo.di.model.Client;

public interface Notification {

	void notification(Client client, String msg);
}
