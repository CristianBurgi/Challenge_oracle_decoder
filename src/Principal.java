import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner lectura = new Scanner(System.in);
        Conversion c = new Conversion();
        int opcion = 0;
        int monto = 0;
        String base = "";
        String fin = "";

        System.out.println("Bienvenidos al Convertidor de Monedas.");
try {
    do {

        System.out.println(" ");
        System.out.println("**************************");

        String menu = """
                1-Convertir de USD (dolares) => a ARS (peso Argentino).
                2-Convertir de ARS (peso Argentino) => a USD (dolares).
                3-Convertir de USD (dolares) => a BOB (peso Boliviano).
                4-Convertir de BOB (peso Boliviano) => a USD (dolares).
                5-Convertir de USD (dolares) => a COP (peso Colombiano).
                6-Convertir de COP (peso colombiano) => a USD (dolares).
                7_Elija Las monedas que desee convertir.
                8-Salir
                                
                """;
        System.out.println(menu);
        System.out.println("Elija una opcion valida");
        opcion = lectura.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el monto a convertir");
                monto = lectura.nextInt();
                base = "USD";
                fin = "ARS";
                System.out.println(monto + " " + base + c.convertir(base, fin, monto));
                System.out.println("Quiere seguir Convirtiendo? ");
                System.out.println("1-si");
                System.out.println("2-no");
                int seguir = lectura.nextInt();
                if (seguir == 1) {
                    break;
                } else {
                    opcion = 7;
                    break;
                }
            case 2:
                System.out.println("Ingrese el monto a convertir");
                monto = lectura.nextInt();
                base = "ARS";
                fin = "USD";
                System.out.println(monto + " " + base + c.convertir(base, fin, monto));
                break;
            case 3:
                System.out.println("Ingrese el monto a convertir");
                monto = lectura.nextInt();
                base = "USD";
                fin = "BOB";
                System.out.println(monto + " " + base + c.convertir(base, fin, monto));
                break;
            case 4:
                System.out.println("Ingrese el monto a convertir");
                monto = lectura.nextInt();
                base = "BOB";
                fin = "USD";
                System.out.println(monto + " " + base + c.convertir(base, fin, monto));
                break;
            case 5:
                System.out.println("Ingrese el monto a convertir");
                monto = lectura.nextInt();
                base = "USD";
                fin = "COP";
                System.out.println(monto + " " + base + c.convertir(base, fin, monto));
                break;
            case 6:
                System.out.println("Ingrese el monto a convertir");
                monto = lectura.nextInt();
                base = "COP";
                fin = "USD";
                System.out.println(monto + " " + base + c.convertir(base, fin, monto));
                break;
            case 7:
                String monedaBase = """
                                                    
                        A continuación, te presento una lista completa de códigos de moneda junto con los países correspondientes:
                                 
                        1. **AFN**: Afganistán
                        2. **ALL**: Albania
                        3. **DZD**: Argelia
                        4. **USD**: Samoa Americana
                        5. **EUR**: Andorra
                        6. **AOA**: Angola
                        7. **XCD**: Anguila
                        8. **XCD**: Antigua y Barbuda
                        9. **ARS**: Argentina
                        10. **AMD**: Armenia
                        11. **AWG**: Aruba
                        12. **AUD**: Australia
                        13. **EUR**: Austria
                        14. **AZN**: Azerbaiyán
                        15. **BSD**: Bahamas
                        16. **BHD**: Bahréin
                        17. **BDT**: Bangladés
                        18. **BBD**: Barbados
                        19. **BYN**: Bielorrusia
                        20. **EUR**: Bélgica
                        21. **BZD**: Belice
                        22. **XOF**: Benín
                        23. **BMD**: Bermudas
                        24. **BTN**: Bután
                        25. **BOB**: Bolivia
                        26. **BOV**: Bolivia (Mvdol)
                        27. **BAM**: Bosnia y Herzegovina
                        28. **BWP**: Botsuana
                        29. **BRL**: Brasil
                        30. **USD**: Territorio Británico del Océano Índico
                        31. **BND**: Brunéi
                        32. **BGN**: Bulgaria
                        33. **XOF**: Burkina Faso
                        34. **BIF**: Burundi
                        35. **CVE**: Cabo Verde
                        36. **KHR**: Camboya
                        37. **XAF**: Camerún
                        38. **CAD**: Canadá
                        39. **KYD**: Islas Caimán
                        40. **XAF**: República Centroafricana
                        41. **XAF**: Chad
                        42. **CLF**: Chile (Unidad de Fomento)
                        43. **CLP**: Chile (Peso chileno)
                        44. **CNY**: China
                        45. **AUD**: Isla de Navidad
                        46. **AUD**: Islas Cocos (Keeling)
                        47. **COP**: Colombia
                        48. **COU**: Colombia (Unidad de Valor Real)
                        49. **KMF**: Comoras
                        50. **CDF**: República Democrática del Congo
                        51. **XAF**: Congo
                        52. **NZD**: Islas Cook
                        53. **CRC**: Costa Rica
                        54. **EUR**: Croacia
                        55. **CUC**: Cuba (Peso convertible)
                        56. **CUP**: Cuba (Peso cubano)
                        57. **ANG**: Curazao
                        58. **EUR**: Chipre
                        59. **CZK**: República Checa
                        60. **XOF**: Costa de Marfil
                        61. **DKK**: Dinamarca
                        62. **DJF**: Yibuti
                        63. **XCD**: Dominica
                        64. **DOP**: República Dominicana
                        65. **USD**: Ecuador
                        66. **EGP**: Egipto
                        67. **SVC**: El Salvador
                        68. **USD**: Guinea Ecuatorial
                        69. **ERN**: Eritrea
                        70. **EUR**: Estonia
                        71. **ETB**: Etiopía
                        72. **EUR**: Unión Europea
                        73. **FKP**: Islas Malvinas (Falkland)
                        74. **DKK**: Islas Feroe
                        75. **FJD**: Fiyi
                        76. **EUR**: Finlandia  
                         Elije el codigo de la moneda que quieras converir (las 3 letras ).                                         
                        """;
                System.out.println(monedaBase);
                base = lectura.next();

                System.out.println("Ingrese el monto que desea convertir");
                monto = lectura.nextInt();

                String monedaFin = """
                        A continuación, te presento una lista completa de códigos de moneda junto con los países correspondientes:
                                 
                        1. **AFN**: Afganistán
                        2. **ALL**: Albania
                        3. **DZD**: Argelia
                        4. **USD**: Samoa Americana
                        5. **EUR**: Andorra
                        6. **AOA**: Angola
                        7. **XCD**: Anguila
                        8. **XCD**: Antigua y Barbuda
                        9. **ARS**: Argentina
                        10. **AMD**: Armenia
                        11. **AWG**: Aruba
                        12. **AUD**: Australia
                        13. **EUR**: Austria
                        14. **AZN**: Azerbaiyán
                        15. **BSD**: Bahamas
                        16. **BHD**: Bahréin
                        17. **BDT**: Bangladés
                        18. **BBD**: Barbados
                        19. **BYN**: Bielorrusia
                        20. **EUR**: Bélgica
                        21. **BZD**: Belice
                        22. **XOF**: Benín
                        23. **BMD**: Bermudas
                        24. **BTN**: Bután
                        25. **BOB**: Bolivia
                        26. **BOV**: Bolivia (Mvdol)
                        27. **BAM**: Bosnia y Herzegovina
                        28. **BWP**: Botsuana
                        29. **BRL**: Brasil
                        30. **USD**: Territorio Británico del Océano Índico
                        31. **BND**: Brunéi
                        32. **BGN**: Bulgaria
                        33. **XOF**: Burkina Faso
                        34. **BIF**: Burundi
                        35. **CVE**: Cabo Verde
                        36. **KHR**: Camboya
                        37. **XAF**: Camerún
                        38. **CAD**: Canadá
                        39. **KYD**: Islas Caimán
                        40. **XAF**: República Centroafricana
                        41. **XAF**: Chad
                        42. **CLF**: Chile (Unidad de Fomento)
                        43. **CLP**: Chile (Peso chileno)
                        44. **CNY**: China
                        45. **AUD**: Isla de Navidad
                        46. **AUD**: Islas Cocos (Keeling)
                        47. **COP**: Colombia
                        48. **COU**: Colombia (Unidad de Valor Real)
                        49. **KMF**: Comoras
                        50. **CDF**: República Democrática del Congo
                        51. **XAF**: Congo
                        52. **NZD**: Islas Cook
                        53. **CRC**: Costa Rica
                        54. **EUR**: Croacia
                        55. **CUC**: Cuba (Peso convertible)
                        56. **CUP**: Cuba (Peso cubano)
                        57. **ANG**: Curazao
                        58. **EUR**: Chipre
                        59. **CZK**: República Checa
                        60. **XOF**: Costa de Marfil
                        61. **DKK**: Dinamarca
                        62. **DJF**: Yibuti
                        63. **XCD**: Dominica
                        64. **DOP**: República Dominicana
                        65. **USD**: Ecuador
                        66. **EGP**: Egipto
                        67. **SVC**: El Salvador
                        68. **USD**: Guinea Ecuatorial
                        69. **ERN**: Eritrea
                        70. **EUR**: Estonia
                        71. **ETB**: Etiopía
                        72. **EUR**: Unión Europea
                        73. **FKP**: Islas Malvinas (Falkland)
                        74. **DKK**: Islas Feroe
                        75. **FJD**: Fiyi
                        76. **EUR**: Finlandia
                                                    
                         Elije el codigo de la moneda  a la que quieras convertir (las 3 letras ). 
                        """;
                System.out.println(monedaFin);
                fin = lectura.next();

                System.out.println(monto + " " + base + c.convertir(base, fin, monto));
                break;


            case 8:
                System.out.println("Gracias por usar el convertidor, Hasta Luego!!");

        }


    } while (opcion != 8);
    lectura.close();
}catch (NumberFormatException e){
    System.out.println("Ingrese numeros");
}catch(InputMismatchException e){
    System.out.println("Escriba numeros");
}





    }
}
