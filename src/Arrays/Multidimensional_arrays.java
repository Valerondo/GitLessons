package Arrays;

public class Multidimensional_arrays {
    public static void main(String[] args){
        int[][] matrice = {{1,2,3},
                            {4},
                            {7,8}};
        System.out.println(matrice[2][1]);//8

        String[][] str_array = new String[2][3];//создание 2мерного массива строк
        str_array[0][0] = "hello";
        System.out.println(str_array[0][0]);//hello

        System.out.println();

        int[][] table = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
