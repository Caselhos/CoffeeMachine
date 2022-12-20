package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int money=550;
        int mlWater=400;
        int mlMilk=540;
        int gCoffee=120;
        int nDisposableCups=9;

        Scanner Scanner = new Scanner(System.in);
        while(true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (Scanner.next()) {
                case "buy" -> {
                    int[] waterReq=new int[]{250,350,200};
                    int[] milkReq=new int[]{0,75,100};
                    int[] coffeeReq=new int[]{16,20,12};
                    int[] cost=new int[]{4,7,6};
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    if(Scanner.hasNextInt()){
                        int choiceCoffee = Scanner.nextInt();
                        if(mlWater<waterReq[choiceCoffee-1] || mlMilk<milkReq[choiceCoffee-1] || gCoffee<coffeeReq[choiceCoffee-1] || nDisposableCups==0){
                            System.out.println("Sorry, not enough resources");
                        }
                        else{
                            System.out.println("I have enough resources, making you a coffee!");
                            mlWater = mlWater - waterReq[choiceCoffee-1];
                            mlMilk = mlMilk - milkReq[choiceCoffee-1];
                            gCoffee = gCoffee - coffeeReq[choiceCoffee-1];
                            money = money + cost[choiceCoffee-1];
                            nDisposableCups--;
                        }
                    }
                    else Scanner.next();
                }
                case "fill" -> {
                    System.out.println("Write how many ml of water you want to add:");
                    mlWater = mlWater + Scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    mlMilk = mlMilk + Scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    gCoffee = gCoffee + Scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    nDisposableCups = nDisposableCups + Scanner.nextInt();
                }
                case "take" -> {
                    System.out.printf("I gave you $%d",money);
                    money = 0;
                }
                case "remaining" -> {
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d ml of water\n",mlWater);
                    System.out.printf("%d ml of milk\n",mlMilk);
                    System.out.printf("%d g of coffee beans\n",gCoffee);
                    System.out.printf("%d disposable cups\n",nDisposableCups);
                    System.out.printf("$%d of money\n",money);
                }
                case "exit" -> System.exit(0);
            }
        }
    }
}
