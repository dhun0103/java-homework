public class hm3 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        System.out.println("시작!");
        while (num1 + num2 != 5) {
            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;
            System.out.println("(" + num1 + "," + num2 + ")");
        }
        System.out.println("끝!");

//        Math.random 함수는 double형으로 0.0 이상 1.0 미만 사이의 값을 반환하는 함수다.
//        이 함수는 기본형이 double형이므로 (int)로 정수화 시켜주는 것이고
//        0부터 값이 나오기 때문에 +1을 해주었다.
//        while문은 조건문이 참인 동안 안에 코드를 계속 수행하므로
//        num1 + num2 != 5 을 해주었다.

    }
}
