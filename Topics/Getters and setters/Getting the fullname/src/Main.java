class User {
    private String firstName;
    private String lastName;

    public static void main(String[] args){
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        String test=tim.getFullName();
        System.out.println(test); // Tim Towler
    }

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {

        if(firstName!=null && !firstName.equals("")){
            this.firstName=firstName;
        }
        // write your code here
    }

    public void setLastName(String lastName) {
        if(lastName!=null && !lastName.equals("")){
            this.lastName=lastName;
        }
    }

    public String getFullName() {
        if((this.firstName==null || this.firstName.equals(""))&&(this.lastName==null || this.lastName.equals(""))){
            return "Unknown";
        }
        else if((this.firstName==null || this.firstName.equals("")) || (this.lastName==null || this.lastName.equals(""))){
            if(this.firstName==null || this.firstName.equals("")){
                return this.lastName;
            }
            else{
                return this.firstName;
            }
        }
        else {
            return this.firstName.concat(" ").concat(this.lastName);
        }// write your code here
    }
}