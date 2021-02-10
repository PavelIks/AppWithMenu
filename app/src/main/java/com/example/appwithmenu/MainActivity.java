package com.example.appwithmenu;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TimePicker;
import android.widget.DatePicker;
import android.widget.TextView;
import java.util.Calendar;

// DatePickerDialog
/*public class MainActivity extends AppCompatActivity
{
    TextView currentDateTime_ID;
    Calendar dateAndTime = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentDateTime_ID = (TextView)findViewById(R.id.DateTime_TV_ID);
        setInitialDateTime();
    }

    public void setTime(View v)
    {
        new DatePickerDialog(MainActivity.this,
                t,
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_YEAR)).show();
    }

    private void setInitialDateTime()
    {
        currentDateTime_ID.setText(DateUtils.formatDateTime(this,
                dateAndTime.getTimeInMillis(),
                  DateUtils.FORMAT_ABBREV_MONTH |
                        DateUtils.FORMAT_SHOW_YEAR));
    }

    DatePickerDialog.OnDateSetListener t = new DatePickerDialog.OnDateSetListener()
    {
        @Override
        public void onDateSet(DatePicker view, int i, int i1, int i2)
        {
            dateAndTime.set(Calendar.YEAR, i);
            dateAndTime.set(Calendar.MONTH, i1);
            dateAndTime.set(Calendar.DAY_OF_YEAR, i2);
            setInitialDateTime();
        }
    };
}*/

// TimePicker
/*public class MainActivity extends AppCompatActivity
{
    TextView currentDateTime;
    Calendar dateAndTime = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentDateTime = (TextView)findViewById(R.id.DateTime_TV_ID);
        setInitialDateTime();

    }

    public void setTime(View v)
    {
        new TimePickerDialog(MainActivity.this,
                t,
                dateAndTime.get(Calendar.HOUR_OF_DAY),
                dateAndTime.get(Calendar.MINUTE),
                true).show();
    }

    private void setInitialDateTime()
    {
        currentDateTime.setText(DateUtils.formatDateTime
                (
                        this,
                        dateAndTime.getTimeInMillis(),
                            DateUtils.FORMAT_SHOW_DATE |
                                    DateUtils.FORMAT_SHOW_TIME |
                                    DateUtils.FORMAT_SHOW_YEAR
                ));
    }

    TimePickerDialog.OnTimeSetListener t = new TimePickerDialog.OnTimeSetListener()
    {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute)
        {
            dateAndTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
            dateAndTime.set(Calendar.MINUTE, minute);
            setInitialDateTime();
        }
    };
}*/