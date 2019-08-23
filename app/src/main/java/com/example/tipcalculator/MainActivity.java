package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    DecimalFormat df = new DecimalFormat("$##########.00");

    public void calculate(View v) {
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        EditText percentEditText = (EditText) findViewById(R.id.percentEditText);
        TextView displayTip = (TextView)findViewById(R.id.tipText);
        TextView displayText = (TextView)findViewById(R.id.totalText);

        double bill =  Double.parseDouble(billEditText.getText().toString());
        double percent =  Integer.parseInt(percentEditText.getText().toString());

        double tip = bill*(percent/100.0);

        double total = tip + bill;

        displayTip.setText("Tip:  " + df.format(tip));
        displayText.setText("Total:  " + df.format(total));
    }
}
