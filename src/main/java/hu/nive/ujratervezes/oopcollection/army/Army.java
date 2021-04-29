package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){
        this.army.add(militaryUnit);
    }
    public void damageAll(int damage){
        List<MilitaryUnit> toRemove = new ArrayList<>();

        for (MilitaryUnit unit: this.army
             ) {
            unit.sufferDamage(damage);
            if(unit.health < 25){
                toRemove.add(unit);
            }
        }
        for (MilitaryUnit unit: toRemove
             ) {
            this.army.remove(unit);
        }
    }

    public int getArmyDamage(){
        int armyDamage = 0;
        for (MilitaryUnit unit: this.army
             ) {
            armyDamage += unit.doDamage();
        }
        return armyDamage;
    }

    public int getArmySize(){
        return this.army.size();
    }
}