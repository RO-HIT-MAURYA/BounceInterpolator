package android.three.brick.bounceinterpolator;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BounceInterpolator bounceInterpolator = new BounceInterpolator();
                ObjectAnimator objectAnimator
                        = ObjectAnimator.ofFloat(v, "translationZ", 3, 7);
                objectAnimator.setDuration(500);
                objectAnimator.setInterpolator(bounceInterpolator);
                objectAnimator.start();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                BounceInterpolator bounceInterpolator = new BounceInterpolator();
                animation.setInterpolator(bounceInterpolator);
                v.startAnimation(animation);
            }
        });

    }
}
