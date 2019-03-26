public class Main {
    public static void main(String args[]){
        Operation0 op0 = () -> 0;
        Operation1 op1 = n -> n%2;
        Operation2 op2 = (x, y) -> x + y;
        OperationC opC = (x, y) -> {
            System.out.println("Внутри блока кода...");
            if (y==0)return 0;
            else return x/y;
        };
        System.out.println("Без параметра: " + op0.zero());
        System.out.println("1 параметр: " + op1.mod2(10));
        System.out.println("2 параметра: " + op2.sum(10, 20));
        System.out.println("Блочное выражение: " + opC.code(10, 10));
    }
}
