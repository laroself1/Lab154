public class Main {
    public static void main(String[] args) {
        int i, n=0;
        for (i=1; i<=300; i++) {
            if ((i%3)==0 | (i%4)==0)
            {System.out.print(i+" ");
                n++;}
            if (n==10){ break;} } }}
