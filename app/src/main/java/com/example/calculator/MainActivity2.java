package com.example.calculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private EditText etNum1;
    private EditText etNum2;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnDot;
    Button btnAdd;
    Button btnSub;
    Button btnUmn;
    Button btnDel;
    Button btnRes;
    String oper = "";
    TextView tvResult;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        // находим элементы
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        btnAdd = (Button) findViewById(R.id.btnPlus);
        btnSub = (Button) findViewById(R.id.btnMinus);
        btnUmn = (Button) findViewById(R.id.btnUmn);
        btnDel = (Button) findViewById(R.id.btnDel);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnRes = (Button) findViewById(R.id.btnResult);

        tvResult = (TextView) findViewById(R.id.textResult);

        // прописываем обработчик
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnUmn.setOnClickListener(this);
        btnDel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }
//        binding.btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "0");
//            }
//        });
//        binding.btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "1");
//            }
//        });
//        binding.btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "2");
//            }
//        });
//        binding.btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "3");
//            }
//        });
//        binding.btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "4");
//            }
//        });
//        binding.btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "5");
//            }
//        });
//        binding.btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "6");
//            }
//        });
//        binding.btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "7");
//            }
//        });
//        binding.btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "8");
//            }
//        });
//        binding.btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "9");
//            }
//        });
//        binding.btnDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + ".");
//            }
//        });
//        binding.btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "0");
//            }
//        });
//        binding.btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "1");
//            }
//        });
//        binding.btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "2");
//            }
//        });
//        binding.btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "3");
//            }
//        });
//        binding.btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "4");
//            }
//        });
//        binding.btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "5");
//            }
//        });
//        binding.btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "6");
//            }
//        });
//        binding.btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum2.setText(binding.etNum2.getText() + "7");
//            }
//        });
//        binding.btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "8");
//            }
//        });
//        binding.btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + "9");
//            }
//        });
//        binding.btnDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.etNum1.setText(binding.etNum1.getText() + ".");
//            }
//        });
        // читаем EditText и заполняем переменные числами
        num1 = Float.parseFloat(etNum1.getText().toString());

        num2 = Float.parseFloat(etNum2.getText().toString());



        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        switch (v.getId()) {
            case R.id.btnPlus:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnMinus:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnUmn:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDel:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }

        // формируем строку вывода
        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}