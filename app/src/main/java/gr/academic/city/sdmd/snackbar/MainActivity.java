package gr.academic.city.sdmd.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvSnacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSnacks = (TextView) findViewById(R.id.tv_snacks);

        findViewById(R.id.btn_snacks).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnacks();
            }
        });
    }

    private void showSnacks() {

        tvSnacks.setText(R.string.got_snacks);

        Snackbar.make(findViewById(R.id.coordinator_layout),
                R.string.msg_snackbar, Snackbar.LENGTH_LONG).setAction(R.string.take_away, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSnacks.setText(R.string.no_snacks);
            }
        }).show();
    }
}
