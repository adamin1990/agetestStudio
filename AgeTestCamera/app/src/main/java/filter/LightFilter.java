package filter;

import android.graphics.Bitmap;
import android.graphics.Color;
/**
 * ����Ч������
 * @author adamin
 *
 */
public class LightFilter {
	// ����Ч������
		public static Bitmap changeToLight(Bitmap bitmap) {
			int width = bitmap.getWidth();
			int height = bitmap.getHeight();

			int pixColor = 0;
			int R = 0;
			int G = 0;
			int B = 0;

			int centerX = width / 3;
			int centerY = height / 3;
			int radius = Math.min(centerX, centerY);

			int strength = 150; // ����ǿ�� 100~150
			int[] pixels = new int[width * height];
			bitmap.getPixels(pixels, 0, width, 0, 0, width, height);
			
			int pos = 0, distance, result;
			for (int y = 1; y < height - 1; y++) {
				for (int x = 1; x < width - 1; x++) {
					pos = y * width + x;
					pixColor = pixels[pos];

					R = Color.red(pixColor);
					G = Color.green(pixColor);
					B = Color.blue(pixColor);

					// ���㵱ǰ�㵽�������ĵľ��룬ƽ������ϵ��������֮��ľ���
					distance = (centerY - y)*(centerY - y) + (centerX - x)*(centerX-x);
					if (distance < radius * radius) {
						// ���վ����С�������ӵĹ���ֵ
						result = (int) (strength * (1.0 - Math.sqrt(distance)/radius));
						R += result;
						G += result;
						B += result;
						
						R = Math.min(255, Math.max(0, R));
						G = Math.min(255, Math.max(0, G));
						B = Math.min(255, Math.max(0, B));

						pixels[pos] = Color.rgb(R, G, B);
					}
				}
			}

			Bitmap returnBitmap = Bitmap.createBitmap(width, height,
					Bitmap.Config.RGB_565);
			returnBitmap.setPixels(pixels, 0, width, 0, 0, width, height);
			return returnBitmap;
		}
}
