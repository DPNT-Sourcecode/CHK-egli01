package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int nr1,nr2,nr3,nr4,i,suma,nrverif,nr5,nr6,nr7,nr8,nr9,nr10,nr11,nr12,nr13,nr14,nr15,nr16,nr17,nr18,nr19,nr20,nr21,nr22,nr23,nr24,reducere,promo ;
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
            }if(skus.charAt(i)=='E'){
                nrverif++;
            }if(skus.charAt(i)=='F'){
                nrverif++;
            }if(skus.charAt(i)=='G'){
                nrverif++;
            }
            if(skus.charAt(i)=='H'){
                nrverif++;
            }
            if(skus.charAt(i)=='I'){
                nrverif++;
            }
            if(skus.charAt(i)=='J'){
                nrverif++;
            }
            if(skus.charAt(i)=='K'){
                nrverif++;
            }
            if(skus.charAt(i)=='L'){
                nrverif++;
            }
            if(skus.charAt(i)=='M'){
                nrverif++;
            }
            if(skus.charAt(i)=='N'){
                nrverif++;
            }
            if(skus.charAt(i)=='O'){
                nrverif++;
            }
            if(skus.charAt(i)=='P'){
                nrverif++;
            }
            if(skus.charAt(i)=='Q'){
                nrverif++;
            }
            if(skus.charAt(i)=='R'){
                nrverif++;
            }
            if(skus.charAt(i)=='S'){
                nrverif++;
            }
            if(skus.charAt(i)=='T'){
                nrverif++;
            }
            if(skus.charAt(i)=='U'){
                nrverif++;
            }
            if(skus.charAt(i)=='V'){
                nrverif++;
            }
            if(skus.charAt(i)=='W'){
                nrverif++;
            }
            if(skus.charAt(i)=='X'){
                nrverif++;
            }
            if(skus.charAt(i)=='Y'){
                nrverif++;
            }
            if(skus.charAt(i)=='Z'){
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
        nr5=0;
        nr6=0;
        nr7=0;
        nr8=0;
        nr9=0;
        nr10=0;
        nr11=0;
        nr12=0;
        nr13=0;
        nr14=0;
        nr15=0;
        nr16=0;
        nr17=0;
        nr18=0;
        nr19=0;
        nr20=0;
        nr21=0;
        nr22=0;
        nr23=0;
        nr24=0;
        for(i=0;i<skus.length();i++) {
            if(skus.charAt(i)=='A'){
                nr1++;
            }else if(skus.charAt(i)=='B'){
                nr2++;
            }else if(skus.charAt(i)=='C'){
                nr3++;
            }else if(skus.charAt(i)=='D'){
                nr4++;
            }else if(skus.charAt(i)=='E'){
                nr5++;
            }else if(skus.charAt(i)=='F'){
                nr6++;
            }else if(skus.charAt(i)=='G'){
                nr6++;
            }
            else if(skus.charAt(i)=='H'){
                nr7++;
            }
            else if(skus.charAt(i)=='I'){
                nr8++;
            }
            else if(skus.charAt(i)=='J'){
                nr9++;
            }
            else if(skus.charAt(i)=='K'){
                nr10++;
            }
            else if(skus.charAt(i)=='L'){
                nr11++;
            }
            else if(skus.charAt(i)=='M'){
                nr12++;
            }
            else if(skus.charAt(i)=='N'){
                nr13++;
            }
            else if(skus.charAt(i)=='O'){
                nr14++;
            }
            else if(skus.charAt(i)=='P'){
                nr15++;
            }
            else if(skus.charAt(i)=='R'){
                nr16++;
            }
            else if(skus.charAt(i)=='S'){
                nr17++;
            }
            else if(skus.charAt(i)=='T'){
                nr18++;
            }
            else if(skus.charAt(i)=='U'){
                nr19++;
            }
            else if(skus.charAt(i)=='V'){
                nr20++;
            }
            else if(skus.charAt(i)=='W'){
                nr21++;
            }
            else if(skus.charAt(i)=='X'){
                nr22++;
            }
            else if(skus.charAt(i)=='Y'){
                nr23++;
            }
            else if(skus.charAt(i)=='Z'){
                nr24++;
            }
        }
        reducere=nr5/2;
        if(reducere<=nr2){
            nr2=nr2-reducere;
        }else{
            nr2=0;
        }
        promo=0;
        if(nr1>=5) {
            promo = nr1 / 5;
            nr1 = nr1 - promo * 5;
        }
        nr6=nr6-nr6/3;

        promo_h=0;
        if(nr8>=10){
            promo_h=nr8/10;
            nr8=nr8-promo_h*10;
        }

        suma=(nr1/3)*130+(nr1-3*(nr1/3))*50+(nr2/2)*45+(nr2-2*(nr2/2))*30+nr3*20+nr4*15+nr5*40+promo*200+nr6*10+nr7*20+promo_h*80+(nr8/5)*45+(nr8-5*(nr8/5))*10+nr9*35+nr10*60+(nr11/2)*150+(nr11-2*(nr11/2))*80+nr12*90+nr13*15+;
        return suma;
    }
}



