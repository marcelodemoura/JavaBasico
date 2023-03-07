package Metodo;


    public class Usuario {
        public static void main(String[] args) {

            SmatTv smatTv = new SmatTv();

            smatTv.almentarVolume();
            smatTv.almentarCanal();
            smatTv.diminuirVolume();

            System.out.println("TV Ligada? " + smatTv.ligada);
            System.out.println("Canal Atual: " + smatTv.canal);
            System.out.println("Volume Atual: " + smatTv.volume);

            smatTv.ligar();
            System.out.println("TV Ligada? " + smatTv.ligada);

            smatTv.desligar();
            System.out.println("TV Ligada? " + smatTv.ligada);


    }
}
