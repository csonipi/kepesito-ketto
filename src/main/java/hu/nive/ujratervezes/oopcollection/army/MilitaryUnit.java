package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    int health;
    int attack;
    boolean hasArmour;

    public int getHitPoints(){
        return this.health;
    }

    public int doDamage(){
        return this.attack;
    }

    public void sufferDamage(int damage){
        if(this.hasArmour){
            this.health -= damage/2;
        }else{
            this.health -= damage;
        }
    }

}
