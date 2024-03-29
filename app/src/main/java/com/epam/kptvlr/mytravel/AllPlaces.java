package com.epam.kptvlr.mytravel;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class AllPlaces extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_places);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.all_places, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    // получаем экземпляр элемента ListView
    ListView lv = (ListView)findViewById(R.id.listView);

    // определяем массив типа String
    final String[] placenames = new String[] {
            "Австралия", "Португалия", "Польша", "Россия", "Греция",
            "Румыния", "Болгария", "Италия", "Бразилия", "Чили",
            "Мексика", "Канада", "США"
    };

    // используем адаптер данных
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, placenames);

    lv.setAdapter(adapter);

}
