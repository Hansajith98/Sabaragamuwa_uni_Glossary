package com.example.amila.newglossary;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.app.Activity;
import android.app.ListActivity;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Typeface;

import java.util.ArrayList;
import java.util.Arrays;

public class pst extends Activity {
   /* ListView mylist;
    CustomAdapter myadapter;
    Context context = pst.this;
    ArrayList newlist = new ArrayList();*/

    String[] englishName = new String[]{"bacon", "Ham", "Tuna", "Candy", "Meatball", "Potato"};
    String[] sinhalaName = new String[]{"wdddbhha", "wdddbhha", "wdddbhha", "wdddbhha", "wa", "wa"};
    // Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_pst);
        ListView listView = (ListView) findViewById(R.id.pstList);
        adapter ada= new adapter(this,englishName,sinhalaName);



        listView.setAdapter(ada);
    }
}