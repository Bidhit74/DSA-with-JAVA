public class ReverseNum {
    public static void main(String[] args){
        // given :- 582002  :: output -> 200285
        int given = 582002;
        int result = 0;
        while (given != 0) {
            int lastDigit = given % 10;
            result = result * 10 + lastDigit;
            given /= 10;
        }
        System.out.println(result);
    }
}
