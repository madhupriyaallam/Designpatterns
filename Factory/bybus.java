package DesignPatterns.Factory;

public class bybus implements anytravel
{
    String name;
    String origin;
    String destination;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getOrigin(){
        return origin;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public String getDestination(){
        return destination;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void travelMode(String mode){
        System.out.println(name+" is travelling from "+origin+" to "+destination+" by "+mode);
    }
}
