package com.example.androidapp.java;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.androidapp.R;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class UpdateListingsEmployer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_listings_employer);

        final ListView list = findViewById(R.id.listWithSkillsLevels);
        ArrayList<String> arrayList = new ArrayList<>();

        // TODO make a loop with skills and its levels from data base and show a list
        arrayList.add("Skill or competency");
        arrayList.add("Level of Experience");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) list.getItemAtPosition(position);
                Toast.makeText(UpdateListingsEmployer.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
}
