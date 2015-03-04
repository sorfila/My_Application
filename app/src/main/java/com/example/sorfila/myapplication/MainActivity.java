package com.example.sorfila.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpref);
        et = (EditText)findViewById(R.id.editText);

        /*
        setContentView(R.layout.activity_main);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "vnOJXzmSEjsaF9mfUFCaqdgCvB58jw3n8carMeXC", "K8krdHtYxMm3KOABh6v7Uo3lRu8jQEKkqQqdCSK3");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
        */
    }
    public void showprefs(View v){
        Intent i = new Intent(this, firstprefactivity.class);
        startActivityForResult(i, 0);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        boolean java = sp.getBoolean("techjava", false);
        boolean php = sp.getBoolean("techphp", false);
        String k = sp.getString("nokey", "no value entered");
        String ring = sp.getString("ringkey", "no ringtone selected");

        String mess= "The technology choosen is ";
        if(java)
            mess+="Java, ";
        if(php)
            mess+=" PHP ";
        mess+= " and the no of news are "+k;
        mess+=" ringtone is "+ring;

        et.setText(mess);

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
