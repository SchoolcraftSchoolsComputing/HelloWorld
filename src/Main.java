public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(pad(i+1, 2)+") Hello " + args[0] + "!");
        }
    }

    private static String pad(int number, int places) {
        if(String.valueOf(number).length() < places) {
            return String.format("%0"+places+"d", number);
        }

        return String.valueOf(number);
    }
}
