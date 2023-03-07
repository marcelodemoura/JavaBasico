package Metodo;
    public class SmatTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void ligar() {
            ligada = true;
        }

        public void desligar() {
            ligada = false;
        }

        public void almentarVolume() {
            volume++;
        }

        public void diminuirVolume() {
            volume--;
        }

        public void almentarCanal() {
            canal++;
        }

        public void diminuircanal() {
            canal--;
        }

}
