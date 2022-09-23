public class hm1 {
    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 2;
        double var3 = var1 / var2;
        int var4 = (int) (var3 * var2);
        System.out.println(var4);

//        java에서 /는 연산자이며 나눈 값의 몫을 알려준다.
//        만약 당신이 var4의 값으로 5를 기대했다면 var3부터 당신의 뜻대로 되지 않았다.
//        var3의 값은 5를 2로 나눈 몫인 2이기 때문이다.
//        이때 var3의 값을 너가 예상한대로 2.5로 만들고 싶다면
//        double var3=(double) var1 / var2; 이나
//        double var3=var1 / (double) var2; 을 해주면 된다.

    }
}
