package com.fiserv.dps.nativeview.modules;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.fiserv.dps.mobile.sdk.bridge.model.Bridge;
import com.fiserv.dps.mobile.sdk.bridge.zelleview.BridgeView;
import com.fiserv.dps.mobile.sdk.bridge.zelleview.Zelle;
import com.fiserv.dps.mobile.sdk.interfaces.GenericTag;
import com.fiserv.dps.nativeview.MainActivity;

@SuppressLint("ViewConstructor")
public class CustomView extends FrameLayout implements GenericTag {

    Context context;
    public static String baseURL;

    @SuppressLint("ResourceType")
    public CustomView(@NonNull Context context, FragmentActivity activity) {
        super(context);
        Log.d("CustomView=====>", "came");
        System.out.println("CustomView ======>");
        // set padding and background color
        this.setPadding(16,16,16,16);
        //this.setBackgroundColor(Color.parseColor("#5FD3F3"));
        this.context = context;

        // add default text view
        //TextView text = new TextView(context);
        //text.setText("Welcome to Android Fragments with React Native.");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.parseColor("#5FD3F3"));
        linearLayout.setId(1234);

        BridgeView.genericTag =  this;

        Zelle zelle = new Zelle(baseURL,
                "88850059",
                "zelle",
                "",
                false,
                null,
                null );
        Bridge bridge = new Bridge(context, zelle);
        zelle.setPreCacheContacts(true);

        activity.getSupportFragmentManager().beginTransaction().add(linearLayout.getId(), bridge.view(), "BridgeView").commit();


        this.addView(linearLayout);
    }

    @Override
    public void getValue(@NonNull String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }

    @Override
    public void sessionTag(@NonNull String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }


}
