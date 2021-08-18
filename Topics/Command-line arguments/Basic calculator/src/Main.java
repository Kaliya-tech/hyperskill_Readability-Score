class Problem {
    public static void main(String[] args) {

        String sign = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if (!"+".equals(sign) && !"-".equals(sign) && !"*".equals(sign)) {
            System.out.println("Unknown operator");
        } else if ("+".equals(sign)) {
            System.out.println(a + b);
        } else if ("*".equals(sign)) {
            System.out.println(a * b);
        } else {
            System.out.println(a - b);
        }
    }
}