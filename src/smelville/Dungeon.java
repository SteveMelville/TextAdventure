package smelville;

import java.util.*;

public class Dungeon {
    ArrayList<DungeonFloor> levels_;
    int fx_;
    int fy_;
    int numFloors_;

    Dungeon(int x, int y, int h){
        levels_ = new ArrayList<>();
        fx_ = x;
        fy_ = y;
        numFloors_ = h;

        for(int i = 0; i < numFloors_; i++){
            levels_.add(new DungeonFloor());
        }
    }
}
