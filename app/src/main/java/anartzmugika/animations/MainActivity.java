package anartzmugika.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    private Button [] animationButtons;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();
    }

    private void initializeComponents()
    {

        imageView = (ImageView) findViewById(R.id.imageView);

        int [] buttons_ids = { R.id.blinkButton, R.id.moveButton, R.id.fadeInButton, R.id.fadeOutButton,
                R.id.rotateButton, R.id.secuentialButton, R.id.zoomInButton, R.id.zoomOutButton, R.id.slideUpButton,
                R.id.slideDownButton, R.id.bounceButton, R.id.randomAnimation
        };
        final int [] animations = {R.anim.blink, R.anim.move, R.anim.fadein, R.anim.fadeout, R.anim.rotate, R.anim.secuential, R.anim.zoomin, R.anim.zoomout,
                                R.anim.slide_up, R.anim.slide_down, R.anim.bounce, R.anim.secuential};
        animationButtons = new Button[buttons_ids.length];
        for (int i = 0; i < animationButtons.length; i++)
        {
            final int pos = i;
            animationButtons [i] = (Button) findViewById(buttons_ids[i]);
            animationButtons [i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),
                            animations[pos]);
                    imageView.startAnimation(anim);
                }
            });

        }
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}

