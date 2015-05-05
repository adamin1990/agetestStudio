package filter;
import android.graphics.Bitmap;

/**
 * �˾�Ч�����࣬�����˻�������Ⱦ����
 *
 */
public class BitmapFilter {
	/**
	 *
	 */
	public static final int GRAY_STYLE = 1; 	// �ڰ�Ч��
	public static final int BLOCK_STYLE = 2; 	// �滭
	public static final int OLD_STYLE = 3; 		// ����Ч��
	public static final int ICE_STYLE = 4;		//����Ч��
	public static final int CARTON_STYLE = 5;	//������Ч��
	public static final int MOLTEN_STYLE = 6;	//����Ч��
	public static final int SOFTNESS_STYLE = 7; //�ữЧ��
	public static final int ECLOSION_STYLE = 8; //��Ч��
	public static final int RELIEF_STYLE = 9; 	// ����Ч��
	public static final int OIL_STYLE = 10; 	// �ͻ�Ч��
	public static final int INVERT_STYLE = 11; 	// ��ɫЧ��
	public static final int LIGHT_STYLE = 12; 	// ����Ч��
	public static final int LOMO_STYLE = 13;	//LOMOЧ��
	public static final int HAHA_STYLE = 14;	//������Ч��
	
	/**
	 * �����˾�Ч����
	 * @param bitmap
	 */
	public static Bitmap changeStyle(Bitmap bitmap, int styleNo) {
		Bitmap newBitmap = null;
		switch(styleNo){
		case GRAY_STYLE:
			newBitmap = GrayFilter.changeToGray(bitmap);
			break;
		case BLOCK_STYLE:
			newBitmap =  BlockFilter.changeToBlock(bitmap);
			break;
		case OLD_STYLE:
			newBitmap =  OldFilter.changeToOld(bitmap);
			break;
		case ICE_STYLE:
			newBitmap =  IceFilter.changeToIce(bitmap);
			break;
		case CARTON_STYLE:
			newBitmap =  CartonFilter.changeToCarton(bitmap);
			break;
		case MOLTEN_STYLE:
			newBitmap = MoltenFilter.changeToMolten(bitmap);
			break;
		case SOFTNESS_STYLE:
			newBitmap = SoftnessFilter.changeToSoftness(bitmap);
			break;
		case ECLOSION_STYLE:
			newBitmap = EclosionFilter.changeToEclosion(bitmap);
			break;
		case RELIEF_STYLE:
			newBitmap =  ReliefFilter.changeToRelief(bitmap);
			break;
		case OIL_STYLE:
			newBitmap =  OilFilter.changeToOil(bitmap);
			break;
		case INVERT_STYLE:
			newBitmap =  InvertFilter.chageToInvert(bitmap);
			break;
		case LIGHT_STYLE:
			newBitmap =  LightFilter.changeToLight(bitmap);
			break;
		case LOMO_STYLE:
			newBitmap =  LomoFilter.changeToLomo(bitmap);
			break;
		case HAHA_STYLE:
			newBitmap =  HahaFilter.changeToHaha(bitmap);
			break;
		default:
			newBitmap = bitmap;
			break;
		}
		
		return newBitmap;
	}
}