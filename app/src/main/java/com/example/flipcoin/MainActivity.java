package com.example.flipcoin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView coinImage;
    private TextView coinText;
    private Button flipBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coinImage = (ImageView) findViewById(R.id.coinImage);
        coinText = (TextView) findViewById(R.id.coinText);
        flipBtn = (Button) findViewById(R.id.flipButton);
        flipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCoin();
            }
        });
    }

    private void flipCoin(){
        Random r = new Random();
        int random = r.nextInt(2) + 1;
        if(random == 2){
            coinImage.setImageResource(R.drawable.tail);
            coinText.setText("TAIL");
        }else {
            coinImage.setImageResource(R.drawable.head);
            coinText.setText("HEAD");
        }
    }
}