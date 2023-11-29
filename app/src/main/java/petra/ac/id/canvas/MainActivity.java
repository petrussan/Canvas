package petra.ac.id.canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rlview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rlview = findViewById(R.id.rlView);
        MyCanvas myCanvas = new MyCanvas(this);
        rlview.addView(myCanvas);

    }
}