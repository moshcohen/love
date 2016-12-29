package com.example.user.love;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USER on 29/12/2016.
 */

public class AtbashDisplay extends Activity
{
    protected AtbashGame game=new AtbashGame();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atbash);
    }

    public void onEnterWord(View view){
        EditText text=(EditText)findViewById(R.id.editText);
        TextView textView=(TextView)findViewById(R.id.atbashView);
        String regularString=text.getText().toString();
        String atbash=game.StartGame(regularString);
        textView.setText(atbash);
    }
}
