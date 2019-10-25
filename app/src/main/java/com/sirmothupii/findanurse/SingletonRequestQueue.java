package com.sirmothupii.findanurse;


import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SingletonRequestQueue
    {

        private static SingletonRequestQueue mInstance; // instance I will use through out the system. it doesn't change
        private Context mContext; //context of current state of the application/object
        private RequestQueue mRequestQueue;

        private SingletonRequestQueue(Context context) {
            mContext = context;
            mRequestQueue = getRequestQueue();
        }

        public static synchronized SingletonRequestQueue getInstance(Context context) {
            if (mInstance == null) {
                mInstance = new SingletonRequestQueue(context);
            }
            return mInstance;
        }

        public RequestQueue getRequestQueue() {
            if (mRequestQueue == null) {
                mRequestQueue = Volley.newRequestQueue(mContext);
            }
            return mRequestQueue;
        }

    }

