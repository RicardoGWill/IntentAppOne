package com.ricardogwill.intentappone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2ExplicitIntent(View view) {
        Intent explicitIntent = new Intent(getApplicationContext(), Activity2.class);
        startActivity(explicitIntent);
    }

    public void goToIntentAppTwoImplicitIntent(View view) {
        Intent implicitIntentToAppTwo = new Intent("com.ricardogwill.intentapptwo");
        startActivity(implicitIntentToAppTwo);
    }
}
