package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    Button button;
        String subject[] = {"Comiler Design", "Wireless Communication", "Mobile Application Development", "Cloud Computing", "Artificial Intelligence"};
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button=(Button)findViewById(R.id.button);
      text=(TextView)findViewById(R.id.texid);


        simpleList = (ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_listview2, R.id.textView, subject);
        simpleList.setAdapter(arrayAdapter);

simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        Toast.makeText(getBaseContext(), adapterView.getItemAtPosition(i) + " is selected", Toast.LENGTH_SHORT).show();
        String pos=adapterView.getItemAtPosition(i).toString();
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text.setText(pos);

                    }
                });

    }
});
    }

}
