package main;

public class ProcessMessage {

    public void sayInitialMessage() {
        System.out.println("Ko-Calculator is Running");
        System.out.println("If you want to stop this Application, Please Enter 'stop'");
    }

    // This String will be used for show what used entered while this program is running
   public static String processMessage = ">> ";

   public static void printProcessMessage() {
        System.out.println(processMessage);
   }

   public static void printResult() {
       System.out.println(processMessage + " = " + ResultCalculated.result);
   }


}