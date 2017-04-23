package com.example.moham.byomi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moham.byomi.models.Question;

public class Questions extends AppCompatActivity {

    private Question[] questions;
    private int currentquestion = 0;
    private int totalcorrect = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        questions = new Question[10];
        questions[0] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[1] = new Question(R.drawable.a, R.drawable.b, "Blah","asfsf", "sdfsdf", "sdbku", 0);
        questions[2] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[3] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[4] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[5] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[6] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[7] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[8] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);
        questions[9] = new Question(R.drawable.a, R.drawable.b, "answersA","answerB", "answerC", "answerD", 0);

        setquestion(currentquestion);

    }

    private void setquestion(int question) {
        currentquestion = question;
        TextView answer1 = (TextView) findViewById(R.id.answer1);
        TextView answer2 = (TextView) findViewById(R.id.answer2);
        TextView answer3 = (TextView) findViewById(R.id.answer3);
        TextView answer4 = (TextView) findViewById(R.id.answer4);
        answer1.setText(questions[currentquestion].answer1);
        answer2.setText(questions[currentquestion].answer2);
        answer3.setText(questions[currentquestion].answer3);
        answer4.setText(questions[currentquestion].answer4);
        ImageView image1 = (ImageView) findViewById(R.id.image1);
        ImageView image2 = (ImageView) findViewById(R.id.image2);
        image1.setImageResource(questions[currentquestion].pic1);
        image2.setImageResource(questions[currentquestion].pic2);

    }

    private void nextquestion()
    {
        currentquestion++;
        if (currentquestion < 10)
            setquestion(currentquestion);
        else
            {questioncomplete();

            }

    }
    private void questioncomplete() {
        new AlertDialog.Builder(this)
                .setTitle("Game Over")
                .setMessage("You got " + Integer.toString(totalcorrect) + "of 10")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
    public void Answer(View view) {
        String id = view.getTag().toString();

        switch (id) {
            case "1":
                // Clicked button 1
                SelectAnswer(0);
                break;
            case "2":

                SelectAnswer(1);
                break;
            case "3":
                SelectAnswer(2);

                break;
            case "4":
            default:
                SelectAnswer(3);

                break;

        }

    }

    private void SelectAnswer(int answerNumber) {
        if (questions[currentquestion].correctanswer==answerNumber) {
            totalcorrect++;
        }

        nextquestion();

    }
}
