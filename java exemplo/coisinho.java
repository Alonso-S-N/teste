public class Main {
    public static void main(String[]args){

        Video v [] = new Video[5];

        v[0] = new Video("aula 1 poo",150,true,500,20);
        System.out.println(v[0].toString());

        pessoa p = new pessoa(0,20,"Alonso","M");
        System.out.println(p.toString());

        Gafanhoto g [] = new Gafanhoto[2];
        g[0] = new Gafanhoto(0,15,"Alonso","M","jubileuDoGrau123",120 );
        System.out.println(g[0].toString());

        Visualização J = new Visualização(g[0],v[0]);
        J.Avaliar(35.0f);
        System.out.println(J.toString());
        System.out.println(J.toString());
    }

}