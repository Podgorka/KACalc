
import java.util.Arrays;
import java.util.Scanner;

public class calcolator {
    public calcolator() {
    }

    public static void main(String[] args) throws FactorialException {
        System.out.println("Введите выражение через пробел 1 + 2 или I + II (от 1 до 10)");
        Scanner Str = new Scanner(System.in);
        String s = Str.nextLine();
        String[] srclist = new String[3];
        srclist = s.split(" ");
        if (srclist.length > 3) {
            throw new FactorialException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            int[] arr2 = new int[3];

            String aCharacterAsString;
            try {
                aCharacterAsString = String.valueOf(srclist[1]);
            } catch (ArrayIndexOutOfBoundsException var13) {
                throw new FactorialException("строка не является математической операцией");
            }

            aCharacterAsString = String.valueOf(srclist[1]);
            String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            String[] rom = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            Arrays.asList(arab).contains(srclist[0]);
            roman[] massivrim = roman.values();

            try {
                int res;
                if (Arrays.asList(arab).contains(srclist[0]) && Arrays.asList(arab).contains(srclist[2])) {
                    arr2[0] = Integer.parseInt(srclist[0]);
                    arr2[1] = 0;
                    arr2[2] = Integer.parseInt(srclist[2]);
                    res = 0;
                    switch (aCharacterAsString) {
                        case "+":
                            res = arr2[0] + arr2[2];
                            break;
                        case "-":
                            res = arr2[0] - arr2[2];
                            break;
                        case "*":
                            res = arr2[0] * arr2[2];
                            break;
                        case "/":
                            res = arr2[0] / arr2[2];
                    }

                    System.out.println(res);
                } else {
                    if (!Arrays.asList(rom).contains(srclist[0]) || !Arrays.asList(rom).contains(srclist[2])) {
                        if ((!Arrays.asList(arab).contains(srclist[0]) || !Arrays.asList(rom).contains(srclist[2])) && (!Arrays.asList(rom).contains(srclist[0]) || !Arrays.asList(arab).contains(srclist[2]))) {
                            throw new FactorialException("строка не является математической операцией");
                        }

                        throw new FactorialException("используются одновременно разные системы счисления");
                    }

                    res = 0;

                    for(int y = 0; y < 3; ++y) {
                        switch (srclist[y]) {
                            case "I":
                                arr2[y] = 1;
                                break;
                            case "II":
                                arr2[y] = 2;
                                break;
                            case "III":
                                arr2[y] = 3;
                                break;
                            case "IV":
                                arr2[y] = 4;
                                break;
                            case "V":
                                arr2[y] = 5;
                                break;
                            case "VI":
                                arr2[y] = 6;
                                break;
                            case "VII":
                                arr2[y] = 7;
                                break;
                            case "VIII":
                                arr2[y] = 8;
                                break;
                            case "IX":
                                arr2[y] = 9;
                                break;
                            case "X":
                                arr2[y] = 10;
                        }
                    }

                    switch (aCharacterAsString) {
                        case "+":
                            res = arr2[0] + arr2[2];
                            break;
                        case "-":
                            res = arr2[0] - arr2[2];
                            break;
                        case "*":
                            res = arr2[0] * arr2[2];
                            break;
                        case "/":
                            res = arr2[0] / arr2[2];
                    }

                    if (res < 0) {
                        throw new FactorialException("в римской системе нет отрицательных чисел");
                    }

                    System.out.println(roman.values()[res]);
                }

            } catch (NumberFormatException var14) {
                throw new RuntimeException(var14);
            }
        }
    }
}
