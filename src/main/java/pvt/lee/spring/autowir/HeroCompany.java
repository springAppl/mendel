package pvt.lee.spring.autowir;

public class HeroCompany {

    private Marvel marvel;

    private DC dc;

    public HeroCompany(Marvel marvel, DC dc) {
        this.marvel = marvel;
        this.dc = dc;
    }


    public Marvel getMarvel() {
        return marvel;
    }

    public void setMarvel(Marvel marvel) {
        this.marvel = marvel;
    }

    public DC getDc() {
        return dc;
    }

    public void setDc(DC dc) {
        this.dc = dc;
    }
}
