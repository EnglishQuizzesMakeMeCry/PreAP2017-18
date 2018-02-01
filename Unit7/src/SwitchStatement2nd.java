
public class SwitchStatement2nd {

	public static void main(String[] args) {
		 int value = 1;
		 String name = "bob";
       if(value == 1) {
           System.out.println("Value was 1");
       } else if(value == 2) {
           System.out.println("Value was 2");
       } else {
           System.out.println("Was not 1 or 2");
       }

       int switchValue = 1;
//byte, short, int, char
       switch(switchValue) {
           case 1://if switchVal == 1, do this
               System.out.println("Value was 1");
               break;//separates code in each case

           case 2://if switchVal == 2, do this
               System.out.println("Value was 2");
               break;
           case 3: case 4: case 5:
        	   System.out.println("Value was " + switchValue);
        	   break;
           default:
        	   System.out.println("Value was not 1 or 2");
        	   break;//optional
       }
           
       // Create a new switch statement using char instead of int
       // create a new char variable
       // create a switch statement testing for
       // A, B, C, D, or E
       // display a message if any of these are found and then break
       // Add a default which displays a message saying not found

       char charValue = 'B';
       switch(charValue) {
           case 'A':
               System.out.println("A was found");
               break;
           case 'B':
               System.out.println("B was found");
               break;
           case 'C': case 'D' : case 'E':
               System.out.println(charValue + " was found");
               break;

           default:
               System.out.println("Could not find A, B, C, D or E");
               break;
       }
       
 /*  String switchString = "jUNe";
   switch(switchString.toLowerCase()){
   		case "june":
	   System.out.println("The month is June");
	   break;
   		case "november":
   			System.out.println("The month is Nov");
   			break;
   		default:
   			System.out.println("Month was " + switchString);
   			break;
   }
   */
	}

}
