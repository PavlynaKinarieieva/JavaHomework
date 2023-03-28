class SwapVariables {
            public static void main(String[] args) {
                int a = 10;
                int b = 20;

                System.out.println("Перед заменой значения, a = " + a + " и b = " + b);

                // Меняем значения местами без использования третьей переменной, используя операцию XOR
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;

                System.out.println("После замены значения, a = " + a + " и b = " + b);
            }
        }