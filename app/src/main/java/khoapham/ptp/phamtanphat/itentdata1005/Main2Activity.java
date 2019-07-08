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

//        1 : Chuoi
//        Intent intent = getIntent();
//        if (intent.hasExtra("chuoi")){
//            String chuoi = intent.getStringExtra("chuoi");
//            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
//        }
//        2 : So
//        Intent intent = getIntent();
//        if (intent.hasExtra("so")){
//            Integer number = intent.getIntExtra("so", Integer.MIN_VALUE);
//            Toast.makeText(this, number + "", Toast.LENGTH_SHORT).show();
//        }
        //3 : Object
        Intent intent = getIntent();
        if (intent.hasExtra("object")){
            Person person = (Person) intent.getSerializableExtra("object");
            Toast.makeText(this, person.name, Toast.LENGTH_SHORT).show();
        }

    }
}
