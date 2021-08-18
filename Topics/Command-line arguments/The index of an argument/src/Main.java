class Problem {
    public static void main(String[] args) {

        String result = "";

        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                result = String.valueOf(i);
            } else {
                result = "-1";
            }
        }
        System.out.println(result);
    }
}