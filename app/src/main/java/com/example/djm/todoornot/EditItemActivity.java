package com.example.djm.todoornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EditItemActivity extends AppCompatActivity {
    EditText etUpdateItem;
    Integer etListSpot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etUpdateItem = (EditText) findViewById(R.id.etUpdateItem);
        String itemText = getIntent().getStringExtra("text");
        etUpdateItem.setText(itemText);
    }

    public void onSubmit(View v) {
        etUpdateItem = (EditText) findViewById(R.id.etUpdateItem);

        Intent data = new Intent();

        data.putExtra("text", etUpdateItem.getText().toString());
        data.putExtra("code", 0);

        setResult(RESULT_OK, data);
        finish();
    }


}
