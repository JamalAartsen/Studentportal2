package com.example.student_portal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class PortalAdd extends AppCompatActivity {

    private Button backButton;
    private Button addButtonPortal;
    private EditText newNameUrl;
    private EditText newNameTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal_add);

        backButton = findViewById(R.id.backButton);
        addButtonPortal = findViewById(R.id.addPortalButton);
        newNameUrl = findViewById(R.id.editTextUrl);
        newNameTitle = findViewById(R.id.editTextTitle);

        //Goes back to the mainactivity class
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PortalAdd.this, MainActivity.class));
            }
        });

        //Add new portal model into the recyclerview and goes back to the mainactivity class
        addButtonPortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Portal portal = new Portal(newNameTitle.getText().toString(), newNameUrl.getText().toString());

                Intent intent = new Intent();
                intent.putExtra(MainActivity.PORAL_NEW, portal);

                setResult(Activity.RESULT_OK, intent);
                finish();


            }
        });


    }
}
