public class HolidayBonus  {
	final static int max =5000;
	final static int norm=2000;
	final static int min=1000;
	

	public static double[] calculateHolidayBonus(double[][] data) {
		double[] HBonus=new double[data.length];
		for(int i=0;i<data.length;i++) {
			HBonus[i]=0;
			for(int k=0;k<data[i].length;k++) {
			if( TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, k)==i)
				HBonus[i]+= min;
			else if( TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, k)==i)
				HBonus[i]+= max;
			else
				HBonus[i]+=norm;
			}
			}
		return HBonus;
		}

	public static double calculateTotalHolidayBonus(double[][] data) {
		// TODO Auto-generated method stub
		double total=0;
		double[] HB= calculateHolidayBonus(data);
		for(int i=0;i<HB.length;i++) {
			total+=HB[i];
		}
		return total;
	}
}