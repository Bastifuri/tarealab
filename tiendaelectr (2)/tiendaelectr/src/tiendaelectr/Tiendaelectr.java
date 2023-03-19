
package tiendaelectr;
import java.util.Scanner;
public class Tiendaelectr {

    
    public static void main(String[] args) {
       Scanner Leer=new Scanner(System.in);
         productos p1=new productos("Notebook Asus 12HJ34","GTX 1650 , 16 GB RAM , Core i5 10500H", 850000,15,"Notebooks");
          productos p2=new productos("Notebook HP 15GGF6","GTX 1650 , 8 GB RAM , Core i7 10500H",750000,8,"Notebooks");
           productos p3=new productos("Mouse Tdagger","Cable de 1m , Luces RGB , 2 Botones laterales", 25000,30,"Perifericos");
            productos p4=new productos("Headset Astro a50","Inalambricos , Con Microfono , Ajustador de Volumen", 600000,11,"Perifericos");
             productos p5=new productos("Teclado Mecanico Nibio Impact","Switchez azules , Español latinoamerica , 100%", 25000,7,"Perifericos");
              productos p6=new productos("Microfono HyperX ","Cable de 1.5 mts , Color rojo , Supresor de ruido", 75000,13,"Perifericos");
               productos p7=new productos("Notebook Asus 12KG36","GTX 3060, 32GB RAM , Core i9 10500H", 1200000,5,"Notebooks");
                productos p8=new productos("Headset Razer Kraken v3","Con microfono , Inalambricos , Negros", 119000,15,"Perifericos");
                 productos p9=new productos("Monitor Asus VG289Q1A","4K , Panel IPS , 60Hz , 28 pulgadas", 349990,15,"Monitores");
                  productos p10=new productos("Monitor AOC C27G2Z","Curvo Full HD , 240Hz , Panel va", 300000,15,"Monitores");
                   productos p11=new productos("Monitor Samsung","27 Pulgadas , Full HD , 240hz", 350000,3,"Notebooks");
Boolean continuar=true;
                   System.out.println("BIENVENIDO A ELECTRONICSC:");
               System.out.println("1.Ver catalogo.");
              System.out.println("2.Buscar por categoria.");
              System.out.println("3.Buscar por producto.");
              System.out.println("4.Salir. ");
              String eleccion=Leer.nextLine();
      
   
      do{    
     
       if (eleccion.equals("1")){
         System.out.println("1."+p1.toString());
         System.out.println("2."+p2.toString());
         System.out.println("3."+p3.toString());
         System.out.println("4."+p4.toString());
         System.out.println("5."+p5.toString());
         System.out.println("6."+p6.toString());
         System.out.println("7."+p7.toString());
         System.out.println("8."+p8.toString());
         System.out.println("9."+p9.toString());
         System.out.println("10."+p10.toString());
         System.out.println("11."+p11.toString());
         
           break;
       }else if (eleccion.equals("2")){
             System.out.println("INGRESE LA CATEGORIA DE BUSQUEDA (Perifericos , Monitores , Notebooks)");
             String buscat=Leer.nextLine();  
             if(buscat.equals("Perifericos")){
            System.out.println("1."+p3.toString());
         System.out.println("2."+p4.toString());
         System.out.println("3."+p5.toString());
         System.out.println("4."+p6.toString());
         System.out.println("5."+p8.toString());
         break;
             }else if(buscat.equals("Monitores")){
                 System.out.println("1."+p9.toString());
         System.out.println("2."+p10.toString());
         System.out.println("3."+p11.toString());
         break;
             }else if(buscat.equals("Notebooks")){
                   System.out.println("1."+p1.toString());
         System.out.println("2."+p2.toString());
          System.out.println("3."+p7.toString());
          break;
             }
             else{
                 System.out.println("ERROR DE BUSQUEDA , INTENTE NUEVAMENTE");
                 break;
             }
               
          
               }
       else if(eleccion.equals("3")){
           
            System.out.println("AUN NO LO TENGO");
       }else if(eleccion.equals("4")){
           continuar=false;
       }else{
         System.out.println("ERROR , INTENTE NUEVAMENTE");  
       break;
       }
      }while(continuar);
     
    }
      
}
