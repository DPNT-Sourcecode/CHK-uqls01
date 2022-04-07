package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public boolean isvalid(String str){
        if (str == null)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != 'A' && str.charAt(i) != 'B' && str.charAt(i) != 'C' && str.charAt(i) != 'D')
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

        while(totalA >= 3){
            totalprice +=130;
            totalA-=3;
        }
        totalprice += totalA*50;

        Integer totalB = totalchar(skus,'B');

        while(totalB >= 2){
            totalprice +=45;
            totalB-=2;
        }
        totalprice +=  totalB*30;

        Integer totalC = totalchar(skus,'C');
        totalprice += totalC*20;

        Integer totalD = totalchar(skus,'D');
        totalprice += totalD*15;

        return totalprice;
    }
}
