import java.util.Scanner;
public class Main {
    public static int arrElemnt(int[] arr , int index){
        if (index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    };

    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8,9,10};
         Scanner inp = new Scanner(System.in);
         System.out.println("0-9 arası bir index giriniz : ");
         int index = inp.nextInt();

         try {
             int element = arrElemnt(arr,index);
             System.out.println("Girilen indexte bulunan eleman : " + element);
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Hata: Dizi boyutu aşıldı. " + e.toString());
         }
    }
}