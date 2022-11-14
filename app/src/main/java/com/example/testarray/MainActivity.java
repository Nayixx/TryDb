package com.example.testarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<answers> answer = new ArrayList<answers>();
        answer.add(new answers("english","b","a","c","b","a","c","c","a","d","d"));
        answer.add(new answers("math","b","a","c","b","a","c","c","a","d","d"));
        answer.add(new answers("science","b","a","c","b","a","c","c","a","d","d"));
        answer.add(new answers("dcit","b","a","c","b","a","c","c","a","d","d"));
        answer.add(new answers("long quiz","b","a","c","b","a","c","c","a","d","d"));

        btn = (Button)findViewById(R.id.insert);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0; i<answer.size(); i++){
                    db.insertData(answer.get(i).set,
                            answer.get(i).getOne(),
                            answer.get(i).getTwo(),
                            answer.get(i).getThree(),
                            answer.get(i).getFour(),
                            answer.get(i).getFive(),
                            answer.get(i).getSix(),
                            answer.get(i).getSeven(),
                            answer.get(i).getEight(),
                            answer.get(i).getNine(),
                            answer.get(i).getTen());
                }
            }
        });

    }

}