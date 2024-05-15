public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // test greetings 
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Yassin Daira");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String MohsenTest = alfredBot.respondBeforeMohsen(
                            "Mohsen! Play Like That."
                            );
        String alfredTest = alfredBot.respondBeforeMohsen(
            "I can't find my Bike Maybe Alfred knows");
        String notRelevantTest = alfredBot.respondBeforeMohsen(
            "i don t know "
        );
        
        // Print 
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(MohsenTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    
    }
}
