import java.beans.Expression;

public class NewSwitchStatement {
    public static void main(String[] args) {
        String day = "Sunday";
//        switch(day){
//            case "Sunday","Saturday" -> System.out.println("7am");
//            case "Friday" -> System.out.println("8am");
//            default -> System.out.println("6am");
//
//        }

//        ----------Switch as an Expression START-------------

        String result = "";
//        switch(day){
//            case "Saturday","Sunday" -> result = "7am";
//            case "Friday" -> result = "8am";
//            default -> result = "6am";
//        }
//        System.out.println(result);

//        result = switch (day){
//            case "Saturday","Sunday" -> "7am";
//            case "Friday" -> "8am";
//            default -> "6am";
//        };

        result = switch (day){
            case "Saturday","Sunday" : yield  "7am";
            case "Friday" : yield "8am";
            default : yield  "6am";
        };
        System.out.println(result);
//        ----------Switch as an Expression END-------------

    }
}

