package com.example.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    TextView tv1,tv2,tv3;
    CheckBox a;
    CheckBox b;
    CheckBox c;
    CheckBox d;
    Button bt;
    RadioGroup rg;
    int q,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.name);
        tv1=(TextView)findViewById(R.id.ques);
        tv2=(TextView)findViewById(R.id.response);
        tv3=(TextView)findViewById(R.id.score);
        rg=(RadioGroup)findViewById(R.id.optionGroup);
        a=(CheckBox)findViewById(R.id.option1);
        b=(CheckBox)findViewById(R.id.option2);
        c=(CheckBox)findViewById(R.id.option3);
        d=(CheckBox)findViewById(R.id.option4);
        bt=(Button)findViewById(R.id.next);
        q=0;
        s=0;

    }
    public void quiz(View v){
        switch (q){
            case 0:
            {
                rg.setVisibility(View.VISIBLE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                ed1.setEnabled(true);
                bt.setText("Dalej");

                s=0;

                tv1.setText("1. Dlaczego WSB jest cudowne ");
                a.setText("bo jest w Chorzowie ");
                b.setText("bo jest w Dąbrowie Gorniczej ");
                c.setText("bo jest w Nowym Sączu");
                d.setText("bo go nigdzie nie ma");
                q=1;
                break;
            }
            case 1:
            {
                ed1.setEnabled(false);
                tv1.setText("2. Kto należy do 5 najbardziej kobiet rektorów w Polsce?");
                a.setText("Zdzisława Dacko Pikiewicz ");
                b.setText("Katarzyna Szczepańska Woszczyna ");
                c.setText("Robert Tomanek ");
                d.setText("Anna Chodakowska");

                if (a.isChecked() && c.isChecked() && d.isChecked()){
                    tv2.setText("Poprawna odpowiedź");
                    s=s+1;
                }
                else
                {
                    tv2.setText("Błąd! To oczywiscie Zdzisława Dacko Pikiewicz");
                }
                q=2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2:
            {
                tv1.setText("3. Które miasta są ubogacone WSB");
                a.setText("Będzin");
                b.setText("Warszawa");
                c.setText("Paryż");
                d.setText("Cieszyn");
                if (a.isChecked() && d.isChecked()){
                    s=s+4;
                    tv2.setText("Poprawna odpowiedź");
                }
                else
                {
                    tv2.setText("Błąd! Poprawna odpowiedź to Cieszyn");
                }
                q=3;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3:
            {
                tv1.setText("4. Kim Jest Bogusław Srebrny");
                a.setText("Imperatorem ciemności");
                b.setText("Wizardem kodu");
                c.setText("Nauczyciele");
                d.setText("Adminem mocy");
                if (a.isChecked() && b.isChecked()){
                    s=s+1;
                    tv2.setText("Poprawna odpowiedź");
                }
                else
                {
                    tv2.setText("Błąd! Nauczyciel!");
                }
                q=4;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4:
            {
                tv1.setText("5. Co to jest Kocoń ");
                a.setText("Wieś w gorach");
                b.setText("Matematyk");
                c.setText("Fizyk");
                d.setText("Następne wcielenie Kordiana");
                if (d.isChecked()){
                    s=s+1;
                    tv2.setText("Poprawna odpowiedź");
                }
                else
                {
                    tv2.setText("Błąd! to jest wieś");
                }
                q=5;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                bt.setText("Finish");
                break;
            }
            case 5:
            {
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                if (a.isChecked() && c.isChecked()&& d.isChecked()){
                    s=s+1;
                    tv2.setText("Poprawna odpowiedź");
                }
                else
                {
                    tv2.setText("Błąd! Poprawna odpowiedź to wieś");
                }
                tv3.setText("Gratulacje "+ed1.getText()+" uzyskałeś "+s+" punktów");
                bt.setText("Restart");
                q=0;
                break;
            }
        }
    }
}