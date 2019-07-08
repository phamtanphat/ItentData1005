package khoapham.ptp.phamtanphat.itentdata1005;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        if (intent.hasExtra("chuoi")){
            String chuoi = intent.getStringExtra("chuoi");
            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
        }


    }
}
