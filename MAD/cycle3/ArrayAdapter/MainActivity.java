package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lview;
    String [] days={"sunday","monday","Tuesday","Wednesday","Thursday","Friday","Saturaday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview=findViewById(R.id.listview);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,days);
        lview.setAdapter(adapter);
        lview.setOnItemClickListener(this);
    }
    @Override
    public  void  onItemClick(AdapterView adapterView, View view,int position,long id){
        TextView temp=(TextView) view;
        Toast.makeText(this, "You Clicked"+temp.getText()+" at "+position,Toast.LENGTH_SHORT).show();
    }
}
