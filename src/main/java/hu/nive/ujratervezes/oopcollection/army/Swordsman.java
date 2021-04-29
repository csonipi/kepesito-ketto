package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{
    int defenseIndex = 0;

    public Swordsman(boolean hasArmour){
        this.health = 100;
        this.attack = 10;
        this.hasArmour = hasArmour;
    }

    @Override
    public void sufferDamage(int damage){
        this.defenseIndex++;
        if(this.defenseIndex == 1){
            defenseIndex++;
        }else{
            if(this.hasArmour){
                this.health -= damage/2;
            }else{
                this.health -= damage;
            }
        }
    }
}