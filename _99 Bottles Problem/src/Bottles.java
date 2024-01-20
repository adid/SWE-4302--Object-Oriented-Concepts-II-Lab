public class Bottles
{
    public String song ()
    {
    return verses (99 , 0) ;
    }

    public String verses ( int upperBound , int lowerBound ) {
        String lyrics = "";
        for (int i = upperBound ; i >= lowerBound ; i--) {
            lyrics += verse ( i ) ;
        }
        return lyrics ;
    }

    public String verse ( int lineNumber ) {
        String lyrics = "";
        switch ( lineNumber ) {
            case 0:
                lyrics += "No more bottles of beer on the wall , no more  bottles of beer .\n" +
                        "Go to the store and buy some more , 99 bottles beer on the wall .\n";
                break ;
            case 1:
                lyrics += "1 bottle of beer on the wall , 1 bottle of beer .\n" +
                        " Take it down and pass it around , no more bottles of beer on the wall .\n";
                break ;
            case 2:
                lyrics += "2 bottles of beer on the wall , 2 bottles of beer .\n" +
                        " Take one down and pass it around , 1 bottle of beer on the wall .\n";
                break ;
            case 89:
                lyrics += "89 bottles of beer on the wall , 89 bottles of beer .\n" +
                        " Take one down and pass it around , 88 bottles of beer on the wall .\n";
                break ;
            case 98:
                lyrics += "98 bottles of beer on the wall , 98 bottles of beer .\n" +
                        " Take one down and pass it around , 97 bottles of beer on the wall .\n";
                break ;
            case 99:
                lyrics += "99 bottles of beer on the wall , 99 bottles of beer .\n" +
                        " Take one down and pass it around , 98 bottles of beer on the wall .\n";
                break ;
        }
        return lyrics ;
    }
}