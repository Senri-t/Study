public class Task2_10 {

    public static void main(String[] args) {
        String[]  fruits = new String[4];
        fruits[0] = "みかん";
        fruits[1] = "りんご";
        fruits[2] = "ぶどう";
        fruits[3] = "メロン";
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
         }
         System.out.println();


        /*
        * 1～50までの数字を順番に表示する
        */

         int s = 1;
         while(s <= 50) {
            System.out.print(s);
            s++;
        }
         System.out.println();

        for (int k = 5; k <= 9; k++) {
            System.out.println(k + "||");            
            for (int j = 1; j <= 9; j++) {
               	System.out.print(k * j + "|");
                }
                System.out.println();
        }
        
    }
                
}