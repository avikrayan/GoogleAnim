package rayan.avik.anim;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    TextView g,o1,o2,g2,l,e;
    Animation fliping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g = (TextView) findViewById(R.id.tv_g);
        o1= (TextView) findViewById(R.id.tv_0);
        o2 = (TextView) findViewById(R.id.tv_02);
        g2 = (TextView) findViewById(R.id.tv_g2);
        l = (TextView) findViewById(R.id.tv_l);
        e = (TextView) findViewById(R.id.tv_e);
        fliping= AnimationUtils.loadAnimation(MainActivity.this, R.anim.fliping);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                g.setVisibility(View.VISIBLE);
                g.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.right_to_left));
                g.setTextColor(Color.parseColor("#2196F3"));
            }
        }, 1200);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                o1.setVisibility(View.VISIBLE);
                o1.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.right_to_left));
                o1.setTextColor(Color.parseColor("#F44336"));
            }
        }, 2400);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                o2.setVisibility(View.VISIBLE);
                o2.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.right_to_left));
                o2.setTextColor(Color.parseColor("#FDD835"));

            }
        }, 3600);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                g2.setVisibility(View.VISIBLE);
                g2.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.right_to_left));
                g2.setTextColor(Color.parseColor("#2196F3"));
            }
        }, 4800);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                l.setVisibility(View.VISIBLE);
                l.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.right_to_left));
                l.setTextColor(Color.parseColor("#4CAF50"));
            }
        }, 6000);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                e.setVisibility(View.VISIBLE);
                e.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.right_to_left));
                e.setTextColor(Color.parseColor("#F44336"));
            }
        }, 7200);


        ////////////// SET IMAGE ///////////////
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                g.setBackgroundResource(R.drawable.gmail);
                g.setText("");
                g.startAnimation(fliping);
            }
        }, 9700);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                o1.setBackgroundResource(R.drawable.map);
                o1.setText("");
                o1.startAnimation(fliping);
            }
        }, 10900);
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                o2.setBackgroundResource(R.drawable.drive);
                o2.setText("");
                o2.startAnimation(fliping);
            }
        }, 12100);

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                g2.setBackgroundResource(R.drawable.youtube);
                g2.setText("");
                g2.startAnimation(fliping);
            }
        }, 13300);
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                l.setBackgroundResource(R.drawable.plus);
                l.setText("");
                l.startAnimation(fliping);
            }
        }, 14500);
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                e.setBackgroundResource(R.drawable.account);
                e.setText("");
                e.startAnimation(fliping);
            }
        }, 15700);


    }
}
