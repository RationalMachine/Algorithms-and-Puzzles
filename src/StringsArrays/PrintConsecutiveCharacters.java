package StringsArrays;

public class PrintConsecutiveCharacters {

    public static void main(String[] args) {
        findAndPrintConsecutiveCharacters("aaabbddaabbcc");
    }

    private static void findAndPrintConsecutiveCharacters(String sToPrint){

        for(int i = 0; i < sToPrint.length(); i ++){
            char c = sToPrint.charAt(i);
            int occurences = 1;

            if(i <= sToPrint.length() - 2) { //limit the nested for so we dont go out of bounds

                for (int i2 = i + 1; i2 < sToPrint.length(); i2 ++){
                    char c2 = sToPrint.charAt(i2);

                    if(c2 == c)
                        occurences += 1;
                    else{
                        i += occurences - 1; //shift i by the amount of occurences, this will prevent counting consecutive chars multiple times
                        break;
                    }
                }

            }
            else
                break; //we are on our last char

            System.out.println(String.valueOf(occurences) + String.valueOf(c));
        }

    }

}