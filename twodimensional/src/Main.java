public class Main {
    public static void main(String[] args) {
      int[] x = {20,30,50}; //[20,30,50] One dimensional
      int[][] y = {{20,30,50},
                    {30,40,50},
                    {50,60,70}};  //Two dimensional
        //System.out.println(x[1]);

        //System.out.println(y[0][2]);

        //for(int i = 0; i < 3; i++){
            //to print one dimensional array
        //    System.out.println(x[i]);
        //}

        for(int i = 0; i < x.length; i++){
            //to print two dimensional array
            for (int j = 0; j < y[i].length; j++){
                System.out.println(y[i][j]);
            }
        }

    }
}