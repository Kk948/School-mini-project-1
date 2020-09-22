class Main {
  public static void main(String[] args) {
    int myAge = 15;
    int myBirthday = 222;
    int todaysDate = 921;

    if (myBirthday == todaysDate)
    {
      System.out.println("Happy Birthday!");
      System.out.println("I am "+ myAge +" years old!");

    }else{
      System.out.println("Happy Unbirthday!");
      System.out.println("I am still "+ myAge + " years old");
    }
  }
}