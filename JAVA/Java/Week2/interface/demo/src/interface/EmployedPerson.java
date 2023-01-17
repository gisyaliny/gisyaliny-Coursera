package interface;

public class EmployedPerson extends Person implements TaxPayer {

    String jobAddress;
    String ssn;

    public EmployedPerson(String fname, String ssn){
        this.fname = fname;
        this.ssn = ssn;
    }

    public EmployedPerson(String height, String weight, String fname, String lname){
        this.height = height;
        this.weight = weight;
        this.fname = fname;
        this.lname = lname;
    }

    public String getJobAddress(){
        return jobAddress;
    }
    public String getSsn(){
        return ssn;
    }

    @Override
    public double payTaxes(){
        // calculate taxes
        return 10.5;
    }

    @Override
    public String getTaxId(){
        return ssn;
    }


    
}
