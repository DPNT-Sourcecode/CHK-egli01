package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int nr1,nr2,nr3,nr4,i,suma,nrverif ;
        nrverif=0;
        for(i=0;i<skus.length();i++) {
            if(skus.charAt(i)=='A'){
                nrverif++;
            } if(skus.charAt(i)=='B'){
                nrverif++;
            } if(skus.charAt(i)=='C'){
                nrverif++;
            }if(skus.charAt(i)=='D'){
                nrverif++;
            }
        }
        if(nrverif<skus.length()){
            return -1;
        }
        suma=0;
        nr1=0;
        nr2=0;
        nr3=0;
        nr4=0;
        for(i=0;i<skus.length();i++) {
            if(skus.charAt(i)=='A'){
                nr1++;
            }else if(skus.charAt(i)=='B'){
                nr2++;
            }else if(skus.charAt(i)=='C'){
                nr3++;
            }else if(skus.charAt(i)=='D'){
                nr4++;
            }
        }
        suma=(nr1/3)*130+(nr1-3*(nr1/3))*50+(nr2/2)*45+(nr2-2*(nr2/2))*30+nr3*20+nr4*15;
        return suma;
    }
}
