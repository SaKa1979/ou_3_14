import java.util.ArrayList;
import verkiezingen.Stemmachine;
import verkiezingen.Partij;
import verkiezingen.Kandidaat;

public class Herhalingsprogramma {
  public static void main(String[] args) {
    
 //ik heb een stemmachine nodig dus maak stemmachine
    Stemmachine stemmachine = new Stemmachine();//declaratie en creatie dmv constructor
    stemmachine.zetAan(); //de partijen en kandaten worden aangemaakt
 //ik heb een partijlijst nodig dus maak partijlijst
    ArrayList<Partij> partijlijst = stemmachine.getPartijen(); //creeer en vul de partijlijst
 //ik heb een partij nodig om te printen dus maak partij, meteen in de for statement
    for(Partij partij : partijlijst){//partij=partijlijst[index++]
      System.out.println("");
      System.out.println(partij.getNaam());
 //ik heb een kandidatenlijst nodig dus maak kandidatenlijst   
      ArrayList<Kandidaat> kandidatenlijst = partij.getKandidaten();//creeer en vul de kandidatenlijst
 //ik heb een kandidaat nodig om te printen dus maak partij, meteen in de for statement
      int i=1;
      for(Kandidaat kandidaat : kandidatenlijst){//kandidaat=kandidaatlijst[index++]
        System.out.println(i++ + ". " + kandidaat.getNaam() + " uit " + kandidaat.getWoonplaats());
      }
    }
      
  }//end main
}//end class

