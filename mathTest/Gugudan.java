package mathTest;

public class Gugudan {
    public static void main(String[] args) {
        int i;
        int j;
        for(i = 1; i< 10; i++){
            for( j = 2; j < 6; j++){
                System.out.printf(" %3d * %d = %3d ", j, i, i*j);
            }
            System.out.println();
        }
        System.out.println();
        for(i = 1; i< 10; i++){
            for( j = 6; j < 10; j++){
                System.out.printf(" %3d * %d = %3d ", j, i, i*j);
            }
            System.out.println();
        }

    }
}