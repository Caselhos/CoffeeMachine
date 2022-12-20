class Cat {

    protected  String name;
    protected int age;
    protected static int counter;
    // write static and instance variables

    public Cat(String name, int age) {
        this.name=name;
        this.age=age;
        counter++;
        if(getNumberOfCats()>5){
            System.out.println("You have too many cats");
        }
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;
    }
}