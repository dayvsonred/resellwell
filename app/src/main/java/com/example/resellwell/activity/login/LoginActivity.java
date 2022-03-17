package com.example.resellwell.activity.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.resellwell.R;
import com.example.resellwell.activity.dashboard.DashboardActivity;

public class LoginActivity extends AppCompatActivity {

    private Button btEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btEntrar = findViewById(R.id.bt_login_entra);


        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callDashboard();
            }
        });
    }

    private void callDashboard(){
        startActivity(new Intent(this, DashboardActivity.class ));
    }

}