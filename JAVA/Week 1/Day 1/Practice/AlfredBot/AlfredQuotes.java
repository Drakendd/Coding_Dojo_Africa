import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {

        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, "+name+". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date= new Date();
        return "It is currently" +date;
    }
    
    public String respondBeforeYassin(String conversation) {
        if (conversation.indexOf("Yassin")>-1){
        return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if (conversation.indexOf("Alfred")>-1){
        return "At your service. As you wish, naturally.";
        }else{
            return "Right. And with that I shall retire.";
        }
    }
    
	}

