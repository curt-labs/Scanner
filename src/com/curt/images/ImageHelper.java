package com.curt.images;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Color;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;


public class ImageHelper {
	
	public static Bitmap getRoundedCornerBitmap(Bitmap bmp, int px){
		Bitmap inner = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), Bitmap.Config.ARGB_8888);
		Canvas innerCvs = new Canvas(inner);

		final Paint paint = new Paint();
		final Rect rect = new Rect(0, 0, bmp.getWidth(), bmp.getHeight());
		final RectF rectF = new RectF(rect);
		final float roundPx = px;
		
		paint.setAntiAlias(true);
		paint.setColor(Color.BLACK);
		paint.setShadowLayer(6f, 6f, 6f, Color.BLACK);
		innerCvs.drawARGB(0, 0, 0, 0);
		innerCvs.drawRoundRect(rectF, roundPx, roundPx, paint);
		
		paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
		innerCvs.drawBitmap(bmp, rect, rect, paint);
		
		Bitmap outer = Bitmap.createBitmap(bmp.getWidth() + 10, bmp.getHeight() + 10, Config.ARGB_8888);
		Canvas outerCvs = new Canvas(outer);
		Paint shadowPaint = new Paint();
		shadowPaint.setColor(Color.BLACK);
		shadowPaint.setAntiAlias(true);
		shadowPaint.setShadowLayer(6f, 6f, 6f, Color.BLACK);
		
		outerCvs.drawBitmap(inner, 0, 0, shadowPaint);
		
		return outer;
	}
	
}
