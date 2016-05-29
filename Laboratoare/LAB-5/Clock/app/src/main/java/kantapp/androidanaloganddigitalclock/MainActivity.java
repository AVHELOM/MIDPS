package kantapp.androidanaloganddigitalclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity
{
    Button button;
    AnalogClock analogClock;
    DigitalClock digitalClock;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         digitalClock=(DigitalClock)findViewById(R.id.digitalClock);

        analogClock=(AnalogClock)findViewById(R.id.analogClock);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if ((analogClock.getVisibility()==analogClock.GONE))
                {
                    analogClock.setVisibility(analogClock.VISIBLE);
                    digitalClock.setVisibility(digitalClock.GONE);
                }
                else
                {
                    analogClock.setVisibility(analogClock.GONE);
                    digitalClock.setVisibility(digitalClock.VISIBLE);
                }
            }
        });
    }
}
