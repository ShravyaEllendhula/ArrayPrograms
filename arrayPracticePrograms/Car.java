package arrayPracticePrograms;

public class Car  implements Comparable
	{
		private int cnum;
		private String cbrand;
		private int cspeed;
		private double cmillage;
		public Car(int cnum, String cbrand, int cspeed, double cmillage)
		{
			super();
			this.cnum = cnum;
			this.cbrand = cbrand;
			this.cspeed = cspeed;
			this.cmillage = cmillage;
		}
		public int getCnum()
		{
			return cnum;
		}
		public void setCnum(int cnum) 
		{
			this.cnum = cnum;
		}
		public String getCbrand()
		{
			return cbrand;
		}
		public void setCbrand(String cbrand) {
			this.cbrand = cbrand;
		}
		public int getCspeed() {
			return cspeed;
		}
		public void setCspeed(int cspeed) {
			this.cspeed = cspeed;
		}
		public double getCmillage() {
			return cmillage;
		}
		public void setCmillage(int cmillage) {
			this.cmillage = cmillage;
		}
		@Override
		public String toString() {
			return "Car [cnum=" + cnum + ", cbrand=" + cbrand + ", cspeed=" + cspeed + ", cmillage=" + cmillage + "]";
		}
		@Override
		public int compareTo(Object o)
		{
			Car rv=(Car)o;
			
			if(this.cspeed>rv.cspeed)
			{
			return 1;
			}
			else if(this.cspeed<rv.cspeed)
			{
				return -1;
			}
			else 
			{
				return 0;
			}
		}
}
