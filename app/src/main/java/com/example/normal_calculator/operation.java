package com.example.normal_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import java.text.DecimalFormat;

public class operation extends AppCompatActivity {
    private static final String CODE = "data";
    boolean focused = true;
    TextView input1, input2, input3, hint1, hint2, down_arrow_1, down_arrow_2, text1, text2, text3;
    Button one, two, three, four, five, six, seven, eight, nine, zero, double_zero, point, ac, remove, plus_minus, F, E, D, C, B, A;
    Spinner spin1, spin2;
    String[] s;
    int[] sp;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        //view definitions
        {
            Intent intent = getIntent();
            a = intent.getIntExtra(CODE, 0);
            one = findViewById(R.id.one);
            two = findViewById(R.id.two);
            three = findViewById(R.id.three);
            four = findViewById(R.id.four);
            five = findViewById(R.id.five);
            six = findViewById(R.id.six);
            seven = findViewById(R.id.seven);
            eight = findViewById(R.id.eight);
            nine = findViewById(R.id.nine);
            zero = findViewById(R.id.zero);
            double_zero = findViewById(R.id.double_zero);
            point = findViewById(R.id.dot);
            input1 = findViewById(R.id.TEXTVIEW);
            input2 = findViewById(R.id.TEXTVIEW2);
            input3 = findViewById(R.id.TEXTVIEW3);
            hint1 = findViewById(R.id.hint1);
            hint2 = findViewById(R.id.hint2);
            spin1 = findViewById(R.id.spinner);
            spin2 = findViewById(R.id.spinner2);
            down_arrow_1 = findViewById(R.id.textView2);
            down_arrow_2 = findViewById(R.id.textView);
            text1 = findViewById(R.id.TEXT1);
            text2 = findViewById(R.id.TEXT2);
            text3 = findViewById(R.id.TEXT3);
            ac = findViewById(R.id.button_ac);
            remove = findViewById(R.id.button_remove);
            sp = new int[]{1, 1};
        }
        setfocus();
        input1.setOnClickListener(view -> {
            focused = true;
            setfocus();
        });
        input2.setOnClickListener(view -> {
            focused = false;
            setfocus();
        });
        one.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-1");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("1");
            } else {
                getfocused().append("1");
            }
        });
        two.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-2");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("2");
            } else {
                getfocused().append("2");
            }
        });
        three.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-3");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("3");
            } else {
                getfocused().append("3");
            }
        });
        four.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-4");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("4");
            } else {
                getfocused().append("4");
            }
        });
        five.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-5");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("5");
            } else {
                getfocused().append("5");
            }
        });
        six.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-6");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("6");
            } else {
                getfocused().append("6");
            }
        });
        seven.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-7");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("7");
            } else {
                getfocused().append("7");
            }
        });
        eight.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-8");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("8");
            } else {
                getfocused().append("8");
            }
        });
        nine.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("-0")) {
                getfocused().setText("-9");
                return;
            }
            if (data.equals("0")) {
                getfocused().setText("9");
            } else {
                getfocused().append("9");
            }
        });
        zero.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("0") || data.equals("-0")) {
                return;
            }
            getfocused().append("0");
        });
        double_zero.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.equals("0") || data.equals("-0")) {
                return;
            }
            getfocused().append("00");
        });
        point.setOnClickListener(view -> {
            if (!getfocused().getText().toString().contains(".")) {
                getfocused().append(".");
            }
        });
        ac.setOnClickListener(view -> {
            input1.setText("0");
            input2.setText("0");
        });
        remove.setOnLongClickListener(view -> {
            getfocused().setText("0");
            return false;
        });
        remove.setOnClickListener(view -> {
            String data = getfocused().getText().toString();
            if (data.contains("E")) {
                return;
            }
            if (data.length() == 1) {
                getfocused().setText("0");
                return;
            }
            StringBuilder sb = new StringBuilder(data);
            if (data.contains("-") && data.length() == 2) {
                getfocused().setText("-0");
                return;
            }
            sb.deleteCharAt(data.length() - 1);
            getfocused().setText(sb);
        });
        switch (a) {
            case S.Area: {
//                Area
                s = new String[]{"km²", "Hectare", "m²", "dm²", "cm²", "mm²", "Acre", "mile²", "yard²", "foot²", "inch²", "vigha"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                set_hints();
                break;

            }
            case S.Data: {
//                Data
                s = new String[]{"B", "KB", "MB", "GB", "TB", "PB"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                spin1.setPadding(60, 0, 0, 0);
                spin2.setPadding(60, 0, 0, 0);
                set_hints();
                break;
            }
            case S.Volume: {
//                Volume
                s = new String[]{"m³", "dm³", "cm³", "mm³", "Liter", "Deciliter", "Centiliter", "Milliliter", "foot³", "inch³", "yard³", "AcreFoot"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                spin1.setPadding(60, 0, 0, 0);
                spin2.setPadding(60, 0, 0, 0);
                set_hints();
                break;
            }
            case S.Discount: {
//                Discount
                input3.setVisibility(View.VISIBLE);
                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                hint1.setVisibility(View.INVISIBLE);
                hint2.setVisibility(View.INVISIBLE);
                spin1.setVisibility(View.INVISIBLE);
                spin2.setVisibility(View.INVISIBLE);
                down_arrow_1.setVisibility(View.INVISIBLE);
                down_arrow_2.setVisibility(View.INVISIBLE);
                break;
            }
            case S.Length: {
//                Length
                s = new String[]{"km", "m", "dm", "cm", "mm", "nm", "mile", "yard", "foot", "inch", "LightYear"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                spin1.setPadding(60, 0, 0, 0);
                spin2.setPadding(60, 0, 0, 0);
                set_hints();
                break;
            }
            case S.Mass: {
//                Mass
                s = new String[]{"Tonne", "kg", "gram", "mg", "Quintal", "Pound", "Ounce", "Carat", "Grain"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                set_hints();
                break;
            }
            case S.Numeral: {
//                Numeral
                s = new String[]{"Binary", "Octal", "Decimal", "HexDecimal"};
                rework_for_numeral();
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                set_hints();
                break;
            }
            case S.Speed: {
//                Speed
                s = new String[]{"Light", "m/s", "km/h", "mph", "foot/s", "inch/s"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                set_hints();
                break;
            }
            case S.Temperature: {
//                Temperature
                s = new String[]{"°C", "°F", "K"};
                rework_for_temp();
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                spin1.setPadding(60, 0, 0, 0);
                spin2.setPadding(60, 0, 0, 0);
                set_hints();
                break;
            }
            case S.Time: {
//                Time
                s = new String[]{"Year", "Month", "Day", "Hour", "Minute", "Second", "Milli-S", "Micro-S", "Pico-S"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, s);
                spin1.setAdapter(adapter);
                spin2.setAdapter(adapter);
                set_hints();
                break;
            }
            default:
                Toast.makeText(this, "Access denied code-" + a * 10, Toast.LENGTH_SHORT).show();
                finish();
        }
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                position++;
                set_hints();
                sp[0] = position;
                spin_click_operation(1, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                position++;
                set_hints();
                sp[1] = position;
                spin_click_operation(0, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        input1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (getfocused().equals(input1)) {
                    spin_click_operation(1, sp[0]);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        input2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (getfocused().equals(input2)) {
                    spin_click_operation(1, sp[0]);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        input3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (a != S.Discount) {
                    return;
                }
                String data = input2.getText().toString();
                if (Double.parseDouble(data) > 100) {
                    StringBuilder sb = new StringBuilder(data);
                    sb.deleteCharAt(data.length() - 1);
                    input2.setText(sb);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        try {
            plus_minus.setOnClickListener(view -> {
                String data = getfocused().getText().toString();
                if (data.length() == 11 && !data.contains("-")) {
                    return;
                }
                getfocused().setText(
                        toFormatted(
                                String.valueOf(
                                        Double.parseDouble(data) * (-1)
                                )
                        )
                );
            });
        } catch (NullPointerException e) {
            Log.e("null_exception", "null pointer exception occurred on plus minus button when opened other activity");
        }
    }

    private void spin_click_operation(int i, int position) {
        String s = getfocused().getText().toString();
        switch (a) {
            case S.Area: {
                switch (position) {
                    case S.area.km2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.km2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.km2tohectare, s, i);
                                return;
                            }

                            case S.area.m2: {
                                conversion(S.area.km2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.km2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.km2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.km2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.km2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.km2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.km2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.km2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.km2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.km2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.hectare: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.hectaretokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.hectaretohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.hectaretom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.hectaretodm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.hectaretocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.hectaretomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.hectaretoacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.hectaretomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.hectaretoyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.hectaretofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.hectaretoinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.hectaretovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.m2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.m2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.m2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.m2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.m2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.m2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.m2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.m2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.m2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.m2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.m2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.m2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.m2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.dm2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.dm2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.dm2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.dm2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.dm2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.dm2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.dm2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.dm2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.dm2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.dm2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.dm2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.dm2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.dm2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.cm2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.cm2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.cm2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.cm2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.cm2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.cm2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.cm2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.cm2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.cm2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.cm2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.cm2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.cm2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.cm2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.mm2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.mm2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.mm2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.mm2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.mm2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.mm2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.mm2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.mm2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.mm2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.mm2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.mm2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.mm2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.mm2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.acre: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.acretokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.acretohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.acretom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.acretodm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.acretocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.acretomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.acretoacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.acretomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.acretoyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.acretofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.acretoinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.acretovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.mile2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.mile2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.mile2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.mile2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.mile2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.mile2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.mile2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.mile2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.mile2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.mile2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.mile2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.mile2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.mile2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.yard2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.yard2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.yard2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.yard2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.yard2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.yard2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.yard2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.yard2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.yard2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.yard2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.yard2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.yard2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.yard2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.foot2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.foot2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.foot2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.foot2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.foot2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.foot2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.foot2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.foot2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.foot2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.foot2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.foot2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.foot2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.foot2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.inch2: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.inch2tokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.inch2tohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.inch2tom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.inch2todm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.inch2tocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.inch2tomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.inch2toacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.inch2tomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.inch2toyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.inch2tofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.inch2toinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.inch2tovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.area.vigha: {
                        switch (sp[i]) {
                            case S.area.km2: {
                                conversion(S.area.vighatokm2, s, i);
                                return;
                            }
                            case S.area.hectare: {
                                conversion(S.area.vighatohectare, s, i);
                                return;
                            }
                            case S.area.m2: {
                                conversion(S.area.vighatom2, s, i);
                                return;
                            }
                            case S.area.dm2: {
                                conversion(S.area.vighatodm2, s, i);
                                return;
                            }
                            case S.area.cm2: {
                                conversion(S.area.vighatocm2, s, i);
                                return;
                            }
                            case S.area.mm2: {
                                conversion(S.area.vighatomm2, s, i);
                                return;
                            }
                            case S.area.acre: {
                                conversion(S.area.vighatoacre, s, i);
                                return;
                            }
                            case S.area.mile2: {
                                conversion(S.area.vighatomile2, s, i);
                                return;
                            }
                            case S.area.yard2: {
                                conversion(S.area.vighatoyard2, s, i);
                                return;
                            }
                            case S.area.foot2: {
                                conversion(S.area.vighatofoot2, s, i);
                                return;
                            }
                            case S.area.inch2: {
                                conversion(S.area.vighatoinch2, s, i);
                                return;
                            }
                            case S.area.vigha: {
                                conversion(S.area.vighatovigha, s, i);
                                return;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case S.Data: {
                switch (position) {
                    case S.data.B: {
                        switch (sp[i]) {
                            case S.data.B: {
                                conversion(S.data.B2B, s, i);
                                break;
                            }
                            case S.data.KB: {
                                conversion(S.data.B2KB, s, i);
                                break;
                            }
                            case S.data.MB: {
                                conversion(S.data.B2MB, s, i);
                                break;
                            }
                            case S.data.GB: {
                                conversion(S.data.B2GB, s, i);
                                break;
                            }
                            case S.data.TB: {
                                conversion(S.data.B2TB, s, i);
                                break;
                            }
                            case S.data.PB: {
                                conversion(S.data.B2PB, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.data.KB: {
                        switch (sp[i]) {
                            case S.data.B: {
                                conversion(S.data.KB2B, s, i);
                                break;
                            }
                            case S.data.KB: {
                                conversion(S.data.KB2KB, s, i);
                                break;
                            }
                            case S.data.MB: {
                                conversion(S.data.KB2MB, s, i);
                                break;
                            }
                            case S.data.GB: {
                                conversion(S.data.KB2GB, s, i);
                                break;
                            }
                            case S.data.TB: {
                                conversion(S.data.KB2TB, s, i);
                                break;
                            }
                            case S.data.PB: {
                                conversion(S.data.KB2PB, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.data.MB: {
                        switch (sp[i]) {
                            case S.data.B: {
                                conversion(S.data.MB2B, s, i);
                                break;
                            }
                            case S.data.KB: {
                                conversion(S.data.MB2KB, s, i);
                                break;
                            }
                            case S.data.MB: {
                                conversion(S.data.MB2MB, s, i);
                                break;
                            }
                            case S.data.GB: {
                                conversion(S.data.MB2GB, s, i);
                                break;
                            }
                            case S.data.TB: {
                                conversion(S.data.MB2TB, s, i);
                                break;
                            }
                            case S.data.PB: {
                                conversion(S.data.MB2PB, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.data.GB: {
                        switch (sp[i]) {
                            case S.data.B: {
                                conversion(S.data.GB2B, s, i);
                                break;
                            }
                            case S.data.KB: {
                                conversion(S.data.GB2KB, s, i);
                                break;
                            }
                            case S.data.MB: {
                                conversion(S.data.GB2MB, s, i);
                                break;
                            }
                            case S.data.GB: {
                                conversion(S.data.GB2GB, s, i);
                                break;
                            }
                            case S.data.TB: {
                                conversion(S.data.GB2TB, s, i);
                                break;
                            }
                            case S.data.PB: {
                                conversion(S.data.GB2PB, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.data.TB: {
                        switch (sp[i]) {
                            case S.data.B: {
                                conversion(S.data.TB2B, s, i);
                                break;
                            }
                            case S.data.KB: {
                                conversion(S.data.TB2KB, s, i);
                                break;
                            }
                            case S.data.MB: {
                                conversion(S.data.TB2MB, s, i);
                                break;
                            }
                            case S.data.GB: {
                                conversion(S.data.TB2GB, s, i);
                                break;
                            }
                            case S.data.TB: {
                                conversion(S.data.TB2TB, s, i);
                                break;
                            }
                            case S.data.PB: {
                                conversion(S.data.TB2PB, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.data.PB: {
                        switch (sp[i]) {
                            case S.data.B: {
                                conversion(S.data.PB2B, s, i);
                                break;
                            }
                            case S.data.KB: {
                                conversion(S.data.PB2KB, s, i);
                                break;
                            }
                            case S.data.MB: {
                                conversion(S.data.PB2MB, s, i);
                                break;
                            }
                            case S.data.GB: {
                                conversion(S.data.PB2GB, s, i);
                                break;
                            }
                            case S.data.TB: {
                                conversion(S.data.PB2TB, s, i);
                                break;
                            }
                            case S.data.PB: {
                                conversion(S.data.PB2PB, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case S.Volume: {
                switch (position) {
                    case S.volume.m3: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.m3tom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.m3todm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.m3tocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.m3tomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.m3toliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.m3todeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.m3tocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.m3tomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.m3tofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.m3toinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.m3toyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.m3toacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.dm3: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.dm3tom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.dm3todm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.dm3tocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.dm3tomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.dm3toliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.dm3todeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.dm3tocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.dm3tomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.dm3tofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.dm3toinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.dm3toyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.dm3toacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.cm3: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.cm3tom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.cm3todm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.cm3tocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.cm3tomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.cm3toliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.cm3todeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.cm3tocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.cm3tomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.cm3tofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.cm3toinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.cm3toyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.cm3toacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.mm3: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.mm3tom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.mm3todm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.mm3tocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.mm3tomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.mm3toliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.mm3todeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.mm3tocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.mm3tomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.mm3tofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.mm3toinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.mm3toyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.mm3toacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.liter: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.litertom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.litertodm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.litertocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.litertomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.litertoliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.litertodeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.litertocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.litertomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.litertofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.litertoinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.litertoyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.litertoacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.deciliter: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.decilitertom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.decilitertodm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.decilitertocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.decilitertomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.decilitertoliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.decilitertodeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.decilitertocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.decilitertomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.decilitertofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.decilitertoinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.decilitertoyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.decilitertoacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.centiliter: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.centilitertom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.centilitertodm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.centilitertocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.centilitertomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.centilitertoliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.centilitertodeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.centilitertocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.centilitertomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.centilitertofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.centilitertoinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.centilitertoyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.centilitertoacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.milliliter: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.millilitertom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.millilitertodm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.millilitertocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.millilitertomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.millilitertoliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.millilitertodeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.millilitertocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.millilitertomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.millilitertofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.millilitertoinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.millilitertoyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.millilitertoacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.foot3: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.foot3tom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.foot3todm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.foot3tocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.foot3tomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.foot3toliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.foot3todeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.foot3tocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.foot3tomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.foot3tofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.foot3toinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.foot3toyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.foot3toacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.inch3: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.inch3tom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.inch3todm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.inch3tocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.inch3tomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.inch3toliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.inch3todeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.inch3tocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.inch3tomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.inch3tofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.inch3toinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.inch3toyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.inch3toacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.yard3: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.yard3tom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.yard3todm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.yard3tocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.yard3tomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.yard3toliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.yard3todeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.yard3tocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.yard3tomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.yard3tofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.yard3toinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.yard3toyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.yard3toacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.volume.acrefoot: {
                        switch (sp[i]) {
                            case S.volume.m3: {
                                conversion(S.volume.acrefoottom3, s, i);
                                break;
                            }
                            case S.volume.dm3: {
                                conversion(S.volume.acrefoottodm3, s, i);
                                break;
                            }
                            case S.volume.cm3: {
                                conversion(S.volume.acrefoottocm3, s, i);
                                break;
                            }
                            case S.volume.mm3: {
                                conversion(S.volume.acrefoottomm3, s, i);
                                break;
                            }
                            case S.volume.liter: {
                                conversion(S.volume.acrefoottoliter, s, i);
                                break;
                            }
                            case S.volume.deciliter: {
                                conversion(S.volume.acrefoottodeciliter, s, i);
                                break;
                            }
                            case S.volume.centiliter: {
                                conversion(S.volume.acrefoottocentiliter, s, i);
                                break;
                            }
                            case S.volume.milliliter: {
                                conversion(S.volume.acrefoottomilliliter, s, i);
                                break;
                            }
                            case S.volume.foot3: {
                                conversion(S.volume.acrefoottofoot3, s, i);
                                break;
                            }
                            case S.volume.inch3: {
                                conversion(S.volume.acrefoottoinch3, s, i);
                                break;
                            }
                            case S.volume.yard3: {
                                conversion(S.volume.acrefoottoyard3, s, i);
                                break;
                            }
                            case S.volume.acrefoot: {
                                conversion(S.volume.acrefoottoacrefoot, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case S.Discount: {
                double amount = Double.parseDouble(input1.getText().toString());
                double discount = Double.parseDouble(input2.getText().toString());
                double final_price = amount - ((amount * discount) / 100);
                input3.setText(toFormatted(String.valueOf(final_price)));
                break;
            }
            case S.Length: {
                switch (position) {
                    case S.length.km: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.kmtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.kmtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.kmtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.kmtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.kmtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.kmtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.kmtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.kmtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.kmtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.kmtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.kmtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.m: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.mtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.mtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.mtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.mtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.mtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.mtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.mtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.mtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.mtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.mtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.mtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.dm: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.dmtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.dmtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.dmtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.dmtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.dmtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.dmtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.dmtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.dmtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.dmtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.dmtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.dmtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.cm: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.cmtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.cmtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.cmtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.cmtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.cmtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.cmtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.cmtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.cmtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.cmtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.cmtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.cmtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.mm: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.mmtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.mmtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.mmtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.mmtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.mmtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.mmtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.mmtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.mmtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.mmtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.mmtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.mmtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.nm: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.nmtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.nmtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.nmtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.nmtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.nmtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.nmtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.nmtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.nmtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.nmtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.nmtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.nmtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.mile: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.miletokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.miletom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.miletodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.miletocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.miletomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.miletonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.miletomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.miletoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.miletofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.miletoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.miletolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.yard: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.yardtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.yardtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.yardtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.yardtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.yardtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.yardtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.yardtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.yardtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.yardtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.yardtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.yardtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.foot: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.foottokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.foottom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.foottodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.foottocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.foottomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.foottonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.foottomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.foottoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.foottofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.foottoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.foottolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.inch: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.inchtokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.inchtom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.inchtodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.inchtocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.inchtomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.inchtonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.inchtomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.inchtoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.inchtofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.inchtoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.inchtolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.length.lightyear: {
                        switch (sp[i]) {
                            case S.length.km: {
                                conversion(S.length.lightyeartokm, s, i);
                                break;
                            }
                            case S.length.m: {
                                conversion(S.length.lightyeartom, s, i);
                                break;
                            }
                            case S.length.dm: {
                                conversion(S.length.lightyeartodm, s, i);
                                break;
                            }
                            case S.length.cm: {
                                conversion(S.length.lightyeartocm, s, i);
                                break;
                            }
                            case S.length.mm: {
                                conversion(S.length.lightyeartomm, s, i);
                                break;
                            }
                            case S.length.nm: {
                                conversion(S.length.lightyeartonm, s, i);
                                break;
                            }
                            case S.length.mile: {
                                conversion(S.length.lightyeartomile, s, i);
                                break;
                            }
                            case S.length.yard: {
                                conversion(S.length.lightyeartoyard, s, i);
                                break;
                            }
                            case S.length.foot: {
                                conversion(S.length.lightyeartofoot, s, i);
                                break;
                            }
                            case S.length.inch: {
                                conversion(S.length.lightyeartoinch, s, i);
                                break;
                            }
                            case S.length.lightyear: {
                                conversion(S.length.lightyeartolightyear, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case S.Mass: {
                switch (position) {
                    case S.mass.tonne: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.tonnetotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.tonnetokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.tonnetogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.tonnetomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.tonnetoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.tonnetopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.tonnetoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.tonnetocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.tonnetograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.kg: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.kgtotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.kgtokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.kgtogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.kgtomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.kgtoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.kgtopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.kgtoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.kgtocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.kgtograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.gram: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.gramtotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.gramtokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.gramtogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.gramtomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.gramtoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.gramtopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.gramtoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.gramtocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.gramtograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.mg: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.mgtotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.mgtokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.mgtogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.mgtomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.mgtoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.mgtopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.mgtoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.mgtocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.mgtograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.quintal: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.quintaltotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.quintaltokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.quintaltogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.quintaltomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.quintaltoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.quintaltopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.quintaltoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.quintaltocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.quintaltograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.pound: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.poundtotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.poundtokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.poundtogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.poundtomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.poundtoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.poundtopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.poundtoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.poundtocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.poundtograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.ounce: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.ouncetotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.ouncetokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.ouncetogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.ouncetomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.ouncetoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.ouncetopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.ouncetoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.ouncetocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.ouncetograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.carat: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.carattotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.carattokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.carattogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.carattomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.carattoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.carattopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.carattoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.carattocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.carattograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.mass.grain: {
                        switch (sp[i]) {
                            case S.mass.tonne: {
                                conversion(S.mass.graintotonne, s, i);
                                break;
                            }
                            case S.mass.kg: {
                                conversion(S.mass.graintokg, s, i);
                                break;
                            }
                            case S.mass.gram: {
                                conversion(S.mass.graintogram, s, i);
                                break;
                            }
                            case S.mass.mg: {
                                conversion(S.mass.graintomg, s, i);
                                break;
                            }
                            case S.mass.quintal: {
                                conversion(S.mass.graintoquintal, s, i);
                                break;
                            }
                            case S.mass.pound: {
                                conversion(S.mass.graintopound, s, i);
                                break;
                            }
                            case S.mass.ounce: {
                                conversion(S.mass.graintoounce, s, i);
                                break;
                            }
                            case S.mass.carat: {
                                conversion(S.mass.graintocarat, s, i);
                                break;
                            }
                            case S.mass.grain: {
                                conversion(S.mass.graintograin, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }

                    default:
                        break;
                }
                break;
            }
            case S.Numeral: {
                break;
            }
            case S.Speed: {
                switch (position) {
                    case S.speed.light: {
                        switch (sp[i]) {
                            case S.speed.light: {
                                conversion(S.speed.LightSpeedtoLightSpeed, s, i);
                                break;
                            }
                            case S.speed.ms: {
                                conversion(S.speed.LightSpeedtoms, s, i);
                                break;
                            }
                            case S.speed.kmh: {
                                conversion(S.speed.LightSpeedtokmh, s, i);
                                break;
                            }
                            case S.speed.mph: {
                                conversion(S.speed.LightSpeedtomph, s, i);
                                break;
                            }
                            case S.speed.footps: {
                                conversion(S.speed.LightSpeedtofootps, s, i);
                                break;
                            }
                            case S.speed.inchps: {
                                conversion(S.speed.LightSpeedtoinchps, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.speed.ms: {
                        switch (sp[i]) {
                            case S.speed.light: {
                                conversion(S.speed.mstoLightSpeed, s, i);
                                break;
                            }
                            case S.speed.ms: {
                                conversion(S.speed.mstoms, s, i);
                                break;
                            }
                            case S.speed.kmh: {
                                conversion(S.speed.mstokmh, s, i);
                                break;
                            }
                            case S.speed.mph: {
                                conversion(S.speed.mstomph, s, i);
                                break;
                            }
                            case S.speed.footps: {
                                conversion(S.speed.mstofootps, s, i);
                                break;
                            }
                            case S.speed.inchps: {
                                conversion(S.speed.mstoinchps, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.speed.kmh: {
                        switch (sp[i]) {
                            case S.speed.light: {
                                conversion(S.speed.kmhtoLightSpeed, s, i);
                                break;
                            }
                            case S.speed.ms: {
                                conversion(S.speed.kmhtoms, s, i);
                                break;
                            }
                            case S.speed.kmh: {
                                conversion(S.speed.kmhtokmh, s, i);
                                break;
                            }
                            case S.speed.mph: {
                                conversion(S.speed.kmhtomph, s, i);
                                break;
                            }
                            case S.speed.footps: {
                                conversion(S.speed.kmhtofootps, s, i);
                                break;
                            }
                            case S.speed.inchps: {
                                conversion(S.speed.kmhtoinchps, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.speed.mph: {
                        switch (sp[i]) {
                            case S.speed.light: {
                                conversion(S.speed.mphtoLightSpeed, s, i);
                                break;
                            }
                            case S.speed.ms: {
                                conversion(S.speed.mphtoms, s, i);
                                break;
                            }
                            case S.speed.kmh: {
                                conversion(S.speed.mphtokmh, s, i);
                                break;
                            }
                            case S.speed.mph: {
                                conversion(S.speed.mphtomph, s, i);
                                break;
                            }
                            case S.speed.footps: {
                                conversion(S.speed.mphtofootps, s, i);
                                break;
                            }
                            case S.speed.inchps: {
                                conversion(S.speed.mphtoinchps, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.speed.footps: {
                        switch (sp[i]) {
                            case S.speed.light: {
                                conversion(S.speed.footpstoLightSpeed, s, i);
                                break;
                            }
                            case S.speed.ms: {
                                conversion(S.speed.footpstoms, s, i);
                                break;
                            }
                            case S.speed.kmh: {
                                conversion(S.speed.footpstokmh, s, i);
                                break;
                            }
                            case S.speed.mph: {
                                conversion(S.speed.footpstomph, s, i);
                                break;
                            }
                            case S.speed.footps: {
                                conversion(S.speed.footpstofootps, s, i);
                                break;
                            }
                            case S.speed.inchps: {
                                conversion(S.speed.footpstoinchps, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.speed.inchps: {
                        switch (sp[i]) {
                            case S.speed.light: {
                                conversion(S.speed.inchpstoLightSpeed, s, i);
                                break;
                            }
                            case S.speed.ms: {
                                conversion(S.speed.inchpstoms, s, i);
                                break;
                            }
                            case S.speed.kmh: {
                                conversion(S.speed.inchpstokmh, s, i);
                                break;
                            }
                            case S.speed.mph: {
                                conversion(S.speed.inchpstomph, s, i);
                                break;
                            }
                            case S.speed.footps: {
                                conversion(S.speed.inchpstofootps, s, i);
                                break;
                            }
                            case S.speed.inchps: {
                                conversion(S.speed.inchpstoinchps, s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case S.Temperature: {
                switch (position) {
                    case S.temperature.c: {
                        switch (sp[i]) {
                            case S.temperature.c: {
                                conversion("1", s, i);
                                break;
                            }
                            case S.temperature.f: {
                                if (i == 1) {
                                    if (getfocusedindex() == 1) {
                                        getnotfocused().setText(toFormatted(S.temperature.ctof(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ftoc(s)));
                                    }
                                } else {
                                    if (getfocusedindex() == 2) {
                                        getnotfocused().setText(toFormatted(S.temperature.ctof(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ftoc(s)));
                                    }
                                }
                                break;
                            }
                            case S.temperature.k: {
                                if (i == 1) {
                                    if (getfocusedindex() == 1) {
                                        getnotfocused().setText(toFormatted(S.temperature.ctok(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ktoc(s)));
                                    }
                                } else {
                                    if (getfocusedindex() == 2) {
                                        getnotfocused().setText(toFormatted(S.temperature.ctok(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ktoc(s)));
                                    }
                                }
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.temperature.f: {
                        switch (sp[i]) {
                            case S.temperature.c: {
                                if (i == 1) {
                                    if (getfocusedindex() == 1) {
                                        getnotfocused().setText(toFormatted(S.temperature.ftoc(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ctof(s)));
                                    }
                                } else {
                                    if (getfocusedindex() == 2) {
                                        getnotfocused().setText(toFormatted(S.temperature.ftoc(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ctof(s)));
                                    }
                                }
                                break;
                            }
                            case S.temperature.f: {
                                conversion("1", s, i);
                                break;
                            }
                            case S.temperature.k: {
                                if (i == 1) {
                                    if (getfocusedindex() == 1) {
                                        getnotfocused().setText(toFormatted(S.temperature.ftok(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ktof(s)));
                                    }
                                } else {
                                    if (getfocusedindex() == 2) {
                                        getnotfocused().setText(toFormatted(S.temperature.ftok(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ktof(s)));
                                    }
                                }
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case S.temperature.k: {
                        switch (sp[i]) {
                            case S.temperature.c: {
                                if (i == 1) {
                                    if (getfocusedindex() == 1) {
                                        getnotfocused().setText(toFormatted(S.temperature.ktoc(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ctok(s)));
                                    }
                                } else {
                                    if (getfocusedindex() == 2) {
                                        getnotfocused().setText(toFormatted(S.temperature.ktoc(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ctok(s)));
                                    }
                                }
                                break;
                            }
                            case S.temperature.f: {
                                if (i == 1) {
                                    if (getfocusedindex() == 1) {
                                        getnotfocused().setText(toFormatted(S.temperature.ktof(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ftok(s)));
                                    }
                                } else {
                                    if (getfocusedindex() == 2) {
                                        getnotfocused().setText(toFormatted(S.temperature.ktof(s)));
                                    } else {
                                        getnotfocused().setText(toFormatted(S.temperature.ftok(s)));
                                    }
                                }
                                break;
                            }
                            case S.temperature.k: {
                                conversion("1", s, i);
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case S.Time: {
                break;
            }
            default:
                Toast.makeText(getApplicationContext(), "You're not allowed here !!", Toast.LENGTH_SHORT).show();
                finish();
        }
    }

    String toFormatted(String s) {
        if (!s.contains("E")) {
            return new DecimalFormat("#.####").format(Double.parseDouble(s));
        }
        return new DecimalFormat("#.#####E0").format(Double.parseDouble(s));
    }

    private void rework_for_numeral() {
        LinearLayout linearLayout = findViewById(R.id.linearLayout3);
        LinearLayout linearLayout1 = findViewById(R.id.linearLayout1);
        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 225);
        layoutParams1.setMargins(8, 24, 8, 8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 225);
        layoutParams2.setMargins(8, 8, 8, 8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 225);
        layoutParams3.setMargins(24, 8, 8, 8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 225);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 225);
        F = new Button(getApplicationContext());
        E = new Button(getApplicationContext());
        D = new Button(getApplicationContext());
        C = new Button(getApplicationContext());
        B = new Button(getApplicationContext());
        A = new Button(getApplicationContext());

        ac.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        remove.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        F.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        E.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        D.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        C.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        B.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        A.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));

        F.setTextColor(getColor(R.color.black));
        E.setTextColor(getColor(R.color.black));
        D.setTextColor(getColor(R.color.black));
        C.setTextColor(getColor(R.color.black));
        B.setTextColor(getColor(R.color.black));
        A.setTextColor(getColor(R.color.black));

        F.setText(getString(R.string.F));
        E.setText(getString(R.string.E));
        D.setText(getString(R.string.D));
        C.setText(getString(R.string.C));
        B.setText(getString(R.string.B));
        A.setText(getString(R.string.A));

        ac.setTextSize(30);
        remove.setTextSize(30);
        F.setTextSize(30);
        E.setTextSize(30);
        D.setTextSize(30);
        C.setTextSize(30);
        B.setTextSize(30);
        A.setTextSize(30);
        remove.setPadding(60, 0, 20, 0);

        layoutParams4.setMargins(22, 8, 8, 8);
        layoutParams3.setMargins(20, 8, 2, 8);
        layoutParams5.setMargins(20, 8, 15, 8);

        ac.setLayoutParams(layoutParams4);
        remove.setLayoutParams(layoutParams3);
        F.setLayoutParams(layoutParams3);
        E.setLayoutParams(layoutParams5);
        D.setLayoutParams(layoutParams2);
        C.setLayoutParams(layoutParams1);
        B.setLayoutParams(layoutParams1);
        A.setLayoutParams(layoutParams1);

        linearLayout1.removeAllViews();
        linearLayout.addView(ac);
        linearLayout.addView(remove);
        linearLayout.addView(F);
        linearLayout.addView(E);
        linearLayout1.addView(D);
        linearLayout1.addView(C);
        linearLayout1.addView(B);
        linearLayout1.addView(A);
    }

    private void rework_for_temp() {
        LinearLayout linearLayout = findViewById(R.id.linearLayout1);
        plus_minus = new Button(getApplicationContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 225);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 225);
        layoutParams2.setMargins(8, 8, 8, 8);
        plus_minus.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        plus_minus.setText(getString(R.string.plus_minus));
        plus_minus.setTextSize(30);
        plus_minus.setTextColor(getColor(R.color.orange));
        layoutParams.setMargins(8, 24, 8, 10);
        ac.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        remove.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.button_background));
        remove.setPadding(60, 0, 20, 0);
        plus_minus.setLayoutParams(layoutParams);
        ac.setLayoutParams(layoutParams2);
        remove.setLayoutParams(layoutParams);
        linearLayout.addView(plus_minus);
    }

    public TextView getfocused() {
        if (focused) {
            return input1;
        }
        return input2;
    }

    public TextView getnotfocused() {
        if (focused) {
            return input2;
        }
        return input1;
    }

    int getfocusedindex() {
        if (focused) {
            return 1;
        }
        return 2;
    }

    public void setfocus() {
        if (focused) {
            input1.setTextColor(getColor(R.color.orange));
            input2.setTextColor(getColor(R.color.black));
            return;
        }
        input1.setTextColor(getColor(R.color.black));
        input2.setTextColor(getColor(R.color.orange));
    }

    public void set_hints() {
        String[] str = new String[]{spin1.getSelectedItem().toString(), spin2.getSelectedItem().toString()};
        main_loop:
        for (int i = 0; i < 2; i++) {
            switch (a) {
                case S.Area: {
                    if (str[i].equals("km²")) str[i] = "Kilometer Square";
                    if (str[i].equals("m²")) str[i] = "Meter Square";
                    if (str[i].equals("dm²")) str[i] = "Decimeter Square";
                    if (str[i].equals("cm²")) str[i] = "Centimeter Square";
                    if (str[i].equals("mm²")) str[i] = "Millimeter Square";
                    if (str[i].equals("mile²")) str[i] = "Mile Square";
                    if (str[i].equals("yard²")) str[i] = "Yard Square";
                    if (str[i].equals("foot²")) str[i] = "Foot Square";
                    if (str[i].equals("inch²")) str[i] = "Inch Square";
                    break;
                }
                case S.Data: {
                    if (str[i].equals("B")) str[i] = "Byte";
                    if (str[i].equals("KB")) str[i] = "Kilo Byte";
                    if (str[i].equals("MB")) str[i] = "Mega Byte";
                    if (str[i].equals("GB")) str[i] = "Giga Byte";
                    if (str[i].equals("TB")) str[i] = "Tera Byte";
                    if (str[i].equals("PB")) str[i] = "Peta Byte";
                    break;
                }
                case S.Volume: {
                    if (str[i].equals("m³")) str[i] = "Cubic Meter";
                    if (str[i].equals("dm³")) str[i] = "Cubic Decimeter";
                    if (str[i].equals("cm³")) str[i] = "Cubic Centimeter";
                    if (str[i].equals("mm³")) str[i] = "Cubic Millimeter";
                    if (str[i].equals("foot³")) str[i] = "Cubic Foot";
                    if (str[i].equals("inch³")) str[i] = "Cubic Inch";
                    if (str[i].equals("yard³")) str[i] = "Cubic Yard";
                    break;
                }
                case S.Length: {
                    if (str[i].equals("km")) str[i] = "KiloMeter";
                    if (str[i].equals("m")) str[i] = "Meter";
                    if (str[i].equals("cm")) str[i] = "CentiMeter";
                    if (str[i].equals("mm")) str[i] = "MilliMeter";
                    if (str[i].equals("dm")) str[i] = "DeciMeter";
                    if (str[i].equals("nm")) str[i] = "NanoMeter";
                    break;
                }
                case S.Mass: {
                    if (str[i].equals("kg")) str[i] = "Kilogram";
                    if (str[i].equals("mg")) str[i] = "Milligram";
                    break;
                }
                case S.Speed: {
                    if (str[i].equals("Light")) str[i] = "LightSpeed";
                    if (str[i].equals("m/s")) str[i] = "Meter per second";
                    if (str[i].equals("km/s")) str[i] = "KiloMeter per second";
                    if (str[i].equals("mph")) str[i] = "Mile per Hour";
                    if (str[i].equals("foot/s")) str[i] = "Foot per second";
                    if (str[i].equals("inch/s")) str[i] = "Inch per second";
                    break;
                }
                case S.Temperature: {
                    if (str[i].equals("°C")) str[i] = "Celsius";
                    if (str[i].equals("°F")) str[i] = "Fahrenheit";
                    if (str[i].equals("K")) str[i] = "Kelvin";
                    break;
                }
                case S.Time: {
                    if (str[i].equals("Milli-S")) str[i] = "Milli Second";
                    if (str[i].equals("Micro-S")) str[i] = "Micro Second";
                    if (str[i].equals("Pico-S")) str[i] = "Pico Second";
                    break;
                }
                default:
                    break main_loop;
            }
        }
        hint1.setText(str[0]);
        hint2.setText(str[1]);
    }

    void conversion(String d, String s, int i) {
        String s1 = String.valueOf(Double.parseDouble(s) * Double.parseDouble(d));
        String s2 = String.valueOf(Double.parseDouble(s) / Double.parseDouble(d));
        if (i == 1) {
            if (getfocusedindex() == 1) {
                getnotfocused().setText(toFormatted(s1));
            } else {
                getnotfocused().setText(toFormatted(s2));
            }
        } else if (i == 0) {
            if (getfocusedindex() == 2) {
                getnotfocused().setText(toFormatted(s1));
            } else {
                getnotfocused().setText(toFormatted(s2));
            }
        }
    }
}