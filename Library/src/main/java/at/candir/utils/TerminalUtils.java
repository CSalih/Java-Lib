package at.candir.utils;


/**
 * Terminal utils like colored output
 */
public class TerminalUtils {

    public static void print(String str, TerminalColor color) {
        System.out.print(color + str + TerminalColor.RESET);
    }

    public static void println(String str, TerminalColor color) {
        System.out.println(color + str + TerminalColor.RESET);
    }
}
