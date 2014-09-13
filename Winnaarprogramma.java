import java.util.ArrayList;
import verkiezingen.Kandidaat;
import verkiezingen.Partij;
import verkiezingen.Stemmachine;

public class Winnaarprogramma {
  public static void main(String[] args) {
  
    //INIT
    Stemmachine stemmachine = new Stemmachine();
    stemmachine.zetAan();
    ArrayList<Partij> partijlijst = stemmachine.getPartijen();
    Partij partij = partijlijst.get(0);
    ArrayList<Kandidaat> kandidatenlijst = partij.getKandidaten();
    Kandidaat meesteStemmen = kandidatenlijst.get(0);//initial winner as reference
    String partijVanMeesteStemmen = "";
  
    //Start application
    if(partijlijst.size() !=0 && kandidatenlijst.size() !=0){
      
      stemmachine.stemNKeer(100, 20); //vote
      
      for(Partij p : partijlijst){
        kandidatenlijst = p.getKandidaten();
        for(Kandidaat k : kandidatenlijst){
          if(meesteStemmen.getAantalStemmen()<k.getAantalStemmen()){
            meesteStemmen=k;
            if(p.zoek(meesteStemmen.getNaam())!=null){
              partijVanMeesteStemmen = p.getNaam();
            }
          }
        }
      }
      System.out.println("De meeste stemmen kreeg " + meesteStemmen.getNaam() + " (" + partijVanMeesteStemmen + ") : " + meesteStemmen.getAantalStemmen());
    }
    else{
      System.out.println("de stemmachine staat niet aan");
    }
  } 
}
