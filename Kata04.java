class Kata04 {

        public static void main (String[] args) {
                System.out.println(convertString(args[0]));
        }

        public static int convertString(String ipv4) {

                int dot = 0;
                int beforedot = -1;
                int[] bits = new int[4];

                for(int i=0; i<3; i++) {
                        dot = ipv4.indexOf('.', beforedot+1);
                        bits[i] = Integer.parseInt(ipv4.substring(beforedot+1,dot));
                        beforedot = dot;
                }
                bits[3] = Integer.parseInt(ipv4.substring(ipv4.lastIndexOf('.')+1, ipv4.length()));

                return toBaseTen(bits);
        }

        public static int toBaseTen(int[] bits) {

                StringBuilder sb = new StringBuilder();

                for(int x : bits) {
                        sb.append(addZeros(Integer.toBinaryString(x)));
                }

                return Integer.parseInt(sb.toString(), 2);

        }

        public static String addZeros(String s) {

                int length = s.length();
                int zeros = 8 - length;

                StringBuilder sb = new StringBuilder(s);

                if(zeros != 0) {
                        for(int i=0; i<zeros; i++) {
                                sb.insert(0,'0');
                        }
                }

                return sb.toString();
        }

}       
