package com.example.resellwell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.resellwell.activity.dashboard.DashboardActivity;
import com.example.resellwell.activity.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onResume() {
        super.onResume();
        if(this.auth()){
            callDashboard();
        }else {
            this.callLogin();
        }
    }


    private boolean auth(){
        return false;
    }

    private void callLogin(){
        startActivity(new Intent(this, LoginActivity.class));
    }

    private void callDashboard(){
        startActivity(new Intent(this, DashboardActivity.class ));
    }
}