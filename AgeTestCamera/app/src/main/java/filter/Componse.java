package filter;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
/**
 * ƴ�D�L�� 
 * @author adamin
 *
 */
public class Componse {
	public static Bitmap getComponseBitmap(Bitmap src, Bitmap src2){
		if(src == null || src2 == null)
			return null;
		
		int width = src.getWidth();
		int height = src.getHeight();
		Bitmap newBitmap = Bitmap.createBitmap(width, height, Config.RGB_565);
		Canvas canvas = new Canvas(newBitmap);
		canvas.drawBitmap(src, 0, 0, null);
		
		Bitmap zoomBitmap = zoomImage(src2, 640, 360);
		canvas.drawBitmap(zoomBitmap, 200, 200, null);
		canvas.save(Canvas.ALL_SAVE_FLAG );
		canvas.restore();
		
		return newBitmap;
	}
	
	/**
	 * //�ȱ�����ͼƬ
	 * @param bitmap
	 * @param newWidth
	 * @param newHeight
	 * @return
	 */
	public static Bitmap zoomImage(Bitmap bitmap, int newWidth, int newHeight){
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();
		//�������ű���
		float scaleW = (float)newWidth/width;
		float sacleH = (float)newHeight/height;
		//ȡ������Matrix����
		Matrix matrix = new Matrix();
		matrix.postScale(scaleW, sacleH);
		matrix.postRotate(30);
		//�õ���ͼƬ
		Bitmap newBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
		return newBitmap;
	}
}
