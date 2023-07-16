public class SpeedConverter {
    // write your code here
     public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour / 1.609);
        }
        // Se puede obtener lo mismo sin usar la variable local milesPerHour
        //long milesPerHour = Math.round(kilometersPerHour / 1.609);
        //return milesPerHour;

    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0){
        System.out.println("Invalid Value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
        
    }
}