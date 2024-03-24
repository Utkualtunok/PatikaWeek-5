import java.util.*;
public class Main {
    public static void main(String[] args) {
       int maxCount = 0;
       String repeater = null;

       Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz : ");
        String words = inp.nextLine();

        String[] splitWords = words.split("\\s+");
        System.out.println(Arrays.toString(splitWords));

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : splitWords){
            wordsCount.put(word,wordsCount.getOrDefault(word,0)+1);
        }

        System.out.println(wordsCount);

        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                repeater = entry.getKey();
            }
        }

        if (repeater != null){
            System.out.println("En çok tekrar edilen kelime : " + repeater + ", tekrar sayısı : " + maxCount);
        }else System.out.println("Kelime bulunamadı !");
    }
}