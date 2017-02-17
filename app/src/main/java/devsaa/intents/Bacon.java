package devsaa.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);


            String s =getIntent().getStringExtra("key");
            TextView Mr_bacon = (TextView) findViewById(R.id.Mr_bacon);
            Mr_bacon.setText(s);


        final Intent intention = new Intent(this,MainActivity.class);

        Button Mr_Anderson = (Button)findViewById(R.id.Mr_Anderson);

        Mr_Anderson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intention);
            }
        });


    }
}
