import java.util.Scanner;

public class ArraySearch{
    public static void main(String [] args){
        
        String[][] seasons = { //2D Array for Months and Seasons
            {"January", "Winter"},
            {"February", "Winter"},
            {"March", "Spring"},
            {"April", "Spring"},
            {"May", "Spring"},
            {"June", "Summer"},
            {"July", "Summer"},
            {"August", "Summer"},
            {"September", "Autumn"},
            {"October", "Autumn"},         
            {"November", "Autumn"},   
            {"December", "Winter"},     
            };

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = scnr.nextLine();

        boolean found = false;
        for(String[] row : seasons){ //For each row in seasons
            if(row[0].equalsIgnoreCase(month)){
                System.out.println(month + " is in " + row[1]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Month not found");
        }
    }
}