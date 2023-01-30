package it.develhope.stringhandling;
public class Start{
    public static void main(String arg[])
{
    String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    String sub1 = veryLongString.substring(0, veryLongString.indexOf("aliquip"));
    String sub2 = veryLongString.substring(veryLongString.indexOf("aliquip"));

    veryLongString = veryLongString.replace("um", "HUM");

    System.out.println("sub1: " + sub1);
    System.out.println("sub2: " + sub2);

    boolean estInSub1 = sub1.contains("est");
    boolean estInSub2 = sub2.contains("est");

    System.out.println("Est in sub1 or Est in sub2: " + (estInSub1 ^ estInSub2));

}
}


