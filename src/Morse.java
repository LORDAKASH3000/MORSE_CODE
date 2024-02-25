package Language;
public class Morse {
    StringBuffer mmsg=new StringBuffer();
    String msg=new String();
    public Morse(){msg="Hi There!";}
    public Morse(String msg){this.msg=msg;}
    public Morse(String msg,boolean flag){
        this(msg);
        if(flag){
            mmsg.delete(0,mmsg.length());
            for(int i=0;i<msg.length();i++){
                if(msg.charAt(i)==' ')
                    mmsg.append(" ");
                else mmsg.append(translate(msg.charAt(i))).append(" ");
            }
        }
        else{
            mmsg.delete(0,mmsg.length());
            for(int i=0;i<msg.length();i++){
                if(msg.charAt(i)==' '&&msg.charAt(i-1)==' '){
                    mmsg.append(" ");
                }
                else{
                    mmsg.append(translate(msg.substring(i,getGindex(i))));
                    i=getGindex(i);
                }
            }
        }
    }
    public void toMorse(){
        mmsg.delete(0,mmsg.length());
        for(int i=0;i<msg.length();i++){
            if(msg.charAt(i)==' ')
                mmsg.append(" ");
            else mmsg.append(translate(msg.charAt(i))).append(" ");
        }
    }
    public void fromMorse(){
        mmsg.delete(0,mmsg.length());
        for(int i=0;i<msg.length();i++){
            if(msg.charAt(i)==' '&&msg.charAt(i-1)==' '){
                mmsg.append(" ");
            }
            else{
                mmsg.append(translate(msg.substring(i,getGindex(i))));
                i=getGindex(i);
            }
        }
    }
    public void setMsg(String msg){
        this.msg=msg.toUpperCase();
    }
    public void getMsg(){
        this.toString();
    }
    public int getGindex(int i){
        int j=i;
        for(j=i;j<msg.length();j++){
            if(msg.charAt(j)==' ')
                return j;
        }
        return msg.length();
    }
    //char to morse
    String translate(char s){
        return switch(s){
            //Character A - Z
            case 'A'->".-";
            case 'B'->"-...";
            case 'C'->"-.-.";
            case 'D'->"-..";
            case 'E'->".";
            case 'F'->"..-.";
            case 'G'->"--.";
            case 'H'->"....";
            case 'I'->"..";
            case 'J'->".---";
            case 'K'->"-.-";
            case 'L'->".-..";
            case 'M'->"--";
            case 'N'->"-.";
            case 'O'->"---";
            case 'P'->".--.";
            case 'Q'->"--.-";
            case 'R'->".-.";
            case 'S'->"...";
            case 'T'->"-";
            case 'U'->"..-";
            case 'V'->"...-";
            case 'W'->".--";
            case 'X'->"--..-";
            case 'Y'->"-.--";
            case 'Z'->"--..";
            //Numbers 0-9
            case '0'->"----";
            case '1'->".----";
            case '2'->"..---";
            case '3'->"...--";
            case '4'->"....-";
            case '5'->".....";
            case '6'->"-....";
            case '7'->"--...";
            case '8'->"---..";
            case '9'->"----.";
            //special character ? - =
            case '?'->"..--..";
            case '!'->"-.-.--";
            case '.'->".-.-.-";
            case ','->"--..--";
            case ';'->"-.-.-.";
            case ':'->"---...";
            case '+'->".-.-.";
            case '-'->"-....-";
            case '/'->"-..-.";
            case '='->"-...-";
            case '@'->"...-.-";
            case '('->"-.--.";
            case ')'->"-.--.-";
            //default case
            default ->"$";
        };
    }
    String translate(String s){
        return switch(s){
            //Character A - Z
            case ".-"->"A";
            case "-..."->"B";
            case "-.-."->"C";
            case "-.."->"D";
            case "."->"E";
            case "..-."->"F";
            case "--."->"G";
            case "...."->"H";
            case ".."->"I";
            case ".---"->"J";
            case "-.-"->"K";
            case ".-.."->"L";
            case "--"->"M";
            case "-."->"N";
            case "---"->"O";
            case ".--."->"P";
            case "--.-"->"Q";
            case ".-."->"R";
            case "..."->"S";
            case "-"->"T";
            case "..-"->"U";
            case "...-"->"V";
            case ".--"->"W";
            case "--..-"->"X";
            case "-.--"->"Y";
            case "--.."->"Z";
            //Numbers 0-9
            case "----"->"0";
            case ".----"->"1";
            case "..---"->"2";
            case "...--"->"3";
            case "....-"->"4";
            case "....."->"5";
            case "-...."->"6";
            case "--..."->"7";
            case "---.."->"8";
            case "----."->"9";
            //special character ? - =
            case "..--.."->"?";
            case "-.-.--"->"!";
            case ".-.-.-"->".";
            case "--..--"->",";
            case "-.-.-."->";";
            case "---..."->":";
            case ".-.-."->"+";
            case "-....-"->"-";
            case "-..-."->"/";
            case "-...-"->"=";
            case "...-.-"->"@";
            case "-.--."->"(";
            case "-.--.-"->")";
            //default case
            default ->"$";
        };
    }
    public String toString(){
        return new String(mmsg).toString();
    }
}
