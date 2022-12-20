public class Main {

    public static void main(String[] args) {
        int counter = 0;

        for(Secret secret : Secret.values()){
            String test=secret.name();
            if(test.startsWith("STAR")){
                counter++;
            }
        }
        // write your code here


        System.out.println(counter);
    }
}
