public class UsoWrapper {


    public static void main(String[] args) {
        short corto =25;
        Short objetoShort =corto;
        String cadena = objetoShort.toString();
        //hace los mismo que String cadena = "25";
        Boolean miboleano =true;
        miboleano.booleanValue();
            System.out.println("FALSO");
        int minumero = 8;
        Integer numeroObjeto = Integer.valueOf(minumero);
        // hace los mismo que Integer Numeroobjeto =8;
        System.out.println("numeroObjeto es un objeto de la clase " + numeroObjeto.getClass().getName());
        int nuevonumero = numeroObjeto;
        System.out.println(nuevonumero);
        Character micaracter='a';
        char ch = micaracter.charValue();
        System.out.println("el valor del objeto micaracter es "+micaracter.charValue());
        Double numdoble =2000.0;
        numdoble= numeroObjeto.doubleValue();
        System.out.println(numdoble);
        
    }
    
}