package Rahmat;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
Card Coltsion = new Card("Coltsion SionSionSang", "SionColtsion@sang.sion"
,70000090, "Norway",100009000, 0.00);
        System.out.println("Full Name: "+Coltsion.getName());
        System.out.println("Email: "+ Coltsion.getEmail());
        System.out.println("Phone Number: "+Coltsion.getPhoneNumber());
        System.out.println("Nationality: "+ Coltsion.getNationality());
        System.out.println("Account Number: "+Coltsion.getAccountNumebr());
        System.out.println("Balance: "+Coltsion.getBalance());

Coltsion.Drawal(9898);
Coltsion.deposit(9787);
Coltsion.Drawal(876);

    }

}
