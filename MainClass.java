import java. util.Scanner;
public class MainClass {
    
    public static void main(String[]args){
        AtmOperationInterf in = new  AtmOperationImpl();
        int AtmNum ;
        int PinNum ;
      Scanner op = new Scanner(System.in) ;
      System.out.print("Enter Atm Number :");
      int AtmN = op.nextInt();
     System.out.print("Enter  Pin :");
      int PinN = op.nextInt();
 
       
           if((AtmN <= 10000)&&(PinN <= 10000)){
               while(true){
               System.out.print("1.view available Amount\n 2.  withdraw Amount \n 3. deposit Amount \n4.view ministatement\n 5.exist");
                    System.out.print("Enter choise");
                   int ch = op.nextInt();
               if(ch==1){
                  in.viewBalance();
               }else if(ch==2){
                         System.out.print("Enter Amount ti withdraw :");
                         double withdrawAmount =op.nextDouble();
                         in.withdrawAmount(withdrawAmount);
               }else if(ch==3){
                         System.out.print("Enter amount to deposit");
                        double depositAmount = op.nextDouble();
                        in.depositAmount(depositAmount);
               }else if(ch==4){
                   in.viewMiniStatement();
               }else if (ch==5){
                         System.out.print("collect your Atm card \n Thank you for using");

               }else{ 
                         System.out.print("Enter correct choise");

               }
                       }               

        }
        else{
                 System.out.print("incorrect atm number or pin");
                 

        }
    }
    
}
