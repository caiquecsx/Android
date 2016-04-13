package caiquecsx.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String list[] = {"Android","iPhone","Macbook","Windows","iOS","Linux","Ultrabook"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ListView_Adapter adapter = new ListView_Adapter(MainActivity.this, R.layout.list_single,list);
        listView.setAdapter(adapter);

    }
}
