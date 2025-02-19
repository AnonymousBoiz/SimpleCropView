package com.example.simplecropviewsample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.basic_sample_button).setOnClickListener(this);
    findViewById(R.id.rx_sample_button).setOnClickListener(this);

    // apply custom font
    FontUtils.setFont(findViewById(R.id.root_layout));

    initToolbar();
  }

  @Override public void onClick(View view) {
    if (view.getId() == R.id.basic_sample_button){
      startActivity(BasicActivity.createIntent(this));
    }
    if (view.getId() == R.id.rx_sample_button){
      startActivity(RxActivity.createIntent(this));
    }
  }

  private void initToolbar() {
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    ActionBar actionBar = getSupportActionBar();
    FontUtils.setTitle(actionBar, "SimpleCropView");
  }
}
