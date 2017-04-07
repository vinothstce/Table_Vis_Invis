package com.internet.table_vis_invis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    TableLayout ll;
    Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (TableLayout) findViewById(R.id.tl);
        b4 = (Button) findViewById(R.id.button);
    }

    public void gayab(View v) {
//visible and invisible collumn
        ll.setColumnCollapsed(0, !ll.isColumnCollapsed(0));
        if (ll.isColumnCollapsed(0)) {
            b4.setText("Show");
        } else {
            b4.setText("Hide");
        }
    }
}