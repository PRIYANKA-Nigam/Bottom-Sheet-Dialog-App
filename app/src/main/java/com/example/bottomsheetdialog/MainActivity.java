package com.example.bottomsheetdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
Button b; @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MainActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);
              final   EditText e1=bottomSheetDialog.findViewById(R.id.ed);
              final   EditText e2=bottomSheetDialog.findViewById(R.id.ed2); final Button b=bottomSheetDialog.findViewById(R.id.but);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(e1.getText().toString().equals("admin")&& e2.getText().toString().equals("admin")){
                            AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                            builder.setTitle("Login Successful");
                            builder.setMessage("Welcome to Android Coding");
                            builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss(); }});
                            AlertDialog alertDialog= builder.create();
                            builder.show(); }
                        else {
                            Toast.makeText(v.getContext(),"Login Failed",Toast.LENGTH_SHORT).show(); }
                    }
                });
                bottomSheetDialog.show();
            }
        }); }}