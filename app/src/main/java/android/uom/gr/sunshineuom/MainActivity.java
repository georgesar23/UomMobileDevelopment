package android.uom.gr.sunshineuom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data = {
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - Error! - 23/18",
            "Sun 6/29 - Sunny - 20/7"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> dummyList = Arrays.asList(data);

        ArrayAdapter<String> forecastListAdapter =
                new ArrayAdapter<String>(
                        this,
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview, dummyList);

        ListView forecastListView = (ListView)findViewById(R.id.listview_forecast);
        forecastListView.setAdapter(forecastListAdapter);

    }

}
