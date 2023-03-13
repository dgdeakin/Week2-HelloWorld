package com.application.week2_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;
    TextView mTextView;
    //Todo Create a button variable
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //Todo Connect to the real layout items
        mEditText = findViewById(R.id.editText);
        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);
        //Todo Button


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Get the value of mEditText
                String inputValue = mEditText.getText().toString();

                //Todo Make a Toast to display inputValue.
                Toast.makeText(MainActivity.this, "Hi Again", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, inputValue, Toast.LENGTH_LONG).show();

                //Todo Change the value ot mTextView
                mTextView.setText("This is new text");
                mTextView.setText("Welcome to SIT305 "+ inputValue);

            }
        });

    }
}