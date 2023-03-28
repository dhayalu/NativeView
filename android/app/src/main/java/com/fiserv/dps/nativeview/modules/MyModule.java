package com.fiserv.dps.nativeview.modules;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MyModule extends ReactContextBaseJavaModule {
    ReactApplicationContext context = getReactApplicationContext();

    public MyModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "MyModule";
    }

    @ReactMethod
    public void zelleData(String baseURL, String instituionId){

        CustomView.baseURL = baseURL;

        System.out.println("get zelle value ========>"+baseURL+instituionId);
    }


}
