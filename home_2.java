public class home_2 {
 // 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int seniorBit(int i) {
    int binLen = Integer.toBinaryString(i).length();
    return binLen;  
}
}