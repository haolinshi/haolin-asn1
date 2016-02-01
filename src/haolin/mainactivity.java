package com.example.haolin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/**
 * Created by haolin on 2/1/16.
 */
public class mainactivity extends Activity {
    private static final String FILENAME = "haolin-FuelTrack.sav";
    private EditText bodyText;
    private ListView oldLogdata;

    private DataList logs;
    private ArrayAdapter<logdata> adapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bodyText = (EditText) findViewById(R.id.body);
        Button viewButton = (Button) findViewById(R.id.view);
        Button addButton  = (Button) findViewById(R.id.add);
        Button totalBUtton= (Button) findViewById(R.id.total);
        oldLogdata = (ListView) findViewById(R.id.oldTweetsList);

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setResult(RESULT_OK);
                String text = bodyText.getText().toString();
                logdata newestlog = new logdata(text);

                logs.add(newestlog);
                adapter.notifyDataSetChanged();
                saveInFile();
//				finish();
            }
        });
        viewButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                setResult(RESULT_OK);
               int index= logs.size();
                for(int j=index;j==0;j--){
                    system.out(logs.getData(j));
                }
                finish();
            }
        });
        totalBUtton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                setResult(RESULT_OK);
                int index = logs.size();
                int total = 0;
                for (int j = 0; j <= index; j++) {
                    total += logs.getData(j).getCost();
                }
                system.out(total);
                finish();
            }
        });
    }

