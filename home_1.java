import java.util.Random;

public class home_1{
    public static void main(String[] args){
      // 1 Выбросить случайное целое число от 0 до 2000 и сохранить в i
      int min = 0; 
      int max = 2000;
      System.out.println(new Random().nextInt(max-min) + min);   
    }
}