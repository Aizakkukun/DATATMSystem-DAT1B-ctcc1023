import java.util.Scanner;


public class CreditCard {
    private String code;
    private String secret;
    private int balance;

    public CreditCard(int balance, String code, String secret){
        this.balance = balance;
        this.code = code;
        this.secret = secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setAmount(int newAmount){
        this.balance = newAmount;
    }

    public void depositAmt(int newAmount){
        this.balance = this.balance + newAmount;
        System.out.println("Deposit Successful!");
    }

    public void withdrawAmt(int newAmount){
        if(this.balance >= newAmount){
            this.balance= this.balance - newAmount;
            System.out.println("Withdrawal Successful!");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public static Scanner yusuke = new Scanner(System.in);

    public static int findCard(CreditCard[] cards, String code){
        for(int i = 0; i< cards.length; i++){
            if (code.equals(cards[i].getCode())){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //example card
        CreditCard firstCard = new CreditCard(100,"1111222233334444", "123");
        CreditCard secCard = new CreditCard(300,"5555666677778888", "567");
        CreditCard thirdCard = new CreditCard(1000,"1111000022229999", "890");
        CreditCard fourthCard = new CreditCard(2000,"5555666677774444", "098");

        CreditCard[] cards = {firstCard,secCard,thirdCard,fourthCard};

        //ask for card number
        System.out.print("Please enter your card number: ");
        String yourCode = yusuke.next();
        while(!yourCode.equals("stop")){
            int codeIndex = findCard(cards,yourCode);
            if(codeIndex != -1){

                //ask for card secret
                System.out.print("Please enter the card's secret code: ");
                String yourSecret;
                boolean guessedRight = false;

                //give them 3 tries if it's wrong
                for(int tries = 0; tries < 3; tries++){
                    yourSecret = yusuke.next();
                    if (yourSecret.equals(firstCard.getSecret())){ // if yourSecret == firstCard's secret
                        guessedRight = true;
                        break;
                    }
                    else{
                        System.out.println("Code is incorrect.");
                    }
                }
            }
        }
    }
}