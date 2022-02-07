package com.example.brainworker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.brainworker.R;

import org.w3c.dom.Text;

public class CalculatorActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EditText attack1;
    private EditText cdmg1;
    private TextView result1;
    private Button add1;

    private EditText evade1;
    private EditText accu1;
    private EditText crit1;
    private TextView result2;
    private Button add2;


    private EditText maxAttack1;
    private EditText cdmg2;
    private EditText skill1;
    private EditText bossbasic;
    private EditText ab1;
    private TextView result3;
    private Button add3;
    private double armor1 = 0.85;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_armor);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.armor,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        attack1 = (EditText) findViewById(R.id.attack);
        cdmg1 = (EditText) findViewById(R.id.cdmg);
        result1 = (TextView) findViewById(R.id.AnswerBrute);
        add1 = (Button) findViewById(R.id.button1);

        evade1 = (EditText) findViewById(R.id.mobevade_id);
        accu1 = (EditText) findViewById(R.id.accu_id);
        crit1 = (EditText) findViewById(R.id.crit_id);
        result2 = (TextView) findViewById(R.id.AnswerCrit);
        add2 = (Button) findViewById(R.id.button2);

        maxAttack1 = (EditText) findViewById(R.id.max_atk_id);
        cdmg2 = (EditText) findViewById(R.id.max_crit_id);
        skill1 = (EditText) findViewById(R.id.skill_id);
        bossbasic = (EditText) findViewById(R.id.boss_easy_id);
        result3 = (TextView) findViewById(R.id.AnswerDmg);
        add3 = (Button) findViewById(R.id.button3);





        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int attack = Integer.parseInt(attack1.getText().toString());
                int cdmg = Integer.parseInt(cdmg1.getText().toString());
                double sum = attack+ attack * 0.8 + cdmg;
                result1.setText(String.valueOf(sum));

            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int evade = Integer.parseInt(evade1.getText().toString());
                int accu = Integer.parseInt(accu1.getText().toString());
                int crit = Integer.parseInt(crit1.getText().toString());
                float sum2 = (accu - evade)/ 50+crit;
                result2.setText(String.valueOf(sum2)+'%');

            }
        });

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int atk = Integer.parseInt(maxAttack1.getText().toString());
                int cdmg = Integer.parseInt(cdmg2.getText().toString());
                int skill = Integer.parseInt(skill1.getText().toString());
                int bossb = Integer.parseInt(bossbasic.getText().toString());
                double sum3 =  ((atk + cdmg) * (skill / 100) * (1 + (bossb / 100)));
                double sum4 =  armor1 * sum3;
                double sum5 =  (sum4 + (sum4*0.5));
                int sum =(int)sum5;
                result3.setText(String.valueOf(sum));


            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
