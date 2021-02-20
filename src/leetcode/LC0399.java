package leetcode;

import java.util.HashMap;
import java.util.List;

public class LC0399 {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int size = queries.size();
        double[] ret = new double[size];
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String zi=equation.get(0);
            String mu=equation.get(1);
            double ziChuMu=values[i];
            HashMap<String, Double> subMap = map.get(i);
            if(subMap==null){
                subMap=new HashMap<>();
                map.put(zi,subMap);
            }
            subMap.put(mu,ziChuMu);
        }
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String zi=query.get(0);
            String mu=query.get(1);

            values[i]=1;

        }
        return ret;
    }

}
