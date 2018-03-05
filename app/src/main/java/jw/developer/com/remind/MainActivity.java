package jw.developer.com.remind;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import jw.developer.com.remind.adapter.ListAdapter;
import jw.developer.com.remind.model.MainListItem;

public class MainActivity extends AppCompatActivity {

    ListView mainList;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainList = (ListView) findViewById(R.id.mainList);

        adapter = new ListAdapter(getApplicationContext());
        adapter.addItem(new MainListItem("FLAGMENT", "jw.developer.com.remind", "FlagmentActivity"));

        mainList.setAdapter(adapter);

        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MainListItem mainListItem = (MainListItem)adapter.getItem(i);
                ComponentName name = new ComponentName(mainListItem.getPackageName(), mainListItem.getPackageName() + "." + mainListItem.getClassName());
                Intent intent = new Intent();
                intent.setComponent(name);
                startActivity(intent);
            }
        });

    }
}
