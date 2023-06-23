package com.tasks6.rle;

public class Application {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println();
            return;
        }

        String input = args[0];
        String compressed = compressRLE(input);
        System.out.println(compressed);
    }

    private static String compressRLE(String input) {
        if (input.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                if (count > 1) {
                    compressed.append(Math.min(count, 9));
                    if (count > 9) {
                        compressed.append(currentChar);
                        compressed.append(Math.min(count - 9, 9));
                    }
                }

                currentChar = c;
                count = 1;
            }
        }

        compressed.append(currentChar);
        if (count > 1) {
            compressed.append(Math.min(count, 9));
            if (count > 9) {
                compressed.append(currentChar);
                compressed.append(Math.min(count - 9, 9));
            }
        }

        return compressed.toString();
    }
}
