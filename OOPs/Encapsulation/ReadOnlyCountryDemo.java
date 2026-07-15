package OOPs.Encapsulation;
// class Student{
//     private final String collage="AKTU";

//     public String getcollage(){
//         return collage;
//     }
// }

class Country {

    private final String country = "India";

    public String getCountry() {
        return country;
    }
}

public class ReadOnlyCountryDemo {

    public static void main(String[] args) {

        Country country = new Country();

        System.out.println("Country Name : " + country.getCountry());
    }
}