package com.example.normal_calculator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class calculations extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    boolean addition = false, division = false, multiplication = false, deduction = false, startSecond_Input = false, start_quick_Input = true;
    double first_value = 0, second_value = 0;
    DecimalFormat formatter;
    TextView textView, textView2;
    Button one, two, three, four, five, six, seven, eight, nine, zero, double_zero, point, remove, clear, div, multi, add, minus, per, equal;

    public calculations() {}
    public static calculations newInstance(String param1, String param2) {
        calculations fragment = new calculations();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = getView().findViewById(R.id.textview);
        textView2 = getView().findViewById(R.id.textview2);
        one = getView().findViewById(R.id.one);
        two = getView().findViewById(R.id.two);
        three = getView().findViewById(R.id.three);
        four = getView().findViewById(R.id.four);
        five = getView().findViewById(R.id.five);
        six = getView().findViewById(R.id.six);
        seven = getView().findViewById(R.id.seven);
        eight = getView().findViewById(R.id.eight);
        nine =getView(). findViewById(R.id.nine);
        zero = getView().findViewById(R.id.zero);
        double_zero = getView().findViewById(R.id.double_zero);
        point = getView().findViewById(R.id.dot);
        remove = getView().findViewById(R.id.remove);
        clear = getView().findViewById(R.id.remove_all);
        div = getView().findViewById(R.id.div);
        multi = getView().findViewById(R.id.multi);
        add = getView().findViewById(R.id.plus);
        minus = getView().findViewById(R.id.min);
        per = getView().findViewById(R.id.per);
        equal = getView().findViewById(R.id.equal_to);
        textView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(textView.length() >= 12 && !startSecond_Input){
                    textView2.setText(toScientific_notation(textView.getText().toString()));
                }
                else if(textView.length() >= 12 && startSecond_Input){
                    String value = toScientific_notation(String.valueOf(first_value)) + get_selected_method() + toScientific_notation(textView.getText().toString());
                    textView2.setText(value);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });
        one.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("1");
            } else {
                if (textView.length() != 12) {
                    textView2.append("1");
                }
            }
            String data = textView.getText().toString();
            if (data.equals("0")) {
                textView.setText("1");
            } else {
                textView.append("1");
            }
            clear.setText("C");
        });
        formatter = new DecimalFormat("#.####");
        two.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("2");
            } else {
                if (textView.length() != 12) {
                    textView2.append("2");
                }
            }
            String data = textView.getText().toString();
            if (data.equals("0")) {
                textView.setText("2");
            } else {
                textView.append("2");
            }
            clear.setText("C");
        });
        three.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("3");
            } else {
                if (textView.length() != 12) {
                    textView2.append("3");
                }
            }
            String data = textView.getText().toString();
            if (data.equals("0")) {
                textView.setText("3");
            } else {
                textView.append("3");
            }
            clear.setText("C");
        });
        four.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("4");
            } else {
                if (textView.length() != 12) {
                    textView2.append("4");
                }
            }
            String data = textView.getText().toString();
            if (data.equals("0")) {
                textView.setText("4");
            } else {
                textView.append("4");
            }
            clear.setText("C");
        });
        five.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("5");
            } else {
                if (textView.length() != 12) {
                    textView2.append("5");
                }
            }
            String data = textView.getText().toString();
            if (data.equals("0")) {
                textView.setText("5");
            } else {
                textView.append("5");
            }
            clear.setText("C");
        });
        six.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("6");
            } else {
                if (textView.length() != 12) {
                    textView2.append("6");
                }
            }
            String data = textView.getText().toString();
            if (data.equals("0")) {
                textView.setText("6");
            } else {
                textView.append("6");
            }
            clear.setText("C");
        });
        seven.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data = textView.getText().toString();
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("7");
            } else {
                if (textView.length() != 12) {
                    textView2.append("7");
                }
            }
            if (data.equals("0")) {
                textView.setText("7");
            } else {
                textView.append("7");
            }
            clear.setText("C");
        });
        eight.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("8");
            } else {
                if (textView.length() != 12) {
                    textView2.append("8");
                }
            }
            String data = textView.getText().toString();
            if (data.equals("0")) {
                textView.setText("8");
            } else {
                textView.append("8");
            }
            clear.setText("C");
        });
        nine.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            textView2.setVisibility(View.VISIBLE);
            String data = textView.getText().toString();
            String data1 = textView2.getText().toString();
            if (data1.equals("0")) {
                textView2.setText("9");
            } else {
                if (textView.length() != 12) {
                    textView2.append("9");
                }
            }
            if (data.equals("0")) {
                textView.setText("9");
            } else {
                textView.append("9");
            }
            clear.setText("C");
        });
        zero.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            String data = textView.getText().toString();
            if (!data.equals("0")) {
                textView2.setVisibility(View.VISIBLE);
                if (textView.length() != 12) {
                    textView2.append("0");
                }
            }
            if (!data.equals("0")) {
                textView.append("0");
                clear.setText("C");
            }
        });
        double_zero.setOnClickListener(v -> {
            Condition_checkFor_SecondInput();
            String data = textView.getText().toString();
            if (!data.equals("0")) {
                if (textView.length() != 12) {
                    if (textView.length() == 11) {
                        textView2.append("0");
                    } else {
                        textView2.append("00");
                    }
                }
                textView.append("00");
                textView2.setVisibility(View.VISIBLE);
                clear.setText("C");
            }
        });
        point.setOnClickListener(v -> {
            Condition_checkFor_SecondInput_for_point();
            String data = textView.getText().toString();
            textView2.setVisibility(View.VISIBLE);
            if (!data.contains(".")) {
                if (data.equals("0")) {
                    if (startSecond_Input) {
                        textView2.append("0.");
                        start_quick_Input = false;
                    } else {
                        if (textView.length() != 12) {
                            textView2.append(".");
                        }
                    }
                } else {
                    if (textView.length() != 12) {
                        textView2.append(".");
                    }
                }
            }
            if (!data.contains(".")) {
                textView.append(".");
                clear.setText("C");
            }
        });
        remove.setOnLongClickListener(view1 -> {
            textView.setText("0");
            if(!startSecond_Input){
                textView2.setText("0");
            }
            else{
                String s = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView2.setText(s);
            }
            clear.setText(getString(R.string.c));
            return false;
        });
        remove.setOnClickListener(v -> {
            String data = textView.getText().toString();
            if(data.contains("E")){
                return;
            }
            if (data.length() == 1) {
                textView2.setVisibility(View.INVISIBLE);
                textView.setText("0");
                if (startSecond_Input) {
                    textView2.setVisibility(View.VISIBLE);
                    String value = formatter.format(first_value) + get_selected_method();
                    textView2.setText(value);
                } else if (!startSecond_Input) {
                    textView2.setText("0");
                }
                clear.setText(getString(R.string.c));
                return;
            }
            if (data.equals("0")) {
                textView2.setVisibility(View.INVISIBLE);
                if (startSecond_Input) {
                    textView2.setVisibility(View.VISIBLE);
                    String value = formatter.format(first_value) + get_selected_method();
                    textView2.setText(value);
                } else if (!startSecond_Input) {
                    textView2.setText("0");
                }
                clear.setText(getString(R.string.c));
                return;
            }
            if (data.equals("0.")) {
                textView2.setVisibility(View.INVISIBLE);
                textView.setText("0");
                if (startSecond_Input) {
                    textView2.setVisibility(View.VISIBLE);
                    String value = formatter.format(first_value) + get_selected_method();
                    textView2.setText(value);
                } else if (!startSecond_Input) {
                    textView2.setText("0");
                }
                clear.setText(getString(R.string.c));
                return;
            }
            StringBuilder sb = new StringBuilder(data);
            sb.deleteCharAt(data.length() - 1);
            textView.setText(sb);
            textView2.setVisibility(View.VISIBLE);
            clear.setText("C");
            if (!startSecond_Input) {
                textView2.setText(sb);
            } else if (startSecond_Input) {
                String value;
                value = formatter.format(first_value) + " " + get_selected_method() + " " + sb;
                textView2.setText(value);
            }
        });
        clear.setOnClickListener(v -> {
            clear.setText(getString(R.string.c));
            textView2.setVisibility(View.INVISIBLE);
            textView.setText("0");
            textView2.setText("0");
            first_value = 0;
            second_value = 0;
            addition = false;
            deduction = false;
            multiplication = false;
            division = false;
            startSecond_Input = false;
            start_quick_Input = true;
            add.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            add.setTextColor(getContext().getColor(R.color.orange));
            minus.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            minus.setTextColor(getContext().getColor(R.color.orange));
            multi.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            multi.setTextColor(getContext().getColor(R.color.orange));
            div.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            div.setTextColor(getContext().getColor(R.color.orange));
        });
        add.setOnClickListener(view2 -> {
            number_Format_Check();
            if (addition) {
                String value;
                first_value = first_value + Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                start_quick_Input = true;
                button_operations();
                return;
            }
            if (deduction) {
                String value;
                addition = true;
                deduction = false;
                start_quick_Input = true;
                first_value = first_value - Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (multiplication) {
                String value;
                addition = true;
                multiplication = false;
                start_quick_Input = true;
                first_value = first_value * Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (division) {
                String value;
                addition = true;
                division = false;
                start_quick_Input = true;
                first_value = first_value / Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            deduction = false;
            multiplication = false;
            division = false;
            addition = true;
            button_operations();
            first_value = Double.parseDouble(textView.getText().toString());
//            textView.setText("0");
            String value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
            textView2.setText(value);
            startSecond_Input = true;
        });
        minus.setOnClickListener(view3 -> {
            number_Format_Check();
            if (deduction) {
                String value;
                first_value = first_value - Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                start_quick_Input = true;
                button_operations();
                return;
            }
            if (addition) {
                String value;
                deduction = true;
                addition = false;
                start_quick_Input = true;
                first_value = first_value + Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (multiplication) {
                String value;
                deduction = true;
                multiplication = false;
                start_quick_Input = true;
                first_value = first_value * Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (division) {
                String value;
                deduction = true;
                division = false;
                start_quick_Input = true;
                first_value = first_value / Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            addition = false;
            multiplication = false;
            division = false;
            deduction = true;
            button_operations();
            first_value = Double.parseDouble(textView.getText().toString());
//            textView.setText("0");
            String value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
            textView2.setText(value);
            startSecond_Input = true;
        });
        multi.setOnClickListener(view4 -> {
            number_Format_Check();
            if (multiplication) {
                String value;
                first_value = first_value * Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                start_quick_Input = true;
                button_operations();
                return;
            }
            if (addition) {
                String value;
                multiplication = true;
                addition = false;
                start_quick_Input = true;
                first_value = first_value + Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (deduction) {
                String value;
                multiplication = true;
                deduction = false;
                start_quick_Input = true;
                first_value = first_value - Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (division) {
                String value;
                multiplication = true;
                division = false;
                start_quick_Input = true;
                first_value = first_value / Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            addition = false;
            deduction = false;
            division = false;
            multiplication = true;
            button_operations();
            first_value = Double.parseDouble(textView.getText().toString());
//            textView.setText("0");
            String value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
            textView2.setText(value);
            startSecond_Input = true;
        });
        div.setOnClickListener(view5 -> {
            number_Format_Check();
            if (division) {
                String value;
                first_value = first_value / Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                start_quick_Input = true;
                button_operations();
                return;
            }
            if (addition) {
                String value;
                division = true;
                addition = false;
                start_quick_Input = true;
                first_value = first_value + Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (deduction) {
                String value;
                division = true;
                deduction = false;
                start_quick_Input = true;
                first_value = first_value - Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            if (multiplication) {
                String value;
                division = true;
                multiplication = false;
                start_quick_Input = true;
                first_value = first_value * Double.parseDouble(textView.getText().toString());
                value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
                textView.setText(formatter.format(first_value));
                textView2.setText(value);
                button_operations();
                return;
            }
            addition = false;
            deduction = false;
            multiplication = false;
            division = true;
            button_operations();
            first_value = Double.parseDouble(textView.getText().toString());
//            textView.setText("0");
            String value = toScientific_notation(formatter.format(first_value)) + get_selected_method();
            textView2.setText(value);
            startSecond_Input = true;
        });
        per.setOnClickListener(view6 -> {
            number_Format_Check();
            if (!startSecond_Input) {
                textView2.setVisibility(View.VISIBLE);
                double value = Double.parseDouble(textView.getText().toString());
                textView.setText(toScientific_notation(formatter.format(value / 100)));
                textView2.setText(toScientific_notation(formatter.format(value / 100)));
                answer_check(Double.parseDouble(formatter.format(value / 100)));
            }
            if (startSecond_Input) {
                textView2.setVisibility(View.VISIBLE);
                if (multiplication) {
                    double value = Double.parseDouble(textView.getText().toString());
                    Double answer = value / 100;
                    String value1 = toScientific_notation(formatter.format(first_value)) + " " + multi.getText().toString() + " " + toScientific_notation(formatter.format(value / 100));
                    textView.setText(formatter.format(answer));
                    textView2.setText(value1);
                } else if (division) {
                    double value = Double.parseDouble(textView.getText().toString());
                    Double answer = value / 100;
                    String value1 = toScientific_notation(formatter.format(first_value)) + " " + div.getText().toString() + " " + toScientific_notation(formatter.format(value / 100));
                    textView.setText(formatter.format(answer));
                    textView2.setText(value1);
                } else if (addition) {
                    double value = Double.parseDouble(textView.getText().toString());
                    Double answer = (first_value * value) / 100;
                    String value1 = toScientific_notation(formatter.format(first_value)) + " + " + toScientific_notation(formatter.format((first_value * value) / 100));
                    textView.setText(formatter.format(answer));
                    textView2.setText(value1);
                } else if (deduction) {
                    double value = Double.parseDouble(textView.getText().toString());
                    Double answer = (first_value * value) / 100;
                    String value1 = toScientific_notation(formatter.format(first_value)) + " - " + toScientific_notation(formatter.format((first_value * value) / 100));
                    textView.setText(formatter.format(answer));
                    textView2.setText(value1);
                }
            }
        });
        equal.setOnClickListener(view7 -> {
            if (startSecond_Input) {
                second_value = Double.parseDouble(textView.getText().toString());
                startSecond_Input = false;
                start_quick_Input = true;
            }
            double answer;
            String value;
            if (addition) {
                answer = first_value + second_value;
                value = toScientific_notation(formatter.format(first_value)) + " + " + toScientific_notation(formatter.format(second_value)) + " = " + toScientific_notation(formatter.format(first_value+second_value));
                textView.setText(toScientific_notation(formatter.format(first_value+second_value)));
                textView2.setText(value);
                answer_check(answer);
                addition = false;
            } else if (deduction) {
                answer = first_value - second_value;
                value = toScientific_notation(formatter.format(first_value)) + " - " + toScientific_notation(formatter.format(second_value)) + " = " + toScientific_notation(formatter.format(first_value-second_value));
                textView.setText(toScientific_notation(formatter.format(first_value - second_value)));
                textView2.setText(value);
                deduction = false;
                answer_check(answer);
            } else if (multiplication) {
                answer = first_value * second_value;
                value = toScientific_notation(formatter.format(first_value)) + " " + multi.getText().toString() + " " + toScientific_notation(formatter.format(second_value)) + " = " + toScientific_notation(formatter.format(first_value*second_value));
                textView.setText(toScientific_notation(formatter.format(first_value * second_value)));
                textView2.setText(value);
                multiplication = false;
                answer_check(answer);
            } else if (division) {
                answer = first_value / second_value;
                value = toScientific_notation(formatter.format(first_value)) + " " + div.getText().toString() + " " + toScientific_notation(formatter.format(second_value)) + " = " + toScientific_notation(formatter.format(first_value/second_value));
                textView.setText(toScientific_notation(formatter.format(first_value / second_value)));
                textView2.setText(value);
                division = false;
                answer_check(answer);
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private void number_Format_Check() {
        if (textView.getText().toString().equals("∞")) {
            textView.setText("0");
        } else if (textView.getText().toString().equals("NaN")) {
            textView.setText("0");
        }
    }

    private String get_selected_method() {
        if (multiplication) {
            return " " + multi.getText().toString() + " ";
        } else if (division) {
            return " " + div.getText().toString() + " ";
        } else if (addition) {
            return " + ";
        }
        return " - ";
    }

    private void Condition_checkFor_SecondInput_for_point() {
        if (startSecond_Input && start_quick_Input) {
            textView.setText("0");
        }
    }

    private void Condition_checkFor_SecondInput() {
        if (startSecond_Input && start_quick_Input) {
            textView.setText("0");
            start_quick_Input = false;
        }
    }

    private void answer_check(double solution) {
        if (solution == 0) {
            clear.setText(getString(R.string.c));
            textView2.setVisibility(View.INVISIBLE);
            textView2.setText("0");
        }
    }
    private String toScientific_notation(String text){
        if(text.length() < 12){
        return text;
        }
        return new DecimalFormat("0.######E0").format(Double.parseDouble(text));
    }
    private void button_operations() {
        if (addition) {
            add.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background_extra));
            add.setTextColor(getContext().getColor(R.color.white));
        } else if (!addition) {
            add.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            add.setTextColor(getContext().getColor(R.color.orange));
        }
        if (deduction) {
            minus.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background_extra));
            minus.setTextColor(getContext().getColor(R.color.white));
        } else if (!deduction) {
            minus.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            minus.setTextColor(getContext().getColor(R.color.orange));
        }
        if (multiplication) {
            multi.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background_extra));
            multi.setTextColor(getContext().getColor(R.color.white));
        } else if (!multiplication) {
            multi.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            multi.setTextColor(getContext().getColor(R.color.orange));
        }
        if (division) {
            div.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background_extra));
            div.setTextColor(getContext().getColor(R.color.white));
        } else if (!division) {
            div.setBackground(AppCompatResources.getDrawable(getContext(), R.drawable.button_background));
            div.setTextColor(getContext().getColor(R.color.orange));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculations, container, false);
    }
}