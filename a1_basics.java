class a1_basics {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
         double num = 78.86889788676;
         String add="India";

        // System.out.println(108+890.90+"krishna");

        // String Formatting

        // System.out.printf("%.3f%n", num);
        // ans:78.868
        // System.out.printf("%.6f", num);
        String name = String.format("My roll no is %s address is %f", num,add);
        String name1 = String.format("My roll no is %2$f address is %1$s", add,num);

        System.out.println(name);

    }

}