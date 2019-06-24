package com.example.notification.CreateChannel;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.notification.BroadCast.BreoadCastReceiverExample;
import com.example.notification.R;

public class BroadCastActivity extends AppCompatActivity {

    BreoadCastReceiverExample breoadCastReceiverExample = new BreoadCastReceiverExample();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(breoadCastReceiverExample,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(breoadCastReceiverExample);
    }
}
