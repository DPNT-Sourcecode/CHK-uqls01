package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public boolean isvalid(String str){
        if (str == null)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) < 'A' || str.charAt(i) > 'Z' )
                return false;
        }
        return true;
    }

    public Integer totalchar(String str, char c){
        Integer counter = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c )
                counter++;
        }
        return counter;
    }

    public Integer checkout(String skus) {
        if(!isvalid(skus))
            return -1;
        Integer totalprice = 0;

        Integer totalA = totalchar(skus,'A');
        Integer totalB = totalchar(skus,'B');
        Integer totalC = totalchar(skus,'C');
        Integer totalD = totalchar(skus,'D');
        Integer totalE = totalchar(skus,'E');
        Integer totalF = totalchar(skus,'F');
        Integer totalG = totalchar(skus,'G');
        Integer totalH = totalchar(skus,'H');
        Integer totalI = totalchar(skus,'I');
        Integer totalJ = totalchar(skus,'J');
        Integer totalK = totalchar(skus,'K');
        Integer totalL = totalchar(skus,'L');
        Integer totalM = totalchar(skus,'M');
        Integer totalN = totalchar(skus,'N');
        Integer totalO = totalchar(skus,'O');
        Integer totalP = totalchar(skus,'P');
        Integer totalQ = totalchar(skus,'Q');
        Integer totalR = totalchar(skus,'R');
        Integer totalS = totalchar(skus,'S');
        Integer totalT = totalchar(skus,'T');
        Integer totalU = totalchar(skus,'U');
        Integer totalV = totalchar(skus,'V');
        Integer totalW = totalchar(skus,'W');
        Integer totalX = totalchar(skus,'X');
        Integer totalY = totalchar(skus,'Y');
        Integer totalZ = totalchar(skus,'Z');



        while(totalE >= 2){
            totalprice += 2*40;
            totalE -= 2;
            if(totalB > 0)
                totalB--;
        }
        totalprice += totalE*40;

        while(totalA >= 5){
            totalprice +=200;
            totalA-=5;
        }

        while(totalA >= 3){
            totalprice +=130;
            totalA-=3;
        }
        totalprice += totalA*50;


        while(totalB >= 2){
            totalprice +=45;
            totalB-=2;
        }
        totalprice +=  totalB*30;

        while(totalF >= 3){
            totalprice +=20;
            totalF-=3;
        }
        totalprice+=totalF*10;

        totalprice += totalC*20;

        totalprice += totalD*15;

        totalprice += totalG*20;

        while(totalH >= 10){
            totalprice += 80;
            totalH-=10;
        }

        while(totalH >= 5){
            totalprice +=45;
            totalH-=5;
        }
        totalprice += totalH*10;

        totalprice += totalI*35;

        totalprice += totalJ*60;

        while(totalK >= 2){
            totalprice +=150;
            totalK-=2;
        }
        totalprice += totalK*80;

        totalprice += totalL*90;

        while(totalN >= 3){
            totalprice += 120;
            if(totalM > 0)
                totalM--;
            totalN-=3;
        }

        totalprice += totalM*15;

        




        return totalprice;
    }
}



