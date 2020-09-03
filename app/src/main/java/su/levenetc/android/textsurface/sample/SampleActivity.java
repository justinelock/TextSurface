package su.levenetc.android.textsurface.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import su.levenetc.android.textsurface.Debug;
import su.levenetc.android.textsurface.TextSurface;
import su.levenetc.android.textsurface.sample.checks.AlignSample;
import su.levenetc.android.textsurface.sample.checks.ColorSample;
import su.levenetc.android.textsurface.sample.checks.CookieThumperSample;
import su.levenetc.android.textsurface.sample.checks.Rotation3DSample;
import su.levenetc.android.textsurface.sample.checks.ScaleTextSample;
import su.levenetc.android.textsurface.sample.checks.ShapeRevealLoopSample;
import su.levenetc.android.textsurface.sample.checks.ShapeRevealSample;
import su.levenetc.android.textsurface.sample.checks.SlideSample;
import su.levenetc.android.textsurface.sample.checks.SurfaceScaleSample;
import su.levenetc.android.textsurface.sample.checks.SurfaceTransSample;

/**
 * Created by Eugene Levenetc.
 */
public class SampleActivity extends AppCompatActivity {

    private TextSurface textSurface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_activity);
        textSurface = (TextSurface) findViewById(R.id.text_surface);

        textSurface.postDelayed(new Runnable() {
            @Override
            public void run() {
                show();
            }
        }, 1000);

        findViewById(R.id.btn_refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });

        CheckBox checkDebug = (CheckBox) findViewById(R.id.check_debug);
        checkDebug.setChecked(Debug.ENABLED);
        checkDebug.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Debug.ENABLED = isChecked;
                textSurface.invalidate();
            }
        });
    }

    private void show() {
        textSurface.reset();
        CookieThumperSample.play(textSurface);//getAssets()
//        SurfaceTransSample.play(textSurface);
//        AlignSample.play(textSurface);
//        ColorSample.play(textSurface);
//        Rotation3DSample.play(textSurface);
//        ScaleTextSample.run(textSurface);
//        ShapeRevealLoopSample.play(textSurface);//1
//        SlideSample.play(textSurface);
//        SurfaceScaleSample.play(textSurface);
//        SurfaceTransSample.play(textSurface);
    }

}