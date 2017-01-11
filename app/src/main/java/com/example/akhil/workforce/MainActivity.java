package com.example.akhil.workforce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.akhil.workforce.worker.WorkerHome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_main);
        WorkerHome home=(WorkerHome)getSupportFragmentManager().findFragmentById(R.id.home);
    }
}
