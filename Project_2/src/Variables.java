public class Variables {
    public static void main(String[] args) {
      int numero1=10;
      double numero2;
      numero2 = 3.14; // Puede requerir colocar D o d al final del numero
      float numero3;
      numero3 = 3.14159F; //Requiere letra F o f al final del numero
      char caracter1='A', caracter2 = 66;
      boolean opcion= true;
      long numero4;
      numero4 = 9876542321L; // Puede requerir L o l al final del numero
      byte numero5 = 126; 
      short numero6 = 128;

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(opcion);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);

        //Variables de referencia
        
        String mensaje,mensaje2;
        mensaje = "Esto es un mensaje";
        mensaje2= """
                Este 
                es un mensaje 
                multilinea
                """;
        System.out.println(mensaje);
        System.out.println(mensaje2);
        System.out.println(mensaje+' '+numero1);
        String numero1_String = Integer.toString(numero1);
        System.out.println(mensaje.concat(numero1_String));

        //Variable general

        var variable1=15; 
        var variable2 ='F';
        var variable3 = 2.8754F;





        System.out.println(variable1);
        System.out.println(variable2);       
        System.out.println(variable3);
    
        //Variable declarada como constante

        final var PI= 3.14159;
        //PI= 3.1416 no funciona
        System.out.println(PI);
    
    
    }
    
}
