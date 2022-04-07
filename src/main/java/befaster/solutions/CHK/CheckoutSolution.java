package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public boolean isvalid(String str){
        if (str == null)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != 'A' && str.charAt(i) != 'B' && str.charAt(i) != 'C' && str.charAt(i) != 'D'
                    && str.charAt(i) != 'E' && str.charAt(i) != 'F')
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

        return totalprice;
    }
}
