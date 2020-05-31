package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Insertion extends AppCompatActivity {

    Button sort, sort2;
    EditText input, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion);

        sort = (Button)findViewById(R.id.b1);
        input = (EditText)findViewById(R.id.ed1);
        output = (EditText)findViewById(R.id.ed2);
        sort2 = (Button)findViewById(R.id.b2);

        sort2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no = input.getText().toString();
                Toast.makeText(getApplicationContext(),no,Toast.LENGTH_SHORT).show();
                int[] a = new int[no.length()];
                for(int i = 0; i<no.length(); i++)
                {
                    char ch = no.charAt(i);
                    a[i] = ch-'0';
                }

                sort(a);

                String n = "";
                for(int i =no.length()-1; i>=0; i--)
                {
                    //n.concat(String.valueOf(a[i]));
                    //n = n+((Integer.toString(a[i])));
                    n += a[i];

                }
                //Toast.makeText(getApplicationContext(),n,Toast.LENGTH_SHORT).show();
                output.setText(n);
            }
        });
        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no = input.getText().toString();
                Toast.makeText(getApplicationContext(),no,Toast.LENGTH_SHORT).show();
                int[] a = new int[no.length()];
                for(int i = 0; i<no.length(); i++)
                {
                    char ch = no.charAt(i);
                    a[i] = ch-'0';
                }

                sort(a);

                String n = "";
                for(int i =0; i<no.length(); i++)
                {
                    //n.concat(String.valueOf(a[i]));
                    //n = n+((Integer.toString(a[i])));
                    n += a[i];

                }
                //Toast.makeText(getApplicationContext(),n,Toast.LENGTH_SHORT).show();
                output.setText(n);

            }
        });
    }
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
