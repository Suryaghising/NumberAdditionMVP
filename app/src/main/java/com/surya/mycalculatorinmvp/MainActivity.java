package com.surya.mycalculatorinmvp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.surya.mycalculatorinmvp.model.SumModel;
import com.surya.mycalculatorinmvp.presenter.SumPresenter;
import com.surya.mycalculatorinmvp.view.IView;

public class MainActivity extends AppCompatActivity implements IView {

    EditText num1, num2;
    Button click;
    TextView result;
    SumPresenter sumPresenter;
    SumModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        click = findViewById(R.id.clickId);
        result = findViewById(R.id.displayId);

        sumPresenter = new SumPresenter(this);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model = new SumModel(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                sumPresenter.addNumbers(model);
            }
        });
    }

    @Override
    public void onSumCalculated(int result) {
        this.result.setText(""+result);
    }
}
