package com.example.td1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText text=(EditText)findViewById(R.id.edit_text);
        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int min =1;
                int max=Integer.parseInt(text.getText().toString());

                final TextView txt=(TextView)findViewById(R.id.textView);
                Random random=new Random();
                final int nbr=random.nextInt(max-min+1)+min;
                final String str= Integer.toString(nbr);
                txt.setText(str);

            }
        });

    }
}
