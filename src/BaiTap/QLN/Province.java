package BaiTap.QLN;

public class Province {
    private int id;
    private String name;
    private int population;
    private int gdp;

    public Province() {
    }

    public Province(int id, String name, int population, int gdp) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.gdp = gdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "Province: " +
                "" + id +
                ", " + name +
                ", " + population +
                "," + gdp +
                ';';
    }
}
