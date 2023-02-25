import java.time.LocalDate;
import java.time.Period;

public  class Wine {


    private String wineName;
    private String wineBrand;
    private String wineCountry;
    private LocalDate wineMadeOfyear;

    public Wine(String wineName, String wineBrand, String wineCountry, LocalDate wineMadeOfyear) {
        this.wineName = wineName;
        this.wineBrand = wineBrand;
        this.wineCountry = wineCountry;
        this.wineMadeOfyear = wineMadeOfyear;
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public String getWineBrand() {
        return wineBrand;
    }

    public void setWineBrand(String wineBrand) {
        this.wineBrand = wineBrand;
    }

    public String getWineCountry() {
        return wineCountry;
    }

    public void setWineCountry(String wineCountry) {
        this.wineCountry = wineCountry;
    }

    public LocalDate getWineMadeOfyear() {
        return wineMadeOfyear;
    }

    public void setWineMadeOfyear(LocalDate wineMadeOfyear) {
        this.wineMadeOfyear = wineMadeOfyear;
    }




    @Override
    public String toString() {
        Period ped = Period.between(getWineMadeOfyear(), LocalDate.now());
        return "Wine" +
                "\nwineName :" + wineName + '\'' +
                "\nwineBrand  :" + wineBrand + '\'' +
                "\nwineCountry  :" + wineCountry + '\'' +
                "\nwineMadeOfyear=" +ped.getYears() +
                '}';
    }


    }
