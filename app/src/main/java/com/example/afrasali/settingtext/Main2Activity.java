package com.example.afrasali.settingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void OnSave(View view){
        e=(EditText)findViewById(R.id.editText);
        t=(TextView)findViewById(R.id.tv);
        if (e.getText().toString().isEmpty()){
            Toast.makeText(this, "enter correct otp", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Verification Success", Toast.LENGTH_SHORT).show();
            t.setText((e.getText().toString()));
        }

    }
}
