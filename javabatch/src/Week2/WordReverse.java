package Week2;

public class WordReverse {

    public void wore(String inputString) {
        String[] wo = inputString.split(" ");
        String revstring = "";
        for (int i = 0; i < wo.length; i++) {
            String singleword=wo[i];
            String revwords="";
        for (int j=singleword.length()-1;j>=0;j--) {
            revwords = revwords + singleword.charAt(j);
        }
            revstring = revstring + revwords +" ";
        }
        System.out.println(" ");
        System.out.println("original string: "+inputString);
        System.out.println("reverse string: "+revstring);
        }
    }
