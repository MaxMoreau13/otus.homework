package otus.hw.lesson;

//выполнил дз
class FirstHomework {

    public static void main(String[] args) {
        greetings();
        checkSign(13, 11, 98);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(13, 11, true);

    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void selectColor() {
        int data = 13;
        if (data <= 10) {
            System.out.println("Red");
        } else if (data > 10 && data <= 20) {
            System.out.println("Yellow");
        } else if (data > 20) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 13;
        int b = 11;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue = initValue + delta;
            System.out.println(initValue);
        } else {
            initValue = initValue - delta;
            System.out.println(initValue);
        }
    }
}
