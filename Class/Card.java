package Rahmat;

public class Card {
    public Card(String Name, String Email, int PhoneNumber, String Nationality, int AccountNumber, double Balance){
        this.Name = Name;
        this.Email= Email;
        this.PhoneNumber= PhoneNumber;
        this.Nationality = Nationality;
        this.AccountNumebr= AccountNumber;
        this.Balance = Balance;
    }
    private String Name;
    private String Email;
    private int PhoneNumber;
    private int AccountNumebr;
    private double Balance;
    private String Nationality;
    public void setNationality(String Nationalty){
        this.Nationality = Nationalty;
    }
    public String getNationality(){
        return Nationality;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setEmail(String Email){
        this.Email= Email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.PhoneNumber = phoneNumber;
    }
    public void setAccountNumebr (int accountNumebr){
        this.AccountNumebr=accountNumebr;
    }
    public void setBalance(double balance){
        this.Balance=balance;
    }
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
    }
    public int getPhoneNumber(){ return PhoneNumber;}
    public int getAccountNumebr(){return AccountNumebr;}
    public double getBalance(){return Balance;}
    public void deposit(double depAmount){
        this.Balance+=depAmount;
        System.out.println(" Deposit is: "+depAmount+ " New Balance is: "+ this.Balance);
    }
    public void Drawal(double drawal){
        if(Balance-drawal<=0){
            System.out.println(" Balance is: "+Balance);
        }else{
            Balance-=drawal;
            System.out.println(" Balance withdrawal is: "+Balance );
        }
    }
}
