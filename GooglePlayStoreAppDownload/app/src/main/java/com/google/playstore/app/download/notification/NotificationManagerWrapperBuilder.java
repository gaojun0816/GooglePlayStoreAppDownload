package com.google.playstore.app.download.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.google.playstore.app.download.R;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public abstract class NotificationManagerWrapperBuilder extends NotificationManagerWrapper {

    public NotificationManagerWrapperBuilder(Context context) {
        super(context);
    }

    protected Notification.Builder getBuilder(Intent intent, String title, String message) {
        return new Notification.Builder(context)
            .setContentTitle(title)
            .setContentText(message)
            .setContentIntent(getPendingIntent(intent))
            .setSmallIcon(R.mipmap.ic_launcher)
            .setAutoCancel(true)
        ;
    }
}
