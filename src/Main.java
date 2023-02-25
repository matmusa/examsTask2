import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Wine wine = new Wine("Malbec", "red Wine ", "France", LocalDate.of(1999, 1, 21));
        Wine wine2 = new Wine("La Wine", "red Wine ", "Italy", LocalDate.of(1967, 1, 21));
        Wine wine3 = new Wine("El wine ", "red Wine ", "France", LocalDate.of(1989, 1, 21));
        Wine wine4 = new Wine("Malbec 3", "red Wine ", "France", LocalDate.of(1977, 1, 21));
        Wine wine5 = new Wine("Malbec 5", "red Wine ", "France", LocalDate.of(1966, 1, 21));

        Wine[] wines =  new Wine[5];
        WineMaker wineMaker=new WineMaker("Shato",12,"Italy ,Rome",wines);
         wines[0]=wine;
         wines[1]=wine2;
         wines[2]=wine3;
         wines[3]=wine4;
         wines[4]=wineMaker.addWine(wines);

        for (Wine w:wines
             ) {
            System.out.println(w);

        }


      /*  Ооп принциптерин колдонуп, Вино классын Сүрөттөңүз
        Класс кандай поля жана методдорду талап кылат:
        1. Вино түрү жөнүндө маалыматты сактоо: аталышы, бренди, өлкөсү, төгүлгөн датасы (класс убакыт классын тузуу) виного канча жыл болгонун  эсептөө
        Жана Винодел классын тузунуз, ал жөнүндө маалымат- ал кандай вино  кылат, эмгек стажы, жумуш дареги
        2. Консолдон жаңы вино кошуу методун тузунуз (интерфейс)
                3.Сиздин класстын натыйжалуулугун көрсөткөн жардамчы классты өзүнчө иштеп чыгыңыз.Main class
        Анда керектүү объектилерди түзүп, виноделге вино массивин дайындаңыз, массив ага ошол винолордун таандык экендигин билдирет
                        Кошуу методун колдонуп жаны вино кошуп, вино тизмесине (массивине)кошуңуз*/
    }
}