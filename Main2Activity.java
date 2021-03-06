package govender.kevashan.testapplication.Activities;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import govender.kevashan.testapplication.Service.TokenHandler;

public class Main2Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        webView = new WebView(this);

        TokenHandler tokenHandler = new TokenHandler(webView);

        tokenHandler.setWebViewClient();
        tokenHandler.loadURL();

        setContentView(webView);

    }


}


