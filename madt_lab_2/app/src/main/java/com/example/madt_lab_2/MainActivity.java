package com.example.madt_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spCounterSelection;
    private EditText txtEnteredText;
    private TextView tvCharsCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCounterSelection= (Spinner) findViewById(R.id.spCounterSelection);
        this.txtEnteredText = findViewById(R.id.txtEnteredText);
        this.tvCharsCount = findViewById(R.id.tvCharsCount);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this,
                R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCounterSelection.setAdapter(adapter);
    }

    public void onBtnCountCharsClick(View view){
        String spinnerSelection=spCounterSelection.getSelectedItem().toString();
        String charSelectionOption=getResources().getString(R.string.selection_chars);
        String wordSelectionOption=getResources().getString(R.string.selection_words);

        if (spinnerSelection.equalsIgnoreCase(charSelectionOption)){
            String userEnteredText = this.txtEnteredText.getText().toString();
            if (!TextCounter.checkEmpty(userEnteredText)) {
                int enteredTextLengthInChars = TextCounter.getCharsCount(userEnteredText);
                this.tvCharsCount.setText(String.valueOf(enteredTextLengthInChars));
            }
            else {
                Toast.makeText(this,"Not implemented.", Toast.LENGTH_LONG).show();
            }
        }
        else if (spinnerSelection.equalsIgnoreCase(wordSelectionOption)){
            String userEnteredText = this.txtEnteredText.getText().toString();
            if (!TextCounter.checkEmpty(userEnteredText)){
                int enteredTextLengthInChars = TextCounter.getWordsCount(userEnteredText);
                this.tvCharsCount.setText(String.valueOf(enteredTextLengthInChars));
            }
            else {
                Toast.makeText(this,"Not implemented.", Toast.LENGTH_LONG).show();
            }
        }
    }
}