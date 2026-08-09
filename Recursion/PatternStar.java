public class PatternStar {
    public static void main(String[] args) {
        printStar(4);
    }

    public static void printStar(int r) {
        int i = r;
        timesToPrint(i);
        if (r == 0) {
            return;
        }
        System.out.println();
        printStar(r - 1);
    }

    public static void timesToPrint(int i) {
        if(i == 0){
            return;
        }
        System.out.print("*");
        timesToPrint(i-1);
    }
}
