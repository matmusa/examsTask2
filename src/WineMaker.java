import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class WineMaker implements WorkMethods {

    private String wineBrandName;
    private int workExperience;
    private String adressOfWork;
    private Wine[]wines;

    public WineMaker(String wineBrandName, int workExperience, String adressOfWork, Wine[] wines) {
        this.wineBrandName = wineBrandName;
        this.workExperience = workExperience;
        this.adressOfWork = adressOfWork;
        this.wines = wines;
    }

    public String getWineBrandName() {
        return wineBrandName;
    }

    public void setWineBrandName(String wineBrandName) {
        this.wineBrandName = wineBrandName;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getAdressOfWork() {
        return adressOfWork;
    }

    public void setAdressOfWork(String adressOfWork) {
        this.adressOfWork = adressOfWork;
    }

    public Wine[] getWines() {
        return wines;
    }

    public void setWines(Wine[] wines) {
        this.wines = wines;
    }

    @Override
    public String toString() {
        return "WineMaker{" +
                "wineBrandName='" + wineBrandName + '\'' +
                ", workExperience=" + workExperience +
                ", adressOfWork='" + adressOfWork + '\'' +
                ", wines=" + Arrays.toString(wines) +
                '}';
    }

    @Override
    public Wine addWine(Wine[] wines) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Write a wines brand name :");
        String name=scanner.nextLine();
        Scanner scanner1=new Scanner(System.in);
        System.out.println(" Write a wines brand  :");
        String Brand =scanner1.nextLine();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("write a wines country  :");
        String Counrty  =scanner2.nextLine();
        Scanner scanner3=new Scanner(System.in);
        Scanner scanner4=new Scanner(System.in);
        Scanner scanner5=new Scanner(System.in);
        System.out.println("write a date of wine year,mouth,day :");
       LocalDate localDate =LocalDate.of(scanner3.nextInt(),scanner4.nextInt(),scanner5.nextInt());
        Wine wine=new Wine(name,Brand,Counrty,localDate);
        return wine;
    }
}
