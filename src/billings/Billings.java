
package billings;


public class Billings {

   
    public static void main(String[] args) {
      
        double initialAirtime = 10000.0; // in UGX
        
        double chargePercentage = 10.0; // 10% charge on loaded airtime
        double costPerSecond = 200.0; // UGX per second

        int callDurationMinutes = 5; // in minutes
        int callDurationSeconds = callDurationMinutes * 60; // converting minutes to seconds

        double chargedAirtime = initialAirtime - (initialAirtime * chargePercentage / 100);

        double callCost = callDurationSeconds * costPerSecond;

        double remainingBalance = chargedAirtime - callCost;

       
        System.out.println("The remaining balance after the call is: UGX " + remainingBalance);
    }
}

    
    

