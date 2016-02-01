package com.example.haolin;
import java.util.ArrayList;
/**
 * Created by haolin on 2/1/16.
 */
public class DataList {
    private ArrayList<logdata> logs= new ArrayList<logdata>();

    public void add(logdata log){logs.add(log);}

    public boolean hasLog(logdata log){return logs.contains(log);}

    public void delete(logdata log){logs.remove(log);}

    public logdata getData(int i){return logs.get(i);}
}
