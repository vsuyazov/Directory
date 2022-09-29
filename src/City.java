
public class City {
    public String name;
    public String region;
    public String district;
    public int population;
    public String foundation;

    public City() {

    }

    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public City setRegion(String region) {
        this.region = region;
        return this;
    }

    public City setDistrict(String district) {
        this.district = district;
        return this;
    }

    public City setPopulation(int population) {
        this.population = population;
        return this;
    }

    public City setFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }

    public City build() {
        return new City(name, region, district, population, foundation);
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', region='" + region + "', district='" + district + "', population='" + population + "', foundation='" + foundation + "'}";
    }
}
