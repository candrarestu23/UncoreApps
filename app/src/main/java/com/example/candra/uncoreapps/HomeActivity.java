package com.example.candra.uncoreapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by candra on 3/5/2018.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        Button logoutButton = findViewById(R.id.logoutButton);
        TextView usernameText = findViewById(R.id.usernameText);
        Bundle dataIntent = getIntent().getExtras();
        String getUsername;
        if(dataIntent!=null){
            getUsername = (String) dataIntent.get("username");
            usernameText.setText(getUsername);
        }else{
            usernameText.setText("NO DATA");
        }
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoutIntent =  new Intent(HomeActivity.this, MainActivity.class);
                startActivity(logoutIntent);
                finish();
            }
        });
    }
}
