package com.example.syk31.capstone;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;



import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter, adapter1, adapter2, adapter3;
    private Spinner spinner;
    private String userID;
    private String userPassword;
    private String userPassword_check;
    private String category;
    private String userName;
    private String userTel;
    private String userAreaname;
    private String userAddress;
    private String userImg;
    private AlertDialog dialog;
    private boolean validate = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner spin1 = (Spinner) findViewById(R.id.address1);
        final Spinner spin2 = (Spinner) findViewById(R.id.address2);
        final Spinner spin3 = (Spinner) findViewById(R.id.address3);





        adapter1 = ArrayAdapter.createFromResource(this, R.array.areaname, android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter1);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapter1.getItem(i).equals("제주")) {
                    adapter2 = ArrayAdapter.createFromResource(MainActivity.this, R.array.제주, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adapter2);
                } else if (adapter1.getItem(i).equals("서울")) {
                    adapter2 = ArrayAdapter.createFromResource(MainActivity.this, R.array.서울, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adapter2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapter2.getItem(i).equals("제주시")) {
                    adapter3 = ArrayAdapter.createFromResource(MainActivity.this, R.array.제주시, android.R.layout.simple_spinner_dropdown_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin3.setAdapter(adapter3);
                } else if (adapter2.getItem(i).equals("서귀포시")) {
                    adapter3 = ArrayAdapter.createFromResource(MainActivity.this, R.array.서귀포시, android.R.layout.simple_spinner_dropdown_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin3.setAdapter(adapter3);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}