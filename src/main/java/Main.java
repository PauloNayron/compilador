public class Main {
    public static void main(String[] args) {
        String input = """
                let a = 42 + 5 - 8;
                let b = 56 + 8;
                print a + b + 6;
                """;
        Parser p = new Parser (input.getBytes());
        p.parse();

        /*
        String input = "let a = 42 + 5;";
        Scanner scan = new Scanner (input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
        */

        /*
        String input = "289-85+0+69";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        */
    }
}
