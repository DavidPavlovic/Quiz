package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void say(View view) {
        ImageView dex = (ImageView) findViewById(R.id.dexter);
        EditText quesOne = (EditText) findViewById(R.id.ques_one);
        String firstQuestion = quesOne.getText().toString();

        RadioButton deedeeBtn = (RadioButton) findViewById(R.id.question_two_deedee);
        boolean isDeeDeeChecked = deedeeBtn.isChecked();

        RadioButton mandarkBtn = (RadioButton)findViewById(R.id.question_two_mandark);
        boolean isMandarkChecked = mandarkBtn.isChecked();

        CheckBox motherCheckBox = (CheckBox) findViewById(R.id.check_box_mother);
        boolean isMotherChecked = motherCheckBox.isChecked();

        CheckBox sisterCheckBox = (CheckBox) findViewById(R.id.check_box_sister);
        boolean isSisterChecked = sisterCheckBox.isChecked();

        CheckBox fatherCheckBox = (CheckBox) findViewById(R.id.check_box_father);
        boolean isFatherChecked  = fatherCheckBox.isChecked();

        CheckBox brotherCheckBox = (CheckBox) findViewById(R.id.check_box_brother);
        boolean isBrotherChecked = brotherCheckBox.isChecked();


        if(firstQuestion.equals("science") && (isMandarkChecked == true && isDeeDeeChecked ==false) && (isMotherChecked == true && isSisterChecked == true && isFatherChecked == true && isBrotherChecked == false)) {
            dex.setImageResource(R.drawable.likelike);
            showMsg("I think that you can be my new friend.");
        }else if(firstQuestion == "") {
            dex.setImageResource(R.drawable.sus);
            showMsg("Something is wrong, you must be Dee Dee's friend.");
        }else {
            dex.setImageResource(R.drawable.sus);
            showMsg("Something is wrong, you must be Dee Dee's friend.");
        }
    }

    public void showMsg(String msg) {
        TextView actionText = (TextView) findViewById(R.id.action_text);
        actionText.setText("" + msg);
    }

}
