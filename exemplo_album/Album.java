package exemplo_album;
public class Album {
    public String name;
    public String artist;
    public double price;
    public int numberOfCopies;
    public void sellCopies(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println("Um album foi vendido!");
        }
        else{
            System.out.println("Não há albuns disponíveis!");
        }
    }
    public void orderCopies(int num){
        numberOfCopies += num;
    }
}
