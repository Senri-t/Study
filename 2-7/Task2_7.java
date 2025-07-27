public class Task2_7 {
    public static void main(String[] args) {
        
        String[] country = new String[4];
        country[0] = "JAPAN";
        country[1] = "AMERICA";
        country[2] = "KOREA";
        country[3] = "ENGLAND";
        
        System.out.println(country.length);
        
        String[] strArray = new String[3];
        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";
        System.out.println(strArray[2]);
        //整数型の配列 intArray を作成し、初期値として 10, 20, 30, 40, 50 を代入
        int[] intArray = { 10, 20, 30, 40, 50 };
        // 配列 intArray の 1番目、5番目の要素を足し、その結果を出力
        System.out.println(intArray[0] + intArray[4]);
    }
}
