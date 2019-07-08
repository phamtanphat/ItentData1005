package khoapham.ptp.phamtanphat.itentdata1005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnItentString,btnIntentInteger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnItentString = findViewById(R.id.buttonIntentString);
        btnIntentInteger = findViewById(R.id.buttonIntentInteger);

        btnItentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intentdata("chuoi","hello main");
            }
        });
        btnIntentInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentdata("so",1);
            }
        });
    }
    //generic type
    private <P> void intentdata(String key , P value){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        if (value instanceof String){
            intent.putExtra(key,(String) value);
        }
        if (value instanceof Integer){
            intent.putExtra(key,(Integer) value);
        }

        startActivity(intent);
    }
}
