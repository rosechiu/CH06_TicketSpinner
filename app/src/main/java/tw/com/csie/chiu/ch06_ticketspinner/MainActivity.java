package tw.com.csie.chiu.ch06_ticketspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txv;
    Spinner cinema; //Spinner物件
    Spinner event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView)findViewById(R.id.txv); //取得TextView物件
        cinema = (Spinner)findViewById(R.id.cinema);    //取得Spinner物件
        event = (Spinner)findViewById(R.id.event);
    }

    public void order(View v){
        String[] cinemas = getResources().getStringArray(R.array.cinemas);
        String[] events = getResources().getStringArray(R.array.events);

        int index_cinema = cinema.getSelectedItemPosition();
        int index_event = event.getSelectedItemPosition();

        txv.setText("訂" + cinemas[index_cinema] + events[index_event] + "的票");
    }

}
