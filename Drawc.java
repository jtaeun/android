package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


public class Drawc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));}


        class MyView extends View {
            public MyView(Context context) {
                super(context);
            }

            public MyView(Context context, AttributeSet att) {
                super(context, att);
            }

            public MyView(Context context, AttributeSet att, int a) {
                super(context, att, a);
            }



            Random rnd = new Random();
            int r, g, b;

            public void onDraw(Canvas c) {
                int x = c.getWidth();
                int y = c.getHeight();



                for (int i = 0; i < 50; i++) {

                    r = rnd.nextInt(128) + 128;
                    g = rnd.nextInt(128) + 128;
                    b = rnd.nextInt(128) + 128;

                    int x2 = rnd.nextInt(x);
                    int y2 = rnd.nextInt(y);

                    Paint paint = new Paint();
                    paint.setColor(Color.rgb(r, g, b));
                    c.drawCircle(x2, y2,r, paint);
                }
            }
        }
    }

