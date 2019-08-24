package ir.greencode.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//EditText etHeight,etWeight;
//Button btnBmi;
//TextView tvBmiResult;
//TextView tvWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//float weight = Float.parseFloat(etWeight.getText().toString());
//float height = Float.parseFloat(etHeight.getText().toString());
bmi BMI = new bmi(42,1.55f);
        Log.d("App",BMI.bmi_result());
    }
}
