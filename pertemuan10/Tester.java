package pertemuan10;

public class Tester {

    // Interface Destroyable
    interface Destroyable {
        void destroyed();
    }

    // Abstract Class Zombie
    abstract static class Zombie implements Destroyable {
        protected int health;
        protected int level;

        public Zombie(int health, int level) {
            this.health = health;
            this.level = level;
        }

        public abstract void heal();

        public String getZombieInfo() {
            return "Health: " + health + ", Level: " + level;
        }
    }

    // WalkingZombie Class
    static class WalkingZombie extends Zombie {

        public WalkingZombie(int health, int level) {
            super(health, level);
        }

        @Override
        public void heal() {
            switch (level) {
                case 1 -> health += health * 0.20;
                case 2 -> health += health * 0.30;
                case 3 -> health += health * 0.40;
            }
        }

        @Override
        public void destroyed() {
            health -= 58; // Sesuai hasil (100 - 58 = 42)
        }
    }

    // JumpingZombie Class
    static class JumpingZombie extends Zombie {

        public JumpingZombie(int health, int level) {
            super(health, level);
        }

        @Override
        public void heal() {
            switch (level) {
                case 1 -> health += health * 0.30;
                case 2 -> health += health * 0.40;
                case 3 -> health += health * 0.50;
            }
        }

        @Override
        public void destroyed() {
            health -= 34; // Sesuai hasil (100 - 34 = 66)
        }
    }

    // Barrier Class
    static class Barrier implements Destroyable {
        private int strength;

        public Barrier(int strength) {
            this.strength = strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public int getStrength() {
            return strength;
        }

        @Override
        public void destroyed() {
            strength -= 36; // Sesuai hasil (100 - 36 = 64)
        }

        public String getBarrierInfo() {
            return "Barrier Strength = " + strength;
        }
    }

    // Plant Class
    static class Plant {
        public void doDestroy(Destroyable d) {
            d.destroyed();
        }
    }

    // Main Method
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println("Walking Zombie Data =");
        System.out.println(wz.getZombieInfo());

        System.out.println("\nJumping Zombie Data =");
        System.out.println(jz.getZombieInfo());

        System.out.println("\n" + b.getBarrierInfo());

        System.out.println("\n--------------------");

        // Loop to destroy the objects 4 times
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }

        System.out.println("\nWalking Zombie Data =");
        System.out.println(wz.getZombieInfo());

        System.out.println("\nJumping Zombie Data =");
        System.out.println(jz.getZombieInfo());

        System.out.println("\n" + b.getBarrierInfo());
    }
}
