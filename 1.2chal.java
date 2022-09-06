class Challenge{
    public static void main(String[] args){
      int i = 0;
      int y = 0;
      while(i <= 20){
        if(i == 4 || i == 6 || i == 8){
          System.out.println("goteem!!");
        }
        
        if(i > 3 && i < 12){
          y = y + 5;
          System.out.println(y);
        }
        // System.out.println(i);
        i++;

      }    
    }
}
//to compile - javac filename
//to run - java mainclassname

