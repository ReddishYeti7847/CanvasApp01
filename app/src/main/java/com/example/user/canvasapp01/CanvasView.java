package com.example.user.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class CanvasView extends View {
    private Paint paint;

    public CanvasView(Context context) {
        super(context);

        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawCircle(200,400,50,paint);
    }


}
