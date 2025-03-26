import java.util.Scanner;
class Logindetails  
{  
   static Scanner sc = new Scanner(System.in);
   void login()
   {
        System.out.println();
        System.out.println();
        System.out.println("---------------Welcome to Events.Insider---------------");
        System.out.println();
        System.out.println("READY TO MAKE A PLAN?\nget tickets to LIVE concerts,comedy shows,sports and much more!");
        System.out.println();
        System.out.println("Login");
        System.out.print("Enter mobile number: ");
        long mobno = sc.nextLong();
        int digitsLogMethod = (int) Math.log10(Math.abs(mobno)) + 1;
         System.out.print("Enter Username: ");
         String username=sc.next();

        System.out.print("Enter password: ");
        String password = sc.next(); 

        if (digitsLogMethod == 10) 
        {
            System.out.println("Login Successful");
            System.out.println("Welcome Back "+username);
        }
       else 
        {
            System.out.println("Invalid Credentials");
           System.exit(0); 
        }
    }
}
class Home extends Concerts
{
 void homepage()
 {
 System.out.println("Find New Experiences");
 System.out.println("1.Concerts\n2.Amusementparks\n3.Festival\n4.WorkShops");
 int n=sc.nextInt();
 if(n==1)
       {
          eventsoptions();
       }
 
}
                   
}
class Concerts extends Calculate 
{   
    static Scanner sc = new Scanner(System.in);
    void eventsoptions()
    {
	System.out.println();
        System.out.println("Choose an event:");
	System.out.println();
        System.out.println("1. Music\n2.Standup Comedy");

        int m = sc.nextInt();
        
        if (m == 1)
        {
            music();
        } 
        else if (m == 2)
        {
            comedy();
        } 
       else
        {
            System.out.println("Invalid selection.");
            System.exit(0);
            
        }
    }
    void music() {
    System.out.println("Choose a music event:");
    System.out.println();
    System.out.println("1. Rockstar DSP Live.");
    System.out.println("   Price (INR 999)   - Gachibowli Stadium.");
    System.out.println();
    System.out.println();
    System.out.println("2. Guru Randhawa Moon Rise Tour.");
    System.out.println("   Price (INR 2,499) - Aahloanam Resort, Gandipet.");
    System.out.println();
    System.out.println();
    System.out.println("3. Geetha Madhuri Live.");
    System.out.println("   Price (INR 599)   - 36 Downtown Brew Pub, Jubilee Hills.");
    System.out.println();
    System.out.println();
    System.out.println("4. Shreya Ghoshal All Hearts Tour.");
    System.out.println("   Price (INR 1,999) - Qatar National Convention Centre.");
    System.out.println();
    System.out.println();
    System.out.println("5. Arijit Singh One Night Only Tour.");
    System.out.println("   Price (INR 2,000) - GMR Arena.");
    System.out.println();
    System.out.println();
    System.out.println("6. Karthik Live.");
    System.out.println("   Price (INR 1,599) - Boulder Hills.");
    System.out.println();
    System.out.println();
    System.out.println("********** Select The Event **********");
    int n = sc.nextInt();
    String eventName = "";
    int ticketPrice = 0;
    String location = "";
    switch (n) {
        case 1:
            eventName = "Rockstar DSP Live.";
            ticketPrice = 999;
            location = "Gachibowli Stadium.";
            break;
        case 2:
            eventName = "Guru Randhawa Moon Rise Tour.";
            ticketPrice = 2499;
            location = "Aahloanam Resort, Gandipet.";
            break;
        case 3:
            eventName = "Geetha Madhuri Live.";
            ticketPrice = 599;
            location = "36 Downtown Brew Pub, Jubilee Hills.";
            break;
        case 4:
            eventName = "Shreya Ghoshal All Hearts Tour.";
            ticketPrice = 1999;
            location = "Qatar National Convention Centre.";
            break;
        case 5:
            eventName = "Arijit Singh One Night Only Tour.";
            ticketPrice = 2000;
            location = "GMR Arena.";
            break;
        case 6:
            eventName = "Karthik Live.";
            ticketPrice = 1599;
            location = "Boulder Hills.";
            break;
        default:
            System.out.println("Invalid selection.");
            System.exit(0);
    }

        System.out.println("You have selected : " + eventName);
        System.out.println("Event Location    : " + location);
        System.out.println("Ticket Price      : " + ticketPrice);
        System.out.print("Enter quantity    : ");
        int quantity = sc.nextInt();
       overallCost(eventName, ticketPrice, quantity, location);
    }
    void comedy()
    {
        System.out.println("Choose a comedy event:");
	System.out.println();
        System.out.println("1. Kunal Kamra Live");
        System.out.println("   Price (INR 999) - KIN Prasad Auditorium.");
        System.out.println();
        System.out.println("2. 'Who Are You?' by Rahul Subramaniam");
        System.out.println("   Price (INR 799) - Venue: Shilpakala Vedika, Hyderabad");
        System.out.println();
        System.out.println("3. Abhishek Upmanyu Live");
        System.out.println("   Price (INR 599) - Venue details missing)");
        System.out.println();
        System.out.println("4. Gaurav Gupta Live");
        System.out.println("   Price (INR 499) - The Comedy Theatre, Hyderabad");
        System.out.println();
        System.out.println("5. Vivek Samtani Live");
        System.out.println("   Price (INR 499) - The Hashtag Cafe, Hyderabad");
        System.out.println();
        System.out.println("********** Select The Event **********");
        
        int n = sc.nextInt();
        String eventName = "";
        int ticketPrice = 0;
        String location = "";
        switch (n) 
	{
            case 1:
                eventName = "Kunal Kamra Live";
                ticketPrice = 999;
                location = "KIN Prasad Auditorium";
                break;
            case 2:
                eventName = "'Who Are You?' by Rahul Subramaniam";
                ticketPrice = 799; // Price not mentioned for this event
                location = "Shilpakala Vedika, Hyderabad";
                break;
            case 3:
                eventName = "Abhishek Upmanyu Live";
                ticketPrice = 599; // No price or venue mentioned
                location = "(Venue details missing)";
                break;
            case 4:
                eventName = "Gaurav Gupta Live";
                ticketPrice = 499; // Assuming user selects the highest price
                location = "The Comedy Theatre, Hyderabad";
                break;
            case 5:
                eventName = "Vivek Samtani Live";
                ticketPrice = 499;
                location = "The Hashtag Cafe, Hyderabad";
                break;
            default:
                System.out.println("Invalid selection.");
                System.exit(0);
        }
        System.out.println("You have selected : " + eventName);
        System.out.println("Event Location    : " + location);
        System.out.println("Ticket Price      : " + ticketPrice);
        System.out.print("Enter quantity    : ");
        int quantity = sc.nextInt();
        overallCost(eventName, ticketPrice, quantity, location);
    }
    
}
class Calculate
{
void overallCost(String eventName, int ticketPrice, int quantity, String location)
    {
        double totalCost = quantity * ticketPrice;
        System.out.println();
    	System.out.println();
    	if(quantity!=1)
    	{
    	    System.out.println("********** Successfully Booked your tickets**");
    	}
    	else
    	{
    	    System.out.println("********** Successfully Booked your ticket **********");
    	}
    	System.out.println();
    	System.out.println("Event Name        : " + eventName);
    	System.out.println("Quantity          : " + quantity);
        System.out.println("Event Location    : " + location);
        System.out.println("Total Cost        : INR " + totalCost + "/-");
    	System.out.println();
    	if(quantity!=1)
    	{
    	    System.out.println("********** Thank you for Booking tickets   **********");
    	}
    	else
    	{
            System.out.println("********** Thank you for Booking ticket    **********");
    	}
    }
}

 

class Event extends Home
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Event obj = new Event();
        Logindetails obj1=new Logindetails();
        obj1.login();
        obj.homepage();
           
        
    }
}
