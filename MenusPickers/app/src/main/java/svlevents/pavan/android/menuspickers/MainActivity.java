package svlevents.pavan.android.menuspickers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int c_date,c_month,c_year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this,""+item.getTitle(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.dail:
                Toast.makeText(this,""+item.getTitle(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.call:
                Toast.makeText(this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void alert(View view) {
        AlertDialog.Builder alertDailog=new AlertDialog.Builder(this);
        alertDailog.setTitle("this is alert Dailog");
        alertDailog.setMessage("Are you want to close the app?");
        alertDailog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDailog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDailog.setCancelable(false);

        alertDailog.show();
    }

    public void datepicker(View view) {

        Calendar c=Calendar.getInstance();
        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_date=c.get(Calendar.DATE);

        DatePickerDialog datePicker=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Toast.makeText(MainActivity.this, dayOfMonth+"-"+(month+1)+"-"+year, Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_date);
        datePicker.show();
    }

    public void timepicker(View view) {
    }
}