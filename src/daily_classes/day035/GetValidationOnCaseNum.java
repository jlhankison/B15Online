package daily_classes.day035;


public class GetValidationOnCaseNum {

    public static void main(String[] args) {

        System.out.println(caseNumber("IPR2012-00001"));

        System.out.println(caseNumber(""));
    }

    public static int caseNumber (String str){

        // do validation on case number
        //TODO : Case number should always start with either
        // CBM , IPR, PGR , DER
        // FOLLOWED BY 4 DIGIT NUMBER
        // FOLLOWED BY -
        // AND FOLLOWED BY 5 DIGIT

        int numStart = 0;

        if(str.contains("CBM")){
            numStart = str.indexOf("CBM") + 3;
        }else if (str.contains("IPR")){
            numStart = str.indexOf("IPR") + 3;
        }else if (str.contains("PGR")){
            numStart = str.indexOf("PGR") + 3;
        }else if (str.contains("DER")){
            numStart = str.indexOf("DER") + 3;
        }else{
            return 0;
        }

        return Integer.parseInt(str.substring(numStart, numStart + 4));
    }
}
