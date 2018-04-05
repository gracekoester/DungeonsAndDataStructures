package com.example.awesomefat.dungeonsanddatastructures;

/**
 * Created by awesomefat on 3/29/18.
 */

public class Exit
{
    private Room r1;
    private Room r2;

    public Exit(Room r1, Room r2)
    {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void takeExit(Player p)
    {
        //make the player move to the room they are NOT currently in.

        if(p.getCurrentRoom() != this.r1)
        {
            p.setCurrentRoom(this.r1);
        }
        else (p.getCurrentRoom() != this.r2)
        {
            p.setCurrentRoom(this.r2);
        }

        System.out.println("Character " + p + "is now in room " + p.getCurrentRoom());


    }
    }
}
