package com.company;

public class Men {

    double years;
    double height;
    double education;




    public Men(double years, double height, double education) {
        this.years = years;
        this.height = height;
        this.education = education;

    }
        public Men(){

            this.years=30;
            this.height=185;
            this.education=5;
        }
       void goToCinema (String cinema) {
        System.out.println("Go to cinema" + cinema);

       }

    void goToRest(String rest){
        if (rest.equals("Mac"))

            System.out.println("No");
        else System.out.println("Yes");
    }
    protected void finalize(){
    System.out.println("by by");
    }


    @Override
    public String toString() {
        return "Men{" +
                "years=" + years +
                ", height=" + height +
                ", education=" + education +
                '}';
    }
}
