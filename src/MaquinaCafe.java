public class MaquinaCafe {

        private static final int MAX_AGUA = 5000; // mililitros
        private static final int MAX_CAFE = 1000; // gramos
        private static final int MAX_CREMA = 1500; // mililitros
        private static final int MAX_VASOS = 50; // vasos
        private static final int CAPACIDAD_VASO = 200; // mililitros

        private int agua;
        private int cafe;
        private int crema;
        private int vasos;

        public MaquinaCafe() {
            this.agua = MAX_AGUA;
            this.cafe = MAX_CAFE;
            this.crema = MAX_CREMA;
            this.vasos = MAX_VASOS;
        }

        public void hacerAmericano() {
            if (agua >= 180 && cafe >= 15 && vasos > 0) {
                agua -= 180;
                cafe -= 15;
                vasos--;
                System.out.println("Café americano servido.");
                mostrarEstado();
            } else {
                System.out.println("Lo siento, no hay suficientes recursos para hacer un café americano.");
            }
        }

        public void hacerExpreso() {
            if (agua >= 120 && cafe >= 20 && vasos > 0) {
                agua -= 120;
                cafe -= 20;
                vasos--;
                System.out.println("Café expreso servido.");
                mostrarEstado();
            } else {
                System.out.println("Lo siento, no hay suficientes recursos para hacer un café expreso.");
            }
        }

        public void hacerCapuchino() {
            if (agua >= 100 && crema >= 70 && cafe >= 14 && vasos > 0) {
                agua -= 100;
                crema -= 70;
                cafe -= 14;
                vasos--;
                System.out.println("Capuchino servido.");
                mostrarEstado();
            } else {
                System.out.println("Lo siento, no hay suficientes recursos para hacer un capuchino.");
            }
        }

        public void mostrarEstado() {
            System.out.println("Agua: " + agua + " ml");
            System.out.println("Café: " + cafe + " g");
            System.out.println("Crema: " + crema + " ml");
            System.out.println("Vasos: " + vasos);
        }
}




