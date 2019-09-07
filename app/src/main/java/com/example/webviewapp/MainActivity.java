package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button loadWebPage,loadFromStaticHtml;
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    loadWebPage=findViewById(R.id.loadWebPage);
    loadFromStaticHtml=findViewById(R.id.loadFromStaticHtml);
    webView=findViewById(R.id.simpleWebView);
    loadWebPage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Load Web Page Clicked", Toast.LENGTH_SHORT).show();
        }
    });

    loadFromStaticHtml.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Load From Static Html clicked", Toast.LENGTH_SHORT).show();
        }
    });
    }
}
