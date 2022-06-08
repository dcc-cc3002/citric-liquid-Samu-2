package cl.uchile.dcc.citricliquid.model.entitys;

import java.util.HashMap;

public abstract class Entity {
    /*
    * ===============================================================
    * =================== ATTRIBUTES =================================
    * ===============================================================
    */

    private final String name;
    private int hp;
    private int atk;
    private int def;
    private int evd;

    /*
    * ==========================================================
    * ================= CONSTRUCTORS ===========================
    * ==========================================================
    */

    public Entity (String name, int hp, int atk, int def, int evd) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.evd = evd;
    }

    /*
    * ============================================================
    * ================ GETTERS AND SETTERS =======================
    * ============================================================
    */

    public String getName() {
        // Creates a copy variable and returns it.
        String copy = name;
        return copy;
    }
    public int getHp() {
        // Returns a copy of the variable.
        int copy = hp;
        return copy;
    }
    public int getAtk() {
        // Returns a copy of the variable.
        int copy = atk;
        return copy;
    }
    public int getDef() {
        // Returns a copy of the variable.
        int copy = def;
        return copy;
    }
    public int getEvd() {
        // Returns a copy of the variable.
        int copy = evd;
        return copy;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setEvd(int evd) {
        this.evd = evd;
    }

}
