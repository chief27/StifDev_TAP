package com.granthutchison.stifdev_tap.Model;

import com.granthutchison.stifdev_tap.Model.Room;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A junit test file for unit testing the Room class.
 * Created by Stifler on 11/06/2016.
 */
public class RoomUnitTests {
    Room unlockedRoom = new Room("Hall", "Hammer", "You found a hammer","The door is locked", "You picked up the Hammer","The doors are unlocked", "North","Room1", false, "South","Room2", false, "West","Room3", false,"East", "Room4", false);
    Room lockedRoom = new Room("Hall", "Hammer", "You found a hammer","The door is locked", "You picked up the Hammer","The doors are unlocked", "North","Room1", false, "South","Room2", true, "West","Room3", false, "East","Room4", false);

    @Test
    public void roomToString(){
        assertEquals("Hall", unlockedRoom.toString());
    }

    @Test
    public void roomGetDescription1(){
        assertEquals("Hall", unlockedRoom.toString());
        assertEquals("The doors are unlocked", unlockedRoom.getRoomDescription());
    }
    @Test
    public void roomGetDescription2(){
        assertEquals("Hall", lockedRoom.toString());
        assertEquals("The door is locked", lockedRoom.getRoomDescription());
    }
}
