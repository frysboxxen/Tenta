public class T16_6{
	public static void main(String[] args) {
		double rx, ry, rz;
		double vx, vy, vz;
		double m;
	}
	public static double getKineticEnergy(double mass, double vx, double vy, double vz){
		double kinEnergy = mass*(vx*vx+vy*vy+vz*vz);
		return kinEnergy;
	} 
}