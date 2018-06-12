import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        E[] b = new E[4];
        b[0] = new E(4,2);
        b[1] = new E(1,10);
        b[2] = new E(-2,5);
        b[3] = new E(1,2);
        Arrays.sort(b);
        for(E t: b)
            System.out.println(t.a + " " + t.b);
    }

    static class E implements Comparable<E> {
        int a, b;
        E(int a0, int b0) {a = a0; b = b0;}
        public int compareTo(E x) {
            if(a!=x.a) return Integer.compare(a, x.a);
            return Integer.compare(b, x.b);
        }
    }
}
