public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public void hacerAmericano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;
            System.out.println("Se ha servido un café americano.");
            this.mostrarEstado();
        } else {
            System.out.println("No hay suficientes recursos para hacer un café americano.");
        }
    }

    public void hacerExpreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;
            System.out.println("Se ha servido un café expreso.");
            this.mostrarEstado();
        } else {
            System.out.println("No hay suficientes recursos para hacer un café expreso.");
        }
    }

    public void hacerCapuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;
            System.out.println("Se ha servido un capuchino.");
            this.mostrarEstado();
        } else {
            System.out.println("No hay suficientes recursos para hacer un capuchino.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de la máquina de café:");
        System.out.println("- Agua: " + this.agua + " ml");
        System.out.println("- Café: " + this.cafe + " g");
        System.out.println("- Crema: " + this.crema + " ml");
        System.out.println("- Vasos: " + this.vasos);
    }

    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();

        maquina.mostrarEstado();

        maquina.hacerAmericano();
        maquina.hacerAmericano();
        maquina.hacerAmericano();
        maquina.hacerExpreso();
        maquina.hacerCapuchino();
        maquina.hacerAmericano();
        maquina.hacerExpreso();
        maquina.hacerCapuchino();
        maquina.hacerCapuchino();
        maquina.hacerCapuchino();
        maquina.hacerAmericano();
        maquina.hacerAmericano();
        maquina.hacerExpreso();
        maquina.hacerExpreso();
        maquina.hacerCapuchino();
        maquina.hacerAmericano();
        maquina.hacerCapuchino();
        maquina.hacerExpreso();
        maquina.hacerCapuchino();
        maquina.hacerCapuchino();

        maquina.mostrarEstado();
    }
}


