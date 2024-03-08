public class Array {

    public static void main(String[] args) {
         String[] deportes = {"Fútbol", "Baloncesto", "Tenis", "Hí­pica", "Natación", "Badminton"};
         String[] personas = {"Angela", "Juan", "Guillermo", "Pablo", "Andres", "Fernando"};
         int[] experiencia = {4, 5, 1, 2, 2, 1};
         deportes[0] = "Yoga";
         for (int i = 0; i < deportes.length; i++) {
             System.out.printf("El deporte %s lo practica %s y lleva %d años de experiencia \n",
                     deportes[i], personas[i], experiencia[i]);
         }
     }   
 }