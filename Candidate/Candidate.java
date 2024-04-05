public class Candidate {
    private int average;
    private int knowsLanguage;
    private int paymentExpectation;
    private int yearExpirience;
    private int kindOfCandidate;
    public Candidate(int average,int knowsLanguage,int paymentExpectation,int yearExpirience){
        this.average=average;
        this.knowsLanguage=knowsLanguage;
        this.paymentExpectation=paymentExpectation;
        this.yearExpirience=yearExpirience;

    } public Candidate(){
        this.average=0;
        this.knowsLanguage=0;
        this.paymentExpectation=0;
        this.yearExpirience=0;

    }
    public int suitableApplicants(){
        if(knowsLanguage>=2&&average>=80){
            if(paymentExpectation<=16000){
                kindOfCandidate=1;
            }
        }else if(knowsLanguage==3&&yearExpirience>=3){
            if(paymentExpectation<=30000){
                kindOfCandidate=2;
            }
        }
        return kindOfCandidate;
    }
    public int getKindOfCandidate() {
        return kindOfCandidate;
    }

    public void setKindOfCandidate(int kindOfCandidate) {
        this.kindOfCandidate = kindOfCandidate;
    }

    public int getYearExpirience() {
        return yearExpirience;
    }

    public void setYearExpirience(int yearExpirience) {
        this.yearExpirience = yearExpirience;
    }

    public int getPaymentExpectation() {
        return paymentExpectation;
    }

    public void setPaymentExpectation(int paymentExpectation) {
        this.paymentExpectation = paymentExpectation;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getKnowsLanguage() {
        return knowsLanguage;
    }

    public void setKnowsLanguage(int knowsLanguage) {
        this.knowsLanguage = knowsLanguage;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "average=" + average +
                ", knowsLanguage=" + knowsLanguage +
                ", paymentExpectation=" + paymentExpectation +
                ", yearExpirience=" + yearExpirience +
                ", kindOfCandidate=" + kindOfCandidate +
                '}';
    }
}
