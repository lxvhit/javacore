public class vonglap {
    public static void main(String[] args) {
        for (int ga = 0; ga < 100; ga++) {
            for (int cho = 0; cho < 100; cho++) {
                if ((ga + cho == 36) && ((ga * 2) + (cho * 4) == 100)) {
                    System.out.println("so ga bang :"+ ga);
                    System.out.println("so cho bang :" + cho);
                }
            }
        }
    }
}
