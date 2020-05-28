package testpractive;

public class Teodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][]= new String[3][5];
        System.out.println(x[0].length);
        System.out.println(x.length);
        x[0][0] = "A";
        x[0][1] = "B";
        x[0][2] = "C";
        x[0][3] = "D";
        x[0][4] = "E";
        x[1][1] = "A1";
        x[1][2] = "A2";
        x[1][3] = "A3";
        
        for(int i=0;i<x.length;i++) {
        	for(int j=0;j<x[0].length;j++)
        	{
        		System.out.println(x[i][j]);
        	}
        }
	}

}
