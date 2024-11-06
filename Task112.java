class Task112 {

    public static void main (String[] args){

        int result = 1; 
        result += 2; // result is now 3
        System.out.println(result);

        result = 3; 
        result -= 1;// result is now 2
        System.out.println(result);

        result = 2; // result is now 4
        result *= 2;
        System.out.println(result);

        result = 4;
        result /= 2; // result is now 2
        System.out.println(result);

        result = 2;
        result += 8; // result is now 10
        result = 10;
        result %= 7; // result is now 3
        System.out.println(result);
    }
}