package com.example.amila.newglossary;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.content.Context;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {


    //private static Button buttonPst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
                                                          public void onClick(View v) {
                                                              Intent I = new Intent();
                                                              I.setAction("android.amila.action.PST");
                                                              startActivity(I);

                                                          }
                                                      }
        );


    }
}
        // button4.setOnClickListener(new Button.OnClickListener() {


                                    //  public void onClick(View v) {
                                        /*  public void pstClick(View view){

                                              Intent P = new Intent(this, pst.class);
                                              startActivity(P);
                                          }*/

                               //   }
     //   );





