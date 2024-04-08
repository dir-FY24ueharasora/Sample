package Sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            //ここに例外が発生する可能性のあるコードを書きます
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //ArithmeticExceptionが発生した時の処理
            System.out.println("ArithmeticExceptionが発生 + e.getmassage()");
        }finally {
            //例外の有無に関わらず、実行されるコードを書きます。
            System.out.println("割り算終了");
        }

    }

}
