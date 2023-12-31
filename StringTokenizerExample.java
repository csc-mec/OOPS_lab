import java.util.StringTokenizer;   

public class StringTokenizerExample {

    /*
     * String Tokenizer can be used in three ways
     * 
     * 1.Just passing the string
     *      When just string is passed string tokenizer
     *      detects the delimiter and starts tokenizing
     * 2.Passing string and delimiter
     *      when string and delimiter is passed the string 
     *      gets seperated on specified delimiter
     * 3.Passing string,delimiter and returnValue
     *      if return value is true delimiter charecters are
     *      also considerd as tokens
     */


    public static void main(String[] args) {

        //Using the first method delimiter is automatically detected as whitespace
        StringTokenizer st1 = new StringTokenizer("Hello World");

        //hasMoreTokens() returns true if there are more tokens available
        //nextToken() returns the next token
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

        System.out.println();

        //Using the second method delimiter is specified as comma
        StringTokenizer st2 = new StringTokenizer("one,two,three" , ",");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        System.out.println();

        //Using the third method delimiter is specified as comma and since returnValue is true it
        //prints the comma too
        StringTokenizer st3 = new StringTokenizer("one,two,three" , "," , true);
        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }

        System.out.println();
    }
}
