package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
        String str = "Hello, ";
        str += friendName;
        str +="!";
        return str;
    }
}
