package com.example.moham.byomi.models;

import android.graphics.drawable.BitmapDrawable;

/**
 * Created by moham on 4/23/2017.
 */

public class Question {
    public int pic1;
    public int pic2;
    public String answer1;
    public String answer2;
    public String answer3;
    public String answer4;
    public int correctanswer;

    public Question(int pic1, int pic2, String answer1, String answer2, String answer3, String answer4, int correctanswer)
    {
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctanswer = correctanswer;


    }
}
