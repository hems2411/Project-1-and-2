package pig;

import java.io.IOException;
 import org.apache.pig.EvalFunc;
  import org.apache.pig.data.Tuple;

  public class Percentage extends EvalFunc<Integer>
  {
    public Integer exec(Tuple input) throws IOException {
        if (input.size() == 0)
            return 0;
        try{
           int perc  = (Integer)input.get(0);
           int value  = 100 + (Integer)input.get(1);
           int res = perc * (value/100);
           return res;
        }catch(Exception e){
            throw new IOException("Caught exception processing input row ", e);
        }
    }
  }
