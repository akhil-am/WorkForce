package com.example.akhil.workforce.worker;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akhil.workforce.R;
public class WorkerHome extends Fragment{
    View view;
    Button accept, reject;
    TextView jobAlert;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.worker_home,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        jobAlert=(TextView)view.findViewById(R.id.job_alert);
        accept=(Button)view.findViewById(R.id.accept);
        reject=(Button)view.findViewById(R.id.reject);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Alert for confirmation
                AlertDialog.Builder dialog=new AlertDialog.Builder(getActivity());
                dialog.setTitle("CONFIRM ACTION");
                dialog.setCancelable(true);
                dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    jobAlert.setText("You have curently dont have active jobs");
                        Toast.makeText(getContext(),"You have assigned a new job..!",Toast.LENGTH_LONG).show();
                    }
                });
                dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"no",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
    }
}
