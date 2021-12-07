package com.example.td1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
///Exercice 1 et 2
public class MainActivity extends AppCompatActivity {
    public static final  String TAG="hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int min=1;
        int max=6;
        Button btn=(Button)findViewById(R.id.button);
        final TextView txt=(TextView)findViewById(R.id.textView);
        final TextView txt2=(TextView)findViewById(R.id.textView2);
        Random random=new Random();
        final int nbr=random.nextInt(max-min+1)+min;
        final int nbr2=random.nextInt(max-min+1)+min;
        final String str= Integer.toString(nbr);
        final String str2= Integer.toString(nbr2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast toast= Toast.makeText(MainActivity.this,"De lance",Toast.LENGTH_SHORT);
                //toast.show();
                txt.setText(str);
                txt2.setText(str2);
                // lancer exerice 3
                Intent mIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(mIntent);

            }
        });
    }
}
