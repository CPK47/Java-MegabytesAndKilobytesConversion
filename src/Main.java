public class Main {
    public static void main(String[] args)
    {
        System.out.println("Output after test data");
        System.out.print("Test data:    2500       ");
        MegabytesAndKilobytes.printMegabytesAndKilobytes(2500);
        System.out.print("Test data:    0          ");
        MegabytesAndKilobytes.printMegabytesAndKilobytes(0);
        System.out.print("Test data:    1024       ");
        MegabytesAndKilobytes.printMegabytesAndKilobytes(1024);
        System.out.print("Test data:    100403     ");
        MegabytesAndKilobytes.printMegabytesAndKilobytes(100403);
        System.out.print("Test data:    -1         ");
        MegabytesAndKilobytes.printMegabytesAndKilobytes(-1);
    }

    public class MegabytesAndKilobytes
    {
        public static void printMegabytesAndKilobytes(int kilobytes)
        {
            int iMegabytes;
            int iKilobytes;

            if (kilobytes < 0) System.out.println("Invalid Value");
            else
            {
                iMegabytes = kilobytes / 1024;
                iKilobytes = kilobytes % 1024;
                System.out.println(kilobytes + "Kb = " + iMegabytes + "Mb and " + iKilobytes + "Kb");
            }
        }
    }
}