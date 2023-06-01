public class Race {

    public String year;
    public String circuit;
    public String driver;
    public String team;

    /** The Race class includes 4 separate attributes. That's how we will store the data taken from the csv file **/


    public Race(String year,String circuit,String driver,String team){
        this.year=year;
        this.circuit=circuit;
        this.driver=driver;
        this.team=team;
    }

    public String getYear(){
        return year;
    }

    public String getCircuit(){
        return circuit;
    }

    public String getDriver(){
        return driver;
    }

    public String getTeam(){
        return team;
    }




}
