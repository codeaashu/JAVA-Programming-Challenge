// Print >>> Reverse Right Half Pyramid 🚀
// Print >>> Left Half Pyramid 🚀
// Print >>> Right Half Pyramid 🚀
// Print >>> Reverse Right Half Pyramid using while loop 🚀
public class challenge1 {
    public static void main(String[] args) {
        System.out.println("calling first pattern");
        printfirstpattern();
        System.out.println("calling second pattern");
        printsecondpattern();
        System.out.println("calling third pattern");
        printthirdpattern();
        System.out.println("print first pattern using while loop ");
        printFirstPattern2Way();
    }

    public static void printsecondpattern() {
        // Reverse Right Half Pyramid
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*\n\n");
    }

    public static void printthirdpattern() {
        // Left Half Pyramid
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *\n\n");
    }

    public static void printfirstpattern() {
        // Right Half Pyramid
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *\n\n");
    }
    public static void printFirstPattern2Way() {
        int rows = 0;
        while(rows < 10){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println(" ");
            rows++;
        }
    }
}