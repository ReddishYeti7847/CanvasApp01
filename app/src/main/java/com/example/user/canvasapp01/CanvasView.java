package com.example.user.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
        //キャンバスの大きさを調べる
        float sx = canvas.getWidth();
        float sy = canvas.getHeight();

        //背景を塗りつぶす
        canvas.drawColor(Color.BLACK);

        //円を描く
        paint.setColor(Color.rgb(0,255,160));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);

        canvas.drawCircle(sx / 2,sy / 2,200, paint);

        //四角を描く
        paint.setColor(Color.rgb(192, 255, 0));
        paint.setStyle(Paint.Style.FILL);

        canvas.drawRect(50,20,250,100, paint);

        //線を描く
        paint.setColor(Color.rgb(255,0,80));
        paint.setStrokeWidth(10);
        paint.setStrokeCap(Paint.Cap.ROUND);

        canvas.drawLine(20, 20, sx - 20, sy - 20, paint);
    }


}
