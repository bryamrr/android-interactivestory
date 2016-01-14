package la.devacademy.interactivestory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import la.devacademy.interactivestory.R;
import la.devacademy.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {

    private Page[] mPages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null) {
            name = "Amigo";
        }

        mPages = new Page[7];
    }

}
