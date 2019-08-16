
package normalgame;

import java.util.ArrayList;


public class NormalGame {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;
    
    private void setUpGame(){
        //Создадим несколько сайтов и дадим им адреса
        DotCom one = new DotCom();
        one.setName("Facebook.com ");
        DotCom two = new DotCom();
        two.setName("Vkontact.com ");
        DotCom three = new DotCom();
        three.setName("Instagramm.com ");
        
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        
        System.out.println("Ваша цель - потопить три сайта: ");
        System.out.println(one.getName()+ two.getName()+ three.getName());
        System.out.println("Попытайтесь потопить их за наименьшее количество ходов. ");
        
        for(DotCom dotComSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComSet.setLocationCells(newLocation);
        }
    }
    
    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Введите ваше число: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Мимо!!";
        
        for(DotCom dotComtoTest : dotComList){
            result = dotComtoTest.checkYouself(userGuess);
            if(result.equals("Попал")){
                break;
            }
            if(result.equals("Потопил")){
                dotComList.remove(dotComtoTest);
                break;
            }
        }
        System.out.println(result);
    }
    
    private void finishGame(){
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят. ");
        if(numOfGuesses<18){
            System.out.println("Это заняло у вас всего "+numOfGuesses+" попыток.");
            System.out.println("Вы успели выбраться до того как всё затануло!!");
        }else{
            System.out.println("Это заняло у вас много времени и "+numOfGuesses+" попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений!!");
        }
    }
    public static void main(String[] args) {
        NormalGame game = new NormalGame();
        game.setUpGame();
        game.startPlaying();
    }
    
}
