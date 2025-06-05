package codebase.largeclass;

import java.util.ArrayList;
import java.util.List;

public class EnemyList {
    private List<String> enemy;

    public EnemyList(List<String> enemyList){
        enemy = enemyList;
    }

    public EnemyList(){
        enemy = new ArrayList<>();
    }

    public void addEnemy(String name){
        enemy.add(name);
    }

    public void deleteEnemy(String name){
        enemy.remove(name);
    }
}
