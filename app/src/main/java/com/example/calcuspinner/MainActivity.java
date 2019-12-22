package com.example.calcuspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Spinner sp;
    Button b;
    TextView t1;
    String s1,s2,spin,s3;
    int i1,i2,i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.num1);
        e2=(EditText)findViewById(R.id.num2);
        sp=(Spinner)findViewById(R.id.operation);
        b=(Button)findViewById(R.id.bt);
        t1=(TextView)findViewById(R.id.ans);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s2);
                spin=sp.getSelectedItem().toString();
                if (spin.equals("+"))
                {
                    i3=i1+i2;
                    s3=String.valueOf(i3);
                    t1.setText(s3);

                }
                if (spin.equals("*"))
                {
                    i3=i1*i2;
                    s3=String.valueOf(i3);
                    t1.setText(s3);

                }
                if (spin.equals("-"))
                {
                    i3=i1-i2;
                    s3=String.valueOf(i3);
                    t1.setText(s3);

                }
                if (spin.equals("/"))
                {   if (i2==0)
                    {
                       t1.setText("Division by zero is not possible");
                    }
                    else
                {
                    i3 = i1 / i2;
                    s3=String.valueOf(i3);
                    t1.setText(s3);
                }
                }
            }
        });
    }
}
