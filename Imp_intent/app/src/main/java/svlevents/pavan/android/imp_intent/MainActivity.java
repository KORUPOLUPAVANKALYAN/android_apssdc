package svlevents.pavan.android.imp_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.et_text);
    }

    public void whatsapp(View view) {
        String s=text.getText().toString();
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+s));
        startActivity(i);
    }

    public void Dail(View view) {
        String s=text.getText().toString();
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+s));
        startActivity(i);
        ShareCompat.IntentBuilder.from(this)
                .setType("text/plain")
                .setChooserTitle("select one app")
                .setText(s)
                .startChooser();
    }
}