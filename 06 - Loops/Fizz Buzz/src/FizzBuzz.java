class FizzBuzz {
    public static void main(String[] args) {
        for(int number = 1; number < 101; number ++) {
            if (number % 3 == 0 || number % 5 == 0) {
                if (number % 3 == 0) { System.out.print("Fizz"); }
                if (number % 5 == 0) { System.out.print("Buzz"); }
                System.out.println();
            } else { System.out.println(number); }
        }
    }
}