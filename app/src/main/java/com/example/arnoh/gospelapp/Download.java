package com.example.arnoh.gospelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Download extends AppCompatActivity {
 WebView web;
 ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_download);

        getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

        web = (WebView) findViewById(R.id.web);
        web.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)
            {
                //Make the bar disappear after URL is loaded, and changes string to Loading...
                if(progress < 100) {
                    setTitle("Loading...");
                    setProgress(progress * 100); //Make the bar disappear after URL is loaded
                }

                // Return the app name after finish loading
                if(progress == 100)
                    setTitle(R.string.app_name);
            }
        });

        web.loadUrl("http://mdundo.com/p/6671");
       // bar.setVisibility(View.INVISIBLE);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());

    }
}
