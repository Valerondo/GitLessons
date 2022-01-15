package Exception_less;

public class Exception3 {
    public static void main(String[] args) {
        //Checked Exceptions (Compile time exception) = исключительные случае в работе программы
        //UnChecked Exceptions (Runtime exception) = ошибка в работе программы

        //int a = 1 / 0; //UnChecked Exceptions

        /*String name = null;
        name.length();*/

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
