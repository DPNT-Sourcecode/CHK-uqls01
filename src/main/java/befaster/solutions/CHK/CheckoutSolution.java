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

    public Integer checkout(String skus) {
        if(isvalid(skus) == false)
            return 

    }
}



