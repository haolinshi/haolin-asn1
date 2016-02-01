package com.example.haolin;
import java.util.Date;
/**
 * Created by haolin on 2/1/16.
 */
public class logdata {
    private Date date;
    private String Station;
    private Float Odometer;
    private String FGrade;
    private Float FAmount;
    private Float FUnitCost;
    private Float Fcost;


    public logdata(Date date, String Station,Float Odometer, String FGrade, Float FAmount,Float FUnitcost, Float Fcost){
        this.date=date;
        this.Station=Station;
        this.Odometer=Odometer;
        this.FGrade=FGrade;
        this.FAmount=FAmount;
        this.FUnitCost=FUnitcost;
        this.Fcost=Fcost;
    }
    public void setOdo(Float Odometer) throws NonNumberException{
        if(Odometer instanceof String){
            throw new NonNumberException();
        }
        this.Odometer=Odometer;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public float getCost(){
        return Fcost;
    }
}


