package com.sirmothupii.findanurse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class DataSource extends AppCompatActivity
{

    EditText editTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_source);

        editTxt = findViewById(R.id.editText);
    }

   /** private void getResponse()
    {

        RequestQueue queue = SingletonRequestQueue.getInstance(getApplicationContext()).getRequestQueue();
        StringRequest strngRq = new StringRequest(Request.Method.GET, new Response.Listener<String>()
        {

            @Override
            public void onResponse(String response)
            {
                editTxt.setText("");
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {

            }
        });

    }*/
}
