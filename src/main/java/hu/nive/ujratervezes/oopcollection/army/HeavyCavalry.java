package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    int attackIndex = 0;

    public HeavyCavalry(){
        this.health = 150;
        this.attack = 20;
        this.hasArmour = true;
    }

    @Override
    public int doDamage(){
        this.attackIndex++;
        if(this.attackIndex == 1){
            return this.attack * 3;
        }else{
            return this.attack;
        }
    }
}