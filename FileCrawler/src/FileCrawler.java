import java.io.IOException ;
import java.nio.file.Files ;
import java.nio.file.Path ;
import java.nio.file.Paths ;
import java.util.Collection;
import java.util.List ;
import java.util.Scanner ;
import java.util.stream.Collectors ;

public class FileCrawler {  
    

    public static void main ( String [ ] args ) throws IOException {
        
        Path path = Paths.get ( "word.txt").toAbsolutePath() ;
      
        List < String > titles = Files.lines ( path ) .collect ( Collectors.toList ()) ; 
        String search = getInput ( ) ; 
                         
        displayResults ( search , titles ) ;
    }

    

    public static String getInput ( ) {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.print ( "Search:" ) ;
        String titleName = sc.nextLine ( ) ;
        sc.close ( ) ; 
        return titleName;
    }

    public static void displayResults(String searchName, List<String> titles) throws IOException {
        boolean inFile = titles.stream().anyMatch(p-> p.equalsIgnoreCase(searchName)) ;
        if (inFile) {
        System.out.println(searchName + "Is the word");
    }   else {
        System.out.println( "\nNo" + searchName + "Is not the word");
}
}
} 
