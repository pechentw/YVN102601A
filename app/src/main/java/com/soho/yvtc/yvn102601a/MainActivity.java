package com.soho.yvtc.yvn102601a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv2= (TextView) findViewById(R.id.textView2);
        tv3= (TextView) findViewById(R.id.textView3);
        spinner=(Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //選了就立刻更新
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                TextView t = (TextView) view;
//                String str = t.getText().toString();
                String[] arr = getResources().getStringArray(R.array.fruits);
                String str = arr[position];
                tv2.setText(str);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void click1(View v)
    {
        EditText ed = (EditText)findViewById(R.id.editText);
        String str = ed.getText().toString();
        Log.d("MYLOG", str);
    }
    public void click2(View v) ////方法2 選了ok 按鈕(click2)才更新
    {
        int position = spinner.getSelectedItemPosition();
        String[] arr = getResources().getStringArray(R.array.fruits);
        String str = arr[position];
        tv3.setText(str);
    }
}
