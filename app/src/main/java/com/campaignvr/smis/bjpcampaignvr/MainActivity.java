package com.campaignvr.smis.bjpcampaignvr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivBjpAR,ivBjpVR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivBjpAR = (ImageView) findViewById(R.id.ivAR);
        ivBjpVR = (ImageView) findViewById(R.id.ivVR);

        ivBjpVR.setOnClickListener(this);
        ivBjpAR.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ivAR:
                startBjpAR();
                break;

            case R.id.ivVR:
                startBjpVR();

                break;

        }

    }

    private void startBjpVR() {

    }

    private void startBjpAR() {
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
