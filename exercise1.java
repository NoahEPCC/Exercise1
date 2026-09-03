public class Exercise1{
    public static void main(String [] args){
        
        int[][] matrix = {
            {40, -87, -21},
            {100, 9, -7},
            {102, 98, -200}
        };
    }

    int max = matrix[0][0];

    for(int[] row : matrix){
        for(int value : row){
            if(value > max){
                max = value;
            }
        }
    }
    System.out.println("The max is " + max);
}