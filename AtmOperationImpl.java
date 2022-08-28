import java.util.Map;
import java.util.HashMap;


public class AtmOperationImpl implements AtmOperationInterf{
    ATM atm = new ATM();
       Map <Double,String> ministmt = new HashMap<>();

       public void viewBalance() {
                    System.out.print("Available balance is :" + atm.getBalance());


       }

      public void withdrawAmount(double withdrawAmount) {
          if(withdrawAmount <= atm.getBalance()){
              ministmt.put(withdrawAmount,"Amount withdrawn");
                System.out.print(withdrawAmount +"collect your cash");
                     atm.setBalance(atm.getBalance()-withdrawAmount) ;  
                       viewBalance();
      }else{
                    System.out.print("Amount is less");

          }
          
      }
   public void depositAmount(double depositAmount) {
                     ministmt.put(depositAmount,"Amount deposit");

             System.out.print(depositAmount+"deposit successfull");
           atm.setBalance(atm.getBalance()+ depositAmount);
           viewBalance();
   }
  public void viewMiniStatement() {
       for(Map.Entry <Double,String> m:ministmt.entrySet()){
                System.out.print(m.getKey()+" " +m.getKey()) ;
 
       }
       
}
}
        


