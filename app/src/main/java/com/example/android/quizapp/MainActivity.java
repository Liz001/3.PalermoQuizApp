package com.example.android.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton question_1_answer_A;
    private RadioButton question_1_answer_B;
    private RadioButton question_1_answer_C;
    private RadioButton question_1_answer_D;

    private RadioButton question_2_answer_A;
    private RadioButton question_2_answer_B;
    private RadioButton question_2_answer_C;
    private RadioButton question_2_answer_D;

    private RadioButton question_3_answer_A;
    private RadioButton question_3_answer_B;
    private RadioButton question_3_answer_C;
    private RadioButton question_3_answer_D;

    private RadioButton question_4_answer_A;
    private RadioButton question_4_answer_B;
    private RadioButton question_4_answer_C;
    private RadioButton question_4_answer_D;

    private EditText question_5_answer;

    private CheckBox question_6_answer_A;
    private CheckBox question_6_answer_B;
    private CheckBox question_6_answer_C;
    private CheckBox question_6_answer_D;

    private RadioButton question_7_answer_A;
    private RadioButton question_7_answer_B;
    private RadioButton question_7_answer_C;
    private RadioButton question_7_answer_D;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_question_1_views();
        init_question_2_views();
        init_question_3_views();
        init_question_4_views();
        init_question_5_views();
        init_question_6_views();
        init_question_7_views();
    }


    //    @Override
//    public void onRestoreInstanceState(Bundle bundle) {
//
//        super.onRestoreInstanceState(bundle);
//
//        scorePlayerOne = bundle.getInt("scorePlayerOne");
//        scorePlayerTwo = bundle.getInt("scorePlayerTwo");
//        scorePlayerThree = bundle.getInt("scorePlayerThree");
//
//        display();
//    }
//
//
//    @Override
//    public void onSaveInstanceState (Bundle bundle){
//        bundle.putInt("scorePlayerOne",scorePlayerOne);
//        bundle.putInt("scorePlayerTwo",scorePlayerTwo);
//        bundle.putInt("scorePlayerThree",scorePlayerThree);
//
//        super.onSaveInstanceState(bundle);
//    }

    private void init_question_1_views() {
        question_1_answer_A = (RadioButton) findViewById(R.id.radio_button_q_one_A);
        question_1_answer_B = (RadioButton) findViewById(R.id.radio_button_q_one_B);
        question_1_answer_C = (RadioButton) findViewById(R.id.radio_button_q_one_C);
        question_1_answer_D = (RadioButton) findViewById(R.id.radio_button_q_one_D);

    }

    private void init_question_2_views() {
        question_2_answer_A = (RadioButton) findViewById(R.id.radio_button_q_two_A);
        question_2_answer_B = (RadioButton) findViewById(R.id.radio_button_q_two_B);
        question_2_answer_C = (RadioButton) findViewById(R.id.radio_button_q_two_C);
        question_2_answer_D = (RadioButton) findViewById(R.id.radio_button_q_two_D);
    }

    private void init_question_3_views() {
        question_3_answer_A = (RadioButton) findViewById(R.id.radio_button_q_three_A);
        question_3_answer_B = (RadioButton) findViewById(R.id.radio_button_q_three_B);
        question_3_answer_C = (RadioButton) findViewById(R.id.radio_button_q_three_C);
        question_3_answer_D = (RadioButton) findViewById(R.id.radio_button_q_three_D);
    }

    private void init_question_4_views() {
        question_4_answer_A = (RadioButton) findViewById(R.id.radio_button_q_four_A);
        question_4_answer_B = (RadioButton) findViewById(R.id.radio_button_q_four_B);
        question_4_answer_C = (RadioButton) findViewById(R.id.radio_button_q_four_C);
        question_4_answer_D = (RadioButton) findViewById(R.id.radio_button_q_four_D);
    }

    private void init_question_5_views() {
        question_5_answer = (EditText) findViewById(R.id.edittext_question_five);
    }

    private void init_question_6_views() {
        question_6_answer_A = (CheckBox) findViewById(R.id.checkbox_q_six_A);
        question_6_answer_B = (CheckBox) findViewById(R.id.checkbox_q_six_B);
        question_6_answer_C = (CheckBox) findViewById(R.id.checkbox_q_six_C);
        question_6_answer_D = (CheckBox) findViewById(R.id.checkbox_q_six_D);
    }

    private void init_question_7_views() {
        question_7_answer_A = (RadioButton) findViewById(R.id.radio_button_q_seven_A);
        question_7_answer_B = (RadioButton) findViewById(R.id.radio_button_q_seven_B);
        question_7_answer_C = (RadioButton) findViewById(R.id.radio_button_q_seven_C);
        question_7_answer_D = (RadioButton) findViewById(R.id.radio_button_q_seven_D);
    }


    public void submitAnswer(View view) {
        int score = getQuestion1Score() + getQuestion2Score() + getQuestion3Score() +
                getQuestion4Score() + getQuestion5Score() + getQuestion6Score() +
                getQuestion7Score();
        String question1Answer = getQuestion1Answer();
        String question2Answer = getQuestion2Answer();
        String question3Answer = getQuestion3Answer();
        String question4Answer = getQuestion4Answer();
        String question5Answer = getQuestion5Answer();
        String question6Answer = getQuestion6Answer();
        String question7Answer = getQuestion7Answer();

        String submitMessage =
                getString(R.string.score) + score + "/7\n" + question1Answer + "\n" + question2Answer + "\n" +
                        question3Answer + "\n" + question4Answer + "\n" + question5Answer + "\n" + question6Answer +
                        "\n" + question7Answer + "\n";
        Toast.makeText(this, submitMessage, Toast.LENGTH_LONG).show();
    }

    private String getQuestion1Answer() {
        if (question_1_answer_B.isChecked())
            return getString(R.string.correct_1);
        else
            return getString(R.string.wrong_1);
    }

    private String getQuestion2Answer() {
        if (question_2_answer_C.isChecked())
            return getString(R.string.correct_2);
        else
            return getString(R.string.wrong_2);
    }

    private String getQuestion3Answer() {
        if (question_3_answer_A.isChecked())
            return getString(R.string.correct_3);
        else
            return getString(R.string.wrong_3);
    }

    private String getQuestion4Answer() {
        if (question_4_answer_D.isChecked())
            return getString(R.string.correct_4);
        else
            return getString(R.string.wrong_4);
    }

    private String getQuestion5Answer() {
        String answer = "1100 - 1150";
        if (question_5_answer.getText().toString().toLowerCase().compareTo(answer) == 0)
            return getString(R.string.correct_5);
        else
            return getString(R.string.wrong_5);
    }

    private String getQuestion6Answer() {
        if (question_6_answer_A.isChecked() &&
                question_6_answer_D.isChecked())
            return getString(R.string.correct_6);
        else
            return getString(R.string.wrong_6);
    }

    private String getQuestion7Answer() {
        if (question_7_answer_B.isChecked())
            return getString(R.string.correct_7);
        else
            return getString(R.string.wrong_7);
    }


    private int getQuestion1Score() {
        if (question_1_answer_B.isChecked())
            return 1;
        else
            return 0;
    }

    private int getQuestion2Score() {
        if (question_2_answer_C.isChecked())
            return 1;
        else
            return 0;
    }

    private int getQuestion3Score() {
        if (question_3_answer_A.isChecked())
            return 1;
        else
            return 0;
    }

    private int getQuestion4Score() {
        if (question_4_answer_D.isChecked())
            return 1;
        else
            return 0;
    }

    private int getQuestion5Score() {
        String answer = "1100 - 1150";
        if (question_5_answer.getText().toString().toLowerCase().compareTo(answer) == 0)
            return 1;
        else
            return 0;
    }

    private int getQuestion6Score() {
        if (question_6_answer_A.isChecked() &&
                question_6_answer_D.isChecked())
            return 1;
        else
            return 0;
    }

    private int getQuestion7Score() {
        if (question_7_answer_B.isChecked())
            return 1;
        else
            return 0;
    }


    /**
     * Reset the score
     */

    public void resetAnswers(View view) {
        reset_question_1_answers();
        reset_question_2_answers();
        reset_question_3_answers();
        reset_question_4_answers();
        reset_question_5_answers();
        reset_question_6_answers();
        reset_question_7_answers();
    }

    private void reset_question_1_answers() {
        question_1_answer_A.setChecked(false);
        question_1_answer_B.setChecked(false);
        question_1_answer_C.setChecked(false);
        question_1_answer_D.setChecked(false);

    }

    private void reset_question_2_answers() {
        question_2_answer_A.setChecked(false);
        question_2_answer_B.setChecked(false);
        question_2_answer_C.setChecked(false);
        question_2_answer_D.setChecked(false);

    }

    private void reset_question_3_answers() {
        question_3_answer_A.setChecked(false);
        question_3_answer_B.setChecked(false);
        question_3_answer_C.setChecked(false);
        question_3_answer_D.setChecked(false);

    }

    private void reset_question_4_answers() {
        question_4_answer_A.setChecked(false);
        question_4_answer_B.setChecked(false);
        question_4_answer_C.setChecked(false);
        question_4_answer_D.setChecked(false);

    }

    private void reset_question_5_answers() {
        question_5_answer.setText("");
    }

    private void reset_question_6_answers() {
        question_6_answer_A.setChecked(false);
        question_6_answer_B.setChecked(false);
        question_6_answer_C.setChecked(false);
        question_6_answer_D.setChecked(false);

    }

    private void reset_question_7_answers() {
        question_7_answer_A.setChecked(false);
        question_7_answer_B.setChecked(false);
        question_7_answer_C.setChecked(false);
        question_7_answer_D.setChecked(false);

    }


}



