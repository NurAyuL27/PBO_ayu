package Pertemuan6.teori;

public class Lingkaran {
    private float r;
    final float PHI = 3.14f;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return PHI * r * r;
    }

    public float keliling() {
        return 2 * PHI * r;
    }
}
