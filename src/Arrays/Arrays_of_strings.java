package Arrays;

public class Arrays_of_strings {
    public static void main(String[] args){
        String[] str = new String[3];
        str[0] = "Valera";
        str[1] = "Dasha";
        str[2] = "Sveta";
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);

        System.out.println();
        for (int i = 0; i< str.length; i++){
            System.out.println(str[i]);
        }

        System.out.println();
        for(String str_array: str){ // String - тип данных/str_array - переменная внутри цикла/str - массив - for each
            System.out.println(str_array);
        }

        System.out.println();
        int[] num = {1,2,3};
        int sum = 0;
        for(int nums_array: num){
            sum = sum + nums_array;
        }
        System.out.println(sum);

        int value = 0; //коробка, так как знаем сколько занимает инт
        String s = null; //ссылка, так как не знаем сколько нужно под стринг, может быть разным
        System.out.println(s);
    }
}
