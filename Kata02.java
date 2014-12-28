class Kata02 {

        public static void main(String[] args) {
                dateConvert(args[0]);
        }

        public static void dateConvert(String isoDate) {
               System.out.println(usDate(isoDate));
               System.out.println(ukDate(isoDate));
               System.out.println(spokenDate(isoDate));
        }

        public static String usDate(String isoDate) {
                StringBuilder sb = new StringBuilder();
                sb.append("US: ");
                sb.append(isoDate.substring(5,7));
                sb.append("/");
                sb.append(isoDate.substring(8,10));
                sb.append("/");
                sb.append(isoDate.substring(0,4));

                return sb.toString();
        }

        public static String ukDate(String isoDate) {
                StringBuilder sb = new StringBuilder();
                sb.append("UK: ");
                sb.append(isoDate.substring(8,10));
                sb.append("/");
                sb.append(isoDate.substring(5,7));
                sb.append("/");
                sb.append(isoDate.substring(0,4));

                return sb.toString();
        }

        public static String spokenDate(String isoDate) {

                switch (isoDate.charAt(9)) {
                        case '1':
                                return restSpoken(isoDate, "st");
                        case '2':
                                return restSpoken(isoDate, "nd");
                        case '3':
                                return restSpoken(isoDate, "rd");
                        default: 
                                return restSpoken(isoDate, "th");
                }

        }

        public static String restSpoken(String isoDate, String nth) {

                StringBuilder sb = new StringBuilder();
                String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

                sb.append("Spoken: ");

                if(isoDate.charAt(8) == '0') {
                        sb.append(isoDate.charAt(9));
                } else {
                        sb.append(isoDate.substring(8,10));
                }

                if(isoDate.charAt(8) == '1') {
                        sb.append("th");
                } else {
                        sb.append(nth);
                }

                sb.append(" of ");
                sb.append(months[Integer.parseInt(isoDate.substring(5,7))-1]);

                sb.append(" ");
                sb.append(isoDate.substring(0,4));

                return sb.toString();

        }

}
