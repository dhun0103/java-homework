public class hm2 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);

//        우선 출력 결과는 31이다.
//        그 이유로는 x는 플러스가 된 11인 반명 y는 20이기 때문이다.
//        피연산자 앞에 증감연산자가 들어가면 다른 연산을 수행하기 전에
//        피연산자 값을 먼저 변화시킨다.
//        그러나 피연산자 뒤에 증감연산자가 들어오면 다른 연산을 수행한 후에
//        피연산자 값을 변화시킨다.

    }
}
