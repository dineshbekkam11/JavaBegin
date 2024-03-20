package Class4;

public class Multi_array {
    public static void main(String[] args) {
        int[][] x ={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x.length-1;j++)
            {
                System.out.println(x[i][j]);
            }
        }
    }
}
