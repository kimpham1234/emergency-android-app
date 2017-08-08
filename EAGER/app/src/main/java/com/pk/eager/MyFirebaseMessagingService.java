package com.pk.eager;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by kimpham on 7/17/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    final static String KEY = "key";
    final static String TAG = MyFirebaseMessagingService.class.getSimpleName();
    DatabaseReference notificationRef = FirebaseDatabase.getInstance().getReference("UserNotification");

    public void onMessageReceived(RemoteMessage remoteMessage){
        DatabaseReference newChild = notificationRef.push();
        newChild.setValue("onMessageReceived Called");
        Log.d(TAG, "onMessageReceived Called");
        /*
        String title = remoteMessage.getNotification().getTitle();
        String body = remoteMessage.getNotification().getBody();
        String clickAction = remoteMessage.getNotification().getClickAction();
        Intent intent = new Intent(clickAction);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra(KEY, title);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);
        notificationBuilder.setContentTitle(title);
        notificationBuilder.setContentText(body);
        notificationBuilder.setAutoCancel(true);
        notificationBuilder.setSmallIcon(R.drawable.ic_notification);
        notificationBuilder.setContentIntent(pendingIntent);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notificationBuilder.build());*/
    }


}
