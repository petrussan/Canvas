package petra.ac.id.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyCanvas extends View {

    Paint aPaint, oPaint, textPaint;

    public MyCanvas(Context context) {
        super(context);
        textPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(pxfromDp(getContext(),24));
        oPaint = new Paint();
        oPaint.setStyle(Paint.Style.FILL);
        oPaint.setColor(Color.BLUE);
        aPaint = new Paint();

    }

    public static float pxfromDp(Context c, float Dp) {
        return Dp * c.getResources().getDisplayMetrics().density;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPaint(oPaint);
        aPaint.setColor(Color.WHITE);
        aPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(getLeft()+(getRight()-getLeft())/3,
                        getTop()+(getBottom()-getTop())/3,
                        getRight()-(getRight()-getLeft())/3,
                        getBottom()-(getBottom()-getTop())/3,aPaint
        );
        canvas.drawText("App Development 2023",
                (float) (getWidth()*0.15), (float) (getHeight()*0.8),textPaint);


    }
}
