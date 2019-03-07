import java.util.ArrayList;

public class Lab14 {
	public static void main(String [] args) {
		
		//Reading the dataset from ClusterLab.txt
		String filepath = "C:\\Users\\Brandon\\eclipse-workspace\\CS2004_Lab14\\src\\ClusterLab.txt";
		double[][] Y = KMeans.ReadArrayFile(filepath, ",");	
		KMeans k = new KMeans(Y, 3, 100);
		
		//Storing the expected arrangement in arraylist
		ArrayList<Integer> cluster = new ArrayList<>();
		for(int i = 0; i<Y.length;i++) {
			if(i<25) cluster.add(i,1);
			else if (i >=75) cluster.add(i,3);
			else cluster.add(i,2);
		}
		
		k.RunIter(3,10,cluster, true);
		System.out.println(cluster);
	}


}
