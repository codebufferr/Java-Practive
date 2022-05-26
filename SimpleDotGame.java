package JavaPractice.JavaConcepts;


    public class SimpleDotGame {
        int[] locationCells;
        int numbOfHits=0;
    
        public void setLocationCells(int[] locs){
            locationCells=locs;
        }
    
        public String checkYourself(String stringGuess){
            int guess=Integer.parseInt(stringGuess);
            String result ="miss";

            for ( int cells: locationCells){
                if(guess==cells){

                    result="hit";
                    numbOfHits++;

                    break;
                }
            }
            if(numbOfHits==locationCells.length){
                result="kill";

            }
            System.out.println(result);
            return result;
    
        }
    
    }
    

