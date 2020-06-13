package svlevents.pavan.android.value_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        Toast.makeText(this, "OnCreat", Toast.LENGTH_SHORT).show();
        Log.i("lifecycle","onCreat");

    }

    public void submit(View view) {
        String fname=e1.getText().toString();
        String lname=e2.getText().toString();

        if(fname.equals("")||lname.equals("")){
            Toast.makeText(this,"fill all the fealds", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent=new Intent(this,MainActivity2.class);
            intent.putExtra("FNAME",fname);
            intent.putExtra("LNAME",lname);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        Log.i("lifecycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        Log.i("lifecycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        Log.i("lifecycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        Log.i("lifecycle","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
        Log.i("lifecycle","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        Log.i("lifecycle","onDestroy");
    }
}