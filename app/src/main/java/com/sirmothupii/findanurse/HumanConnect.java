package com.sirmothupii.findanurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HumanConnect extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_connect);
    }
    //cleick button to access API
    static final int HUMANAPI_AUTH = 1;

    public void onConnect(View view)
    {

        /* 1. Create an Intent for Human Connect */
        Intent intent = new Intent(this, co.humanapi.connectsdk.ConnectActivity.class);


        /* 2. Add Bundle with configuration options */
        Bundle b = new Bundle();

        b.putString("client_id", "0a3c4405a22f05106bcb11165858dd2646811924");
        b.putString("auth_url", "http://10.0.2.2:3000/sessionToken");
        b.putString("client_user_id", "iamkeenan07@gmail.com");
        b.putString("language", "en");

        //PublicToken (mandatory for existing users)
        b.putString("public_token", "demo");
        intent.putExtras(b);

        /* 3. Launch Human Connect Activity */
        startActivityForResult(intent, 2);
    }
    }

