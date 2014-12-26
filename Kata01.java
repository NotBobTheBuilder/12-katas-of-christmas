class Kata01 {

        public static void main (String[] args) {

        System.out.println(isEven(args[0]));

        }

        public static boolean isEven (String word) {

        boolean odd = false;
        boolean beforeOdd = false;
        boolean result = false;

        for(int i=0; i<word.length(); i++) {
                        odd = (word.charAt(i) % 2) != 0;
                if(beforeOdd && odd) {
                        result = false; 
                } else {
                        result = true;
                }
                beforeOdd = odd;
        }
        return result;
        }
}
