class Kata03 {

        public static void main(String[] args) {
                System.out.println(commonSeg(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }

        public static String commonSeg(int num1, int num2) {
        
                boolean[] common = union(num1, num2);
                return printCommon(common);
        }

        public static boolean[] union(int num1, int num2) {
                boolean[][] sevenseg = {{true, true, true, false, true, true, true}, {false, false, true, false, false, true, false}, {true, false, true, true, true, false, true}, {true, false, true, true, false, true, true},{false, true, true, true, false, true, false}, {true, true, false, true, false, true, true},{true, true, false, true, true, true, true}, {true, false, true, false, false, true, false},{true, true, true, true, true, true, true, true},{true, true, true, true, false, true, false}};

                boolean[] result = new boolean[7];

                for(int i=0; i<7; i++) {
                        if(sevenseg[num1][i] == sevenseg[num2][i]) result[i] = true;
                }

                return result;
        }

        public static String printCommon(boolean[] result) {

               StringBuilder sb = new StringBuilder();

               for(int i=0; i<7; i++) {
                       if(result[i]) {

                        if(i==0 || i==3 || i==6) {
                                sb.append(" —\n");
                        } else if (i==1 || i==4) {
                                sb.append("| ");
                        } else {
                                sb.append("|\n");
                        }
                       } else if(i%3 ==0) { 
                               sb.append("\n");
                       } else {
                               sb.append(" ");
                       }
               }

               return sb.toString();
        }

}
