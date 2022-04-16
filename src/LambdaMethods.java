public class LambdaMethods 
{

    public static int makeInt( IntIntPairs p )
    {
        // hier ergaenzen
        int sum = p.accumulate((int x, int y) -> {return  y;});
        return sum;
    }
    
    public static IntIntPairs  makePairs( IntIntPairs p )
    {
        // hier ergaenzen
        IntIntPairs pairs = p.extract((int x, int y) -> { return y < 0;});
        return pairs;
    }
        
    public static void apply( IntIntPairs p )
    {
        // hier ergaenzen
        p.manipulate((int x, int y) -> {return x / 3;}, (int x, int y) -> {return y / 3;} );

    }

 
}
